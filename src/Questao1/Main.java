/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao1;

import java.util.Scanner;

/**
 *
 * @author pcadmin
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        ContaBancaria c1 = new ContaBancaria();
        int option = 0;
        double valor = 0;
        String menu =("""
                ---------------Conta Bancária---------------
                Selecione a opção desejada:
                [1] - Depositar
                [2] - Sacar
                [3] - Consultar Saldo
                [4] - Sair""");
        
        

        while(option != 4){
            
             System.out.println(menu);
             option = in.nextInt();
            if(option == 1) {
                System.out.println("Qual valor você quer depositar");
                valor = in.nextDouble();
                c1.depositar( valor);   
                
            }else if(option == 2){
                System.out.println("Qual valor você quer sacar");
                valor = in.nextDouble();
                c1.sacar(valor);
                
            }
        else if(option == 3){
                System.out.println("Consulta o saldo");
                    System.out.println(c1.getSaldo());
                    }
        
        else {
            
            break;
        }
                
        }
    }

        
        
    }
    

