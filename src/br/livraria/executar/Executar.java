/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.livraria.executar;

import br.livraria.classes.CarrinhoDeCompras;
import br.livraria.classes.Cliente;
import br.livraria.classes.Livraria;
import br.livraria.classes.Venda;
import br.livraria.produto.Livro;
import br.livraria.produto.Produto;

import java.util.ArrayList;

/**
 *
 * @author USER_ADM
 */
public class Executar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Livraria leitura = new Livraria("Rua das bandeiras ", 20745888);
        Cliente leo = new Cliente("Leonardo","11042882738" );
        Livro narnia = new Livro("Narnia", 40, "25423515", "1", 20,
                "C.S.Lews","Harper Collins", 500 );



        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionar(narnia, 10);
        leitura.cadastrarProduto(narnia);
        leitura.imprimirLoja();
        leitura.listarProdutos();
        carrinhoDeCompras.mostrarCarrinho();
        carrinhoDeCompras.remover(narnia, 10);
        carrinhoDeCompras.mostrarCarrinho();

        carrinhoDeCompras.removerUnidade(narnia);
        Venda venda = new Venda();
    }
    
}
