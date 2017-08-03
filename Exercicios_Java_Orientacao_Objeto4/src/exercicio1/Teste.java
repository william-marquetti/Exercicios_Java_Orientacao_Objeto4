package exercicio1;

public class Teste {
	
	public static void main(String[] args) {
		
		Chefe chefe1 = new Chefe("Carlos", "Souza", 3900d);
		chefe1.calcularGanho();
		
		TrabalhadorComissionado tComissionado = new TrabalhadorComissionado("João", "Silva", 2500d, 5d, 3);
		tComissionado.calcularGanho();
		
		TrabalhadorHora tHora = new TrabalhadorHora("Andiara", "Kistner", 65d, 80d);
		tHora.calcularGanho();
		
		TrabalhadorPecaProduzida tPeca = new TrabalhadorPecaProduzida("William", "Marquetti", 45d, 43);
		tPeca.calcularGanho();
		
		System.out.println(chefe1.toString());
		System.out.println(tComissionado.toString());
		System.out.println(tHora.toString());
		System.out.println(tPeca.toString());
	}

}
