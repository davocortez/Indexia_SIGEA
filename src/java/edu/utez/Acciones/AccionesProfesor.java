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
    public void setListaProfesor(List listaProfesor) {
        this.listaProfesor = listaProfesor;
    }

    public String consultarProfesor() {
        DaoProfesor dao = new DaoProfesor();
        listaProfesor = dao.consultaProfesor();
        return SUCCESS;
    }
}
