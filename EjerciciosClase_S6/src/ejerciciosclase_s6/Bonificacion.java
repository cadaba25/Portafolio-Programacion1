/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosclase_s6;

/**
 *
 * @author David Barreda
 */
public class Bonificacion extends Empleado {
    int bonificacion;
    
    public Bonificacion(String nombre, double salario, String genero, int edad, int bonificacion, int antiguedad) {
        super(nombre, salario, genero, edad, antiguedad);
        
    }
    
    public double criterios(){
        
        if(salario > 4500){
            bonificacion = (int) (salario*0.20);
            
        }else if(salario > 25000 && antiguedad> 7){
            bonificacion = (int) (salario*0.15);
            
        }else if(salario > 18900 && antiguedad > 5){
            bonificacion = (int) (salario*0.10);
            
        }else{
            bonificacion= 0;
        }
        return bonificacion;
        
    }
    
    public double salariofinal(){
        
        return salario + bonificacion;
    }
        
    public void mostrar(){
           System.out.println("nombre :" + nombre);
           System.out.println("Salario : "+ salario);
           System.out.println("Genero : " + genero);
           System.out.println("Edad: " + edad);
           System.out.println("Antiguedad: "+ antiguedad);
    }
    
    
    
}
