/*
package exercicio4;

public class Ponto2D {
	
	private double x, y;
	
	Ponto2D(double _x, double _y){
		x = _x; y = _y;
	}

}
*/

// foram implementados os getters e setters que faltavam
package exercicio4;

public class Ponto2D {
	
	private double x, y;
	
	Ponto2D(double _x, double _y){
		x = _x; y = _y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
}
