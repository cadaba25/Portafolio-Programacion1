/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clasepersonas;

/**
 *
 * @author David Barreda
 */
public class ClasePersonas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       persona[] personas = new persona[10];
        
       
       personas[0] = new persona("CARLOS", 20);
       personas[1] = new persona("MARIO", 10);
       personas[2] = new persona("ROBERT", 18);
       
       
       
       for (int i = 0; i < personas.length; i++) {
            for (int j = 1; j < personas.length; j++) {
                if(personas[j].edad > personas[j+1].edad){
                    persona temp = personas[j];
                    temp = personas[j];
                    personas[j]= personas[j-1];
                    personas[j-1]=temp;
                }
                
            }
            
        }
       
        for (int i = 0; i < personas.length; i++) {
            personas[i].motrar();
            System.out.println();
            
        }
       
       
       
        
    }
    
}
