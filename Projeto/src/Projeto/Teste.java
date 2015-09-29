/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projeto;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author NathanDBF
 */
public class Teste {
    public static void main(String[] args) {
        
 
    LocalTime currentTime = LocalTime.now(); // current time
    LocalTime midday = LocalTime.of(12, 0); // 12:00
    LocalTime midday2 = LocalTime.of(13, 0); 
    LocalTime midday3 = LocalTime.of(14, 0); 
    LocalDate firstAug2014 = LocalDate.of(2014, 8, 1);
    LocalTime hora0 = LocalTime.of(0, 30); 
    LocalTime hora1 = LocalTime.of(1, 0); 
    LocalTime hora2 = LocalTime.of(2, 0);
    LocalTime hora3 = LocalTime.of(3, 0);
    LocalTime hora4 = LocalTime.of(4, 0);
    LocalTime hora5 = LocalTime.of(5, 0);
    LocalTime hora6 = LocalTime.of(6, 0);
    LocalTime hora7 = LocalTime.of(7, 0);
    LocalTime hora8 = LocalTime.of(18, 0);
    LocalTime hora9 = LocalTime.of(19, 0);
    
    LocalDate Data1 = LocalDate.of(2015, 5, 5);
    LocalDate Data2 = LocalDate.of(2015, 5, 6);
    LocalDate Data3 = LocalDate.of(2015, 5, 6);
    LocalDate Data4 = LocalDate.of(2015, 6, 5);
     
    Compromisso c1 = new Compromisso("Compromisso 1 ", "Assunto 1", "No Centro", Data1, hora0, hora2);
    Compromisso c2 = new Compromisso("Compromisso 2 ", "Assunto 2", "No Centro", Data1, hora1, hora4);
    Compromisso c3 = new Compromisso("Compromisso 3 ", "Assunto 3", "No Centro", Data2, hora4, hora8);

 
  
   // Fachada F1 = new Fachada();
    //F1.criarAgenda("Agenda 1");
   // F1.criarAgenda("Agenda 2");
    //F1.listaAgendas().get(0);
    
    
    
    GerenciadorDeAgendas G1 = new GerenciadorDeAgendas();
    G1.criarAgenda("AgendaLegal");

    //pega a primeira Agenda
    G1.getLista().get(0).cadastraCompromisso(c2);
    G1.getLista().get(0).cadastraCompromisso(c3);
    G1.getLista().get(0).cadastraCompromisso(c1);
    AgendaDAOFile.salvarDados(G1);
    AgendaDAOFile.exportarCompromisso(c1);
    
    //Métodos da fachada
    
 //   ag.salvarDados(G1);
    
}
}
