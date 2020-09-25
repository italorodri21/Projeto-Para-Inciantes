

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public final class Conta {

   

    
    
    private int numero;
    private String titular;
    private double balanco;
    
    
    public Conta(int numero, String titular){
    
    this.numero = numero;
    this.titular = titular;

    
    }
    
   
    public Conta(int numero, String titular, double depositoIncial){

        this.numero = numero;
        this.titular = titular;
        double depositoInicial;
        metodoDeposito(depositoIncial);
        
    }
    
    // Metodo de Deposito
    
    public void metodoDeposito(double valor){
    
        balanco += valor;
        
        
        
    }
    
    // Metodo de Saque
    
    public void metodoSaque(double valor){
    
        balanco -= valor +5;
        
    }
    
    

  
    public int getNumero() {
        return numero;
    }

   
    public void setNumero() {
        this.numero = numero;
    }

   
    public String getTitular() {
        return titular;
    }

    
    public void setTitular() {
        this.titular = titular;
    }

  
    public double getBalanco() {
        return balanco;
    }

  
    public void setBalanco() {
        this.balanco = balanco;
    }

    public String toString(){
    
        return "Conta"
                + numero +
                "Titular: " +
                titular +
                "Saldo: R$" +
                balanco +
                String.format("%.2f", balanco);
    
    }
    
}
