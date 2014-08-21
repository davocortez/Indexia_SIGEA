/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.utez.Acciones;

import static com.opensymphony.xwork2.Action.SUCCESS;
import java.util.ArrayList;
import java.util.List;
import edu.utez.Dao.DaoGrupo;

/**
 *
 * @author RobertoEnrique
 */
public class AccionesGrupo {

    List listaGrupos = new ArrayList();
    List listaBaja = new ArrayList();
    
    public List getListaBaja() {
        return listaBaja;
    }

    public void setListaBaja(List listaBaja) {
        this.listaBaja = listaBaja;
    }

    public List getListaGrupos() {
        return listaGrupos;
    }

    public void setListaGrupos(List listaGrupos) {
        this.listaGrupos = listaGrupos;
    }

    public String consultarGrupos() {
        DaoGrupo dao = new DaoGrupo();
        listaGrupos = dao.consultaAltaGrupos();
        listaBaja = dao.consultaAsignacion();
        return SUCCESS;
    }
   
}
