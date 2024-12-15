/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioclase_sem4;

import java.util.Random;

/**
 *
 * @author David Barreda
 */
public class EjercicioClase_sem4 {

    public static void main(String[] args) {
        Random random = new Random();
        int max = 50;
        int min = 1;
        int listaNumeros[] = new int[10];

        for (int i = 0; i < 10; i++) {
            listaNumeros[i] = random.nextInt((max - min) + 1) + min;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Numero " + i + ": " + listaNumeros[i]);
        }
    }
}