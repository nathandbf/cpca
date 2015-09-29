/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projeto;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author NathanDBF
 */
public class GerenciadorDeAgendas implements Serializable {

    
    private ArrayList<Agenda> lista;

    public GerenciadorDeAgendas(){
     lista = new ArrayList<Agenda>();
    }
    public void criarAgenda(String nome) {
        Agenda a = new Agenda(nome);
        System.out.println("Criou");
        lista.add(a);
    }
    
    public ArrayList<Agenda> getLista(){
    	return lista;
    
    }

    public boolean cadastraCompromisso(Agenda A, Compromisso C) {
        if (verificaAgenda(A)) {
            return A.cadastraCompromisso(C);
        }
        return false;
    }

    public void deletaAgenda(Agenda A) {
        lista.remove(A);
    }

    public boolean verificaAgenda(Agenda a) {
        for (Agenda ag : lista) {
            if (ag.getTitulo().equals(a.getTitulo())) {
                return false;
            }
        }
        return true;
    }
}
