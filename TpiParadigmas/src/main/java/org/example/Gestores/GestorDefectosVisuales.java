/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.Gestores;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import org.example.Modelos.DefectoVisual;


public class GestorDefectosVisuales {
    private final ArrayList<DefectoVisual> listaDefectosVisuales = new ArrayList<>();

    public ArrayList<DefectoVisual> getListaDefectosVisuales() {
        return listaDefectosVisuales;
    }
    
    public void cargarDefectosVisuales(){
        InputStream archivoDefectos = getClass().getClassLoader().getResourceAsStream("Archivos\\DefectosVisuales.txt");
        
        try (BufferedReader br = new BufferedReader(new InputStreamReader(archivoDefectos))){
            String linea;
            br.readLine();
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                
             
                if (datos.length == 3) {
                    listaDefectosVisuales.add(new DefectoVisual(Integer.parseInt(datos[0]), datos[1], datos[2]));
                }else{
                    System.out.println("Error al leer una de las lineas");
                }
            }
            System.out.println("Todos los defectos visuales cargados correctamente");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
    
}
