/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_alejandrocardona;

import java.awt.Color;

public class Motocicleta extends Vehiculo {
    
    private double maxSpeed;
    private double peso;
    private double gasCons;

    public Motocicleta(double maxSpeed, double peso, double gasCons, String placa, String marca, String modelo, String tipo, int año, Color color) {
        super(placa, marca, modelo, tipo, año, color);
        this.maxSpeed = maxSpeed;
        this.peso = peso;
        this.gasCons = gasCons;
    }
    
    
    
}
