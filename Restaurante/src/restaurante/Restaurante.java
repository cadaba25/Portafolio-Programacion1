/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package restaurante;

import java.util.Scanner;

/**
 *
 * @author David Barreda
 */
public class Restaurante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lea = new Scanner(System.in);
        int opcion;
        double descuento = 0;
        double subtotal = 0;
        
        
        
        System.out.print("Ingrese precio economico: ");
        TipoComida comidaEconomica = new TipoComida("Economica", lea.nextDouble());
        System.out.print("Ingrese precio regular: ");
        TipoComida comidaregular = new TipoComida("Regular", lea.nextDouble());
        System.out.print("Ingrese precio premium: ");
        TipoComida comidapremium = new TipoComida("Premium", lea.nextDouble());
        
        System.out.println("Ingrese precio de Extras: ");
        double precioExtra = lea.nextDouble();
        
        
        
        
        extras ketchup = new extras("Ketchup");
        extras ensalada = new extras("Ensalada");
        extras papas = new extras("Papas");

        
        int totalPedidos = 0;
        double totalIngresos = 0;
        int totalpedidos = 0;
        double totalingresos = 0;
        
        
        
        do{
            
            System.out.println("--MENU--");
            System.out.println("(1)Facturar pedido");
            System.out.println("(2)Resumen de ventas");
            System.out.println("(3)Salir");
            System.out.print(":");
            opcion = lea.nextInt();
            
            switch (opcion){
                case 1:
                    System.out.println("Seleccione el tipo de comida:");
                    System.out.println("(1)" +  comidaEconomica.getNombre());
                    System.out.println("(2)" + comidaregular.getNombre());
                    System.out.println("(3)" + comidapremium.getNombre());
                    int tipocomida = lea.nextInt();
                    
                    
                    double precioBase = 0;
                    
                    if(tipocomida == 1){
                        precioBase = comidaEconomica.getPrecio();
                        
                    }else if(tipocomida == 2){
                        precioBase = comidaregular.getPrecio();
                        
                    }else if(tipocomida == 3){
                        precioBase = comidapremium.getPrecio();
                    }
                    
                    
                    
                    double costoExtras = 0;
                    System.out.println("\nSeleccione extras :");
                    System.out.println("(1) " + ketchup.getNombre() + " - $" + ketchup.getPrecio());
                    System.out.println("(2) " + ensalada.getNombre() + " - $" + ensalada.getPrecio());
                    System.out.println("(3) " + papas.getNombre() + " - $" + papas.getPrecio());
                    System.out.println("(4) Finalizar selección");
                    
                    int extraSeleccion;
                    do {
                        System.out.print("Seleccione un extra: ");
                        extraSeleccion = lea.nextInt();
                        switch (extraSeleccion) {
                            case 1:
                                costoExtras += ketchup.getPrecio();
                                break;
                            case 2:
                                costoExtras += ensalada.getPrecio();
                                break;
                            case 3:
                                costoExtras += papas.getPrecio();
                                break;
                            case 4:
                                System.out.println("Selección de extras finalizada.");
                                break;
                            default:
                                System.out.println("Opción no válida.");
                        }
                        
                        System.out.println("Es cliente Frecunte (SI/NO) ");
                        String frecuente = lea.next().toUpperCase();
                        if(frecuente.equals("SI")){
                            descuento = subtotal*0.15;
                        }
                        
                        
                        System.out.println("Es mayor de edad (SI/NO) ");
                        String edad = lea.next().toUpperCase();
                        if(edad.equals("SI")){
                            descuento = subtotal*0.25;
                            
                        }
                        
                        double total = subtotal - descuento;
                        
                        System.out.println("Total a pagar: " + total);
                        
                        totalpedidos++;
                        totalingresos += total;
                        
                        break;
                        
                        
                    } while (extraSeleccion != 4);
                
                case 2:
                    System.out.println("\nResumen del día:");
                    System.out.println("Total de pedidos: " + totalPedidos);
                    System.out.printf("Ingresos totales: %.2f%n", totalIngresos);
                    break;
                    
                case 3:
                    System.out.println("saliendo...");
            }
            
            
        }while(opcion != 3);

    }
    
}
