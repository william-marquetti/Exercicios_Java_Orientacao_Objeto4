package exercicio5;

public class Teste {
	
	public static void main(String[] args) {
		
		try {
			Hora despertar = new Hora( (byte) 5, (byte) 40, (byte) 00);
		} catch (IllegalArgumentException erro) {
			System.out.println(erro.getMessage());
		}
		
		EntradaNaAgenda entradaAgenda = new EntradaNaAgenda( (byte) 10, (byte) 3, (short) 2010, (byte) 23, (byte) 25, (byte) 00, "Trabalhar");
		
		System.out.println(entradaAgenda.toString());
	}

}
