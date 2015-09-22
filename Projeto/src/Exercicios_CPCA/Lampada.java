package Exercicios_CPCA;

public class Lampada {
		public enum STATUS {QUEIMADA,LIGADA,DESLIGADA};
		private int voltagem;
		private int potencia;
		private STATUS estado;
		public Lampada(int voltagem, int potencia) {
			estado = STATUS.DESLIGADA;
			this.voltagem = voltagem;
			this.potencia = potencia;
		}
		public int getVoltagem() {
			return voltagem;
		}
		public void setVoltagem(int voltagem) {
			this.voltagem = voltagem;
		}
		public int getPotencia() {
			return potencia;
		}
		public void setPotencia(int potencia) {
			this.potencia = potencia;
		}
		
		public void trocaEstado(){
			if (estado == STATUS.LIGADA){
			 estado = STATUS.DESLIGADA;	
			}
			
			else if (estado == STATUS.DESLIGADA){
				if (Math.random()<0.30){
					estado = STATUS.QUEIMADA;
				}
				else
					estado = STATUS.LIGADA;
			}
			
		}
		
		public STATUS getEstado(){
			
			return estado;
		}
		
	
	
}
