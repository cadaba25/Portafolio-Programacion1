/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calcular;

import java.util.Scanner;

/**
 *
 * @author David Barreda
 */
public class CalculadoraAnualidad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la renta o pago por periodo (R): ");
        double renta = scanner.nextDouble();

        System.out.print("Ingrese la tasa de interés anual en porcentaje (i): ");
        double tasaInteres = scanner.nextDouble();

        System.out.print("Ingrese el número de pagos (n): ");
        int numeroPagos = scanner.nextInt();

        System.out.print("¿Es una anualidad anticipada? (true: Sí, false: No): ");
        boolean esAnticipada = scanner.nextBoolean();

        Anualidad anualidad = new Anualidad(renta, tasaInteres, numeroPagos, esAnticipada);
        double valorPresente = anualidad.calcularValorPresente();
        System.out.printf("El valor presente de la anualidad es: %.2f%n", valorPresente);

        scanner.close();
    }
    
    
}
