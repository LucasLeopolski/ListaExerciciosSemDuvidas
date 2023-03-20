/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.cadastrarcerveja;

/**
 *
 * @author LUIZ-PC
 */
public class CadastrarCerveja {

    public static void main(String[] args) {
        Cerveja cadastro1 = new Cerveja("Marrom", "Brahma", 450.0, 653.0, 123123, 3.5);
        Cerveja cadastro2 = new Cerveja("Verde", "Heineken", 450.0, 665.6, 456456, 6.6);
        Cerveja cadastro3 = new Cerveja("Marrom", "Eisenbahn", 450.0, 649.9, 789789, 5.1);
        Cerveja cadastro4 = new Cerveja("Marrom", "Itaipava", 450.0, 637.0, 192192, 4.7);
        Cerveja cadastro5 = new Cerveja("Marrom", "Skol", 450.0, 656.6, 283283, 6.5);

        System.out.println("CERVEJA 1: \nMARCA: " + cadastro1.getMarca() + "\nCOR DA GARRAFA: " + cadastro1.getCorGarrafa() + "\nQUANTIDADE EM ML: " + cadastro1.getQtddML() + " ML \nPESO DA GARRAFA: " + cadastro1.getPesoGarrafa() + " gramas \nTEOR ALCOOLICO: " + cadastro1.getTeorAlcoolico() + "\nLOTE DE FABRICAÇÃO: " + cadastro1.getLote());
        System.out.println("\n\nCERVEJA 2: \nMARCA: " + cadastro2.getMarca() + "\nCOR DA GARRAFA: " + cadastro2.getCorGarrafa() + "\nQUANTIDADE EM ML: " + cadastro2.getQtddML() + " ML \nPESO DA GARRAFA: " + cadastro2.getPesoGarrafa() + " gramas \nTEOR ALCOOLICO: " + cadastro2.getTeorAlcoolico() + "\nLOTE DE FABRICAÇÃO: " + cadastro2.getLote());
        System.out.println("\n\nCERVEJA 3: \nMARCA: " + cadastro3.getMarca() + "\nCOR DA GARRAFA: " + cadastro3.getCorGarrafa() + "\nQUANTIDADE EM ML: " + cadastro3.getQtddML() + " ML \nPESO DA GARRAFA: " + cadastro3.getPesoGarrafa() + " gramas \nTEOR ALCOOLICO: " + cadastro3.getTeorAlcoolico() + "\nLOTE DE FABRICAÇÃO: " + cadastro3.getLote());
        System.out.println("\n\nCERVEJA 4: \nMARCA: " + cadastro4.getMarca() + "\nCOR DA GARRAFA: " + cadastro4.getCorGarrafa() + "\nQUANTIDADE EM ML: " + cadastro4.getQtddML() + " ML \nPESO DA GARRAFA: " + cadastro4.getPesoGarrafa() + " gramas \nTEOR ALCOOLICO: " + cadastro4.getTeorAlcoolico() + "\nLOTE DE FABRICAÇÃO: " + cadastro4.getLote());
        System.out.println("\n\nCERVEJA 5: \nMARCA: " + cadastro5.getMarca() + "\nCOR DA GARRAFA: " + cadastro5.getCorGarrafa() + "\nQUANTIDADE EM ML: " + cadastro5.getQtddML() + " ML \nPESO DA GARRAFA: " + cadastro5.getPesoGarrafa() + " gramas \nTEOR ALCOOLICO: " + cadastro5.getTeorAlcoolico() + "\nLOTE DE FABRICAÇÃO: " + cadastro5.getLote());
    
    
    }
}
