/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba_semana4;

import java.util.Scanner;

/**
 *
 * @author David Barreda
 */
public class Empresa {
    public static void main(String[] args) {
        
     Scanner lea = new Scanner(System.in);
     
     double consumoTotal = 0;
     double consumoM;
     
     for (int i = 1; i <= 12; i++) {
            System.out.print("Ingrese el consumo de agua en litros para el mes " + i + ": ");
            consumoM = lea.nextDouble();
            consumoTotal += consumoM;
            
            
        }
     
        double promedioMensual = consumoTotal/12;
     
        System.out.println("Consumo total de agua: " + consumoTotal);
        System.out.println("Promedio de consumo mensual: " + promedioMensual);
        
        
        
    }
}
