package Exercicios_CPCA;

public class Matriz {
	private int[][] matriz;
	
	public Matriz(int tamanho){
		matriz = new int[tamanho][tamanho];	
	}
	
	public void trocaValor(int x, int y, int valor){
		
		if(x>matriz.length || y>matriz.length)
			throw new IllegalArgumentException("Tamanho Invalido");	
			matriz[x][y]=valor;
		
	}
	
	
	public int calculaLinha(int l){
		int total=0;
		for(int i = 0; i<= matriz.length;i++){
			total=total+ matriz[l][i];
		}
		return total;
	}
	
	public int calculaColuna(int c){
		int total=0;
		for(int i = 0; i<= matriz.length;i++){
			total=total+ matriz[i][c];
		}
		return total;
	}
	
}
