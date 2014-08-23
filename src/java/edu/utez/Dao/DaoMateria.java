/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.utez.Dao;

import Utilerias.ConexionMySql;
import edu.utez.Bean.BeanAsignacion;
import edu.utez.Bean.BeanMateria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author RobertoEnrique
 */
public class DaoMateria {

    private String sqlConsultaMateria = "SELECT * FROM materia;";
    private String sqlInsertarAsignacion = "INSERT INTO asignacion_materia (Clave_Materia, idProfesor,TotalHoras, Grupo_idGrupo) VALUES (?, ?, ?, ?)";

    public List consultaMaterias() {
        List listaMaterias = new ArrayList();
        try {
            Connection con = ConexionMySql.getConnection();
            PreparedStatement ps = con.prepareStatement(sqlConsultaMateria);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                BeanMateria bean = new BeanMateria();
                bean.setIdEspecialidad(rs.getString(1));
                bean.setDescripcion(rs.getString(2));
                listaMaterias.add(bean);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listaMaterias;
    }

    public void insertarAsignacion(BeanAsignacion bean) {
        try {
            Connection con = ConexionMySql.getConnection();
            PreparedStatement ps = con.prepareStatement(sqlInsertarAsignacion);
            ps.setInt(1, bean.getClave_Materia());
            ps.setInt(2, bean.getGrupo_idGrupo());
            ps.setInt(3, bean.getHora());
            ps.setInt(4, bean.getTotalHoras());
            ps.executeUpdate();
        } catch (Exception e) {

        }
    }
}
