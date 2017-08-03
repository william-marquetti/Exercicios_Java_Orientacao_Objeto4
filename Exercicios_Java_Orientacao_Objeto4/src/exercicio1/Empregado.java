package exercicio1;

public abstract class Empregado {
	
	private String nome;
	private String sobreNome;
	private double salarioMensal;

	Empregado(String nome, String sobreNome){
		setNome(nome);
		setSobreNome(sobreNome);
	}
		
	public double getSalarioMensal() {
		return salarioMensal;
	}

	public void setSalarioMensal(double salarioMensal) {
		this.salarioMensal = salarioMensal;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public abstract double calcularGanho();

}
