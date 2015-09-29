/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projeto;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author NathanDBF
 */
public class AgendaDAOFile  {

    
    public static void exportarCompromisso(Compromisso C) {
       String s = "BEGIN:VEVENT \n";
       LocalDateTime Data1= LocalDateTime.of(C.getData(),C.getInicio());
       LocalDateTime Data2= LocalDateTime.of(C.getData(),C.getTermino());
       String start = "" + Data1.getYear() + "" + Data1.getMonthValue() +""+ Data1.getDayOfMonth()+ "" + Data1.getHour()+ ""+ Data1.getMinute()+""+Data1.getSecond()+"";
       String fim = "" + Data2.getYear() + "" + Data2.getMonthValue() +""+ Data2.getDayOfMonth()+ "" + Data2.getHour()+ ""+ Data2.getMinute()+""+Data2.getSecond()+"";
       s = s + "DTSTAMP:" + start +"Z\n";
       s = s + "DTSTART:" + start +"Z\n";
       s = s + "DTEND:" + fim +"Z\n";
       s = s + "SUMMARY:" + C.toStringSimples() + "\n";
       s = s + "END:VEVENTEND:VEVENT";
      FileWriter arq; 
        try {
            arq = new FileWriter("C:\\bla\\compromisso.txt");
            PrintWriter gravarArq = new PrintWriter(arq); 
            gravarArq.printf(s);
            arq.close();
        } catch (IOException ex) {
            System.out.println("Problema na exportação");
        } 
    }

    
    public static void salvarDados(GerenciadorDeAgendas A) {
        try {
         FileOutputStream out = new FileOutputStream("C:\\bla\\test.txt");
         ObjectOutputStream oout = new ObjectOutputStream(out);
         oout.writeObject(A);
         oout.close();
         } catch (Exception ex) {
         ex.printStackTrace();
      }
    }
        
    
    
}
