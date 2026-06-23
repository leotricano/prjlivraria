/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.livraria.classes;

import br.livraria.tipos.Funcao;

/**
 *
 * @author USER_ADM
 */
public class Funcionario {
    private String nome;
    private int matricula;
    private double salario;
    private Funcao funcao;

    public Funcionario() {
    }

    public Funcionario(String nome, Funcao funcao, double salario, int matricula) {
        this.nome = nome;
        this.funcao = funcao;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Funcao getFuncao() {
        return funcao;
    }

    public void setFuncao(Funcao funcao) {
        this.funcao = funcao;
    }
}
