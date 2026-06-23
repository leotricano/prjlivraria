/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.livraria.classes;

import br.livraria.produto.Produto;

import javax.swing.*;
import java.util.ArrayList;

/**
 *
 * @author USER_ADM
 */
public class Livraria {
    private String enderecoLoja;
    private int cepLoja;
    private ArrayList<Produto> produto;
    private ArrayList<Cliente> cliente;
    private ArrayList<Venda> venda;

   

    public Livraria(String enderecoLoja, int cepLoja) {
        this.enderecoLoja = enderecoLoja;
        this.cepLoja = cepLoja;

        this.produto = new ArrayList<>();
        this.cliente = new ArrayList<>();
        this.venda = new ArrayList<>();

    }
//---------------------------------Getters e Setters ----------------------------------------------------------------
    public String getEnderecoLoja() {
        return enderecoLoja;
    }

    public int getCepLoja() {
        return cepLoja;
    }

    public void cadastrarProduto(Produto produto){
        this.produto.add(produto);
    }
//-------------------------------------------------------------------------------------------------------------------------
public void imprimirLoja(){
    System.out.println("------- Informações da Livraria --------");
    System.out.println("Endereço da loja: " + enderecoLoja);
    System.out.println("Endereço da cep: " + cepLoja);
}
    public void cadastrarCliente(Cliente cliente){
        this.cliente.add(cliente);
    }
 //--------------------------------Produto---------------------------------------------------------------------------
    public void listarProdutos(){
        System.out.println("-------------------------Produtos no Estoque-------------------------------");
        if(this.produto.isEmpty()){
            System.out.println("Estoque vazio");
        }else{
            for(Produto p: produto){
                System.out.println(p);
            }
        }
        System.out.println("-------------------------------------------------------------------------");
    }


    public void cadastrarVenda(Venda venda){
        this.venda.add(venda);
    }
    

    public Produto buscarProdutoPorNome(String nomeBuscado) {
        for (Produto p : produto) {
            if (p.getNome().equalsIgnoreCase(nomeBuscado))
                return p;
        }
        return null;
    }
    public Produto buscarProdutoPorCodBarra(String codigoDeBarrasBuscado) {

        for (Produto p: produto) {
            if(p.getCodigoDeBarras().equalsIgnoreCase(codigoDeBarrasBuscado))
                return p;
        }
        return null;
    }

    
    
    
}
