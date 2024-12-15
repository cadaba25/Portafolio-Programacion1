/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_sem6;

/**
 *
 * @author enigm
 */
public class Empleado {
    
    String nombre;
    double salario;
    String genero;
    int edad;
    int antiguedad;

   
    public Empleado(String nombre, double salario, String genero, int edad, int antiguedad) {
        this.nombre = nombre;
        this.salario = salario;
        this.genero = genero;
        this.edad = edad;
        this.antiguedad = antiguedad;
    }
}