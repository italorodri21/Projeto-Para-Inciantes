/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author italo
 */
public class Funcionario {

    

    private String nome;
    private NivelCargo nivel;
    private double salarioBase;
    
    private Departamento departamento;
    private List<Contrato> listaContratos = new ArrayList<>();
    
    
    public Funcionario(){
    
    }
    
    public Funcionario(String nome, NivelCargo nivel, double salarioBase){
    
        this.nome = nome;
        this.nivel = nivel;
        this.salarioBase = salarioBase;
        
    }

    Funcionario(String nome, NivelCargo valueOf, double salarioBase, Departamento departamento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    // Metodo para pegar lista e add contrato como argumento
    public void adicionarContrato(Contrato contrato){
    
        getListaContratos().add(contrato);
        
    }
    
    // Metodo para remover contrato dos contratos asociados ao trabalhador
    public void removerContrato(Contrato contrato){
        
        getListaContratos().remove(contrato);
        
    }
    
    public double calculo(int ano, int mes){
    
        double soma = salarioBase;
        
        for (Contrato c : listaContratos){
        
            Calendar calendario = Calendar.getInstance();
            
            calendario.setTime(c.getData());
            
            int c_ANO = calendario.get(calendario.YEAR);
            int c_MES = 1 + calendario.get(calendario.MONTH);
            
            if (ano == c_ANO && mes == c_MES){
                
                soma = soma + c.valorTotal();
                
            }
            
        }
     return  soma; 
    }
   
  
    
    
    
    
    
public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public NivelCargo getNivel() {
        return nivel;
    }

    public void setNivel(NivelCargo nivel) {
        this.nivel = nivel;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }    
    
    
    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    public List<Contrato> getListaContratos() {
        return listaContratos;
    }
    
    
    
}
