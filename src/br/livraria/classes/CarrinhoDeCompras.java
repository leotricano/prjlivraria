package br.livraria.classes;

import br.livraria.produto.Produto;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private ArrayList<Produto> itens;

    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
    }

    public ArrayList<Produto> getItens() {
        return itens;
    }

    public void setItens(ArrayList<Produto> itens) {
        this.itens = itens;
    }

    public void adicionar(Produto p, int quantidade) {
        if (p.getQtdEstoque() < quantidade) {
            System.out.println("Quantidade em estoque não permitida");
            System.out.println(p.getQtdEstoque());
        } else {
            for (int i = 0; i < quantidade; i++) {
                this.itens.add(p);
                System.out.println("Carrinho contem: " + itens.size() + " Produtos: " + p.getNome());
            }

        }

    }

    public void remover(Produto p, int quantidade){
        if(quantidade > itens.size() || quantidade < 0){
            System.out.println("Erro");
        }else {
            itens.remove(p);

        }
    }
    public void incrementarUnidade(Produto p){
        long jaNoCarrinho = this.itens.stream()
                .filter(item -> item.equals(p))
                .count();
        if (jaNoCarrinho + 1 > p.getQtdEstoque()){
            System.out.println("Atingiu limite do estoque");
        }else {
            this.adicionar(p, 1);
        }
    }
    public void mostrarCarrinho(){
        System.out.println("--- ITENS NO CARRINHO ---");
        this.itens.stream().forEach(p -> System.out.println(p.getNome() + " | R$ " + p.getPreco()));
    }
}