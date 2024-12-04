/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.example;


import org.example.Gestores.GestorCliente;
import org.example.Gestores.GestorDefectosVisuales;
import org.example.Gestores.GestorEmpleado;
import org.example.Gestores.GestorRevision;
import org.example.Gestores.GestorSeccion;
import org.example.Gestores.GestorVehiculo;
import org.example.Modelos.Empleado;
import org.example.Vistas.FinalizarRevision;
import org.example.Vistas.IniciarSesion;
import org.example.Vistas.Inicio;
import org.example.Vistas.RegistrarCancelacion;
import org.example.Vistas.RegistrarCliente;
import org.example.Vistas.RegistrarDefectosVisuales;
import org.example.Vistas.RegistrarMedicion;
import org.example.Vistas.RegistrarRevision;
import org.example.Vistas.RegistrarVehiculo;

/**
 *
 * @author oroca
 */
public class TpiParadigmas {

    public static void main(String[] args) {
        //Instanciar gestores
        GestorEmpleado gestorEmpleado = new GestorEmpleado();
        GestorCliente gestorCliente = new GestorCliente();
        GestorVehiculo gestorVehiculo = new GestorVehiculo();
        GestorRevision gestorRevision = new GestorRevision();
        GestorSeccion gestorSeccion = new GestorSeccion();
        GestorDefectosVisuales gestorDefectosVisuales = new GestorDefectosVisuales();
        
        //Metodos de inicio y carga de datos previamente registrados de cada gestor
        gestorEmpleado.cargarEmpleados();
        
        gestorCliente.cargarClientes();
        
        gestorVehiculo.iniciarTiposVehiculo();
        gestorVehiculo.cargarVehiculos(gestorCliente);
        
        gestorSeccion.cargarSecciones();
        
        gestorDefectosVisuales.cargarDefectosVisuales();
        
        //Instanciar vistas
        IniciarSesion pantallaIniciarSesion = new IniciarSesion();
        Inicio pantallaInicio = new Inicio();
        RegistrarCliente pantallaRegistrarCliente = new RegistrarCliente(gestorCliente);
        RegistrarVehiculo pantallaRegistrarVehiculo = new RegistrarVehiculo(gestorCliente,gestorVehiculo);
        RegistrarRevision pantallaRegistrarRevision = new RegistrarRevision(gestorCliente,gestorVehiculo,gestorRevision,pantallaRegistrarCliente,pantallaRegistrarVehiculo);
        RegistrarCancelacion pantallaRegistrarCancelacion = new RegistrarCancelacion(gestorRevision);
        RegistrarMedicion pantallaRegistrarMedicion = new RegistrarMedicion(gestorRevision, gestorSeccion);
        RegistrarDefectosVisuales pantallaRegistrarDefectosVisuales = new RegistrarDefectosVisuales(gestorRevision, gestorDefectosVisuales);
        FinalizarRevision pantallaFinalizarRevision = new FinalizarRevision(gestorRevision);
        
        boolean sesionActiva = false;
        
        while (true){
            pantallaIniciarSesion.setVisible(true);
            
            Empleado empleadoEnUso = pantallaIniciarSesion.iniciarSesion(gestorEmpleado);
            
            if (empleadoEnUso!=null){
                sesionActiva = true;
                pantallaInicio.mostrarPantalla(empleadoEnUso);
                pantallaIniciarSesion.setVisible(false);
            }
            
            while(sesionActiva){

                switch (pantallaInicio.seleccionOpcion()){
                    
                    case 1 -> {
                        pantallaInicio.setVisible(false);
                        
                        pantallaRegistrarCliente.mostrarPantalla();
                        
                        pantallaRegistrarCliente.setOnVolverCallback(() -> {
                            pantallaInicio.setVisible(true); 
                        });     
                    }
                    
                    case 2 -> {
                        pantallaInicio.setVisible(false);
                        
                        pantallaRegistrarVehiculo.mostrarPantalla();
                        
                        pantallaRegistrarVehiculo.setOnVolverCallback(() -> {
                            pantallaInicio.setVisible(true);
                        });
                    }
                    
                    case 3 -> {
                        pantallaInicio.setVisible(false);
                        
                        pantallaRegistrarRevision.mostrarPantalla();
                        
                        pantallaRegistrarRevision.setOnVolverCallback(() -> {
                            pantallaInicio.setVisible(true);
                        });
                    }
                    
                    case 4 -> {
                        pantallaInicio.setVisible(false);
                        
                        pantallaRegistrarCancelacion.mostrarPantalla();
                        
                        pantallaRegistrarCancelacion.setOnVolverCallback(() -> {
                            pantallaInicio.setVisible(true);
                        });
                    }
                    
                    case 5 -> {
                        pantallaInicio.setVisible(false);
                        
                        pantallaRegistrarMedicion.mostrarPantalla(empleadoEnUso);
                        
                        pantallaRegistrarMedicion.setOnVolverCallback(() -> {
                            pantallaInicio.setVisible(true);
                        });
                    }
                    
                    case 6 -> {
                        pantallaInicio.setVisible(false);
                        
                        pantallaRegistrarDefectosVisuales.mostrarPantalla();
                        
                        pantallaRegistrarDefectosVisuales.setOnVolverCallback(() -> {
                            pantallaInicio.setVisible(true);
                        });  
                    }
                    
                    case 7 -> {
                        pantallaInicio.setVisible(false);
                        
                        pantallaFinalizarRevision.mostrarPantalla(empleadoEnUso);
                        
                        pantallaFinalizarRevision.setOnVolverCallback(() -> {
                            pantallaInicio.setVisible(true);
                        });  
                        
                    }
                    
                    case 8 -> {
                        pantallaInicio.setVisible(false);
                        sesionActiva = false;
                        empleadoEnUso = null;
                    }
                }
            }
        }     
    }
}
