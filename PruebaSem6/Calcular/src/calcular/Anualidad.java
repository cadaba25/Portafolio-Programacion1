/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calcular;

/**
 *
 * @author David Barreda
 */
public class Anualidad {
    
    private double renta; 
    private double tasaInteres;
    private int numeroPagos; 
    private boolean esAnticipada;

    
    public Anualidad(double renta, double tasaInteres, int numeroPagos, boolean esAnticipada) {
        this.renta = renta;
        this.tasaInteres = tasaInteres / 100; 
        this.numeroPagos = numeroPagos;
        this.esAnticipada = esAnticipada;
    }
    
    public double calcularValorPresente() {
        double valorPresente;
        if (esAnticipada) {
            valorPresente = renta * (1 + tasaInteres) * ((1 - Math.pow(1 + tasaInteres, -numeroPagos)) / tasaInteres);
        } else {
            valorPresente = renta * ((1 - Math.pow(1 + tasaInteres, -numeroPagos)) / tasaInteres);
        }
        return valorPresente;
    }
}

    


