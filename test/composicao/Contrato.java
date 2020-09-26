/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicao;

import java.util.Date;

/**
 *
 * @author italo
 */
public class Contrato {
    
    private Date data;
    private double valorHora;
    private Integer horasTrabalhadas;
    
    public Contrato(){
    
    }
    
    public Contrato(Date data, double valorHora, Integer horasTrabalhadas){
    
        this.data = data;
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    
    }
    
    // Fazendo calculo das horas
    public double valorTotal(){
        return valorHora * horasTrabalhadas;
    }
    
    
        
    public Date getData() {
        return data;
    }
    
    public void setData(Date data) {
        this.data = data;
    }
    
    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public Integer getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(Integer horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
    
    
    
}
