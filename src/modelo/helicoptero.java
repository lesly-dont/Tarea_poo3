/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author 50254
 */
public class helicoptero extends vehiculo_aereo {
     private String no_helices;

    public String getNo_helices() {
        return no_helices;
    }

    public void setNo_helices(String no_helices) {
        this.no_helices = no_helices;
    }
    @Override
    public void agregar (){
        System.out.println("Numero de helices"+ getNo_helices());
        System.out.println("tren de aterrizaje"+ this.getTren_aterrizaje());
        System.out.println("tipo de transporte"+ this.getTipo_transporte());
        System.out.println("Altura maxima"+ this.getAltura_maxima());
        System.out.println("Pasajeros"+ this.getPasajeros());
             System.out.println("Marca:"+ this.getMarca());
             System.out.println("Modelo:"+ this.getModelo());
             System.out.println("Color:"+ this.getColor());
             System.out.println("Precio:"+ this.getPrecio());
             System.out.println("Motor:"+ this.getMotor());
             System.out.println("Gasolina:"+ this.getGasolina());
             System.out.println("Peso:"+ this.getPeso());
}}
