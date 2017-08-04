/*
  package exercicio5;
 

public class Data {

	private byte dia, mês; private short ano;
	
	Data(byte d, byte m, byte a){
		dia = d; mês = m; ano = a;
	}
	
	public String toString(){
		return dia +"/"+mês+"/"+ano;
	}
	
	
}
*/

/*
 * na linha 7, a variável mes foi declarada com acento (mês)
 * na linha 13, a variável mes foi chamada com acento (mês)
 * faltaram os getters e setters
 * 
 */
package exercicio5;

public class Data {

	private byte dia, mes; 
	private short ano;
	
	Data(byte d, byte m, short a){
		setDia(d);
		setMes(m);
		setAno(a);
	}
	
	public String toString(){
		return "\nData: "+ getDia() +"/"+ getMes() +"/"+ getAno();
	}

	public byte getDia() {
		return dia;
	}

	public void setDia(byte dia) {
		this.dia = dia;
	}

	public byte getMes() {
		return mes;
	}

	public void setMes(byte mes) {
		this.mes = mes;
	}

	public short getAno() {
		return ano;
	}

	public void setAno(short ano) {
		this.ano = ano;
	}
	
	
}
