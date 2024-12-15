/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package banca;

/**
 *
 * @author David Barreda
 */
public class Banca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaBanco cuenta = new CuentaBanco();
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("=== Menu de Cuenta Banco ===");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.print("Elige una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Saldo actual: " + cuenta.getSaldo());
                    break;
                case 2:
                    System.out.print("Ingresa el monto a depositar: ");
                    float montoDeposito = scanner.nextFloat();
                    cuenta.depositar(montoDeposito);
                    break;
                case 3:
                    System.out.print("Ingresa el monto a retirar: ");
                    float montoRetiro = scanner.nextFloat();
                    cuenta.retirar(montoRetiro);
                    break;
                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opcion invalida. Intenta de nuevo.");
            }
        } while (opcion != 4);

        
    }
}
    
}
