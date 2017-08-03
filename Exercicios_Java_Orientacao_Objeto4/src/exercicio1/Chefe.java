package exercicio1;

import java.text.DecimalFormat;

public class Chefe extends Empregado {
	
	DecimalFormat df = new DecimalFormat("#0.00");
	private double salarioSemanal;

	
	Chefe(String nome, String sobreNome, double salarioSemanal) {
		super(nome, sobreNome);
		setSalarioSemanal(salarioSemanal);
	}

		
	public double getSalarioSemanal() {
		return salarioSemanal;
	}



	public void setSalarioSemanal(double salarioSemanal) {
		this.salarioSemanal = salarioSemanal;
	}



	@Override
	public double calcularGanho() {
		setSalarioMensal( this.salarioSemanal * 4 );
		return getSalarioMensal();
	}
	
	@Override
	public String toString() {
		String dados;
		dados = "\n-----------------------";
		dados += "\nNome: "+ getNome() + " Sobrenome: "+ getSobreNome();
		dados += "\nChefe";
		dados += "\n-----------------------";
		dados += "\nSobrenome: "+ getSobreNome();
		dados += "\nSalário Mensal: "+ df.format(getSalarioMensal());
		dados += "\nSalário Semanal: "+ df.format(getSalarioSemanal());
		dados += "\nGanho mensal: "+ df.format(calcularGanho());
		return dados;
	}



}
