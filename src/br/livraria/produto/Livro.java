/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.livraria.produto;

/**
 *
 * @author USER_ADM
 */
public class Livro extends Produto {
    private String autor, editora;
    private int numeroPaginas;

    public Livro(String nome, double preco, int codigoDeBarras, int id,
            int qtdEstoque, String autor, String editora, int numeroPaginas) {
        super(nome, preco, codigoDeBarras, id, qtdEstoque);
        this.autor = autor;
        this.editora = editora;
        this.numeroPaginas = numeroPaginas;
        
        
    }
}
