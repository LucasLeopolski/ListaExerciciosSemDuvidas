/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.cadastroadvogado;

/**
 *
 * @author LUIZ-PC
 */
public class CadastroAdvogado {

    public static void main(String[] args) {
        Advogado cadastro1 = new Advogado("Robert Zane", 123);
        Advogado cadastro2 = new Advogado("Katrina Bennett", 456);
        Advogado cadastro3 = new Advogado("Rachel Zane", 789);
        Advogado cadastro4 = new Advogado("Louis Litt", 912);
        Advogado cadastro5 = new Advogado("Jessica Pearson", 834);
        Advogado cadastro6 = new Advogado("Mike Ross", 756);
        Advogado cadastro7 = new Advogado("Samantha Wheeler", 678);
        Advogado cadastro8 = new Advogado("Harvey Specter", 589);
            
        //erro no tipo de dado que deve retornar o if e else e erro no metodo contato. 
        System.out.println("" + "ADVOGADO 1:\n NOME: " + cadastro6.nome + ", NUMERO DE CADASTRO DA OAB: " + cadastro6.numIdentiOAB + ", CPF: " + cadastro6.getCpf() + ", PODE SER CONTRATADO? " + cadastro6.getDisponivel()+", NUMERO DE CASOS DEFENDIDOS: "+cadastro6.getCasosTotal()+", NUMERO DE CASOS GANHOS: "+cadastro6.getCasosGanhos()+", CONTATAO: "cadastro6.contato());
        System.out.println("" + "ADVOGADO 1:\n NOME: " + cadastro7.nome + ", NUMERO DE CADASTRO DA OAB: " + cadastro7.numIdentiOAB + ", CPF: " + cadastro7.getCpf() + ", PODE SER CONTRATADO? " + cadastro7.getDisponivel()+", NUMERO DE CASOS DEFENDIDOS: "+cadastro7.getCasosTotal()+", NUMERO DE CASOS GANHOS: "+cadastro7.getCasosGanhos()+", CONTATAO: "cadastro7.contato());
        System.out.println("" + "ADVOGADO 1:\n NOME: " + cadastro8.nome + ", NUMERO DE CADASTRO DA OAB: " + cadastro8.numIdentiOAB + ", CPF: " + cadastro8.getCpf() + ", PODE SER CONTRATADO? " + cadastro8.getDisponivel()+", NUMERO DE CASOS DEFENDIDOS: "+cadastro8.getCasosTotal()+", NUMERO DE CASOS GANHOS: "+cadastro8.getCasosGanhos()+", CONTATAO: "cadastro8.contato());
    
    }
}
