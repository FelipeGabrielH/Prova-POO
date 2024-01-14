/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao1;

/**
 *
 * @author pcadmin
 */
public class ContaBancaria {
    
    private String numero;
    private String nome;
    private double saldo;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        if ( nome == null || nome.isBlank() ){
            throw new IllegalArgumentException("O nome esta vazio!");
        }
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if ( nome == null || nome.isBlank() ){
            
            throw new IllegalArgumentException("O nome esta vazio!");
        }
        
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }
    
     public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Depósito inválido");
        }
        saldo = saldo + valor;
    }
     
     public void sacar(double valor) {
        if (valor <= 0 || (saldo - valor) < 0) {
            throw new IllegalArgumentException("Saque inválido");
        }
        saldo = saldo - valor;
    }

    
}
