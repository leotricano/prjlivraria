package br.livraria.classes;

import br.livraria.produto.Produto;

import java.util.ArrayList;

public class CarrinhoDeCompras {
    private ArrayList<Produto> carrinho;

    public CarrinhoDeCompras() {
        this.carrinho = new ArrayList<>();
    }

    public ArrayList<Produto> getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(ArrayList<Produto> carrinho) {
        this.carrinho = carrinho;
    }

    public void adicionar(Produto p, int quantidade) {
        if (p.getQtdEstoque() < quantidade) {
            System.out.println("Quantidade em estoque não permitida");
            System.out.println(p.getQtdEstoque());
        } else {
            for (int i = 0; i < quantidade; i++) {
                this.carrinho.add(p);
                System.out.println("Carrinho contem: " + carrinho.size() + " Produtos: " + p.getNome());
            }

        }

    }

    public void remover(Produto p, int quantidade){
        if(quantidade > carrinho.size() || quantidade < 0){
            System.out.println("Erro");
        }else {
            for(int i=0; i < quantidade; i++) {
                carrinho.remove(p);
                System.out.println("Carrinho contem: " + carrinho.size() + " Produtos: " + p.getNome());
            }
        }
    }
    public void incrementarUnidade(Produto p){
        long jaNoCarrinho = this.carrinho.stream()
                .filter(item -> item.equals(p))
                .count();
        if (jaNoCarrinho + 1 > p.getQtdEstoque()){
            System.out.println("Atingiu limite do estoque");
        }else {
            this.adicionar(p, 1);
        }
    }

    public void removerUnidade(Produto p){
        long jaNoCarrinho = this.carrinho.stream()
                .filter(item -> item.equals(p))
                .count();
        if (jaNoCarrinho <= 0){
            System.out.println("Limite já alcançado");
        }else {
            this.remover(p, 1);
        }
    }
    public void mostrarCarrinho(){
        System.out.println("--- ITENS NO CARRINHO ---");
        this.carrinho.stream().forEach(p -> System.out.println(p.getNome() + " | R$ " + p.getPreco()));
    }
}