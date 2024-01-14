/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao3;

/**
 *
 * @author cliente
 */
public class Livro {
    
    private String titulo;
    private String autor;
    private int nPaginas;
    private boolean disponivel;

    public Livro(String titulo, String autor, int nPaginas, boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.nPaginas = nPaginas;
        this.disponivel = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getnPaginas() {
        return nPaginas;
    }
    
    public void emprestar (){
        if (disponivel == true){
             
            System.out.println("O livro " + titulo + " do autor " + autor + " que possui o número de paginas " + nPaginas + " foi emprestado");
            disponivel = false;
        }
        else{
            
            System.out.println("O livro" + titulo+ "não esta disponivel no momento");
        } 
    }
    
    public void devolver(){
        if (!disponivel == true){
            
      System.out.println("O livro " + titulo + " do autor " + autor + " que possui o número de paginas " + nPaginas + " foi devolvido");
      disponivel= true;
      
        }
        else{
            System.out.println("O livro " + titulo + " já esta disponivel no momento");   
        }
    }
    
    public String disponivel(){
 
        if ( disponivel == true){
            
            return " O livro " + titulo + " está disponivel";
        }
        else{
            
            return " O livro "  + titulo + " não está disponivel";
        }
}
    
    
    
    
    
    

    
    
    
    
    
}
