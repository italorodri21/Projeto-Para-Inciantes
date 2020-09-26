/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumeracoes;

import java.util.Date;

/**
 *
 * @author italo
 */
public class Status {

    private int id;
    private Date data;
    private StatusPedido status;
    
    public Status(){
        
    }
    
    public Status(int id, Date data, StatusPedido status){
    
        this.id = id;
        this.data = data;
        this.status = status;
    
    }
    
    
    
     
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }
    
    // Criando toString
    
    @Override
    public String toString(){
        return "Status [id=" + id +", data=" + data +", status=" + status +"]";
    
        
    }
    
    
}
