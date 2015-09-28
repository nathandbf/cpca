package Exercicios_CPCA;

public class Moeda implements Comparable<Moeda>{

		private double valor;
		private String nome;
		
		public Moeda(double v,String n){
			valor=v;
			nome=n;
			
		}

		public double getValor() {
			return valor;
		}

		public String getNome() {
			return nome;
		}

		

		
		public int compareTo(Moeda m) {
			if(m.getValor()>this.getValor()){
			return -1;	
			}
			if(m.getValor()==this.getValor()){
				return 0;
			}
			
			return 1;
		}


	
		
}
