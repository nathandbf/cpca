/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projeto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

/**
 *
 * @author NathanDBF
 */

public class Compromisso implements Comparable, Serializable {

    private String titulo;
    private String assunto;
    private String local;
    private LocalDate data;
    private LocalTime inicio;
    private LocalTime termino;

    
    public Compromisso(String titulo, String assunto, String local, LocalDate data, LocalTime inicio, LocalTime termino) {
        this.titulo = titulo;
        this.assunto = assunto;
        this.local = local;
        this.data = data;
        this.inicio = inicio;
        this.termino = termino;
    }
    
     @Override
    public String toString() {
        return "Compromisso: " + titulo + ", Assunto: " + assunto + ", Local: " + local + 
                ", \nHora de inicio: " + inicio + ", Hora de termino: " + termino + '\n';
    }
    
    public String toStringSimples(){
    
    return "Compromisso: " + titulo + ", Assunto: " + assunto + ", Local: " + local +"";
    }

    
    @Override
    public int compareTo(Object o) {
        if (o == null) {
            throw new NullPointerException();
        }

        Compromisso c2 = (Compromisso) o;
        
        int valor = data.compareTo(c2.getData());
        if (data.isAfter(c2.data)) {
            return 1;
        } else if (c2.data.isAfter(data)) {
            return -1;
        }
        else if (inicio.isAfter(c2.inicio)){
            return 1;
        }
        return -1;
        
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        final Compromisso other = (Compromisso) obj;
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.assunto, other.assunto)) {
            return false;
        }
        if (!Objects.equals(this.local, other.local)) {
            return false;
        }
        if (!Objects.equals(this.data, other.data)) {
            return false;
        }
        if (!Objects.equals(this.inicio, other.inicio)) {
            return false;
        }
        if (!Objects.equals(this.termino, other.termino)) {
            return false;
        }
        return true;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setInicio(LocalTime inicio) {
        this.inicio = inicio;
    }

    public void setTermino(LocalTime termino) {
        this.termino = termino;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAssunto() {
        return assunto;
    }

    public String getLocal() {
        return local;
    }

    public LocalTime getInicio() {
        return inicio;
    }

    public LocalTime getTermino() {
        return termino;
    }

    public LocalDate getData() {
        return data;
    }

   
    
    
    

}
