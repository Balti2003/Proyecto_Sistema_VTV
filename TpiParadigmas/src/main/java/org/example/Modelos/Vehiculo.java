/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.Modelos;

/**
 *
 * @author oroca
 */
public class Vehiculo {
    private Cliente dueno;
    private String marca;
    private String modelo;
    private TipoVehiculo tipoVehiculo;
    private String anoFabricacion;
    private String patente;

    public Vehiculo(Cliente dueno, String marca, String modelo, TipoVehiculo tipoVehiculo, String anoFabricacion, String patente) {
        this.dueno = dueno;
        this.marca = marca;
        this.modelo = modelo;
        this.tipoVehiculo = tipoVehiculo;
        this.anoFabricacion = anoFabricacion;
        this.patente = patente;
    }

    public Cliente getDueno() {
        return dueno;
    }

    public void setDueno(Cliente dueno) {
        this.dueno = dueno;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public TipoVehiculo getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(TipoVehiculo tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getAnoFabricacion() {
        return anoFabricacion;
    }

    public void setAnoFabricacion(String anoFabricacion) {
        this.anoFabricacion = anoFabricacion;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    @Override
    public String toString() {
        return tipoVehiculo + " | " + patente + " " + marca + " " + modelo + " " + anoFabricacion;
    }
    
    
    
}
