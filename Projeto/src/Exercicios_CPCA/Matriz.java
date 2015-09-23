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
	public int calculaDiagonalPrincipal(int c){
		int total=0;
		for(int i = 0; i<= matriz.length;i++){
			total=total+ matriz[i][i];
		}
		return total;
	}
	
	public int[][] somaMatriz(int[][] matriz2){
		int total=0;
		int[][] matrizResultado = new int [matriz.length+1][matriz.length+1];
		
		for(int i = 0; i<= matriz.length;i++){
			
			for(int j = 0; j<= matriz.length;i++){
			matrizResultado[i][j]= matriz[i][j]+matriz2[i][j];
			}
	
		}
		return matrizResultado;
	
	}
}
