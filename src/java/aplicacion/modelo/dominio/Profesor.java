/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aplicacion.modelo.dominio;

import java.io.Serializable;

/**
 * 
 * @author Sergio Romero
 */
public class Profesor implements Serializable{
    private int legajo;
    private String nombre;
    private String apellido;
    private int edad;
    private String materia;

    public Profesor() {
    }

    public Profesor(int legajo, String nombre, String apellido, int edad, String materia) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.materia = materia;
    }
    
    /**
     * @return the legajo
     */
    public int getLegajo() {
        return legajo;
    }

    /**
     * @param legajo the legajo to set
     */
    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the materia
     */
    public String getMateria() {
        return materia;
    }

    /**
     * @param materia the materia to set
     */
    public void setMateria(String materia) {
        this.materia = materia;
    }
}

