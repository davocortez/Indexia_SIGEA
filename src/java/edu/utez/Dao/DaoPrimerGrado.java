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
import edu.utez.Bean.BeanProfesor;

/**
 *
 * @author RobertoEnrique
 */
public class DaoPrimerGrado {

    private String sqlComboDhpl = "SELECT profesor.idProfesor,concat(profesor.Nombre,' ',profesor.ApellidoPaterno,' ',profesor.ApellidoMaterno) as\n"
            + "Nombre FROM Profesor INNER JOIN (Profesor_Especialidad INNER JOIN Especialidad\n"
            + "ON Profesor_Especialidad.idEspecialidad = Especialidad.idEspecialidad) ON Profesor.idProfesor = \n"
            + "Profesor_Especialidad.idProfesor WHERE especialidad.Descripcion='Des.Hab.Pens.Matemático';";

    private String salComboSoporte = "SELECT profesor.idProfesor,concat(profesor.Nombre,' ',profesor.ApellidoPaterno,' ',profesor.ApellidoMaterno) as\n"
            + "Nombre FROM Profesor INNER JOIN (Profesor_Especialidad INNER JOIN Especialidad\n"
            + "ON Profesor_Especialidad.idEspecialidad = Especialidad.idEspecialidad) ON Profesor.idProfesor = \n"
            + "Profesor_Especialidad.idProfesor WHERE especialidad.Descripcion='Soporte Técnico';";

    private String sqlMetodologia = "SELECT profesor.idProfesor,concat(profesor.Nombre,' ',profesor.ApellidoPaterno,' ',profesor.ApellidoMaterno) as\n"
            + "Nombre FROM Profesor INNER JOIN (Profesor_Especialidad INNER JOIN Especialidad\n"
            + "ON Profesor_Especialidad.idEspecialidad = Especialidad.idEspecialidad) ON Profesor.idProfesor = \n,"
            + "Profesor_Especialidad.idProfesor WHERE especialidad.Descripcion='Metodología de la Programación';";

    private String sqlOfimatica = "SELECT profesor.idProfesor,concat(profesor.Nombre,' ',profesor.ApellidoPaterno,' ',profesor.ApellidoMaterno) as\n"
            + "Nombre FROM Profesor INNER JOIN (Profesor_Especialidad INNER JOIN Especialidad\n"
            + "ON Profesor_Especialidad.idEspecialidad = Especialidad.idEspecialidad) ON Profesor.idProfesor = \n"
            + "Profesor_Especialidad.idProfesor WHERE especialidad.Descripcion='Ofimática';";

    private String sqlFundamentos = "SELECT profesor.idProfesor,concat(profesor.Nombre,' ',profesor.ApellidoPaterno,' ',profesor.ApellidoMaterno) as\n"
            + "Nombre FROM Profesor INNER JOIN (Profesor_Especialidad INNER JOIN Especialidad\n"
            + "ON Profesor_Especialidad.idEspecialidad = Especialidad.idEspecialidad) ON Profesor.idProfesor = \n"
            + "Profesor_Especialidad.idProfesor WHERE especialidad.Descripcion='Fundamentos de Redes';";

    private String sqlExprecion = "SELECT profesor.idProfesor,concat(profesor.Nombre,' ',profesor.ApellidoPaterno,' ',profesor.ApellidoMaterno) as\n"
            + "Nombre FROM Profesor INNER JOIN (Profesor_Especialidad INNER JOIN Especialidad\n"
            + "ON Profesor_Especialidad.idEspecialidad = Especialidad.idEspecialidad) ON Profesor.idProfesor = \n"
            + "Profesor_Especialidad.idProfesor WHERE especialidad.Descripcion='Expresión Oral y Escrita I';";

    private String sqlInglesI = "SELECT profesor.idProfesor,concat(profesor.Nombre,' ',profesor.ApellidoPaterno,' ',profesor.ApellidoMaterno) as\n"
            + "Nombre FROM Profesor INNER JOIN (Profesor_Especialidad INNER JOIN Especialidad\n"
            + "ON Profesor_Especialidad.idEspecialidad = Especialidad.idEspecialidad) ON Profesor.idProfesor = \n"
            + "Profesor_Especialidad.idProfesor WHERE especialidad.Descripcion='Inglés I';";

