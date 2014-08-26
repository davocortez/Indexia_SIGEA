    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.utez.Dao;

import Utilerias.ConexionMySql;
import edu.utez.Bean.BeanAsignacion;
import edu.utez.Bean.BeanGrupos;
import edu.utez.Bean.BeanMateria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author RobertoEnrique
 */
public class DaoMateria {

    private String consulta = "select m.Nombre_Materia,m.horas from materia as m join materia_grupo as mg on m.idMateria=mg.materiaID where mg.grupoID=?;";
    private String sqlInsertarAsignacion = "INSERT INTO asignacion_materia (Clave_Materia, idProfesor,TotalHoras, Grupo_idGrupo) VALUES (?, ?, ?, ?)";
    private String profesoresEspecialidad="select profesor.idProfesor, CONCAT(Nombre, ' ', ApellidoPaterno, ' ', ApellidoMaterno) AS NombreCompleto from profesor join especialidad on profesor.idProfesor=especialidad.idProfesor where Descripcion=?";

    public List consultaMaterias(String id) {
        List listaMaterias = new ArrayList();

        try {
            Connection con = ConexionMySql.getConnection();
            PreparedStatement ps = con.prepareStatement(consulta);
            System.out.println("id que recibe mi dao: " + id);
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                BeanMateria bean = new BeanMateria();
                bean.setNombreMateria(rs.getString(1));
                bean.setHoras(rs.getString(2));
                bean.setListaProfesores(consultaProfesoresEspecialidad(rs.getString(1)));
                listaMaterias.add(bean);
            }
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listaMaterias;
    }

    public List consultaProfesoresEspecialidad(String especialidad) {
        List listaProfes = new ArrayList();
        try {

            Connection con = ConexionMySql.getConnection();
            PreparedStatement ps = con.prepareStatement(profesoresEspecialidad);
            ps.setString(1, especialidad);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                BeanMateria bean = new BeanMateria();
                bean.setIdProfesor(rs.getString(1));
                bean.setNombreProfesor(rs.getString(2));
                
                listaProfes.add(bean);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoMateria.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaProfes;

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
