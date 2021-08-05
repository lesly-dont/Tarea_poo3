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
public class vehiculo_aereo extends vehiculo  {
    private String tren_aterrizaje, tipo_transporte,altura_maxima,pasajeros;

    public String getTren_aterrizaje() {
        return tren_aterrizaje;
    }

    public void setTren_aterrizaje(String tren_aterrizaje) {
        this.tren_aterrizaje = tren_aterrizaje;
    }

    public String getTipo_transporte() {
        return tipo_transporte;
    }

    public void setTipo_transporte(String tipo_transporte) {
        this.tipo_transporte = tipo_transporte;
    }

    public String getAltura_maxima() {
        return altura_maxima;
    }

    public void setAltura_maxima(String altura_maxima) {
        this.altura_maxima = altura_maxima;
    }

    public String getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(String pasajeros) {
        this.pasajeros = pasajeros;
    }
    
    @Override
    public void agregar (){
        System.out.println("tren de aterrizaje"+ getTren_aterrizaje());
        System.out.println("tipo de transporte"+ getTipo_transporte());
        System.out.println("Altura maxima"+ getAltura_maxima());
        System.out.println("Pasajeros"+ getPasajeros());
             System.out.println("Marca:"+ this.getMarca());
             System.out.println("Modelo:"+ this.getModelo());
             System.out.println("Color:"+ this.getColor());
             System.out.println("Precio:"+ this.getPrecio());
             System.out.println("Motor:"+ this.getMotor());
             System.out.println("Gasolina:"+ this.getGasolina());
             System.out.println("Peso:"+ this.getPeso());
}}
