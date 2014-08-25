/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.utez.Acciones;

import static com.opensymphony.xwork2.Action.SUCCESS;
import edu.utez.Dao.DaoAsesores;
import edu.utez.Dao.DaoProfesor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author David
 */
public class AccionesEspecialidad {

    List ListaNombreProfesores = new ArrayList();
    List listaEspecialidad = new ArrayList();

    public List getListaEspecialidad() {
        return listaEspecialidad;
    }

    public void setListaEspecialidad(List listaEspecialidad) {
        this.listaEspecialidad = listaEspecialidad;
    }
    
    

    public List getListaNombreProfesores() {
        return ListaNombreProfesores;
    }

    public void setListaNombreProfesores(List ListaNombreProfesores) {
        this.ListaNombreProfesores = ListaNombreProfesores;
    }

    public String consultarProfesores() {
        DaoProfesor dao = new DaoProfesor();
        DaoAsesores daoA = new DaoAsesores();
        this.setListaNombreProfesores(dao.consultaProfesoresModuloProf());
     
        return SUCCESS;
    }

}
