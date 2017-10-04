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
public class Furgoneta extends Vehiculo{
    String disponible,cant_pasajeros;;
    

    public Furgoneta(String marca, String color, String placa, int precio,String cant_pasajeros,String disponible) {
        super(marca,color,placa,precio);
        this.cant_pasajeros=cant_pasajeros;
        this.disponible=disponible;
    }
    public String getCan_Pasajeros(){
        return cant_pasajeros;
    }
    public String getDisponible(){
        return disponible;
    }
}
