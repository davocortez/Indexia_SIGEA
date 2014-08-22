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
import edu.utez.Dao.DaoProfesor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author RobertoEnrique
 */
public class AccionesProfesor extends ActionSupport{
    
    private int idGrupo;
private int Cuatrimestre;
private String Grupo;
private String Descripcion;
private String Turno;
    private String nombreProfesor;
    private int idProfesor;

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
    
    public String registroAsesores(){
        DaoProfesor dao = new DaoProfesor();
        BeanProfesor profesor = new BeanProfesor();
        BeanGrupo grupo = new BeanGrupo();
        
        profesor.setIdProfesor(this.getIdProfesor());
        grupo.setIdGrupo(this.getIdGrupo());
        System.out.println("id prof: "+idProfesor);
        System.out.println("id grupo: "+idGrupo);
        
        dao.registroAsesores(profesor, grupo); 
        addFieldError("errorVerde", "Registro fallido");
                return SUCCESS;
        
        
        
      
    }
    
    /*Modulo de tutores   Hector flores --combo*/
    /*
    List ListaProfesoresModulo= new ArrayList();

    public List getListaProfesoresModulo() {
        return ListaProfesoresModulo;
    }

    public void setListaProfesoresModulo(List ListaProfesoresModulo) {
        this.ListaProfesoresModulo = ListaProfesoresModulo;
    }

 
    
    
    public  String consultarProfesoresModuloProf(){
            DaoProfesor daop = new DaoProfesor();
           this.setListaProfesoresModulo(daop.consultaProfesoresModuloProf());
        return SUCCESS;
   
    }
    
    /* Consulta tabla profesores
    
    List ListaDetallesProfesores=new ArrayList();

    public List getListaDetallesProfesores() {
        return ListaDetallesProfesores;
    }

    public void setListaDetallesProfesores(List ListaDetallesProfesores) {
        this.ListaDetallesProfesores = ListaDetallesProfesores;
    }
    
    public String consultaDetallesProfesor(){
        DaoProfesor dao= new DaoProfesor();
        this.setListaDetallesProfesores(dao.DetallesProfesoresModuloProf());
        
        return SUCCESS;
    }
    */
    
    List ListaNombreProfesores = new ArrayList();
    List ListadeGrados= new ArrayList();

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
    
       public String consultaAsesores(){
        DaoProfesor dao = new DaoProfesor();
        this.setListaNombreProfesores(dao.consultaProfesoresModuloProf());
        this.setListadeGrados(dao.consultaGradoGrupoProfesores());
        return SUCCESS;
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
