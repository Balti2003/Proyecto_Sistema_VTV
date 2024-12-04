/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.Modelos;

/**
 *
 * @author oroca
 */
public class Seccion {
    private String nombreSeccion;
    private int nroSeccion;
  //private Maquina maquina;

    public Seccion(String nombreSeccion, int nroSeccion) {
        this.nombreSeccion = nombreSeccion;
        this.nroSeccion = nroSeccion;
    }

    public String getNombreSeccion() {
        return nombreSeccion;
    }

    public void setNombreSeccion(String nombreSeccion) {
        this.nombreSeccion = nombreSeccion;
    }

    public int getNroSeccion() {
        return nroSeccion;
    }

    public void setNroSeccion(int nroSeccion) {
        this.nroSeccion = nroSeccion;
    }

    @Override
    public String toString() {
        return "Seccion" + nroSeccion + " | " + nombreSeccion;
    }
    
    
    
}
