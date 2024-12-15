/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba_semana4;

import java.util.Scanner;

/**
 *
 * @author David Barreda
 */
public class Supermercado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lea = new java.util.Scanner(System.in);
        
        int productos;
        double costoTotal = 0, costoProducto;
        
        System.out.println("Cuantos productos desea comprar? ");
        System.out.print("=");
        productos = lea.nextInt();
        
        for (int i = 1; i <= productos; i++) {
            System.out.print("Ingrese la cantidad del producto " + i + " que desea comprar: ");
            double cantidad = lea.nextDouble();
            System.out.print("Ingrese el precio del producto "+ i + ": ");
            double precio = lea.nextDouble();
            
           
            costoTotal = cantidad * precio ;
         
        }
        
        System.out.println("Costo Total de la compra es: " + costoTotal);
        
    }
    
}
