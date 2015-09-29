
package Projeto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Collections;
import java.util.LinkedList;

/**
 *
 * @author NathanDBF
 */
public class Agenda implements Serializable {

    private LinkedList<Compromisso> compromissos;
    private String titulo;
 

    public Agenda(String titulo) {
        this.titulo = titulo;
        compromissos = new LinkedList<>();
    }

    public Agenda(LinkedList<Compromisso> compromissos, String titulo) {
        this.compromissos = compromissos;
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean cadastraCompromisso(Compromisso c) {
        LocalDate hoje = LocalDate.now();
        int cadastro = hoje.compareTo(c.getData());
        if (cadastro == 1) {
            compromissos.add(c);
            organiza();
            return true;
        }
        return false;
    }

    public void organiza() {
        Collections.sort(compromissos);
    }

    public void removeCompromisso(Compromisso c) {
        compromissos.remove(c);
    }

    public boolean alteraCompromissoTitulo(Compromisso c, String s) {
        for (Compromisso c1 : compromissos) {
            if (c1.equals(c)) {
                c1.setTitulo(s);
                return true;
            }
        }
        return false;
    }

    public boolean alteraCompromissoLocal(Compromisso c, String s) {
        for (Compromisso c1 : compromissos) {
            if (c1.equals(c)) {
                c1.setLocal(s);
                return true;
            }
        }
        return false;
    }

    public boolean alteraCompromissoData(Compromisso c, LocalDate l) {
        for (Compromisso c1 : compromissos) {
            if (c1.equals(c)) {
                c1.setData(l);
                return true;
            }
        }
        return false;
    }

    public boolean alteraCompromissoHoraInicio(Compromisso c, LocalTime t) {
        for (Compromisso c1 : compromissos) {
            if (c1.equals(c)) {
                c1.setInicio(t);
                return true;
            }
        }
        return false;
    }

    public boolean alteraCompromissoFinal(Compromisso c, LocalTime t) {
        for (Compromisso c1 : compromissos) {
            if (c1.equals(c)) {
                c1.setTermino(t);
                return true;
            }
        }
        return false;
    }

    public boolean alteraCompromissoAssunto(Compromisso c, String s) {
        for (Compromisso c1 : compromissos) {
            if (c1.equals(c)) {
                c1.setAssunto(s);
                return true;
            }
        }
        return false;
    }

    public String visualizarCompromissosDia(LocalDate d) {
        String dia = "";
        int controle = 0;
        for (Compromisso c : compromissos) {
            if (c.getData().isEqual(d)) {
                if (controle == 0) {
                    dia = dia + "" + c.getData() + "\n";
                    controle++;
                }
            
            dia = dia + c.toString();
            }
        }

        return dia;
    }

    public String visualizarCompromissosSemana(LocalDate d) {
        String Semana = "";
        int controle = 0;
        LocalDate controleDate = d.plusDays(8);
        for (Compromisso c : compromissos) {
            if (c.getData().isAfter(d.minusDays(1)) && c.getData().isBefore(controleDate)) {
                if (controle != c.getData().getDayOfWeek().getValue()) {
                    Semana = Semana + "" + c.getData().getDayOfWeek() + "\n";
                    controle = c.getData().getDayOfWeek().getValue();
                }

                Semana = Semana + c.toString();
            }
        }

        return Semana;
    }

   

    public String visualizarCompromissosMes(LocalDate d) {
       String mes = "";
        int controle = 0;
        for (Compromisso c : compromissos) {
            if (c.getData().getMonthValue()==d.getMonthValue()) {
                if (controle == 0) {
                    mes = mes + "" + c.getData() + "\n";
                    controle++;
                }
            
            mes = mes + c.toString();
          }
        }

        return mes;
    }

}
