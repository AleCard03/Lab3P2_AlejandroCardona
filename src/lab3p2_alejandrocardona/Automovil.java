/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_alejandrocardona;

import java.awt.Color;
import java.util.Date;

public class Automovil extends Vehiculo {
    
    private String comb;
    private int puertas;
    private String transmision;
    private int asientos;

    public Automovil(String comb, int puertas, String transmision, int asientos, String placa, String marca, String modelo, String tipo, Date año, Color color) {
        super(placa, marca, modelo, tipo, año, color);
        this.comb = comb;
        this.puertas = puertas;
        this.transmision = transmision;
        this.asientos = asientos;
    }

    public String getComb() {
        return comb;
    }

    public void setComb(String comb) {
        this.comb = comb;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuestas(int puertas) {
        this.puertas = puertas;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    
   
}
