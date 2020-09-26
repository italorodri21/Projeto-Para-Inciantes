package matriz;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author italo
 */
public class Matriz {
    
    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);
        
        // Salvando dados na matriz
        int n = sc.nextInt();
        int[][] matriz = new int [n][n];
        
        for(int i=0; i<n; i++){
        
            for(int j=0; j<n; j++){
            
                matriz[i][i] = sc.nextInt();
                
            }
         
                
            }
        
        System.out.println("Diagonal :");
        
            for (int i=0; i<n; i++){
                System.out.println(matriz[i][i] + "");
        
        }
            System.out.println();
            
            
            // Encontrar numeros negativos
            
            int negativo = 0;
            
            for (int i=0; i<n; i++){
                
                for (int j=0; j<n; j++){
                    
                    if(matriz[i][i] < 0){
                        negativo++;
                    }
                
                }
                
                System.out.println("Numeros negativos: " + negativo);
            }
        
    }
    
}
