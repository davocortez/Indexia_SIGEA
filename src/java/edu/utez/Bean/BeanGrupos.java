/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.utez.Bean;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author RobertoEnrique
 */
public class BeanGrupos {

    private int idGrupo;
    private String cuatrimestre;
    private String grupo;
    private String descripcion;
    private String turno;
    private int estado;
    private int materiID;

    List listaGrupos = new ArrayList();

    public List getListaGrupos() {
        return listaGrupos;
    }

    public void setListaGrupos(List listaGrupos) {
        this.listaGrupos = listaGrupos;
    }

    public String getCuatrimestre() {
        return cuatrimestre;
    }

    public void setCuatrimestre(String cuatrimestre) {
        this.cuatrimestre = cuatrimestre;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public int getMateriID() {
        return materiID;
    }

    public void setMateriID(int materiID) {
        this.materiID = materiID;
    }

    public int getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(int idGrupo) {
        this.idGrupo = idGrupo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

}
