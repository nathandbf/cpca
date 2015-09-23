package Exercicios_CPCA;

import java.util.ArrayList;
import java.util.List;

public class CadastroDeConta implements ContaDAO {

	private ArrayList<ContaCorrente> Contas;
	
	
	public CadastroDeConta(ArrayList<ContaCorrente> contas) {
		Contas = new ArrayList<ContaCorrente>();
	}

	@Override
	public void adicionar(ContaCorrente conta) {
		Contas.add(conta);
		
	}

	@Override
	public List buscar() {
		return Contas;
	}

	@Override
	public ContaCorrente buscar(int numeroConta) {
		for(ContaCorrente c: Contas){
			if(c.getNumero()==numeroConta)
				return c;
		}
		return null;
	}

	@Override
	public List buscar(String cpfTitular) {
		ArrayList<ContaCorrente> aux = new ArrayList<ContaCorrente>();
		for(ContaCorrente c: Contas){
			if(c.getTitular().equals(cpfTitular))
				aux.add(c);
		}
		return aux;
	}
	
	
}
