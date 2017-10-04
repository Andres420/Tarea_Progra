/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculo;

/**
 *
 * @author Extreme pc
 */
public class Deportivo extends Vehiculo {

    String potencia, velocidad;

    public Deportivo(String marca, String color, String placa, int precio, String potencia, String velocidad) {
        super(marca, color, placa, precio);
        this.potencia = potencia;
        this.velocidad = velocidad;
    }

    public String getPotencia() {
        return potencia;
    }

    public String getVelocidad() {
        return velocidad;
    }
}
