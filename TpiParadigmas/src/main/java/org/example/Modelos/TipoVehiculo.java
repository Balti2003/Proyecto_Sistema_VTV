/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.Modelos;

/**
 *
 * @author oroca
 */
public class TipoVehiculo {
    private String nombre;
    private String descripcion;
    private double precioRevision;

    public TipoVehiculo(String nombre, String descripcion, double precioRevision) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioRevision = precioRevision;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripccion) {
        this.descripcion = descripccion;
    }

    public double getPrecioRevision() {
        return precioRevision;
    }

    public void setPrecioRevision(double precioRevision) {
        this.precioRevision = precioRevision;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
