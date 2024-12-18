/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.example.Vistas;


import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import org.example.Gestores.GestorDefectosVisuales;
import org.example.Gestores.GestorRevision;
import org.example.Modelos.DefectoVisual;
import org.example.Modelos.Revision;


/**
 *
 * @author oroca
 */
public class RegistrarDefectosVisuales extends javax.swing.JFrame {
    private Runnable volverCallBack;
    private Revision revision;
    private GestorRevision gestorRevision;
    private GestorDefectosVisuales gestorDefectosVisuales;
    private DefaultListModel<DefectoVisual> datosDefectosVisuales;
    private DefaultListModel<DefectoVisual> datosDefectosSeleccionados;
    
    
    public RegistrarDefectosVisuales(GestorRevision gestorRevision, GestorDefectosVisuales gestorDefectosVisuales) {
        this.gestorRevision = gestorRevision;
        this.gestorDefectosVisuales = gestorDefectosVisuales;
        this.datosDefectosVisuales = new DefaultListModel<>();
        this.datosDefectosSeleccionados = new DefaultListModel<>();
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

        textoRegistrarDefectos = new javax.swing.JLabel();
        textoIngresoPatente = new javax.swing.JLabel();
        campoIngresoPatente = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        panelDefectos = new javax.swing.JPanel();
        textoVehiculo = new javax.swing.JLabel();
        campoVehiculo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaDefectosVisuales = new javax.swing.JList<>();
        textoSeleccioneDefectos = new javax.swing.JLabel();
        textoDefectosSeleccionados = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaDefectosSeleccionados = new javax.swing.JList<>();
        btnFinalizar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Applus VTV - Defectos Visuales");

        textoRegistrarDefectos.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        textoRegistrarDefectos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoRegistrarDefectos.setText("Registrar defectos visuales");

        textoIngresoPatente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoIngresoPatente.setText("Ingrese la patente del vehiculo");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        textoVehiculo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoVehiculo.setText("Vehiculo");

        campoVehiculo.setEditable(false);

        listaDefectosVisuales.setModel(datosDefectosVisuales);
        listaDefectosVisuales.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaDefectosVisuales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaDefectosVisualesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listaDefectosVisuales);

        textoSeleccioneDefectos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoSeleccioneDefectos.setText("Seleccione el/los defectos visuales encontrados");

        textoDefectosSeleccionados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoDefectosSeleccionados.setText("Defectos seleccionados");

        listaDefectosSeleccionados.setModel(datosDefectosSeleccionados);
        listaDefectosSeleccionados.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaDefectosSeleccionados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaDefectosSeleccionadosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(listaDefectosSeleccionados);

        btnFinalizar.setText("Finalizar");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDefectosLayout = new javax.swing.GroupLayout(panelDefectos);
        panelDefectos.setLayout(panelDefectosLayout);
        panelDefectosLayout.setHorizontalGroup(
            panelDefectosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDefectosLayout.createSequentialGroup()
                .addGroup(panelDefectosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDefectosLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(panelDefectosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoSeleccioneDefectos, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelDefectosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoDefectosSeleccionados, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelDefectosLayout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addGroup(panelDefectosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(campoVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelDefectosLayout.createSequentialGroup()
                        .addGap(372, 372, 372)
                        .addComponent(btnFinalizar)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        panelDefectosLayout.setVerticalGroup(
            panelDefectosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDefectosLayout.createSequentialGroup()
                .addComponent(textoVehiculo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelDefectosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoSeleccioneDefectos)
                    .addComponent(textoDefectosSeleccionados))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDefectosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFinalizar)
                .addContainerGap())
        );

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textoRegistrarDefectos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelDefectos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(340, 340, 340)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textoIngresoPatente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(campoIngresoPatente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(textoRegistrarDefectos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textoIngresoPatente)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoIngresoPatente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(24, 24, 24)
                .addComponent(panelDefectos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        if(this.volverCallBack!=null){
            this.volverCallBack.run();
            this.dispose();
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        this.revision = gestorRevision.buscarRevisionActivaPorPatente(this.campoIngresoPatente.getText());
        
        if (this.revision != null){
            this.campoVehiculo.setText(revision.getVehiculo().toString());
            
            this.panelDefectos.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(
                    this,
                    "No se pudo encontrar la revision, revise el numero de patente e intente nuevamente",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void listaDefectosVisualesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaDefectosVisualesMouseClicked
        // TODO add your handling code here:
        datosDefectosSeleccionados.addElement(listaDefectosVisuales.getSelectedValue());
    }//GEN-LAST:event_listaDefectosVisualesMouseClicked

    private void listaDefectosSeleccionadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaDefectosSeleccionadosMouseClicked
        // TODO add your handling code here:
        datosDefectosSeleccionados.removeElement(listaDefectosSeleccionados.getSelectedValue());
    }//GEN-LAST:event_listaDefectosSeleccionadosMouseClicked

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        // TODO add your handling code here:
        for(int i=0 ; i<datosDefectosSeleccionados.getSize(); i++){
            revision.registrarDefectoVisual(datosDefectosSeleccionados.getElementAt(i));
        }
        
        JOptionPane.showMessageDialog(
                    this,
                    "Defecto/s visuales registrado/s correctamente!",
                    "Defecto/s Registrados",
                    JOptionPane.INFORMATION_MESSAGE
            );
        
        if(volverCallBack!=null){
            volverCallBack.run();
            this.dispose();
        }
    }//GEN-LAST:event_btnFinalizarActionPerformed

    
    public void mostrarPantalla(){
        setListaDefectosVisuales();
        setCamposVacios();
        this.panelDefectos.setVisible(false);
        
        this.setVisible(true);
    }
    
    public void setOnVolverCallback(Runnable callback) {
        this.volverCallBack = callback;
    }
    
    private void setListaDefectosVisuales(){
        datosDefectosVisuales.setSize(0);
       
        for(DefectoVisual defectoVisual : gestorDefectosVisuales.getListaDefectosVisuales()){
            datosDefectosVisuales.addElement(defectoVisual);
        }
    }
    

    
    private void setCamposVacios(){
        this.campoIngresoPatente.setText("");
        this.campoVehiculo.setText("");
        datosDefectosSeleccionados.setSize(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JTextField campoIngresoPatente;
    private javax.swing.JTextField campoVehiculo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<DefectoVisual> listaDefectosSeleccionados;
    private javax.swing.JList<DefectoVisual> listaDefectosVisuales;
    private javax.swing.JPanel panelDefectos;
    private javax.swing.JLabel textoDefectosSeleccionados;
    private javax.swing.JLabel textoIngresoPatente;
    private javax.swing.JLabel textoRegistrarDefectos;
    private javax.swing.JLabel textoSeleccioneDefectos;
    private javax.swing.JLabel textoVehiculo;
    // End of variables declaration//GEN-END:variables
}
