/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao2;

/**
 *
 * @author pcadmin
 */
public class Main {
    public static void main(String[] args) {
        
        double notas[]= {10,10,10,10, 0.5};
        
        Aluno aluno1 = new Aluno("Maria Silva", 12345, notas);

        // Calcular a média das notas
        System.out.println("Média das notas: " + aluno1.calcularMedia());

        // Verificar a situação do aluno
        System.out.println("Situação do aluno: " + aluno1.situacao());
    }
    }
    

