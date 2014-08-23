/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.utez.Acciones;

import static com.opensymphony.xwork2.Action.SUCCESS;
import edu.utez.Bean.BeanProfesor;
import java.util.ArrayList;
import java.util.List;
import edu.utez.Dao.DaoGrupo;
import edu.utez.Dao.DaoPrimerGrado;

/**
 *
 * @author RobertoEnrique
 */
public class AccionesGrupo {

    List listaGrupos = new ArrayList();
    List listaBaja = new ArrayList();

    public boolean chk;
    List listaDesarrollo;
    List listaSoporte;
    List listaMetodologia;
    List listaOfimatica;
    List listaFundamentos;
    List listaExprecion;
    List listaIngles;
    List listaFormacion;

    private int idEstado;

    public boolean isChk() {
        return chk;
    }

    public void setChk(boolean chk) {
        this.chk = chk;
    }

    public List getListaFormacion() {
        return listaFormacion;
    }

    public void setListaFormacion(List listaFormacion) {
        this.listaFormacion = listaFormacion;
    }

    public List getListaDesarrollo() {
        return listaDesarrollo;
    }

    public void setListaDesarrollo(List listaDesarrollo) {
        this.listaDesarrollo = listaDesarrollo;
    }

    public List getListaSoporte() {
        return listaSoporte;
    }

    public void setListaSoporte(List listaSoporte) {
        this.listaSoporte = listaSoporte;
    }

    public List getListaMetodologia() {
        return listaMetodologia;
    }

    public void setListaMetodologia(List listaMetodologia) {
        this.listaMetodologia = listaMetodologia;
    }

    public List getListaOfimatica() {
        return listaOfimatica;
    }

    public void setListaOfimatica(List listaOfimatica) {
        this.listaOfimatica = listaOfimatica;
    }

    public List getListaFundamentos() {
        return listaFundamentos;
    }

    public void setListaFundamentos(List listaFundamentos) {
        this.listaFundamentos = listaFundamentos;
    }

    public List getListaExprecion() {
        return listaExprecion;
    }

    public void setListaExprecion(List listaExprecion) {
        this.listaExprecion = listaExprecion;
    }

    public List getListaIngles() {
        return listaIngles;
    }

    public void setListaIngles(List listaIngles) {
        this.listaIngles = listaIngles;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

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

    public String altaGrupos() {
        DaoGrupo dao = new DaoGrupo();

        if (chk == false) {
            dao.actualizarEstado(1);
        } else {
            System.out.println("Error");
        }
        return SUCCESS;
    }

    public String consultarPrimero() {

        DaoPrimerGrado dao = new DaoPrimerGrado();
        listaDesarrollo = dao.consultaDesarolleHabilidades();
        listaSoporte = dao.consultaSoporteTecnico();
        listaExprecion = dao.consultaExprecion();
        listaFundamentos = dao.consultaFundamentos();
        listaIngles = dao.consultaIngles();
        listaMetodologia = dao.consultaMetodologia();
        listaOfimatica = dao.consultaOfimatica();
        listaFormacion = dao.consultaFormacion();
        System.out.println("Lista = " + listaDesarrollo.get(0));
        return SUCCESS;
    }

    public String guaradrProfe() {
        BeanProfesor bean = new BeanProfesor();

        return SUCCESS;
    }

}
