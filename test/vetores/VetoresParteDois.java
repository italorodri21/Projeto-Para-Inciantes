package vetores;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import classesconstrutores.Produtos;
import java.util.Scanner;

/**
 *
 * @author italo
 */
public class VetoresParteDois {
    
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        Produtos[] vetor = new Produtos[n];
    
    
        for (int i=0; i<0; i++){
        sc.nextInt();
        String nome = sc.nextLine();
        double precos = sc.nextDouble();
        
        vetor[i] = new Produtos(nome, precos);
          
        }
        
        double soma =  0.0;
        
        for (int i=0; i<0; i++){
        soma += vetor[i].getPreco();
        }
        
        double avg = soma / n;
        System.out.printf("SOMA: " + avg);
        
    }
    
    
}
