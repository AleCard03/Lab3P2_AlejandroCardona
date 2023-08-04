/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_alejandrocardona;

import java.awt.Color;
import java.util.Date;

/**
 *
 * @author jets
 */
public class Vehiculo {
    
    private String placa;
    private String marca;
    private String modelo;
    private String tipo;
    private Date año;
    private Color color;

    public Vehiculo(String placa, String marca, String modelo, String tipo, Date año, Color color) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.año = año;
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getAño() {
        return año;
    }

    public void setAño(Date año) {
        this.año = año;
    }
    

    
    
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vehiculo" + "\nplaca: " + placa + "\nmarca: " + marca + "\nmodelo: " + modelo + "\ntipo: " + tipo + "\ndate: " + año + ", color=" + color + '}';
    }
    
    
    
}
