/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.Modelos;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author oroca
 */
public class Revision {
    private final Vehiculo vehiculo;
    private final LocalDateTime fechaRealizacion;
    private LocalDateTime fechaVencimiento;
    //private Oblea oblea;
    private Empleado supervisor;
    private final ArrayList<Medicion> listaMediciones;
    private final ArrayList<DefectoVisual> listaDefectosVisuales;
    private String resultadoRevision;
    private String estadoRevision;

    public Revision(Vehiculo vehiculo, LocalDateTime fechaRealizacion, String estadoRevision) {
        this.vehiculo = vehiculo;
        this.fechaRealizacion = fechaRealizacion;
        this.listaMediciones = new ArrayList<>();
        this.listaDefectosVisuales = new ArrayList<>();
        this.estadoRevision = estadoRevision;
    }
    
    public Vehiculo getVehiculo(){
        return this.vehiculo;
    }
    
    public LocalDateTime getFechaRealizacion(){
        return this.fechaRealizacion;
    }
    
    public LocalDateTime getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDateTime fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }


    public Empleado getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Empleado supervisor) {
        this.supervisor = supervisor;
    }
    
    public ArrayList<Medicion> getListaMediciones(){
        return this.listaMediciones;
    }
        
    public ArrayList<DefectoVisual> getListaDefectosVisuales(){
        return this.listaDefectosVisuales;
    }

    public String getResultadoRevision() {
        return resultadoRevision;
    }

    public void setResultadoRevision(String resultadoRevision) {
        this.resultadoRevision = resultadoRevision;
    }

    public String getEstadoRevision() {
        return estadoRevision;
    }

    public void setEstadoRevision(String estadoRevision) {
        this.estadoRevision = estadoRevision;
    }
    
    public void registrarMedicion(Seccion seccion, int medida, int valorReferencia,Empleado inspector){
        this.listaMediciones.add(new Medicion(seccion, medida, valorReferencia, inspector));
        listaMediciones.getLast().calcularResultado();
    }
    
    public void registrarDefectoVisual(DefectoVisual defectoVisual){
        this.listaDefectosVisuales.add(defectoVisual);
    }
    
    public void registrarFinalizacionDeRevision(LocalDateTime fechaVto, String resultado, Empleado supervisor){
        this.fechaVencimiento = fechaVto;
        this.resultadoRevision = resultado;
        this.supervisor = supervisor;
    }
    
    public String calcularResultado(){
        int cantidadGraves = 0;
        int cantidadMedios = 0;
        int cantidadLeves = 0;
        double puntos = 10;
        
        for(Medicion medicion : listaMediciones){
            if(medicion.getResultadoSeccion().equals("Desaprobado")){
                cantidadGraves += 1 ;
            }else if(medicion.getResultadoSeccion().equals("Condicional")){
                cantidadMedios += 1;
            }
        }
        
        for(DefectoVisual defectoVisual : listaDefectosVisuales){
            switch (defectoVisual.getCalificacionDefecto()) {
                case "Grave" -> cantidadGraves += 1;
                
                case "Media" -> cantidadMedios += 1;
                
                case "Leve" -> cantidadLeves += 1;
            }
        }
        
        puntos -= cantidadGraves - (cantidadMedios/2) - (cantidadLeves/4);
        
        if(puntos >= 8){
            return "Aprobado";
        }else if (puntos <8 && puntos >= 5){
            return "Condicional";
        }else{
            return "Rechazada";
        }
    }
    
    
    
    
    
}
