/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_alejandrocardona;

import java.awt.Color;

public class Automovil extends Vehiculo {
    
    private String comb;
    private int puestas;
    private String transmision;
    private int asientos;

    public Automovil(String comb, int puestas, String transmision, int asientos, String placa, String marca, String modelo, String tipo, int año, Color color) {
        super(placa, marca, modelo, tipo, año, color);
        this.comb = comb;
        this.puestas = puestas;
        this.transmision = transmision;
        this.asientos = asientos;
    }

    public String getComb() {
        return comb;
    }

    public void setComb(String comb) {
        this.comb = comb;
    }

    public int getPuestas() {
        return puestas;
    }

    public void setPuestas(int puestas) {
        this.puestas = puestas;
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
