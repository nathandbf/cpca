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
	
	
	public double calculaDistancia(Ponto p){
	return this.calculaDistancia(p.getX(), p.getY());
	}

	public double calculaDistancia(int x, int y){
		
		return this.calculaDistancia(this.getX(),x,this.y,y);
	}

	public double calculaDistancia(int x1,int x2,int y1,int y2){
		double var = 0;
		var = ((x2-x1)*(x2-x1)) +((y2-y1)*(y2-y1)) ;
		Math.sqrt(var);
		return var;
	}
}
