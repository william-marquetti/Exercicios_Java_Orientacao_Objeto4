/*
  package exercicio3;
 

public abstract class Dispositivo {

	private String nome;
	private long capacidadeEmBytes;
	
	Dispositivo(String n, long c){
		nome = n;
		capacidadeEmBytes = c;
	}
	
	abstract public String toString();
	abstract public long capacidadeEmBytes();

}
*/


/* 
 * estavam faltando os getters e setters
 */
package exercicio3;

public abstract class Dispositivo {

	private String nome;
	private long capacidadeEmBytes;
	
	Dispositivo(String n, long c){
		nome = n;
		capacidadeEmBytes = c;
	}
		
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getCapacidadeEmBytes() {
		return capacidadeEmBytes;
	}

	public void setCapacidadeEmBytes(long capacidadeEmBytes) {
		this.capacidadeEmBytes = capacidadeEmBytes;
	}

	abstract public String toString();
	abstract public long capacidadeEmMegaBytes();
}
