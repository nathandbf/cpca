package Exercicios_CPCA;

public class ContaCorrente {
	private int numero;
	private double saldo;
	private Pessoa titular;
	
	public ContaCorrente(int numero, Pessoa titular) {
		super();
		this.numero = numero;
		this.titular = titular;
		saldo=0;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public Pessoa getTitular() {
		return titular;
	}
	
	public void depositar(double valor) {
		saldo=saldo+valor;
	}

	public void sacar(double valor) {
		saldo=saldo-valor;
	}
	
	
	
}
