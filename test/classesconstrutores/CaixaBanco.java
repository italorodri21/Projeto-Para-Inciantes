package classesconstrutores;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author italo
 */

import java.util.Locale;
import java.util.Scanner;

public class CaixaBanco {
    
    
    public static void main(String[] args){
    
    // Definindo ponto como separador de decimais
    Locale.setDefault(Locale.US);
    // Passando Scanner
    Scanner sc = new Scanner(System.in);
    // Instanciando Conta
    Conta conta;
    
    System.out.print("Digite sua senha: ");
        int numero = sc.nextInt();
    System.out.print("Digite o seu nome:");
        sc.nextLine();
        String titular = sc.nextLine();
    System.out.print("Tem um deposito Incial? (y/n)");
        char resposta = sc.next().charAt(0);
    
    if(resposta == 'y'){
        
        conta = new Conta(numero, titular);
        
    }else{
        
        
        conta = new Conta(numero,titular);
    }
    
        System.out.println();
        System.out.println("Saldo da conta");
        System.out.println(conta);
        
         System.out.println();
         System.out.println("Digite o valor do deposito: ");
         double valorDeposito = sc.nextDouble();
         
        
    
    sc.close();
    }
    
    
    
    
    
}
