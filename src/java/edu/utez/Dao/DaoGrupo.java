/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.utez.Dao;

import Utilerias.ConexionMySql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import edu.utez.Bean.BeanGrupos;

/**
 *
 * @author RobertoEnrique
 */
public class DaoGrupo {

    private String sqlConsultaAlta = "SELECT * FROM grupo WHERE Estado=0;";
    private String sqlConsultaBaja = "SELECT * FROM grupo WHERE Estado=1;";
    private String sqlInsertarGrupo = "UPDATE grupo SET Estado = 1 WHERE idGrupo = ?;";

    public List consultaAltaGrupos() {
        List listaGrupos = new ArrayList();
        try {
            Connection con = ConexionMySql.getConnection();
            PreparedStatement ps = con.prepareStatement(sqlConsultaAlta);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                BeanGrupos bean = new BeanGrupos();
                bean.setDescripcion(rs.getString(3));
                bean.setGrupo(rs.getInt(2));
                bean.setTurno(rs.getString(4));
                listaGrupos.add(bean);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listaGrupos;
    }

    public List consultaAsignacion() {
        List lista = new ArrayList();
        try {
            Connection con = ConexionMySql.getConnection();
            PreparedStatement ps = con.prepareStatement(sqlConsultaBaja);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                BeanGrupos bean = new BeanGrupos();
                bean.setDescripcion(rs.getString(3));
                bean.setGrupo(rs.getInt(2));
                bean.setTurno(rs.getString(4));
                lista.add(bean);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    public void actualizarEstado(int idEstado) {
        try {
            Connection con = ConexionMySql.getConnection();
            PreparedStatement ps = con.prepareStatement(sqlInsertarGrupo);
            ps.setInt(1, idEstado);
            ps.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
