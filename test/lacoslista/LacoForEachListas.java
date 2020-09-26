package lacoslista;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author italo
 */
public class LacoForEachListas {
    
    public static void main(String[] args){
    
     
        // Laco for each - Assunto Arrays = : Significa contido
        
        String[] permissoesNecessarias = new String[] {
            "Permitir uso da camera, ",
            "Permitir leitura de dados e ",
            "Permitir uso do GPS"};
        
        
        for(int i = 0; i < permissoesNecessarias.length; i++){
            
            System.out.println(permissoesNecessarias[i]);
            
        }
    
        
        
        // Percorrendo listas
        System.out.println("_________________ Percorrendo listas ___________________");
        for (String lista : permissoesNecessarias){
        
            System.out.println(lista);
        
        }
        
        
        
        // Criando listas com a classe ArrayList 
        System.out.println("________________ Criando listas com a classe ArrayList  ____________________");
        List<String> lista = new ArrayList<>();
        
        lista.add("Maria");
        lista.add("Paulo");
        lista.add(2, "Andersom"); // -> Add a lista em uma posicao especifica
        lista.add("João");
        lista.add("Agatha");
        
        lista.remove(0); // -> Deletando dados
        
        System.out.println(lista.size()); // -> Tamanho da lista
        
       for (String dados : lista){
       
           
           
           System.out.println(lista);
           
       }
       
       
       
       // -> Remover elemento da lista por predicado ou seja Por Inicio de Letra
       
       lista.removeIf(x -> x.charAt(0) == 'M');
       
       
       
       // -> Encontrar posição de um elemento
       System.out.println("________________ Encontrar posição de um elemento ____________________");
       System.out.println("Posicao do Paulo: " + lista.indexOf("Paulo") );
       
       
       
       
       // -> Add apenas pessoas com o nome que comece com a letra A
       System.out.println("________________ Add apenas pessoas com o nome que comece com a letra A ____________________");
       List<String> resultados = lista.stream()
               .filter(val -> val.charAt(0) == 'A')
               .collect(Collectors.toList());
       
       for ( String val : resultados){
       
       System.out.println(val);
       }
       
       // -> Encontrando primeiro elemento que comece com a letra A
       System.out.println("________________ Encontrando primeiro elemento que comece com a letra A ____________________");
       String nome  = lista.stream()
               .filter(val -> val.charAt(0)== 'A').findFirst().orElse(null);
       System.out.println(nome);
       
       
    }
    
}
