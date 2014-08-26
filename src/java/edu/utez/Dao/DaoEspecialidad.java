/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.utez.Dao;

import Utilerias.ConexionMySql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author David
 */
public class DaoEspecialidad {
    private String insertar="insert into  especialidad( descripcion,idProfesor)values (?,?);";
    
    public boolean registrarEspecialidad(String especialidad,String idProfesor){
       boolean status=false;
        
        try {
            
            Connection con = ConexionMySql.getConnection();
            PreparedStatement ps = con.prepareStatement(insertar);
            ps.setString(1, especialidad);
            ps.setString(2, idProfesor);
            
            status=ps.executeUpdate()==1;
            
        } catch (SQLException ex) {
            Logger.getLogger(DaoEspecialidad.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }
}
