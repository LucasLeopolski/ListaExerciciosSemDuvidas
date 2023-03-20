/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.excadastrojogador;

/**
 *
 * @author LUIZ-PC
 */
public class ExCadastroJogador {

    public static void main(String[] args) {
        jogador jogador1 = new jogador("Lionel Messi", 35, false, "Barcelona", true);
        jogador jogador2 = new jogador("Neymar Jr.", 28, false, "Santos F.C", true);
        jogador jogador3 = new jogador("Cristiano Ronaldo", 32, false, "Juventus F.C", true);
        jogador jogador4 = new jogador("Ronaldinho Gaucho", 40, false, "Real Madrid F.C", true);
        jogador jogador5 = new jogador("Mohamed Salah", 33, false, "Liverpool F.C", true);
        
        Time time1 = new Time("Barcelona F.C", "Barcelona - ES", "La Liga", 1, "Spotify Camp Nou", jogador1);
        Time time2 = new Time("Santos F.C", "Santos", "Campeonato Brasileiro Série A", 5, "Urbano Caldeira", jogador2);
        System.out.println("O jogo de hoje pela final da libertadores será entre: "+time1.getNomeTime()+" VS "+time2.getNomeTime()+"\n");
        System.out.println("O poderoso time do "+time1.getNomeTime()+" trás como sua principal arma no ataque "+time1.JogadorPrincipal()+" no alge dos seus "+jogador1.getIdade()+" anos.\n");
        System.out.println("Já o majestoso time do "+time2.getNomeTime()+" tem no seu ataque nada menos que ele,  "+time2.JogadorPrincipal()+" com impressionante "+jogador2.getIdade()+" anos. ");



        
    }
}
