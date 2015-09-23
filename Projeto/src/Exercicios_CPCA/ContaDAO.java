package Exercicios_CPCA;

import java.util.List;

public interface ContaDAO {

	void adicionar(ContaCorrente conta);
	List buscar();
	ContaCorrente buscar(int numeroConta);
	List buscar(String cpfTitular);

}
