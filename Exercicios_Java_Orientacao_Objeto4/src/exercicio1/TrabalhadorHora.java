package exercicio1;

import java.text.DecimalFormat;

public class TrabalhadorHora extends Empregado{

	DecimalFormat df = new DecimalFormat("#0.00");
	
	private double salarioHora;
	private double quantidadeHoras;
	
	TrabalhadorHora(String nome, String sobreNome, double salarioHora, double quantidadeHoras) {
		super(nome, sobreNome);
		setSalarioHora(salarioHora);
		setQuantidadeHoras(quantidadeHoras);

	}	

	public double getSalarioHora() {
		return salarioHora;
	}

	public void setSalarioHora(double salarioHora) {
		this.salarioHora = salarioHora;
	}

	public double getQuantidadeHoras() {
		return quantidadeHoras;
	}

	public void setQuantidadeHoras(double quantidadeHoras) {
		this.quantidadeHoras = quantidadeHoras;
	}

	@Override
	public double calcularGanho() {
		double ganho;
		ganho = ( getSalarioHora() * getQuantidadeHoras() );
		setSalarioMensal(ganho);
		return ganho;
	}
	
	@Override
	public String toString() {
		String dados;
		dados = "\n-----------------------";
		dados += "\nNome: "+ getNome() + " Sobrenome: "+ getSobreNome();
		dados += "\nTrabalhador Hora";
		dados += "\n-----------------------";
		dados += "\nSalário Mensal: "+ (getSalarioMensal());
		dados += "\nSalário por Hora: "+ df.format(getSalarioHora());
		dados += "\nQuantidade de Horas: "+ df.format(getQuantidadeHoras());
		dados += "\nGanho mensal: "+ df.format(calcularGanho());
		return dados;
	}

}
