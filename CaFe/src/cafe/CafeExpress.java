/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cafe;

import java.util.Scanner;

public class CafeExpress {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int totalClientes = 0;
        int cafesPequenno = 0, cafesMediano = 0, cafesGrande = 0;
        double totalCaja = 0;

        while (true) {
            System.out.println("\n*** Menu Principal ***");
            System.out.println("1. Facturar cafe");
            System.out.println("2. Cerrar caja");
            System.out.print("Seleccione una opcion: ");
            int opcion = entrada.nextInt();

            if (opcion == 1) {
                System.out.println("\nSeleccione el tamanno del cafe:");
                System.out.println("1. Pequennio (Lps. 45)");
                System.out.println("2. Mediano (Lps. 56)");
                System.out.println("3. Grande (Lps. 65)");
                System.out.print("Opcion: ");
                int tamanno = entrada.nextInt();

                Cafe cafe = null;
                if (tamanno == 1) {
                    cafe = new Cafe("Pequenno", 45);
                    cafesPequenno++;
                } else if (tamanno == 2) {
                    cafe = new Cafe("Mediano", 56);
                    cafesMediano++;
                } else if (tamanno == 3) {
                    cafe = new Cafe("Grande", 65);
                    cafesGrande++;
                } else {
                    System.out.println("Opcion invalida. Intente de nuevo.");
                    continue;
                }

                System.out.println("\nSeleccione el agregado:");
                System.out.println("1. Leche (Lps. 5)");
                System.out.println("2. Cremora (Lps. 8)");
                System.out.println("3. Sencillo (Lps. 0)");
                System.out.print("Opcion: ");
                int opcionAgregado = entrada.nextInt();

                Agregado agregado = null;
                if (opcionAgregado == 1) {
                    agregado = new Agregado("Leche", 5);
                } else if (opcionAgregado == 2) {
                    agregado = new Agregado("Cremora", 8);
                } else if (opcionAgregado == 3) {
                    agregado = new Agregado("Sencillo", 0);
                } else {
                    System.out.println("Opcion invalida. Intente de nuevo.");
                    continue;
                }

                System.out.print("\nIngrese la edad del cliente: ");
                int edad = entrada.nextInt();

                double descuento = 0;
                if (edad > 65) {
                    descuento = 0.15 * (cafe.getPrecio() + agregado.getCosto());
                }

                double total = cafe.getPrecio() + agregado.getCosto() - descuento;

                System.out.println("\n*** Factura ***");
                System.out.println("Tamanno del cafe: " + cafe.getTamanno());
                System.out.println("Agregado: " + agregado.getNombre());
                System.out.println("Edad del cliente: " + edad + " annos");
                System.out.printf("Subtotal: Lps. %.2f\n", cafe.getPrecio() + agregado.getCosto());
                System.out.printf("Descuento: Lps. %.2f\n", descuento);
                System.out.printf("Total a pagar: Lps. %.2f\n", total);

                totalClientes++;
                totalCaja += total;
            } else if (opcion == 2) {
                System.out.println("\n*** Resumen del Dia ***");
                System.out.println("Clientes atendidos: " + totalClientes);
                System.out.println("Cafes pequennos vendidos: " + cafesPequenno);
                System.out.println("Cafes medianos vendidos: " + cafesMediano);
                System.out.println("Cafes grandes vendidos: " + cafesGrande);
                System.out.printf("Total en caja: Lps. %.2f\n", totalCaja);
                break;
            } else {
                System.out.println("Opcion invalida. Intente de nuevo.");
            }
        }

        entrada.close();
    }
}



