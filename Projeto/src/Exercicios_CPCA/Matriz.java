package Exercicios_CPCA;

public class Matriz {
	private int[][] matriz;

	public Matriz(int tamanho) {
		matriz = new int[tamanho][tamanho];
	}

	public void trocaValor(int x, int y, int valor) {

		if (x > matriz.length || y > matriz.length)
			throw new IllegalArgumentException("Tamanho Invalido");
		matriz[x][y] = valor;

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

	public int[][] somaMatriz(int[][] matriz2) {
		int total = 0;
		if (matriz2.length == matriz.length) {

			int[][] matrizResultado = new int[matriz.length + 1][matriz.length + 1];

			for (int i = 0; i < matriz.length; i++) {
				System.out.println(" ");
				for (int j = 0; j < matriz.length; j++) {
					matrizResultado[i][j] = matriz[i][j] + matriz2[i][j];
					System.out.print(matrizResultado[i][j]);
				}

			}
			return matrizResultado;
		} else {
			int[][] matrizResultado = new int[matriz.length + matriz2.length + 2][matriz.length + matriz2.length + 2];
			for (int i = 0; i < matriz.length; i++) {
				System.out.println(" ");
				for (int j = 0; j < matriz.length; j++) {
					matrizResultado[i][j] = matriz[i][j] + matriz2[i][j];
					System.out.print(matrizResultado[i][j]);
				}

			}

			for (int i = matriz2.length; i < matriz2.length; i--) {
				System.out.println(" ");
				for (int j = matriz2.length; j < matriz2.length; j--) {
					matrizResultado[i][j] = matriz[i][j] + matriz2[i][j];
					System.out.print(matrizResultado[i][j]);
				}

			}

			return matrizResultado;
		}
	}
}
