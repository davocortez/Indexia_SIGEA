/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.utez.Acciones;

import static com.opensymphony.xwork2.Action.SUCCESS;
import edu.utez.Bean.BeanMateria;
import edu.utez.Dao.DaoMateria;
import edu.utez.Dao.DaoProfesor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author RobertoEnrique
 */
public class AccionesMaterias {

    List listaMaterias = new ArrayList();
    List listaProfesor = new ArrayList();
    private String idGrupo;
    private String cuatrimestre;
    private String grupo;
    private String nombreMateria;
    private String horas;
    private BeanMateria bean;

    public String getHoras() {
        return horas;
    }

    public void setHoras(String horas) {
        this.horas = horas;
    }

    public BeanMateria getBean() {
        return bean;
    }

    public void setBean(BeanMateria bean) {
        this.bean = bean;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public String getCuatrimestre() {
        return cuatrimestre;
    }

    public void setCuatrimestre(String cuatrimestre) {
        this.cuatrimestre = cuatrimestre;
    }

    public String getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(String idGrupo) {
        this.idGrupo = idGrupo;
    }

    public List getListaMaterias() {
        return listaMaterias;
    }

    public void setListaMaterias(List listaMaterias) {
        this.listaMaterias = listaMaterias;
    }

    public List getListaProfesor() {
        return listaProfesor;
    }

    public void setListaProfesor(List listaProfesor) {
        this.listaProfesor = listaProfesor;
    }

    public String consultaMaterias() {

        DaoMateria dao = new DaoMateria();
        System.out.println("idGrupo: " + idGrupo);
        listaMaterias = dao.consultaMaterias(idGrupo);
        return SUCCESS;
    }
}
