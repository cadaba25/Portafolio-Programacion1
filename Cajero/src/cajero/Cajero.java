/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cajero;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author David Barreda
 */
public class Cajero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lea = new Scanner(System.in);
        int dinero = 0;
        int cajero = 2000;
        int saldo = 2000;
        int menu = 1;
      
        int opcion, deposito, retiro;
        while(menu !=3){
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Seleccina una opcion" + 
                "\n(1)Deposito" +
                "\n(2)Retiro" +
                "\n(3)Salir"));
        
        switch(opcion){
            case 1:
                deposito = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el deposito"));
               if(deposito>=1){
                   cajero = deposito + saldo;
                   JOptionPane.showMessageDialog(null, "Su saldo actual es: " + cajero);
                   
               }else{
                   JOptionPane.showMessageDialog(null, "Deposito no valido");
               } 
               
                break;
            case 2:  
                retiro = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Retiro"));
                if ( retiro< cajero){
                    cajero = cajero - retiro;
                    JOptionPane.showMessageDialog(null, "Dinero en el cajero: " + cajero );
                }else{
                    JOptionPane.showMessageDialog(null, "Dinero insuficiente en el cajero para realizar un retiro");
                }
                break;
                
                
        }
        
        
    }
        
        
        
    }
    
}
