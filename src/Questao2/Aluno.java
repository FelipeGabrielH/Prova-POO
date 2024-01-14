/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao2;

/**
 *
 * @author pcadmin
 */
public class Aluno {
    
    private String aluno;
    private int matricula;
    private double nota[];

    public Aluno (){
        
    }

    public Aluno(String aluno, int matricula, double[] nota) {
        this.aluno = aluno;
        this.matricula = matricula;
        this.nota = nota;
    }
    

    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double[] getNota() {
        return nota;
    }

    public void setNota(double[] nota) {
        
        for (double notas : nota) {
     if (notas <0 || notas >10)
        
         throw new IllegalArgumentException("As notas não podem ser maiores que 10 e menores que 0");
    }
        
        this.nota = nota;
        
    }

    public double calcularMedia() {
        double soma = 0;
        for (double notas : nota) {
            soma += notas;
        }
        return soma /( nota.length);
    }
    
    public String situacao(){
        
        double media = calcularMedia();
        
        if( media < 6){
            
            return "Reprovado";
          
        }
        else{
            
            return "Aprovado";
        }
    }
}
    
    
    
    

