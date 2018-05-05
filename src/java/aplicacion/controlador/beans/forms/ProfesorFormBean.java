/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.forms;

import aplicacion.modelo.dominio.Profesor;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Sergio Romero
 */
@ManagedBean
@ViewScoped
public class ProfesorFormBean implements Serializable{
    private Profesor profesor;
    private Profesor nuevoProfesor;
    /**
     * Creates a new instance of ProfesorFormBean
     */
    public ProfesorFormBean() {
        profesor = new Profesor();
        nuevoProfesor = new Profesor();
    }

    /**
     * @return the profesor
     */
    public Profesor getProfesor() {
        return profesor;
    }

    /**
     * @param profesor the profesor to set
     */
    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    /**
     * @return the nuevoProfesor
     */
    public Profesor getNuevoProfesor() {
        return nuevoProfesor;
    }

    /**
     * @param nuevoProfesor the nuevoProfesor to set
     */
    public void setNuevoProfesor(Profesor nuevoProfesor) {
        this.nuevoProfesor = nuevoProfesor;
    }
    
    public void agregarProfesor(){
        profesor = nuevoProfesor;
        nuevoProfesor = new Profesor();
    }
    
}
