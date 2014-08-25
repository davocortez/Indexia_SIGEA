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

    List<BeanProfesor> listaPersonas = new ArrayList();
    List listaPortafolios = new ArrayList();
    List listaProfesores = new ArrayList();

    private String idProfesor;
    private String estado;
    private String idReporte;
    

    public String getIdReporte() {
        return idReporte;
    }

    public void setIdReporte(String idReporte) {
        this.idReporte = idReporte;
    }
    

    public List getListaProfesores() {
        return listaProfesores;
    }

    public void setListaProfesores(List listaProfesores) {
        this.listaProfesores = listaProfesores;
    }

    public List getListaPortafolios() {
        return listaPortafolios;
    }

    public void setListaPortafolios(List listaPortafolios) {
        this.listaPortafolios = listaPortafolios;
    }

    public String getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(String idProfesor) {
        this.idProfesor = idProfesor;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(List listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    public String consultarProfesores() {
        String idProfesor = "";
        String nombreProfesor = "";
        DaoPortafolio dao = new DaoPortafolio();
        listaPersonas = dao.consultaProfesor();

        for (int i = 0; i < listaPersonas.size(); i++) {
            idProfesor = listaPersonas.get(i).getIdProfesor() + "";
            nombreProfesor = listaPersonas.get(i).getNombreProfesor();
            listaPortafolios = dao.consultaPortafolios(idProfesor);
            BeanProfesor bean = new BeanProfesor();
            bean.setIdProfesor(Integer.parseInt(idProfesor));
            bean.setNombreProfesor(nombreProfesor);
            bean.setPortafolios(listaPortafolios);
            listaProfesores.add(bean);
        }

        for (int i = 0; i < listaProfesores.size(); i++) {
            System.out.println(" tamaño " + i);
        }
        return SUCCESS;
    }

    public String actualizarEstado() {
        DaoPortafolio dao = new DaoPortafolio();
        dao.modificar(idReporte);
        consultarProfesores();
        return SUCCESS;
    }
}
