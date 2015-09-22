package Exercicios_CPCA;

public class Circulo {

	private static final String Throw = null;
	private double raio;
	private int x;
	private int y;
	
	public Circulo(int x,int y){
		this.x=x;
		this.y=y;
		raio=1;
	
	}
	
	public Circulo(int r){
		this.raio=r;
		y=1;
		x=1;
	}
	
	public Circulo(Circulo c){
		this.raio=c.getRaio();
		this.x=c.getX();
		this.y=c.getY();
	}
	
	public Circulo(Ponto p,double r){
		if (p==null){
			throw new NullPointerException("Ponto nulo");
		}
		if (r<0){
			throw new IllegalArgumentException("Raio negativo");	
		}
		
		raio = r;
		x=p.getX();
		y=p.getY();
		
	}
	
	
	public Circulo(double d,Ponto p ){
		raio = d/2;
		x=p.getX();
		y=p.getY();
	}
	
	public double getRaio() {
		return raio;
	}
	
	public void setRaio(double raio) {
		this.raio = raio;
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
	
	public double aumentarCirculo(){
		raio++;
		return raio;
	}
	
	public double diminuirCirculo(){
		raio--;
		return raio;
	}
	public void moverCirculo(int x,int y ){
		this.x=x;
		this.y=y;
		
	}
	public void moverCirculo(Ponto p){
		this.x=p.getX();
		this.y=p.getY();
		
	}
	

	
	@Override
	public String toString() {
		return "O Circulo possue raio de " + raio + ",tendo seu x em " + x + "e seu y em " + y + ".";
	}
	
	
	
}
