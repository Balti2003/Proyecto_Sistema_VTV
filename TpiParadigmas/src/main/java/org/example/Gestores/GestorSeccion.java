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
import org.example.Modelos.Seccion;


/**
 *
 * @author oroca
 */
public class GestorSeccion {
    private final ArrayList<Seccion> listaSecciones = new ArrayList<>();

    public ArrayList<Seccion> getListaSecciones() {
        return listaSecciones;
    }
    
    public void cargarSecciones(){
        InputStream archivoSecciones = getClass().getClassLoader().getResourceAsStream("Archivos\\Secciones.txt");
        
        try (BufferedReader br = new BufferedReader(new InputStreamReader(archivoSecciones))){
            String linea;
            br.readLine();
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                
             
                if (datos.length == 2) {
                    listaSecciones.add(new Seccion(datos[0],Integer.parseInt(datos[1])));
                }else{
                    System.out.println("Error al leer una de las lineas");
                }
            }
            System.out.println("Todas las secciones cargados correctamente");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
    
}
