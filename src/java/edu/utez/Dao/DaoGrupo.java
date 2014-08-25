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
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author RobertoEnrique
 */
public class DaoGrupo {

    private String sqlConsultaAlta = "SELECT * FROM grupo WHERE Estado=0;";
    private String sqlConsultaBaja = "SELECT * FROM grupo WHERE Estado=1;";
    private String insertarGrupo = "insert into grupo ()SET Estado = 1 WHERE idGrupo = ?;";
    private String materias = "select * from materia where especialidad=? and cuatrimestre=?;";
    private String insertar = "insert into grupo(cuatrimestre,grupo,descripcion,turno)value(?,?,?,?)";
    private String insertarDetalles = "insert into materia_grupo (grupoID,materiaID)values(?,?)";
    private String consultaGrupo = "select * from grupo";

    public List consultaAltaGrupos() {
        List listaGrupos = new ArrayList();
        try {
            Connection con = ConexionMySql.getConnection();
            PreparedStatement ps = con.prepareStatement(sqlConsultaAlta);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                BeanGrupos bean = new BeanGrupos();
                bean.setDescripcion(rs.getString(3));
                bean.setGrupo(rs.getString(2));
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
                bean.setGrupo(rs.getString(2));
                bean.setTurno(rs.getString(4));
                lista.add(bean);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    public void registrarGrupo(String grado, String letra, String especialidad, String turno) {
        String idGrupo = "";
        try {
            Connection con = ConexionMySql.getConnection();
            PreparedStatement ps = con.prepareStatement(insertar, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, grado);
            ps.setString(2, letra);
            ps.setString(3, especialidad);
            ps.setString(4, turno);
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            while (rs.next()) {
                idGrupo = rs.getString(1);
            }
            ps.close();
            con.close();
            rs.close();

            Connection con2 = ConexionMySql.getConnection();
            PreparedStatement ps2 = con2.prepareStatement(materias);
            System.out.println("grado dao: " + grado);
            System.out.println("especialidad dao: " + especialidad);
            ps2.setString(1, especialidad);
            ps2.setString(2, grado);

            ResultSet rs2 = ps2.executeQuery();

            while (rs2.next()) {
                Connection con3 = ConexionMySql.getConnection();
                PreparedStatement ps3 = con3.prepareStatement(insertarDetalles);

                String idMateria = rs2.getString(1);
                System.out.println("idGRUPO: " + idGrupo);
                System.out.println("idMateria: " + idMateria);
                ps3.setString(1, idGrupo);
                ps3.setString(2, idMateria);
                ps3.executeUpdate();
                ps3.close();
                con3.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("-------" + e);
        }
    }

    public List consultarGrupos() {

        List listaGrupos = new ArrayList();
        try {

            Connection con = ConexionMySql.getConnection();
            PreparedStatement ps = con.prepareStatement(consultaGrupo);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                BeanGrupos bean = new BeanGrupos();
                bean.setIdGrupo(rs.getInt(1));
                bean.setCuatrimestre(rs.getString(2));
                bean.setGrupo(rs.getString(3));
                bean.setTurno(rs.getString(5));
                listaGrupos.add(bean);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoGrupo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaGrupos;

    }
}
