/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.excadastrojogador;

/**
 *
 * @author LUIZ-PC
 */
public class Time { // declaração atributos
   private String nomeTime;  // privado é quando o atributo não será usado novamente, se quiser "reutilizar coloco como public"
   private String cidadeTime; 
   private String campeonato;
   private int classificacao; 
   private String nomeEstadio;
   private jogador jogador; 
   
   
   public Time (String aNomeTime, String aCidadeTime, String aCampeonato, int aClassificacao, String aNomeEstadio, jogador aJogador ){ // definindo metodos 
    
    this.nomeTime = aNomeTime; // está informando que a class "nomeTime" receberá o metodo "aNomeTime". 
    this.cidadeTime = aCidadeTime; 
    this.campeonato = aCampeonato;
    this.classificacao = aClassificacao; 
    this.nomeEstadio = aNomeEstadio; 
    this.jogador = aJogador; 
   }
    
   
   public String JogadorPrincipal(){
       System.out.println("O time: "+nomeTime+" tem como seu jogador principal: "+jogador);
       return jogador.getNome();
   }
   
   public String getNomeTime(){
       return this.nomeTime; 
   
   } 
   
   public void cadastrarTime(){
       String nomeTime;
       String pais; 
       
       
   }
}
