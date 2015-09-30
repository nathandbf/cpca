package Exercicios_CPCA;

public class teste {
	 public static void main(String[] args) {
	       Matriz m1 = new Matriz(2);
	      
	       Matriz m2= new Matriz(2);
	       int[][] m3 = new int[3][3];
	       m3[0][0]=4;
	       m3[1][1]=1;
	       int[][] m4 = new int[2][2];
	       m4[0][0]=10;
	     m1.setMatriz(m4);
	       System.out.println(m3.length-1);
	    
	     m1.somaMatriz(m3);
	    }
}
