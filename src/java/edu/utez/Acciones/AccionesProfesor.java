/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.utez.Acciones;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import edu.utez.Bean.BeanGrupo;
import edu.utez.Bean.BeanProfesor;
import edu.utez.Dao.DaoAsesores;
import edu.utez.Dao.DaoProfesor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author RobertoEnrique
 */
public class AccionesProfesor extends ActionSupport {

    private int idGrupo;
    private int Cuatrimestre;
    private String Grupo;
    private String Descripcion;
    private String Turno;
    private String nombreProfesor;
    private int idProfesor;
    private String Nombre;
    
    private String nombre;
    private String apePaterno;
    private String apeMaterno;

    

    List listaProfesor = new ArrayList();

    public void setListaProfesor(List listaProfesor) {
        this.listaProfesor = listaProfesor;
    }

    public String consultarProfesor() {
        DaoProfesor dao = new DaoProfesor();
        listaProfesor = dao.consultaProfesor();
        dao.consultaProfesoresModuloProf();
        return SUCCESS;
    }

    /*Modulo de tutores   Hector flores --combo*/
    public String registroAsesores() {
        DaoProfesor dao = new DaoProfesor();
        BeanProfesor profesor = new BeanProfesor();
        BeanGrupo grupo = new BeanGrupo();

        profesor.setIdProfesor(this.getIdProfesor());
        grupo.setIdGrupo(this.getIdGrupo());
        System.out.println("id prof: " + idProfesor);
        System.out.println("id grupo: " + idGrupo);

        dao.registroAsesores(profesor, grupo);
        consultaAsesores();
        addFieldError("errorVerde", "Registro fallido");
        return SUCCESS;
    }

    List ListaNombreProfesores = new ArrayList();
    List ListadeGrados = new ArrayList();

    public List getListaNombreProfesores() {
        return ListaNombreProfesores;
    }

    public void setListaNombreProfesores(List ListaNombreProfesores) {
        this.ListaNombreProfesores = ListaNombreProfesores;
    }

    public List getListadeGrados() {
        return ListadeGrados;
    }

    public void setListadeGrados(List ListadeGrados) {
        this.ListadeGrados = ListadeGrados;
    }

    public String consultaAsesores() {
        DaoProfesor dao = new DaoProfesor();
        DaoAsesores daoA = new DaoAsesores();
        this.setListaNombreProfesores(dao.consultaProfesoresModuloProf());
        this.setListadeGrados(dao.consultaGradoGrupoProfesores());
        this.setConsultaProfesoresSelect(daoA.consultaProfesoresSelect());
        return SUCCESS;
    }
    
    /* consulta tabla tutores */
    List consultaProfesoresSelect= new ArrayList();

    public List getConsultaProfesoresSelect() {
        return consultaProfesoresSelect;
    }

    public void setConsultaProfesoresSelect(List consultaProfesoresSelect) {
        this.consultaProfesoresSelect = consultaProfesoresSelect;
    }
    
    
    

    public int getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(int idGrupo) {
        this.idGrupo = idGrupo;
    }

    public int getCuatrimestre() {
        return Cuatrimestre;
    }

    public void setCuatrimestre(int Cuatrimestre) {
        this.Cuatrimestre = Cuatrimestre;
    }

    public String getGrupo() {
        return Grupo;
    }

    public void setGrupo(String Grupo) {
        this.Grupo = Grupo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getTurno() {
        return Turno;
    }

    public void setTurno(String Turno) {
        this.Turno = Turno;
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
    
    

}
