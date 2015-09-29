/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projeto;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

/**
 *
 * @author NathanDBF
 */
public class Fachada {
  
    private Agenda agenda;
   
    private GerenciadorDeAgendas gerenciador;

    public void criarAgenda(String nome) {
        gerenciador.criarAgenda(nome);
    }

    public boolean cadastraCompromisso(Agenda a, Compromisso c) {
        return gerenciador.cadastraCompromisso(a, c);

    }
    
    public List<Agenda> listaAgendas(){
    
        return gerenciador.getLista();
    }
    
    public void visualizaPorFiltro(Agenda a, String s,LocalDate d) {
        if (s.equals("Mês")) {
            a.visualizarCompromissosMes(d);
        }
        if (s.equals("Semana")) {
            a.visualizarCompromissosSemana(d);
        }
        if (s.equals("Dia")) {
            a.visualizarCompromissosDia(d);
        }
    }

    public void removeCompromisso(Agenda a, Compromisso C) {
        a.removeCompromisso(C);
    }

    public void removeAgenda(Agenda a) {
        gerenciador.deletaAgenda(a);
    }

    public void alteraNomeAgenda(Agenda a, String nome) {
        a.setTitulo(nome);
    }

    public void alteraCompromissoString(Agenda a, Compromisso c, String alteracao, String nova) {
        if (alteracao.equals("Titulo")) {
            a.alteraCompromissoTitulo(c, nova);
        }
        if (alteracao.equals("Local")) {
            a.alteraCompromissoLocal(c, nova);
        }
    }

    public void alteraHorarios(Agenda a, Compromisso c, String alteracao, LocalTime t) {
        if (alteracao.equals("Inicio")) {
            a.alteraCompromissoHoraInicio(c, t);
        }

        if (alteracao.equals("Fim")) {
            a.alteraCompromissoFinal(c, t);
        }
    }
    
    public void alteraData(Agenda a,Compromisso c,LocalDate d){
        a.alteraCompromissoData(c, d);
    
    }
    
    public void exportarCompromisso(Compromisso c){
        AgendaDAOFile.exportarCompromisso(c);
    }
    
    public void salvarDados(GerenciadorDeAgendas a ){
      AgendaDAOFile.salvarDados(a);  
    }
    
}
