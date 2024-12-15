/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empleacion;

import java.util.Scanner;

/**
 *
 * @author enigm
 */
public class Empleacion{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        empleado[] empleados = new empleado[100];
        Scanner lea = new Scanner(System.in);
        /* Crea una clase Empleado que permita gestionar el nombre y el salario de un empleado.
           Realiza las siguientes acciones en el método main:
           Crea un objeto de la clase Empleado.
           Asigna un nombre y un salario al empleado.
           Muestra el nombre y el salario.
           Calcula el salario anual del empleado.*/
        
        
        int opcion;
        int contadorE = 0;
        
        do{
            System.out.println("--Menu--");
            System.out.println("(1)Agregar Empleado ");
            System.out.println("(2)Mostrar Empleados");
            System.out.println("(3)Salir");
            opcion = lea.nextInt();
            
            if(opcion == 1){
                
                System.out.println("Ingrese el nombre del empleado");
                String nombre = lea.next();
                System.out.println("Ingrese el salario del empleado");
                double salario = lea.nextDouble();
                
                empleados[contadorE] = new empleado(nombre, salario);
                contadorE++;
             
            }else if(opcion == 2){
                for (int i = 0; i < contadorE; i++) {
                    System.out.println("Nombre Empleado: "+ empleados[i].getNombre() );
                    System.out.println("Salario: " + empleados[i].getSalario());
                    
                    
                    
                }
                
                
            }
            
           
        }while(opcion != 3);
        
        
    }

    

    

    
    
    
    
}
