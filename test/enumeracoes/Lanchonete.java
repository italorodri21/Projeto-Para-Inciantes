/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumeracoes;

import java.util.Date;

/**
 *  +++++++++++++++++ Enumerações ++++++++++++++++++++++++++++
 * @author italo
 */
public class Lanchonete {
    
    
    public static void main(String[] args){
    
        Status status = new Status(12323, new Date(), StatusPedido.AGUARDANDO_PAGAMENTO);
        
        StatusPedido pedido1 = StatusPedido.RECEBIDO;
        
        StatusPedido pedido2 = StatusPedido.valueOf("RECEBIDO");
        
        System.out.println(status);
        System.out.println(pedido1);
        System.out.println(pedido2);
    }
    
    
}
