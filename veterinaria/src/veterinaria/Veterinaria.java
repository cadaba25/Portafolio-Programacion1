/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package veterinaria;

import java.util.Scanner;

/**
 *
 * @author enigm
 */
public class Veterinaria {

    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        bano servicioBano = new bano();

        animal[] animales = new animal[100];
        int indiceActual = 0;
        int registros = 0, consultas = 0, banios = 0;
        double ganancias = 0.0;

        int opcion;

        do {
            System.out.println("\n--- Menu Veterinaria ---");
            System.out.println("(1) Registrar animal");
            System.out.println("(2) Lista de animales");
            System.out.println("(3) Atencion medica ($50)");
            System.out.println("(4) Servicio Bannio ($30)");
            System.out.println("(5) Cierre de caja");
            System.out.println("(6) Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = lea.nextInt();

            switch (opcion) {
                case 1:
                    if (indiceActual < animales.length) {
                        System.out.print("Ingrese nombre del animal: ");
                        String nombre = lea.next();
                        System.out.print("Ingrese raza: ");
                        String raza = lea.next();
                        System.out.print("Tamano (Grande, mediano, pequeno): ");
                        String tamano = lea.next();

                        animales[indiceActual] = new animal(nombre, raza, tamano);
                        indiceActual++;
                        registros++;
                        System.out.println("Animal registrado exitosamente.");
                    } else {
                        System.out.println("Capacidad maxima alcanzada.");
                    }
                    break;

                case 2:
                    if (indiceActual == 0) {
                        System.out.println("No hay animales registrados.");
                    } else {
                        System.out.println("Lista de animales registrados:");
                        for (int i = 0; i < indiceActual; i++) {
                            animal actual = animales[i];
                            System.out.println((i + 1) + ". Nombre: " + actual.getNombre() +
                                               ", Raza: " + actual.getRaza() +
                                               ", Tamano: " + actual.getTamano());
                        }
                    }
                    break;

                case 3:
                    System.out.print("Ingrese nombre del animal registrado: ");
                    String nombreA = lea.next();
                    boolean encontrado = false;

                    for (int i = 0; i < indiceActual; i++) {
                        if (animales[i].getNombre().equalsIgnoreCase(nombreA)) {
                            System.out.println("Atencion medica realizada a " + animales[i].getNombre());
                            ganancias += 50;
                            consultas++;
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Animal no encontrado.");
                    }
                    break;

                case 4:
                    if (indiceActual == 0) {
                        System.out.println("No hay animales registrados para el servicio de bannio.");
                    } else {
                        System.out.println("\n--- Servicio de Bannio ---");
                        System.out.println("Lista de Animales:");
                        for (int i = 0; i < indiceActual; i++) {
                            System.out.println((i + 1) + ". Nombre: " + animales[i].getNombre() +
                                               ", Tamano: " + animales[i].getTamano());
                        }
                        System.out.print("Seleccione el numero del animal a bannar: ");
                        int index = lea.nextInt() - 1;

                        if (index >= 0 && index < indiceActual) {
                            servicioBano.hacerBano(animales[index]);
                            banios++;
                            ganancias += 30;
                        } else {
                            System.out.println("Numero invalido. Intente de nuevo.");
                        }
                    }
                    break;

                case 5:
                    System.out.println("\n--- Cierre de Caja ---");
                    System.out.println("Animales registrados: " + registros);
                    System.out.println("Consultas medicas realizadas: " + consultas);
                    System.out.println("Banios realizados: " + banios);
                    System.out.println("Ganancias totales: $" + ganancias);
                    break;

                case 6:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opcion no valida. Intente de nuevo.");
            }
        } while (opcion != 6);
    }
}