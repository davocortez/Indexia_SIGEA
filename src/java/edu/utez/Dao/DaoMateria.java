/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.utez.Dao;

import Utilerias.ConexionMySql;
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

    public List consultaMaterias() {
        List listaMaterias = new ArrayList();
        try{
            Connection con = ConexionMySql.getConnection();
            PreparedStatement ps = con.prepareStatement(sqlConsultaMateria);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                BeanMateria bean = new BeanMateria();
                bean.setIdEspecialidad(rs.getString(1));
                bean.setDescripcion(rs.getString(2));
                listaMaterias.add(bean);
            }
        }catch(Exception e){
        e.printStackTrace();
        }
        return listaMaterias;
    }
}
