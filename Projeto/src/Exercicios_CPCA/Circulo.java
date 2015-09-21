package Exercicios_CPCA;

public class Circulo {

	private int raio;
	private int x;
	private int y;
	
	public Circulo(){
		raio =1;
		x=1;
		y=1;
		
	}
	public Circulo(int raio, int x, int y) {
		this.raio = raio;
		this.x = x;
		this.y = y;
	}

	public int getRaio() {
		return raio;
	}
	
	public void setRaio(int raio) {
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
	
	public int aumentarCirculo(){
		raio++;
		return raio;
	}
	
	public int diminuirCirculo(){
		raio--;
		return raio;
	}
	public void moverCirculo(int x,int y ){
		this.x=x;
		this.y=y;
		
	}
	
	@Override
	public String toString() {
		return "O Circulo possue raio de " + raio + ",tendo seu x em " + x + "e seu y em " + y + ".";
	}
	
	
	
}
