package Exercicios_CPCA;

public class Ponto {
	private double x;
	private double y;

	public Ponto(){
		x=0;
		y=0;
	}
	
	public Ponto(double x1,double y1){
		this.x=x1;
		this.y=y1;
		
	}
	
	public Ponto(Ponto p){
		this.x=p.x;
		this.y=p.y;
	}

	public double getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	
	public double calculaDistancia(Ponto p){
		return this.calculaDistancia(p.getX(), p.getY());
	}

	public double calculaDistancia(double x, double y){
		
		return this.calculaDistancia(this.getX(),x,this.y,y);
	}

	public double calculaDistancia(double x1,double x2,double y1,double y2){
		double var = 0;
		var = ((x2-x1)*(x2-x1)) +((y2-y1)*(y2-y1)) ;
		
		return Math.sqrt(var);
	}
}