    private String sqlFormacion = "SELECT profesor.idProfesor,concat(profesor.Nombre,' ',profesor.ApellidoPaterno,' ',profesor.ApellidoMaterno) as\n"
            + "Nombre FROM Profesor INNER JOIN (Profesor_Especialidad INNER JOIN Especialidad\n"
            + "ON Profesor_Especialidad.idEspecialidad = Especialidad.idEspecialidad) ON Profesor.idProfesor = \n"
            + "Profesor_Especialidad.idProfesor WHERE especialidad.Descripcion='Formación Sociocultural I';";

    public List consultaDesarolleHabilidades() {
        List listaDesarolleHabilidades = new ArrayList();
        try {
            Connection con = ConexionMySql.getConnection();
            PreparedStatement ps = con.prepareStatement(sqlComboDhpl);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                BeanProfesor bean = new BeanProfesor();
                bean.setIdProfesor(rs.getInt(1));
                bean.setNombreProfesor(rs.getString(2));
                listaDesarolleHabilidades.add(bean);
            }
        } catch (Exception e) {
        }
        return listaDesarolleHabilidades;
    }

    public List consultaSoporteTecnico() {
        List listaSoporte = new ArrayList();
        try {
            Connection con = ConexionMySql.getConnection();
            PreparedStatement ps = con.prepareStatement(salComboSoporte);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                BeanProfesor bean = new BeanProfesor();
                bean.setIdProfesor(rs.getInt(1));
                bean.setNombreProfesor(rs.getString(2));
                listaSoporte.add(bean);
            }
        } catch (Exception e) {
        }
        return listaSoporte;
    }

    public List consultaMetodologia() {
        List listaMetologia = new ArrayList();
        try {
            Connection con = ConexionMySql.getConnection();
            PreparedStatement ps = con.prepareStatement(sqlMetodologia);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                BeanProfesor bean = new BeanProfesor();
                bean.setIdProfesor(rs.getInt(1));
                bean.setNombreProfesor(rs.getString(2));
                listaMetologia.add(bean);
            }
        } catch (Exception e) {
        }
        return listaMetologia;
    }

    public List consultaOfimatica() {
        List listaOfimatica = new ArrayList();
        try {
            Connection con = ConexionMySql.getConnection();
            PreparedStatement ps = con.prepareStatement(sqlOfimatica);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                BeanProfesor bean = new BeanProfesor();
                bean.setIdProfesor(rs.getInt(1));
                bean.setNombreProfesor(rs.getString(2));
                listaOfimatica.add(bean);
            }
        } catch (Exception e) {
        }
        return listaOfimatica;
    }

    public List consultaFundamentos() {
        List listaFundamentos = new ArrayList();
        try {
            Connection con = ConexionMySql.getConnection();
            PreparedStatement ps = con.prepareStatement(sqlOfimatica);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                BeanProfesor bean = new BeanProfesor();
                bean.setIdProfesor(rs.getInt(1));
                bean.setNombreProfesor(rs.getString(2));
                listaFundamentos.add(bean);
            }
        } catch (Exception e) {
        }
        return listaFundamentos;
    }

    public List consultaExprecion() {
        List listaExprecion = new ArrayList();
        try {
            Connection con = ConexionMySql.getConnection();
            PreparedStatement ps = con.prepareStatement(sqlExprecion);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                BeanProfesor bean = new BeanProfesor();
                bean.setIdProfesor(rs.getInt(1));
                bean.setNombreProfesor(rs.getString(2));
                listaExprecion.add(bean);
            }
        } catch (Exception e) {
        }
        return listaExprecion;
    }

    public List consultaIngles() {
        List listaIngles = new ArrayList();
        try {
            Connection con = ConexionMySql.getConnection();
            PreparedStatement ps = con.prepareStatement(sqlInglesI);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                BeanProfesor bean = new BeanProfesor();
                bean.setIdProfesor(rs.getInt(1));
                bean.setNombreProfesor(rs.getString(2));
                listaIngles.add(bean);
            }
        } catch (Exception e) {
        }
        return listaIngles;
    }
}
