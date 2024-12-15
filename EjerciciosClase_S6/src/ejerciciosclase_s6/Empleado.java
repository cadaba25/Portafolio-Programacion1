/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosclase_s6;

/**
 *
 * @author David Barreda
 */
public class Empleado {
    
    String nombre;
    double salario;
    String genero;
    int edad;
    int antiguedad;
    
    public Empleado(String nombre, double salario, String genero, int edad, int antiguedad){
        this.nombre = nombre;
        this.salario = salario;
        this.genero = genero;
        this.edad = edad;
        this.antiguedad = antiguedad;
        
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
    
    
    
}
