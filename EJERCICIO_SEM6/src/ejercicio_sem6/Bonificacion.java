/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_sem6;

/**
 *
 * @author enigm
 */
public class Bonificacion extends Empleado {
    double bonificacion;

    
    public Bonificacion(String nombre, double salario, String genero, int edad, int antiguedad) {
        super(nombre, salario, genero, edad, antiguedad);
        this.bonificacion = 0;
    }
    
    
    public double calcularSalarioFinal() {
        if (salario > 45000) {
            bonificacion = salario * 0.2;
        } else if (salario > 25000 && salario <= 45000 && antiguedad > 7) {
            bonificacion = salario * 0.15;
        } else if (salario > 18900 && antiguedad > 5) {
            bonificacion = salario * 0.1;
        }
        return salario + bonificacion;
    }
}