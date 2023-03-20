/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastrarcerveja;

/**
 *
 * @author LUIZ-PC
 */
public class Cerveja {
    public String corGarrafa,marca;
    public double qtddML,pesoGarrafa; 
    private int loteFabricacao;
    private double teorAlcoolico; 
    
    public  Cerveja( String aCorGarrafa, String aMarca, double aQtddML, double aPesoGarrafa, int aLoteFabricacao, double aTeorAlcoolico){ //construtor
    this.corGarrafa = aCorGarrafa;
    this.marca = aMarca;
    this.qtddML = aQtddML; 
    this.pesoGarrafa = aPesoGarrafa; 
    this.loteFabricacao = aLoteFabricacao; 
    this.teorAlcoolico = aTeorAlcoolico; 
    }
    String getCorGarrafa(){
        return this.corGarrafa;
}
    String getMarca(){
            return this.marca;
    }
    
    double getQtddML(){
    return this.qtddML;
    }
    
    double getPesoGarrafa(){
    return this.pesoGarrafa;
    }
    
    int getLote(){
    return this.loteFabricacao;
    }
    
    double getTeorAlcoolico(){
    return this.teorAlcoolico;
    }
    
}
