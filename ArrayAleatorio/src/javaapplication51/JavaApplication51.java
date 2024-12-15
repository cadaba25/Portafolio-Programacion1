/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication51;

import java.util.Random;

/**
 *
 * @author David Barreda
 */
public class JavaApplication51 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random random = new Random();
        
        int[] num = new int[10];
        
        
        for (int i = 1; i < 10; i++) {
            num[i]= random.nextInt(100);
            System.out.println(num[i]);
            
        }
        
    }
    
}
