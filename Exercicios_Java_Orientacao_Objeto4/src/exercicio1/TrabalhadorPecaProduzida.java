package exercicio1;

import java.text.DecimalFormat;

public class TrabalhadorPecaProduzida extends Empregado {

	DecimalFormat df = new DecimalFormat("#0.00");
	
	private double remuneracao;
	private int quantidadePecas;

	TrabalhadorPecaProduzida(String nome, String sobreNome, double remuneracao, int quantidadePecas) {
		super(nome, sobreNome);
		setRemuneracao(remuneracao);
		setQuantidadePecas(quantidadePecas);

	}
	
	public double getRemuneracao() {
		return remuneracao;
	}

	public void setRemuneracao(double remuneracao) {
		this.remuneracao = remuneracao;
	}

	public int getQuantidadePecas() {
		return quantidadePecas;
	}

	public void setQuantidadePecas(int quantidadePecas) {
		this.quantidadePecas = quantidadePecas;
	}

	@Override
	public double calcularGanho() {
		setSalarioMensal( getRemuneracao() * getQuantidadePecas() );
		return getSalarioMensal();
	}
	
	@Override
	public String toString() {
		String dados;
		dados = "\n-----------------------";
		dados += "\nNome: "+ getNome() + " Sobrenome: "+ getSobreNome();
		dados += "\nTrabalhador Pe�a";
		dados += "\n-----------------------";
		dados += "\nSal�rio Mensal: "+ df.format(getSalarioMensal());
		dados += "\nRemunera��o: "+ df.format(getRemuneracao());
		dados += "\nQuantidade de Pe�as: "+ df.format(getQuantidadePecas());
		dados += "\nGanho mensal: "+ df.format(calcularGanho());
		return dados;
	}

}
