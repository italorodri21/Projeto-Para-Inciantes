package datas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

/**
 *
 * @author italo
 */
public class Datas {
    
    public static void main(String[] args) throws ParseException{
    
        // -> Definindo padrões de datas
        
        System.out.println("Seja Bem-vindo");
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat dateFormat2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat dateTimeZone = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        dateTimeZone.setTimeZone(TimeZone.getTimeZone("GMT"));
        
        
        // Formato de data no Padrão ISO-8601 - Definido do Padrao UTC
        Date dateFormatIso = Date.from(Instant.parse("2020-09-25T15:42:07Z"));
        
        Date ex1 = dateFormat1.parse("25/09/2020");
        Date ex2 = dateFormat2.parse("25/09/2020 12:50:23");
        
        // Criando data com o horario atual
        Date dataAtual = new Date();
        
        // Convertendo date para os formatos definidos
         System.out.println("----------- Horario Brasil --------------------------");
         System.out.println("Formato 1: " + dateFormat1.format(ex1));
         System.out.println("Formato 2: " + dateFormat2.format(ex2));
         System.out.println("Data Atal: " + dateFormat2.format(dataAtual));
         System.out.println("Data Iso 8601: " + dateFormat2.format(dateFormatIso));
         
         System.out.println("----------- Horario UTC -----------------------------");
         System.out.println("Formato 1: " + dateTimeZone.format(ex1));
         System.out.println("Formato 2: " + dateTimeZone.format(ex2));
         System.out.println("Data Atal: " + dateTimeZone.format(dataAtual));
         System.out.println("Data Iso 8601: " + dateTimeZone.format(dateFormatIso));
         
    }
    
}
