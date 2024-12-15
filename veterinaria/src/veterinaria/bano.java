/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veterinaria;

import java.util.Scanner;

/**
 *
 * @author enigm
 */
public class bano {
     int contBano;
    
    void hacerBano(animal animal) {
       Scanner scanner = new Scanner(System.in);

        System.out.println("Servicio para el bannio");
        System.out.println("Animal: " + animal.getNombre() + ", Tamano registrado: " + animal.getTamano());
        System.out.print("Confirme el tamano del animalito (pequeno, mediano, grande): ");
        String tamano = scanner.next().toLowerCase();

        int precio;

        if (tamano.equals("pequeno")) {
            precio = 50;
        } else if (tamano.equals("mediano")) {
            precio = 60;
        } else if (tamano.equals("grande")) {
            precio = 70;
        } else {
            System.out.println("Tamano invalido. Se asigna precio base de 50.");
            precio = 50;
        }

        System.out.println("El bannio se realizo para el animal " + animal.getNombre() + ". Precio: " + precio + " LPS");
        contBano++;
    }

    int getContBano() {
        return contBano;
    }
}