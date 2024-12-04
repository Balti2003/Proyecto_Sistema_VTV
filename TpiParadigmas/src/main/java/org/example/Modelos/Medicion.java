/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.Modelos;

/**
 *
 * @author oroca
 */
public class Medicion {
    private final Seccion seccion;
    private final int medida;
    private final int valorReferencia;
    private String resultadoSeccion;
    private final Empleado inspector;

    public Medicion(Seccion seccion, int medida, int valorReferencia, Empleado inspector) {
        this.seccion = seccion;
        this.medida = medida;
        this.valorReferencia = valorReferencia;
        this.inspector = inspector;
    }

    public Seccion getSeccion() {
        return seccion;
    }

    public int getMedida() {
        return medida;
    }

    public int getValorReferencia() {
        return valorReferencia;
    }

    public String getResultadoSeccion() {
        return resultadoSeccion;
    }

    public Empleado getInspector() {
        return inspector;
    }
    
    public void calcularResultado(){
        
        double diferenciaAbsoluta = Math.abs(valorReferencia - medida);
        double promedio = (valorReferencia + medida) / 2;
        
        double porcentajeDiferencia = (diferenciaAbsoluta / promedio) * 100;
        
        if(porcentajeDiferencia <= 30.0){
            this.resultadoSeccion = "Aprobada";
        }else if (porcentajeDiferencia > 30.0 && porcentajeDiferencia <= 50.0){
            this.resultadoSeccion = "Condicional";
        }else{
            this.resultadoSeccion = "Desaprobado";
        }    
    }

    @Override
    public String toString() {
        return "Medicion{" + "seccion=" + seccion + ", medida=" + medida + ", valorReferencia=" + valorReferencia + ", resultadoSeccion=" + resultadoSeccion + ", inspector=" + inspector + '}';
    }
    
    
    
}
