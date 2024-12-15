/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banca;

/**
 *
 * @author David Barreda
 */
public class cuentabanco {
    
    public String cliente;
    public int numerodecuenta;
    public int telefono;
    public double limite;
    private double saldo;

    public cuentabanco(String cliente, int numerodecuenta, int telefono, double limite) {
        this.cliente = "Carlos";
        this.numerodecuenta = 123456;
        this.telefono = 93253344;
        this.limite = 999999;
        this.saldo = 0;
    }
    
    
    

    public double getsaldo() {
        return this.saldo;
    }
    
    public void depositar(double monto){
        if(monto>0){
            if(this.saldo + monto <= this.numerodecuenta){
                this.saldo += monto;
            }else{
                System.out.println("El monto eccede el limite");
            }
            
            
            
            
        }else{
            System.out.println("Monto no permitido");
        }
    }
    
    public void retirar(double monto){
        
        if(monto> 0 ){
            if(this.saldo - monto >= 0){
                this.saldo -= monto;
            }else{
                System.out.println("Monto no permitido");
            }
        }else{
            System.out.println("Monto no permitido");
        }
        
        
    }
    
    
    
}
