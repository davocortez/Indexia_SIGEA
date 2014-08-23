/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.utez.Bean;

/**
 *
 * @author RobertoEnrique
 */
public class BeanAsignacion {

    private int clave_Materia;
    private int idProfesor;
    private int hora;
    private int totalHoras;
    private int grupo_idGrupo;

    public int getClave_Materia() {
        return clave_Materia;
    }

    public void setClave_Materia(int clave_Materia) {
        this.clave_Materia = clave_Materia;
    }

    public int getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getTotalHoras() {
        return totalHoras;
    }

    public void setTotalHoras(int totalHoras) {
        this.totalHoras = totalHoras;
    }

    public int getGrupo_idGrupo() {
        return grupo_idGrupo;
    }

    public void setGrupo_idGrupo(int grupo_idGrupo) {
        this.grupo_idGrupo = grupo_idGrupo;
    }

}
