/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.Modelos;

/**
 *
 * @author oroca
 */
public class DefectoVisual {
    private int idDefecto;
    private String descrpcion;
    private String calificacionDefecto;

    public DefectoVisual(int idDefecto, String descrpcion, String calificacionDefecto) {
        this.idDefecto = idDefecto;
        this.descrpcion = descrpcion;
        this.calificacionDefecto = calificacionDefecto;
    }

    public int getIdDefecto() {
        return idDefecto;
    }

    public void setIdDefecto(int idDefecto) {
        this.idDefecto = idDefecto;
    }

    public String getDescrpcion() {
        return descrpcion;
    }

    public void setDescrpcion(String descrpcion) {
        this.descrpcion = descrpcion;
    }

    public String getCalificacionDefecto() {
        return calificacionDefecto;
    }

    public void setCalificacionDefecto(String calificacionDefecto) {
        this.calificacionDefecto = calificacionDefecto;
    }

    @Override
    public String toString() {
        return idDefecto + " | " + descrpcion + " | " + calificacionDefecto;
    }
    
    
    
}
