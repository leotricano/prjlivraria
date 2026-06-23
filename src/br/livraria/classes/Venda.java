/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.livraria.classes;

import br.livraria.produto.Produto;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author USER_ADM
 */
public class Venda {
    private Cliente cliente;
    private ArrayList<Produto> itensComprados;
    private Date dataDaVenda;
    private double valorTotal;

    public Venda(Cliente cliente, ArrayList<Produto> itensComprados,
            Date dataDaVenda, double valorTotal) {
        this.cliente = cliente;
        this.itensComprados = itensComprados;
        this.dataDaVenda = dataDaVenda;
        this.valorTotal = valorTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

   

    public ArrayList<Produto> getItensComprados() {
        return itensComprados;
    }

    public void setItensComprados(ArrayList<Produto> itensComprados) {
        this.itensComprados = itensComprados;
    }

    public Date getDataDaVenda() {
        return dataDaVenda;
    }

    public void setDataDaVenda(Date dataDaVenda) {
        this.dataDaVenda = dataDaVenda;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void Vender(){


    }
    public void imprimirRecibo(){
        System.out.println("--- Recibo ---");
        System.out.println("Cliente: " + this.cliente.getNomeCliente());
        System.out.println("Data: " + this.dataDaVenda);
        System.out.println("Itens Comprados:");
        for (Produto p : this.itensComprados) {
            System.out.println("- " + p.getNome() + " (R$ " + p.getPreco() + ")");
        }
        System.out.println("Valor Total: R$ " + this.valorTotal);
        System.out.println("--------------");
    }
    
}
