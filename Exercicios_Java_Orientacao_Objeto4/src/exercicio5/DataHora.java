/*
 * package exercicio5;
public class DataHora extends Data {

	private Hora hora;

	public DataHora(byte d,bytem,short a,byte hor,byte min,bite seg){
		super(d,m,a);
		hora = new Hora(hor,min,seg);
	}

	public String toString() {
		return super.toString() + hora.toString();
	}
}
*/

/*
 * Foi necess�rio criar a Classe Hora, corrigir os construtores
 * e gerar os getters e setters
 * 
 */
package exercicio5;

public class DataHora extends Data {

	private Hora hora;

	public DataHora(byte d, byte m, short a, byte hor, byte min, byte seg){
		super(d,m,a);
		hora = new Hora(hor,min,seg);
	}

	public String toString() {
		return super.toString() + hora.toString();
	}

	public Hora getHora() {
		return hora;
	}

	public void setHora(Hora hora) {
		this.hora = hora;
	}
	
	
}