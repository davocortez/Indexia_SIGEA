/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.utez.Dao;

import Utilerias.ConexionMySql;
import edu.utez.Bean.BeanProfesor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author David
 */
public class DaoPortafolio {
    String consultar="select * from Profesor";
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
            System.out.println("error al consultar");
        }
        return listaProfesor;
    }
    
    
}
