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

/**
 *
 * @author oroca
 */
public class GestorCliente {
    private ArrayList<Cliente> listaClientes = new ArrayList<>();

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }
    
    
    public void registrarCliente(String nombre, String apellido, String direccion, String localidad, String telefono, String email, String tipoDocumento, String numeroDocumento){
        listaClientes.add(new Cliente(nombre, apellido, direccion, localidad, telefono, email, tipoDocumento, numeroDocumento));
        
        guardarCliente(listaClientes.getLast());
    }
    
    public Cliente buscarClientePorDni(String NroDni){
        for (Cliente cliente : listaClientes){
            if (cliente.getNumeroDocumento().equals(NroDni)){
                return cliente;
            }
        }
        return null;
    }
    
    public void cargarClientes(){
        InputStream archivoClientes = getClass().getClassLoader().getResourceAsStream("Archivos\\Clientes.txt");
        
        try (BufferedReader br = new BufferedReader(new InputStreamReader(archivoClientes))){
            String linea;
            br.readLine();
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                
             
                if (datos.length == 8) {
                    listaClientes.add(new Cliente(datos[0], datos[1], datos[2],datos[3],datos[4],datos[5],datos[6],datos[7]));
                }else{
                    System.out.println("Error al leer una de las lineas");
                }
            }
            System.out.println("Todos los clientes cargados correctamente");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
    
    private void guardarCliente(Cliente cliente){
        
        try(OutputStreamWriter escritor = new OutputStreamWriter(new FileOutputStream("src\\main\\resources\\Archivos\\Clientes.txt",true))){
            escritor.write("\n");
            escritor.write(
                    cliente.getNombre()+","
                    +cliente.getApellido()+","
                    +cliente.getDireccion()+","
                    +cliente.getLocalidad()+","
                    +cliente.getTelefono()+","
                    +cliente.getEmail()+","
                    +cliente.getTipoDocumento()+","
                    +cliente.getNumeroDocumento()
            );
            escritor.flush();
            
        }catch (IOException e) {
            System.err.println("Error al intentar escribir en el archivo: " + e);
        }
    }
    
}
