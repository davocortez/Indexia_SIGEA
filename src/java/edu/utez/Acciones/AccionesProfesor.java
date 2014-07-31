/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.utez.Acciones;

import static com.opensymphony.xwork2.Action.SUCCESS;
import edu.utez.Dao.DaoProfesor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author RobertoEnrique
 */
public class AccionesProfesor {

    List listaProfesor = new ArrayList();
    private int idMateria;

    public List getListaProfesor() {
        return listaProfesor;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public void setListaProfesor(List listaProfesor) {
        this.listaProfesor = listaProfesor;
    }

    public String consultarProfesor() {
        System.out.println("Vale: " + idMateria);
        DaoProfesor dao = new DaoProfesor();
        listaProfesor = dao.consultaProfesor();
        return SUCCESS;
    }
}
