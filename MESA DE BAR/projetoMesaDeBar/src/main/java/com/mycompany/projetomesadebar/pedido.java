/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetomesadebar;

/**
 *
 * @author LUIZ
 */
public class pedido {

    int numMesa;
    String itemPedido;
    boolean bebidaCerveja = false;
    double valorPedido, vlrTtl, vlrTtlMesa;
    int idGarcom;

    public pedido(int aNumMesa, String aItemPedido, boolean aBebidaCerveja, double aValorPedido, double aVlrTtlMesa, double aVlrTtl, int aIdGarcom) {

        this.numMesa = aNumMesa;
        this.itemPedido = aItemPedido;
        this.bebidaCerveja = aBebidaCerveja;
        this.valorPedido = aValorPedido;
        this.idGarcom = aIdGarcom;
        this.vlrTtl = aVlrTtl;
        this.vlrTtlMesa = aVlrTtlMesa;

    }

    public int getNumMesa() {

        return this.numMesa;

    }

    public String getItemPedido() {
        return this.itemPedido;
    }

    public double getValorPedido() {
        return this.valorPedido;

    }

    public void getBebidaCerveja() {
        if (true) {
            
            vlrTtlMesa = valorPedido + 5.00;
        }else 
            vlrTtlMesa = valorPedido; 
    }
    
    

    public int getIdGarcom() {
        return this.idGarcom;
    }
    
    public void cadastroPedido(){
    int numMesa;
    String itemPedido;
    boolean bebidaCerveja = false;
    double valorPedido, vlrTtl;
    int idGarcom;    
    }
}
