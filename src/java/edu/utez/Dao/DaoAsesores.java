/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.utez.Dao;

import Utilerias.ConexionMySql;
import edu.utez.Bean.BeanGrupo;
import edu.utez.Bean.BeanProfesor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hector
 */
public class DaoAsesores {
         public List consultaProfesoresSelect() {
        String consulta = "select p.`Nombre`,g.`Cuatrimestre`,g.`Grupo` from profesor as p inner join tutor as t on p.`idProfesor`=t.`idProfesor` inner join grupo as g on t.`grupoID`=g.`idGrupo`;";
        List listaAsesoresSelec = new ArrayList();
        try {
            Connection con = ConexionMySql.getConnection();
            PreparedStatement ps = con.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                BeanProfesor profesor = new BeanProfesor();
                BeanGrupo grupo = new BeanGrupo();
                profesor.setNombreProfesor(rs.getString(1));
                grupo.setCuatrimestre(rs.getInt(2));
                grupo.setGrupo(rs.getString(3));
                listaAsesoresSelec.add(profesor);
                listaAsesoresSelec.add(grupo);
            }
            ps.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listaAsesoresSelec;
    }
    
}
