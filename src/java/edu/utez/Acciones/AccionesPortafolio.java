/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.utez.Acciones;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import edu.utez.Bean.BeanProfesor;
import edu.utez.Dao.DaoPortafolio;
import edu.utez.Dao.DaoProfesor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author David
 */
public class AccionesPortafolio extends ActionSupport {
    List listaPersonas = new ArrayList();

    public List getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(List listaPersonas) {
        this.listaPersonas = listaPersonas;
    }
    
     public String consultarProfesores() {
        DaoPortafolio dao = new DaoPortafolio();
        dao.consultaProfesor();
        listaPersonas = dao.consultaProfesor();

        return SUCCESS;
    }
     
     public String registrarProfesores() {
        DaoPortafolio dao = new DaoPortafolio();
        BeanProfesor bean=new BeanProfesor();
        dao.insertar(bean.getNombre(), bean.getApePaterno(), bean.getApeMaterno(),bean.getDisponibilidad());
        return SUCCESS;
    }
    
}
