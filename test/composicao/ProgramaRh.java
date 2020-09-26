/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author italo
 */
public class ProgramaRh {
    
    public static void main(String[] args) throws ParseException{
    
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
      
        System.out.print("Entre com o nome do departamento: ");
        String nomeDepartamento = sc.nextLine();
        
        System.out.print("Digite os dados do trabalhador");
        
         System.out.print("Nome:");
         String nome = sc.nextLine();
         System.out.print("Nivel do Departamento:");
         String nivel = sc.nextLine();
         System.out.print("Salario Base:");
         double salarioBase = sc.nextDouble();
        
         Funcionario f = new Funcionario(nome,NivelCargo.valueOf(nivel),salarioBase,new Departamento(nomeDepartamento));
         
         System.out.print("Quantos contratos esse funcionario vai ter? ");
         int n = sc.nextInt();
         
         for(int i=1; i<n; i++){
         
             System.out.print("Entre com o contrato" + i + "dados");
             System.out.println("Data (dd/MM/yyyy): ");
             Date dataContrato = sdf.parse(sc.next());
         
         }
         
        sc.close();
    } 
    
}
