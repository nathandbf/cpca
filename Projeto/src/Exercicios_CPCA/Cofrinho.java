package Exercicios_CPCA;

import java.awt.font.NumericShaper.Range;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

public class Cofrinho implements Iterable {

	private ArrayList<Moeda> guardadas;
	
	public Cofrinho(){
		guardadas= new ArrayList();
		
	}
	
	public void adicionar(Moeda m){
		guardadas.add(m);
		
	}
	
	public double calcularTotal(){
		return 0;
	}
	
	public double valorMenorMoeda(){
		double menor = Double.MAX_VALUE;
		for(Moeda m : guardadas){
			if(m.getValor()<menor){
				menor = m.getValor();
			}
		}
		return menor;
	}
	
	public Moeda menorMoeda(){
		double menor = Double.MAX_VALUE;
		Moeda m1=null;
		for(Moeda m : guardadas){
			if(m.getValor()<menor){
				menor = m.getValor();
				m1=m;
			}
		}
		return m1;
	}
	
	public double valorMenorMoeda2(){
		double menor = Double.MAX_VALUE;
		Moeda m = Collections.min(guardadas);
		return m.getValor();
	}
	
	public Moeda menorMoeda2(){
		double menor = Double.MAX_VALUE;
		Moeda m = Collections.min(guardadas);
		return m;
		}
	
	public Map TodasMoedas(){
		Map<Integer, Integer> MoedasCount = new HashMap<Integer, Integer>();
		MoedasCount.put(1, 0);
		MoedasCount.put(5, 0);
		MoedasCount.put(10, 0);
		MoedasCount.put(25, 0);
		MoedasCount.put(50, 0);
		MoedasCount.put(100, 0);
		int oldCount=0;
		for(Moeda m : guardadas){
			oldCount=MoedasCount.get(m.getValor());
			
			MoedasCount.replace((int) m.getValor(), oldCount+1);
		}

		return MoedasCount;
	}

	public Iterator<Integer> iterator() {
        return new Iterador();
    }

   
}
