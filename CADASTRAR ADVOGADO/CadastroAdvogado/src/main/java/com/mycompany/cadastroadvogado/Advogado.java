/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastroadvogado;

/**
 *
 * @author LUIZ-PC
 */
public class Advogado {

    public String nome;
    public int numIdentiOAB;
    private int cpf;
    private boolean disponivel = false;
    private int numCasosCarreira;
    private int numCasosGanhos;
    private int contato;

    public Advogado(String aNome, int aNumIdentiOAB) {
        this.nome = aNome;
        this.numIdentiOAB = aNumIdentiOAB;
    }

    int getCpf() {
        return cpf;
    }

    String getDisponivel() {
        if (disponivel) {
            System.out.println("O advogado solicitado está disponivél.");
        }else{
        System.out.println("O advogado solicitado não está disponível no momento, por favor escolha outro!");

    }
    }
    int getCasosTotal() {
        return numCasosCarreira;
    }
    
    int getCasosGanhos() {
        return numCasosGanhos;
    }
    
    int contato(){
    return contato;
    }
}