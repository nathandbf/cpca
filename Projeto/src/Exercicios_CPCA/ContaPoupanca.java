package Exercicios_CPCA;

public class ContaPoupanca extends ContaCorrente {
	private double juros;
	
	public ContaPoupanca(int numero, Pessoa titular,double juros) {
		super(numero, titular);
		this.juros=juros;
	}

	public double getJuros() {
		return juros;
	}

	public void setJuros(double juros) {
		this.juros = juros;
	}
	
	public void depositaRendimento(){
		double valor = super.getSaldo()*juros;
		super.depositar(valor);
		
	}
}
