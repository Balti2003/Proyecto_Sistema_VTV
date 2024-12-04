/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.Gestores;

import java.time.LocalDateTime;
import java.util.ArrayList;
import org.example.Modelos.Revision;
import org.example.Modelos.Vehiculo;

/**
 *
 * @author oroca
 */
public class GestorRevision {
    private final ArrayList<Revision> listaRevisiones = new ArrayList<>();

    public ArrayList<Revision> getListaRevisiones() {
        return listaRevisiones;
    }
    
    public void registrarRevision(Vehiculo vehiculo, LocalDateTime fechaRealizacion){
        listaRevisiones.add(new Revision(vehiculo, fechaRealizacion, "Iniciada"));
    }
    
    public void registrarCancelacion(Revision revision){
        revision.setEstadoRevision("Cancelada");    
    }
    
    public Revision buscarRevisionActivaPorPatente(String patente){   
        for(Revision revision : listaRevisiones){
            if(revision.getVehiculo().getPatente().equals(patente) && revision.getEstadoRevision().equals("Iniciada")){
                return revision;
            }
        }
        return null;
    }
    
    
    
}
