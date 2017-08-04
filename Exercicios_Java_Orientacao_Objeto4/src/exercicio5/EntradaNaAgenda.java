/*
package exercicio5;

public class EntradaNaAgenda extends DataHora {

	private String evento;

	public EntradaNaAgenda(byte d,byte m,short a,bite hor,byte min,byte seg,String ev){
		super.super(d,m,a);
		super(d,m,a,hor,min,seg);
		evento = ev;
	}

	public String toString(){
		return super.super.toString()+":"+super.toString()+"->"+ev;
	}
}
*/

package exercicio5;

public class EntradaNaAgenda extends DataHora {

	private String evento;

	public EntradaNaAgenda(byte d, byte m, short a, byte hor, byte min, byte seg, String ev){
		super(d, m, a, hor, min, seg);
		this.evento = ev;
	}
	
	public String getEvento() {
		return evento;
	}

	public void setEvento(String evento) {
		this.evento = evento;
	}

	public String toString(){
		return super.toString()+": ->"+ getEvento();
	}
	
}