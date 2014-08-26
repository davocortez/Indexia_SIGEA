/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.utez.Dao;

import Utilerias.ConexionMySql;
import edu.utez.Bean.BeanGrupos;
import edu.utez.Bean.BeanMateria;
import edu.utez.Bean.BeanProfesor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author RobertoEnrique
 */
public class DaoProfesor {

    private String sqlConsultaProfesor = "SELECT idProfesor , CONCAT(Nombre, ' ', ApellidoPaterno, ' ', ApellidoMaterno) AS NombreCompleto FROM profesor;";
    private String sqlTraerId = "SELECT idProfesor  FROM profesor WHERE CONCAT(Nombre,ApellidoPaterno,ApellidoMaterno) = ?;";

    public List consultaProfesor() {
        List listaProfesor = new ArrayList();
        try {
            Connection con = ConexionMySql.getConnection();
            PreparedStatement ps = con.prepareStatement(sqlConsultaProfesor);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                BeanProfesor bean = new BeanProfesor();
                bean.setIdProfesor(rs.getInt(1));
                bean.setNombreProfesor(rs.getString(2));
                listaProfesor.add(bean);
            }
            ps.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listaProfesor;
    }

    public int traeridMaestro(BeanProfesor bean) {
        int idProfesor = 0;
        try {
            Connection con = ConexionMySql.getConnection();
            PreparedStatement ps = con.prepareStatement(sqlTraerId);

        } catch (Exception e) {

        }
        return idProfesor;
    }
    
    /*************Metodos hector flores ************ */
    
    public List consultaProfesoresModuloProf() {
        String consulta="select p.`idProfesor`,p.`Nombre`from profesor as p;";
        List listaProf = new ArrayList();
        try {
            Connection con = ConexionMySql.getConnection();
            PreparedStatement ps = con.prepareStatement(sqlConsultaProfesor);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                BeanProfesor bean = new BeanProfesor();
                bean.setIdProfesor(rs.getInt(1));
                bean.setNombreProfesor(rs.getString(2));
                listaProf.add(bean);
            }
            ps.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listaProf;
    }
    
    
    
      public List consultaGradoGrupoProfesores() {
        String consulta="select g.`idGrupo`,g.`Cuatrimestre`,g.`Grupo`  from grupo as g;";
        List listaGrados = new ArrayList();
        try {
            Connection con = ConexionMySql.getConnection();
            PreparedStatement ps = con.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                BeanGrupos grupo = new BeanGrupos();
                grupo.setIdGrupo(rs.getInt(1));
                grupo.setCuatrimestre(rs.getString(2));
                grupo.setGrupo(rs.getString(3));
                listaGrados.add(grupo);
            }
            ps.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listaGrados;
    }
      
      public boolean registroAsesores(BeanProfesor prof,BeanGrupos grup) {
        boolean resultado = false;
   
        String registroProveedor = "insert into tutor(idProfesor,grupoID) VALUES(?,?);";
        try {
            Connection Connect = ConexionMySql.getConnection();
            PreparedStatement ps = Connect.prepareStatement(registroProveedor);
            ps.setInt(1, prof.getIdProfesor());
            ps.setInt(2, grup.getIdGrupo());
        
       System.out.println("id profesor: "+prof.getIdProfesor());
            System.out.println("id grupo: "+grup.getIdGrupo());
            System.out.println("CONSULTA: " + ps);
            
            resultado = ps.executeUpdate() == 1;
            ps.close();
            Connect.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultado;
    }
    
      
      /*
        public List DetallesProfesoresModuloProf() {
        String consulta="select p.`Cuatrimestre`,p.`Grupo`,p2.`idProfesor`,p2.`Nombre`from grupo as p inner join asignacion_materia as a on p.`idGrupo`=a.`idGrupo` inner join profesor as p2 on a.`idProfesor`=p2.`idProfesor`;";
        List listaTutores = new ArrayList();
        try {
            Connection con = ConexionMySql.getConnection();
            PreparedStatement ps = con.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                BeanMateria materia= new BeanMateria();
                BeanGrupo grupo= new BeanGrupo();
                BeanProfesor profesor= new BeanProfesor();
                
                grupo.setCuatrimestre(rs.getInt(1));
                grupo.setGrupo(rs.getString(2));
                profesor.setIdProfesor(rs.getInt(3));
                profesor.setNombreProfesor(rs.getString(4));
                listaTutores.add(grupo);
                listaTutores.add(profesor);
                
            }
            ps.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listaTutores;
    }
      
      */
}
