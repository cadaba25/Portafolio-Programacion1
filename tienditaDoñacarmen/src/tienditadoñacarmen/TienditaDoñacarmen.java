/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tienditadoñacarmen;

import java.util.Scanner;

/**
 *
 * @author enigm
 */
public class TienditaDoñacarmen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* TODO code application logic here
        
        El ejercicio consiste en crear un sistema para administrar productos de una tienda. 
        Debes hacer una clase llamada Producto con tres datos principales: el nombre del producto, su precio y la cantidad disponible. 
        Además, necesitarás un programa principal que permita agregar productos, mostrarlos y actualizar las cantidades en un inventario de hasta 50 productos.
        Tendrás que hacer un menú para que el usuario pueda elegir qué acción realizar: 
        agregar, mostrar o actualizar productos. Cada vez que se haga algo, 
        los datos se guardan o se muestran según sea necesario.
        */
        Scanner lea = new Scanner(System.in);
        
        producto[] productos = new producto[100];
        
        int opcion;
        int contadorP = 0;
        
        do{
            System.out.println("(1)Agregar");
            System.out.println("(2)Mostrar");
            System.out.println("(3)Salir");
            opcion = lea.nextInt();
            
            
            if(opcion == 1){
                
                System.out.print("Ingrese el nombre del Producto: ");
                String nombre = lea.next();
                System.out.print("Ingrese precio del Producto: ");
                double precio = lea.nextDouble();
                System.out.print("Ingrese el inventario del producto: ");
                int cantidad = lea.nextInt();                
                
                
                
                productos[contadorP] = new producto(nombre, precio, cantidad);
                contadorP++;
                System.out.println("-------------------------------------");
                
            }else if(opcion == 2){
                
                for (int i = 0; i < productos.length; i++) {
                    System.out.println("Producto N." + i +": " + productos[i].getNombre());
                    System.out.println("Precio: "+ productos[i].getPrecio() );
                    System.out.println("Cantidad: " + productos[i].getCantidad());
                    System.out.println("-------------------------------------------------------");
                    
                    
                }
                
                
                
                
                
            }
            
            
            
            
        }while(opcion != 3 );
        
        
    }
    
}
