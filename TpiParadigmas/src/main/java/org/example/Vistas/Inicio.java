/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.example.Vistas;

import org.example.Modelos.Empleado;

/**
 *
 * @author oroca
 */
public class Inicio extends javax.swing.JFrame {
    private boolean presionado;
    private int opcion;
    
    public Inicio() {
        this.presionado = false;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logoApplus = new javax.swing.JLabel();
        textoSeleccione = new javax.swing.JLabel();
        textoEmpleado = new javax.swing.JLabel();
        campoMuestraEmpleado = new javax.swing.JTextField();
        textoRol = new javax.swing.JLabel();
        campoMuestraRol = new javax.swing.JTextField();
        botonCerrarSesion = new javax.swing.JButton();
        opcionesPorRol = new javax.swing.JPanel();
        opcionesSupervisor = new javax.swing.JPanel();
        btnFinalizarRev = new javax.swing.JButton();
        btnCancelarRev1 = new javax.swing.JButton();
        opcionesCajero = new javax.swing.JPanel();
        btnRegistrarRev = new javax.swing.JButton();
        btnCancelarRev2 = new javax.swing.JButton();
        opcionesRecepcionista = new javax.swing.JPanel();
        btnRegistrarCliente = new javax.swing.JButton();
        btnRegistrarVehiculo = new javax.swing.JButton();
        opcionesInspector = new javax.swing.JPanel();
        btnRegistrarMedicion = new javax.swing.JButton();
        btnRegistrarDefectos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Applus VTV - Inicio");

        logoApplus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoApplus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesVistas/LogoApplus.png"))); // NOI18N

        textoSeleccione.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textoSeleccione.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoSeleccione.setText("Seleccione una opción del menú");

        textoEmpleado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        textoEmpleado.setText("Empleado:");

        campoMuestraEmpleado.setEditable(false);
        campoMuestraEmpleado.setText("Nombre y Apellido");

        textoRol.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        textoRol.setText("Rol:");

        campoMuestraRol.setEditable(false);
        campoMuestraRol.setText("Rol");

        botonCerrarSesion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botonCerrarSesion.setText("Cerrar Sesión");
        botonCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarSesionActionPerformed(evt);
            }
        });

        opcionesPorRol.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        opcionesPorRol.setToolTipText("");

        btnFinalizarRev.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnFinalizarRev.setText("Finalizar Revisión");
        btnFinalizarRev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarRevActionPerformed(evt);
            }
        });

        btnCancelarRev1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCancelarRev1.setText("Cancelar Revisión");
        btnCancelarRev1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarRev1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout opcionesSupervisorLayout = new javax.swing.GroupLayout(opcionesSupervisor);
        opcionesSupervisor.setLayout(opcionesSupervisorLayout);
        opcionesSupervisorLayout.setHorizontalGroup(
            opcionesSupervisorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionesSupervisorLayout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(btnFinalizarRev, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelarRev1)
                .addGap(210, 210, 210))
        );
        opcionesSupervisorLayout.setVerticalGroup(
            opcionesSupervisorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionesSupervisorLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(opcionesSupervisorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFinalizarRev, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarRev1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        btnRegistrarRev.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRegistrarRev.setText("Registrar Revisión");
        btnRegistrarRev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarRevActionPerformed(evt);
            }
        });

        btnCancelarRev2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCancelarRev2.setText("Cancelar Revisión");
        btnCancelarRev2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarRev2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout opcionesCajeroLayout = new javax.swing.GroupLayout(opcionesCajero);
        opcionesCajero.setLayout(opcionesCajeroLayout);
        opcionesCajeroLayout.setHorizontalGroup(
            opcionesCajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionesCajeroLayout.createSequentialGroup()
                .addContainerGap(216, Short.MAX_VALUE)
                .addComponent(btnRegistrarRev, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140)
                .addComponent(btnCancelarRev2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(170, 170, 170))
        );
        opcionesCajeroLayout.setVerticalGroup(
            opcionesCajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionesCajeroLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(opcionesCajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarRev, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarRev2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        btnRegistrarCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRegistrarCliente.setText("Registrar Cliente");
        btnRegistrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarClienteActionPerformed(evt);
            }
        });

        btnRegistrarVehiculo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRegistrarVehiculo.setText("Registrar Vehículo");
        btnRegistrarVehiculo.setActionCommand("Registrar Cliente");
        btnRegistrarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarVehiculoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout opcionesRecepcionistaLayout = new javax.swing.GroupLayout(opcionesRecepcionista);
        opcionesRecepcionista.setLayout(opcionesRecepcionistaLayout);
        opcionesRecepcionistaLayout.setHorizontalGroup(
            opcionesRecepcionistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionesRecepcionistaLayout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addComponent(btnRegistrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(btnRegistrarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(229, Short.MAX_VALUE))
        );
        opcionesRecepcionistaLayout.setVerticalGroup(
            opcionesRecepcionistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionesRecepcionistaLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(opcionesRecepcionistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        btnRegistrarMedicion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRegistrarMedicion.setText("Registrar Medición");
        btnRegistrarMedicion.setActionCommand("Registrar Cliente");
        btnRegistrarMedicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarMedicionActionPerformed(evt);
            }
        });

        btnRegistrarDefectos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRegistrarDefectos.setText("Registrar Defectos Visuales");
        btnRegistrarDefectos.setActionCommand("Registrar Cliente");
        btnRegistrarDefectos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarDefectosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout opcionesInspectorLayout = new javax.swing.GroupLayout(opcionesInspector);
        opcionesInspector.setLayout(opcionesInspectorLayout);
        opcionesInspectorLayout.setHorizontalGroup(
            opcionesInspectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionesInspectorLayout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(btnRegistrarMedicion, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138)
                .addComponent(btnRegistrarDefectos)
                .addContainerGap(155, Short.MAX_VALUE))
        );
        opcionesInspectorLayout.setVerticalGroup(
            opcionesInspectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, opcionesInspectorLayout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addGroup(opcionesInspectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarMedicion, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrarDefectos, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81))
        );

        javax.swing.GroupLayout opcionesPorRolLayout = new javax.swing.GroupLayout(opcionesPorRol);
        opcionesPorRol.setLayout(opcionesPorRolLayout);
        opcionesPorRolLayout.setHorizontalGroup(
            opcionesPorRolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, opcionesPorRolLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(opcionesSupervisor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(opcionesPorRolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(opcionesPorRolLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(opcionesCajero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(opcionesPorRolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(opcionesPorRolLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(opcionesRecepcionista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(opcionesPorRolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(opcionesPorRolLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(opcionesInspector, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        opcionesPorRolLayout.setVerticalGroup(
            opcionesPorRolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, opcionesPorRolLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(opcionesSupervisor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(opcionesPorRolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, opcionesPorRolLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(opcionesCajero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(opcionesPorRolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, opcionesPorRolLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(opcionesRecepcionista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(opcionesPorRolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, opcionesPorRolLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(opcionesInspector, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(opcionesPorRol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(logoApplus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textoRol)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoMuestraRol, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textoEmpleado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoMuestraEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(textoSeleccione, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(botonCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoApplus)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textoEmpleado)
                            .addComponent(campoMuestraEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textoRol)
                            .addComponent(campoMuestraRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(botonCerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textoSeleccione, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addComponent(opcionesPorRol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarSesionActionPerformed
        // TODO add your handling code here:
        opcion = 8;
        presionado = true;
        
        synchronized (this) {
            notify();
        }
    }//GEN-LAST:event_botonCerrarSesionActionPerformed

    private void btnFinalizarRevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarRevActionPerformed
        // TODO add your handling code here:
        presionado = true;
        opcion = 7;
        
         synchronized (this) {
            notify();
        }
        
    }//GEN-LAST:event_btnFinalizarRevActionPerformed

    private void btnRegistrarRevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarRevActionPerformed
        // TODO add your handling code here:
        presionado = true;
        opcion = 3;
        
         synchronized (this) {
            notify();
        }
    }//GEN-LAST:event_btnRegistrarRevActionPerformed

    private void btnRegistrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarClienteActionPerformed
        // TODO add your handling code here:
        presionado = true;
        opcion = 1;
        
        synchronized (this) {
            notify();
        }
    }//GEN-LAST:event_btnRegistrarClienteActionPerformed

    private void btnRegistrarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarVehiculoActionPerformed
        // TODO add your handling code here:
        presionado = true;
        opcion = 2;
        
        synchronized (this) {
            notify();
        }
    }//GEN-LAST:event_btnRegistrarVehiculoActionPerformed

    private void btnCancelarRev1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarRev1ActionPerformed
        // TODO add your handling code here:
        presionado = true;
        opcion = 4;
        
        synchronized (this) {
            notify();
        }
    }//GEN-LAST:event_btnCancelarRev1ActionPerformed

    private void btnCancelarRev2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarRev2ActionPerformed
        // TODO add your handling code here:
        presionado = true;
        opcion = 4;
        
        synchronized (this) {
            notify();
        }
    }//GEN-LAST:event_btnCancelarRev2ActionPerformed

    private void btnRegistrarDefectosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarDefectosActionPerformed
        // TODO add your handling code here:
        presionado = true;
        opcion = 6;
        
        synchronized (this) {
            notify();
        }
    }//GEN-LAST:event_btnRegistrarDefectosActionPerformed

    private void btnRegistrarMedicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarMedicionActionPerformed
        // TODO add your handling code here:
        presionado = true;
        opcion = 5;
        
        synchronized (this) {
            notify();
        }
    }//GEN-LAST:event_btnRegistrarMedicionActionPerformed


    
    //Metodo utilizado para mostrar la pantalla
    public void mostrarPantalla(Empleado empleado){
        //Establecer el campo del nombre y rol del empleado con los datos del empleado pasado como parametro
        campoMuestraEmpleado.setText(empleado.getNombre() + " " + empleado.getApellido());
        campoMuestraRol.setText(empleado.getRol());
        
        //Se llama al metodo privado que hara visibles las opciones correctas segun el rol del empleado
        mostrarOpcionesDeRol(empleado.getRol());
        
        //Se setea la visibilidad de la pantalla en true
        this.setVisible(true);
        
    }
    
    //Metodo utilizado para mostrar la pantalla de registro requerida por el empleado
    public int seleccionOpcion(){
        //Se inicia una espera hasta que el usuario seleccione la opcion que desea realizar
        synchronized (this) {
            while(!presionado){
                try{
                    wait();
                }catch (InterruptedException e) {
                    System.err.print(e);
                }
            }  
        }
        
        //Se setea el atributo presionado nuevamente en false y se retorna al main la opcion seleccionada
        presionado = false;
        return opcion;
    }
    
    //Metodo que muestra el Jpanel correspondiente al rol del empleado que utiliza el sistema
    private void mostrarOpcionesDeRol(String rol){
        //Se setea la visiblidad de todos los Jframe's en false
        opcionesRecepcionista.setVisible(false);
        opcionesCajero.setVisible(false);
        opcionesInspector.setVisible(false);
        opcionesSupervisor.setVisible(false);
        
        //Se setea la visibilidad del jframe coresspondiente al rol del empleado en true
        switch (rol) {
            case "Recepcionista" -> opcionesRecepcionista.setVisible(true);
            
            case "Cajero" -> opcionesCajero.setVisible(true);
            
            case "Inspector" -> opcionesInspector.setVisible(true);
            
            case "Supervisor" -> opcionesSupervisor.setVisible(true);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCerrarSesion;
    private javax.swing.JButton btnCancelarRev1;
    private javax.swing.JButton btnCancelarRev2;
    private javax.swing.JButton btnFinalizarRev;
    private javax.swing.JButton btnRegistrarCliente;
    private javax.swing.JButton btnRegistrarDefectos;
    private javax.swing.JButton btnRegistrarMedicion;
    private javax.swing.JButton btnRegistrarRev;
    private javax.swing.JButton btnRegistrarVehiculo;
    private javax.swing.JTextField campoMuestraEmpleado;
    private javax.swing.JTextField campoMuestraRol;
    private javax.swing.JLabel logoApplus;
    private javax.swing.JPanel opcionesCajero;
    private javax.swing.JPanel opcionesInspector;
    private javax.swing.JPanel opcionesPorRol;
    private javax.swing.JPanel opcionesRecepcionista;
    private javax.swing.JPanel opcionesSupervisor;
    private javax.swing.JLabel textoEmpleado;
    private javax.swing.JLabel textoRol;
    private javax.swing.JLabel textoSeleccione;
    // End of variables declaration//GEN-END:variables
}