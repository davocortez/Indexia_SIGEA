/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.utez.Acciones;

import static com.opensymphony.xwork2.Action.SUCCESS;
import edu.utez.Dao.DaoMateria;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author RobertoEnrique
 */
public class AccionesMaterias {

    List listaMaterias = new ArrayList();

    public List getListaMaterias() {
        return listaMaterias;
    }

    public void setListaMaterias(List listaMaterias) {
        this.listaMaterias = listaMaterias;
    }

    public String consultaMaterias() {
        DaoMateria dao = new DaoMateria();
        listaMaterias = dao.consultaMaterias();
        return SUCCESS;
    }

}
