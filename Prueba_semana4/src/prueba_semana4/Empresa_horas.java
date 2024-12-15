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
public class Empresa_horas {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);

        System.out.print("Ingrese el numero de empleados: ");
        int numEmpleados = lea.nextInt();

        for (int i = 0; i < numEmpleados; i++) {
            System.out.println("Empleado " + (i + 1) + ":");
            double totalHoras = 0;

            for (int j = 1; j <= 7; j++) {
                System.out.print("Ingrese las horas trabajadas el dia " + j + ": ");
                double horasDia = lea.nextDouble();
                totalHoras += horasDia;
            }

            double promedioDiario = totalHoras / 7;
            System.out.println("Total de horas trabajadas: " + totalHoras);
            System.out.println("Promedio de horas trabajadas por dia: " + promedioDiario);
            
            
        }
    }
}