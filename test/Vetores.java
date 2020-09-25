/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Locale;
import java.util.Scanner;

public class Vetores {
    
    public static void main(String[] args){
    
        Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    double[] vetor = new double[n];
    
    
    for (int i=0; i<n; i++ ){
        vetor[i] = sc.nextDouble();
    
    }
    
    double soma = 0.0;

    for(int i=0; i<n; i++){
        soma += vetor[i];
    
    }
    
    double media = soma / n;
    
    System.out.println("Media: " + media);
    
    sc.close();
    }
    
}
