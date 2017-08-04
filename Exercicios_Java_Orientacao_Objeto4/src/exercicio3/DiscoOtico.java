/*
package exercicio3;

public class DiscoOtico extends Dispositivo {

	DiscoOtico(long c) {
		super("Disco Ótico", 241172480l);
	}

	@Override
	public String toString() {
		return "Dispositivo: "+ nome + " Capacidade: " c;
	}	
}
*/


/*
 *  linha 12 foi corrigida, utilizando os metodos getNome() e capacidadeEmMegaBytes()
 *  o construtor DiscoOtico(long c) foi corrigido, antes o parametro c não era utilizado
 *  e o método capacidadeEmMegaBytes() foi implementado
 */

package exercicio3;

public class DiscoOtico extends Dispositivo {

	DiscoOtico(long c) {
		super("Disco Ótico", c);
	}

	@Override
	public String toString() {
		return "Dispositivo: "+ getNome() + " Capacidade: "+ capacidadeEmMegaBytes();
	}

	@Override
	public long capacidadeEmMegaBytes() {
		long mb = ( getCapacidadeEmBytes() / 1000000 ); 
		return mb;
	}	
}