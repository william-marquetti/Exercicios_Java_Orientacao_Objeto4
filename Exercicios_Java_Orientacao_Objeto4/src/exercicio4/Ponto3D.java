/*
  package exercicio4;

public class Ponto3D extends Ponto2D{
	
	private double z;
	
	Ponto3D(double _x, double _y, double _z){
		x = _x;
		y = _y;
		z = _z;
	}

}

 */

/* 
 * foram implementados os getters e setters que faltavam 
 * na linha 9, estava faltando a chamada do construtor da super classe Ponto2D, 
 * pois Ponto3D extende à ela e a mesma possui apenas um construtor com todos os atributos
 * obrigatórios.
 */
package exercicio4;

public class Ponto3D extends Ponto2D{
	
	private double z;
	
	Ponto3D(double _x, double _y, double _z){
		super(_x, _y);
		this.z = _z;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}
	
}
