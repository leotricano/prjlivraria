/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.livraria.classes;

import br.livraria.produto.Produto;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author USER_ADM
 */
public class Venda {
    private Cliente cliente;
    private ArrayList<Produto> itensComprados;
    private Date dataDaVenda;
    private double valorTotal;

    public Venda(Cliente cliente) {
        this.cliente = cliente;



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

    public void finalizarVenda(CarrinhoDeCompras produtos, Livraria livraria){
        Scanner leitor =  new Scanner(System.in);
        double total = 0.0;
        double dinheiroCliente = 0.0;

       if(produtos.getCarrinho().size() <= 0){
           System.out.println("Carrinho vazio");
       }else {
           System.out.println("Processando pagamento... ");
           produtos.getCarrinho()
                   .stream()
                   .forEach(p ->
                           System.out.println("Produto: " + p.getNome() +
                           "Valor: " + p.getPreco()));
           total = produtos.getCarrinho()
                           .stream()
                                   .mapToDouble(p -> p.getPreco())
                                           .sum();

           System.out.println("Valor Total: " + total);
           System.out.println("=====================================================================");
           System.out.println("Digite o valor do seu pagamento: ");
           dinheiroCliente = leitor.nextDouble();
           if (dinheiroCliente < total){
               System.out.println("Pagamento recusado! Dinheiro insuficiente.");


           }else if(dinheiroCliente > total) {
               double troco = 0.0;
               troco = dinheiroCliente - total;
               System.out.println("Seu troco é de " + troco);

               System.out.println("Pagamento de " + total + " realizado.");

               livraria.depositarNoCaixa(total);
               System.out.println("Caixa: " + livraria.getCaixa());

           }

           else {

               System.out.println("Pagamento de " + total + " realizado.");

               livraria.depositarNoCaixa(total);
               System.out.println("Caixa: " + livraria.getCaixa());
           }
       }



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
