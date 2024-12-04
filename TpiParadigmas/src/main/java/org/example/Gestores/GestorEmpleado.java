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
import org.example.Modelos.Empleado;

/**
 *
 * @author oroca
 */
public class GestorEmpleado {
    private final ArrayList<Empleado> listaEmpleados = new ArrayList<>();

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }
    
    public void cargarEmpleados(){
        InputStream archivoEmpleado = getClass().getClassLoader().getResourceAsStream("Archivos\\Empleados.txt");
        
        try (BufferedReader br = new BufferedReader(new InputStreamReader(archivoEmpleado))){
            String linea;
            br.readLine();
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                
             
                if (datos.length == 10) {
                    listaEmpleados.add(new Empleado(datos[0], datos[1], datos[2],datos[3],datos[4],datos[5],datos[6],datos[7],datos[8],datos[9]));
                }else{
                    System.out.println("Error al leer una de las lineas");
                }
            }
            System.out.println("Todos los empleados cargados correctamente");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
    
    public Empleado buscarEmpleadoPorEmailYLegajo(String email, String legajo){
        for (Empleado empleado : listaEmpleados){
            if(empleado.getEmail().equals(email) && empleado.getLegajo().equals(legajo)){
                return empleado;
            }
        }
        return null;
    }
    
}
