/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasepersonas;

/**
 *
 * @author David Barreda
 */
public class persona {
    
    String nombre;
    int edad;
    
    public  persona(String nombre , int edad){
        this.nombre = nombre;
        this.edad = edad;
        
    }
    
    public void motrar(){
        
        System.out.println("nombre: " + nombre);
        System.out.println("Edad: "+ edad);
        
        
    }
    
    
}
