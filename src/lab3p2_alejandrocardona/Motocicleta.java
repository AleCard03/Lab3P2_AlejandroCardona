/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_alejandrocardona;

import java.awt.Color;
import java.util.Date;

public class Motocicleta extends Vehiculo {
    
    private double maxSpeed;
    private double peso;
    private double gasCons;

    public Motocicleta(double maxSpeed, double peso, double gasCons, String placa, String marca, String modelo, String tipo, Date año, Color color) {
        super(placa, marca, modelo, tipo, año, color);
        this.maxSpeed = maxSpeed;
        this.peso = peso;
        this.gasCons = gasCons;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getGasCons() {
        return gasCons;
    }

    public void setGasCons(double gasCons) {
        this.gasCons = gasCons;
    }
    
    

    @Override
    public String toString() {
        return super.toString()+"Motocicleta\n" + "maxSpeed: " + maxSpeed + "\npeso: " + peso + "\ngasCons: " + gasCons;
    }
    
    
    
}
