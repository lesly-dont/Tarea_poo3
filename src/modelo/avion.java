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
public class avion extends vehiculo_aereo {
   
    private String aerolinea, tipo_alas;

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public String getTipo_alas() {
        return tipo_alas;
    }

    public void setTipo_alas(String tipo_alas) {
        this.tipo_alas = tipo_alas;
    }
    
    
    @Override
    public void agregar (){
        System.out.println("Aerolinea"+ getAerolinea());
        System.out.println("Tipo de alas"+ getTipo_alas());
        System.out.println("tren de aterrizaje"+ this.getTren_aterrizaje());
        System.out.println("tipo de transporte"+ this.getTipo_transporte());
        System.out.println("Altura maxima"+ this.getAltura_maxima());
        System.out.println("Pasajeros"+ getPasajeros());
             System.out.println("Marca:"+ this.getMarca());
             System.out.println("Modelo:"+ this.getModelo());
             System.out.println("Color:"+ this.getColor());
             System.out.println("Precio:"+ this.getPrecio());
             System.out.println("Motor:"+ this.getMotor());
             System.out.println("Gasolina:"+ this.getGasolina());
             System.out.println("Peso:"+ this.getPeso());
}}
