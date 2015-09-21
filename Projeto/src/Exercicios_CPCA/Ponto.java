package Exercicios_CPCA;

public class Ponto {
	private int x;
	private int y;

	public Ponto(){
		x=0;
		y=0;
	}
	
	public Ponto(int x1,int y1){
		this.x=x1;
		this.y=y1;
		
	}
	
	public Ponto(Ponto p){
		this.x=p.x;
		this.y=p.y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	
}
