/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.Modelos;

/**
 *
 * @author oroca
 */
public class Empleado extends Persona{
    private String legajo;
    private String rol;

    public Empleado(String legajo, String rol, String nombre, String apellido, String direccion, String localidad, String telefono, String email, String tipoDocumento, String numeroDocumento) {
        super(nombre, apellido, direccion, localidad, telefono, email, tipoDocumento, numeroDocumento);
        this.legajo = legajo;
        this.rol = rol;
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Empleado{" + "legajo=" + legajo + ", rol=" + rol + '}';
    }
    
    
    
}
