/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicao;

/**
 *
 * @author italo
 */
public class Departamento {

    private String nome;
    
    public Departamento(){
    
    }
    
    public Departamento(String nome){
    
        this.nome = nome;
        
    }
    
       public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
