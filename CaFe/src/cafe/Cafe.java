/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cafe;

/**
 *
 * @author enigm
 */
public class Cafe {
    private String tamanno;
    private double precio;

    public Cafe(String tamanno, double precio) {
        this.tamanno = tamanno;
        this.precio = precio;
    }

    public String getTamanno() {
        return tamanno;
    }

    public double getPrecio() {
        return precio;
    }
}