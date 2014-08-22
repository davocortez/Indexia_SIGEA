/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.utez.Bean;

import static com.opensymphony.xwork2.Action.SUCCESS;
import edu.utez.Dao.DaoPortafolio;

/**
 *
 * @author RobertoEnrique
 */
public class BeanProfesor {

    private String nombreProfesor;
    private int idProfesor;
    private String nombre;
    private String apePaterno;
    private String apeMaterno;
    private String disponibilidad;

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApePaterno() {
        return apePaterno;
    }

    public void setApePaterno(String apePaterno) {
        this.apePaterno = apePaterno;
    }

    public String getApeMaterno() {
        return apeMaterno;
    }

    public void setApeMaterno(String apeMaterno) {
        this.apeMaterno = apeMaterno;
    }
    
    

    public String getNombreProfesor() {
        return nombreProfesor;
    }

    public void setNombreProfesor(String nombreProfesor) {
        this.nombreProfesor = nombreProfesor;
    }

    public int getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }
    
    public String registrarProfesores() {
        DaoPortafolio dao = new DaoPortafolio();
        BeanProfesor bean=new BeanProfesor();
        System.out.println("-----------------------------------nombre: "+nombre);
        dao.insertar(nombre, apePaterno, apeMaterno,disponibilidad);
       
        return SUCCESS;
    }

}
