/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.utez.Acciones;

import com.opensymphony.xwork2.ActionSupport;
import edu.utez.Dao.DaoGrupo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author David
 */
public class AccionesGrupos extends ActionSupport {

    private String grado;
    private String grupo;
    private String especialidad;
    private String turno;

    List listaDeMaterias = new ArrayList();
        List listaGrupos = new ArrayList();

    public List getListaDeMaterias() {
        return listaDeMaterias;
    }

    public void setListaDeMaterias(List listaDeMaterias) {
        this.listaDeMaterias = listaDeMaterias;
    }

    public List getListaGrupos() {
        return listaGrupos;
    }

    public void setListaGrupos(List listaGrupos) {
        this.listaGrupos = listaGrupos;
    }


    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String insertarGrupo() {
        DaoGrupo dao = new DaoGrupo();
        dao.registrarGrupo(grado, grupo, especialidad, turno);
        consultaGrupo();
//        System.out.println("grado: "+grado);
//        System.out.println("grupo: "+grupo);
//        System.out.println("espe: "+especialidad);
//        System.out.println("turno: "+turno);
        return SUCCESS;
    }
    public String consultaGrupo(){
        DaoGrupo dao = new DaoGrupo();
        dao.consultarGrupos();
        listaGrupos=dao.consultarGrupos();
        
        return SUCCESS;
    
    
    }

}
