/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.Gestores;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import org.example.Modelos.Cliente;
import org.example.Modelos.TipoVehiculo;
import org.example.Modelos.Vehiculo;


public class GestorVehiculo {
    private final ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();
    private final ArrayList<TipoVehiculo> listaTipoVehiculos = new ArrayList<>();

    public ArrayList<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public ArrayList<TipoVehiculo> getListaTipoVehiculos() {
        return listaTipoVehiculos;
    }
    
    public void iniciarTiposVehiculo(){
        listaTipoVehiculos.add(new TipoVehiculo("Automovil","Vehiuclo monomotor liviano de 2 ejes",3000.0));
        listaTipoVehiculos.add(new TipoVehiculo("Motocicleta","Vehiuclo monomotor liviano de 2 ruedas",1500.0));
        listaTipoVehiculos.add(new TipoVehiculo("Camioneta","Vehiuclo monomotor pesado de 2 ejes",5500.50));
        listaTipoVehiculos.add(new TipoVehiculo("Camion","Vehiuclo monomotor pesado de 2 ejes o mas",7890.25));  
    }
    
    public void registrarVehiculo(Cliente dueno, String marca, String modelo, TipoVehiculo tipoVehiculo, String anoFabricacion, String patente){
        listaVehiculos.add(new Vehiculo(dueno, marca, modelo, tipoVehiculo, anoFabricacion, patente));
        guardarVehiculo(listaVehiculos.getLast());    
    }
    
    public void cargarVehiculos(GestorCliente gestorCliente){
        InputStream archivoVehiculos = getClass().getClassLoader().getResourceAsStream("Archivos\\Vehiculos.txt");
        
        try (BufferedReader br = new BufferedReader(new InputStreamReader(archivoVehiculos))){
            String linea;
            br.readLine();
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                
             
                if (datos.length == 6) {
                    listaVehiculos.add(new Vehiculo(gestorCliente.buscarClientePorDni(datos[0]), datos[1], datos[2],buscarTipoVehiculo(datos[3]),datos[4],datos[5]));
                }else{
                    System.out.println("Error al leer una de las lineas");
                }
            }
            System.out.println("Todos los vehiculos cargados correctamente");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
    
    private void guardarVehiculo(Vehiculo vehiculo){
        
        try(OutputStreamWriter escritor = new OutputStreamWriter(new FileOutputStream("src\\main\\resources\\Archivos\\Vehiculos.txt",true))){
            escritor.write("\n");
            escritor.write(
                    vehiculo.getDueno().getNumeroDocumento() + ","
                    + vehiculo.getMarca() + ","
                    + vehiculo.getModelo() + ","
                    + vehiculo.getTipoVehiculo().getNombre() + ","
                    + vehiculo.getAnoFabricacion() + ","
                    + vehiculo.getPatente()
            );
            escritor.flush();
            
        }catch (IOException e) {
            System.err.println("Error al intentar escribir en el archivo: " + e);
        }
    }
    
    public TipoVehiculo buscarTipoVehiculo(String nombre){
        for(TipoVehiculo tipoVehiculo : listaTipoVehiculos){
            if(tipoVehiculo.getNombre().equals(nombre)){
                return tipoVehiculo;
            }
        }
        return null;
    }
    
    
    
}
