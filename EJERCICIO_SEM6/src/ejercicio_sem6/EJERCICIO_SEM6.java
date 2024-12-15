/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_sem6;

/**
 *
 * @author enigm
 */
public class EJERCICIO_SEM6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Bonificacion empleado = new Bonificacion("Juan ", 30000, " Masculino ", 35, 8);

        double salarioFinal = empleado.calcularSalarioFinal();

        System.out.println("""
            Nombre: """ + empleado.nombre + """
            Salario base: Lps. """ + empleado.salario + """
            Género: """ + empleado.genero + """
            Edad: """ + empleado.edad + """
            Antigüedad: """ + empleado.antiguedad + """
            Bonificación: Lps. """ + empleado.bonificacion + """
            Salario final: Lps. """ + salarioFinal);
    }
    
}
