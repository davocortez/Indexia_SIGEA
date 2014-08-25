/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.utez.Dao;

import Utilerias.ConexionMySql;
import edu.utez.Bean.BeanPortafolio;
import edu.utez.Bean.BeanProfesor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author David
 */
public class DaoPortafolio {

    String consultarPortafolio = "SELECT * FROM portafolio where idProfesor=?";
    private String sqlConsultaProfesor = "SELECT idProfesor , CONCAT(Nombre, ' ', ApellidoPaterno, ' ', ApellidoMaterno) AS NombreCompleto FROM profesor;";
    private String sqlTraerId = "SELECT idProfesor  FROM profesor WHERE CONCAT(Nombre,ApellidoPaterno,ApellidoMaterno) = ?;";
    String registrar = "iNSERT INTO profesor (`Nombre`, `ApellidoPaterno`, `ApellidoMaterno`,tipoDisponibilidad)"
            + " VALUES (?,?,?,?);";
    String registrarPortafolio = " INSERT INTO portafolio(`idProfesor`,`tipo`) values (?,?);";
    String entregar = "UPDATE portafolio set estado=0 where idReportes=?;";

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
            System.out.println("error al consultar");
        }
        return listaProfesor;
    }

    public boolean insertar(String nombre, String apePaterno, String apeMaterno, String disponibilidad) {

        boolean status = false;
        String idProfe = "";
        try {
            Connection con = ConexionMySql.getConnection();
            PreparedStatement ps = con.prepareStatement(registrar, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, nombre);
            ps.setString(2, apePaterno);
            ps.setString(3, apeMaterno);
            ps.setString(4, disponibilidad);

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            while (rs.next()) {
                idProfe = rs.getString(1);
            }
            ps.close();
            con.close();
            rs.close();

            Connection con2 = ConexionMySql.getConnection();
            PreparedStatement ps2 = con2.prepareStatement(registrarPortafolio);
            for (int i = 0; i < 4; i++) {
                ps2.setString(1, idProfe);
                ps2.setString(2, i+1+"");

                status = ps2.executeUpdate() == 1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoPortafolio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }

    public List consultaPortafolios(String idProfe) {
        List listaPortafolios = new ArrayList();
        try {
            Connection con = ConexionMySql.getConnection();
            PreparedStatement ps = con.prepareStatement(consultarPortafolio);
            ps.setString(1, idProfe);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                BeanPortafolio bean = new BeanPortafolio();
                bean.setIdReportes(rs.getString(2));
                bean.setDescripcion(rs.getString(3));
                bean.setEstado(rs.getString(4));
                listaPortafolios.add(bean);
            }
            ps.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("error al consultar");
        }
        return listaPortafolios;
    }

    public boolean modificar(String idReporte) {

        boolean status = false;
        try {
            Connection con = ConexionMySql.getConnection();
            PreparedStatement ps = con.prepareStatement(entregar);
            ps.setString(1, idReporte);

            status = ps.executeUpdate() == 1;
            ps.close();
            con.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(DaoPortafolio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }

}
