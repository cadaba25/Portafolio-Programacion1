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
public class TiendaRopa {
    public static void main(String[] args) {
        
        Scanner lea = new Scanner(System.in);
        
        String[] productos = new String[100];
        int[] cantidades = new int[100];
        int numProductos = 0;
        
        while(true){
            System.out.print("Ingrese el nombre del producto: ");
            String producto = lea.next();
            System.out.print("Ingrese la cantidad en inventario: ");
            int cantidad = lea.nextInt();
            
            productos[numProductos] = producto;
            cantidades[numProductos] = cantidad;
            numProductos++;
            
            System.out.println("Inventario final:");
            for (int i = 0; i < numProductos; i++) {
            System.out.println(productos[i] + ": " + cantidades[i]);
            }
            
            
            
        }
    }
    
}
