/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.excadastrojogador;

/**
 *
 * @author LUIZ-PC
 */
public class jogador {

    private String nome;
    private int idade;
    private boolean lesionado;
    private String time;
    private boolean cadastrado = false;

    public jogador(String aNome, int aIdade, boolean aLesionado, String aTime, boolean aCadastrado) {
        this.nome = aNome;
        this.idade = aIdade;
        this.lesionado = aLesionado;
        this.time = aTime;
        this.cadastrado = aCadastrado;

    }

    public void getNomeIdade() {
        System.out.println("O Jogador: " + nome + " Tem: " + idade + " anos. ");

    }
    public String getNome(){
    return this.nome;
    }
    
    public int getIdade(){
        return this.idade;
    }

    public void cadastroJogador() {
        String nome;
        int idade;
        long cpf;
        long telefone;
        String posicao;
        String Nacionalidade;

    }

    public void getPosicaoLesao() {
        if (lesionado) {
            System.out.println("O Jogador: " + nome + " joga na posição: "  + ". E está lesionado.");
        } else {
            System.out.println("O Jogador: " + nome + " joga na posição: "  + ". E está apto para jogar.");
          

        }

    }
}
