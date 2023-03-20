/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.projetomesadebar;

/**
 *
 * @author LUIZ
 */
public class ProjetoMesaDeBar {

    public static void main(String[] args) {
        pedido pedido1 = new pedido(05, "Feijoada", true, 15.00, 0, 0, 0154);
        pedido pedido2 = new pedido(03, "FeijoaFeijao e Arrozda", true, 15.00, 0, 0, 0154)
        pedido pedido3 = new pedido(01, "Feijoada", true, 15.00, 0, 0, 0154)
        pedido pedido4 = new pedido(07, "Feijoada", true, 15.00, 0, 0, 0154)
        pedido pedido5 = new pedido(09, "Feijoada", true, 15.00, 0, 0, 0154)
                                
        System.out.println("d" + "MESA: " + pedido1.getNumMesa() + "\nPEDIDO: " + pedido1.getItemPedido() + "\nBEBIDA-CERVEJA: " + pedido1.getBebidaCerveja() + "\nVALOR TOTAL DO PEDIDO: " + pedido1.vlrTtlMesa
        "\n\nID Garcom: "+pedido1.getIdGarcom()
    

);
    }
}
