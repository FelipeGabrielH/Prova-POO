/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao3;

/**
 *
 * @author cliente
 */
public class Main {
    public static void main(String[] args) {
        
     Livro l1 = new Livro("Mito da Caverna", "Platão", 700, true);
     Livro l2 = new Livro("1984", "Jorge Orval", 300, true);
        
        System.out.println("O nome do livro: " + l1.getTitulo());
        System.out.println("O autor do livro: " + l1.getAutor());
        System.out.println("O livro tem " + l1.getnPaginas()+ " paginas");
        
        System.out.println("-------------------------------------------------------------------------");
        
        System.out.println("O nome do livro: " + l2.getTitulo());
        System.out.println("O autor do livro: " + l2.getAutor());
        System.out.println("O livro tem " + l2.getnPaginas()+ " paginas");
     
         System.out.println("-------------------------------------------------------------------------");
        
        //Emprestei os livros
        l1.emprestar();
        l2.emprestar();
        
         System.out.println("-------------------------------------------------------------------------");
        
         //Devolvi os livros
        
        l2.devolver();
        
        System.out.println("-------------------------------------------------------------------------");
        
        //Tenho que colocar dentro de sout pois está retornando uma String
        System.out.println( l1.disponivel());
        System.out.println( l2.disponivel());
        
    }  
}
