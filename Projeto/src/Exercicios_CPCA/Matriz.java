package Exercicios_CPCA;

public class Matriz {
	private int[][] matriz;

	public Matriz(int tamanho) {
		matriz = new int[tamanho][tamanho];
	}

	public Matriz(int[][] matrizR) {
		matriz = matrizR;
	}

	public void setMatriz(int[][] matriz) {
		this.matriz = matriz;
	}

	public void trocaValor(int x, int y, int valor) {

		if (x > matriz.length || y > matriz.length)
			throw new IllegalArgumentException("Tamanho Invalido");
		matriz[x][y] = valor;

	}

	public void imprimeMatriz(Matriz m) {
		for (int i = 0; i < m.matriz.length; i++) {
			System.out.println(" ");
			for (int j = 0; j < m.matriz.length; j++) {
				System.out.print(m.matriz[i][j]+ " ");
			}
		}
	}

	public int calculaLinha(int l) {
		int total = 0;
		for (int i = 0; i <= matriz.length; i++) {
			total = total + matriz[l][i];
		}
		return total;
	}

	public int calculaColuna(int c) {
		int total = 0;
		for (int i = 0; i <= matriz.length; i++) {
			total = total + matriz[i][c];
		}
		return total;
	}

	public int calculaDiagonalPrincipal(int c) {
		int total = 0;
		for (int i = 0; i <= matriz.length; i++) {
			total = total + matriz[i][i];
		}
		return total;
	}

	public Matriz somaMatriz(int[][] matriz2) {
		
	    Matriz aux = new Matriz(1);
		int total = 0;
		//Matrizes Iguais
		if (matriz2.length == matriz.length) {

			int[][] matrizResultado = new int[matriz.length][matriz.length];

			for (int i = 0; i < matriz.length; i++) {
				System.out.println(" ");
				for (int j = 0; j < matriz.length; j++) {
					matrizResultado[i][j] = matriz[i][j] + matriz2[i][j];
					System.out.print(matrizResultado[i][j]);
				}

			}
			
			aux.setMatriz(matrizResultado);
			return aux;
			}
			
		
		 else {
			int[][] matrizResultado = new int[matriz.length + matriz2.length ][matriz.length + matriz2.length ];
		
			
			 int tamanho = matriz.length + matriz2.length;
			 for (int i = 0; i < matriz.length; i++) { 
			 
				 for (int j = 0; j < matriz.length; j++) {
					 matrizResultado[i][j] = matriz[i][j] ;
			     }
			 }
			 
			 System.out.println("Antes do loop");
			 for (int i = matrizResultado.length-1,i2 = matriz2.length-1; i2 >=0; i--,i2--){
				 System.out.println("Entrou");
				 for (int j = matrizResultado.length-1, j2=matriz2.length-1; j2 >=0; j--,j2--) {
					 matrizResultado[i][j] = 
							 matriz2[i2][j2];
				 }
			 
			  }
			aux.setMatriz(matrizResultado); 
			aux.imprimeMatriz(aux);
			return aux;
		}
	}
}