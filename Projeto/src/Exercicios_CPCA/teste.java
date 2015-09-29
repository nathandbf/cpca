package Exercicios_CPCA;

public class teste {
	 public static void main(String[] args) {
	       Matriz m1 = new Matriz(3);
	       Matriz m2= new Matriz(2);
	       int[][] m3 = new int[5][5];
	       m3[0][0]=4;
	       m3[4][4]=1;
	       System.out.println(m1.somaMatriz(m3));
	    }
}
