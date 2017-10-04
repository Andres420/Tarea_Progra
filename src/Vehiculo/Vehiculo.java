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
public class Vehiculo {

    String marca, color, placa;
    int precio;

    public Vehiculo(String marca, String color, String placa, int precio) {
        this.marca = marca;
        this.color = color;
        this.placa = placa;
        this.precio = precio;
    }
    public String getMarca(){
        return marca;
    }
    public String getColor(){
        return color;
    }
    public String getPlaca(){
        return placa;
    }
    public int getPrecio(){
        return precio;
    }
}
