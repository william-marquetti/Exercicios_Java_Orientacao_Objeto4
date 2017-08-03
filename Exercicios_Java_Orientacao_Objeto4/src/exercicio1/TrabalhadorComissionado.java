package exercicio1;

import java.text.DecimalFormat;

public class TrabalhadorComissionado extends Empregado {

	DecimalFormat df = new DecimalFormat("#0.00");
	
	private double comissao;
	private int qtVendas;

	TrabalhadorComissionado(String nome, String sobreNome, double salarioMensal, double comissao, int qtVendas) {
		super(nome, sobreNome);
		setSalarioMensal(salarioMensal);
		setComissao(comissao);
		setQtVendas(qtVendas);
	}
	
	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public int getQtVendas() {
		return qtVendas;
	}

	public void setQtVendas(int qtVendas) {
		this.qtVendas = qtVendas;
	}

	@Override
	public double calcularGanho() {
		double ganho;
		ganho = ( getSalarioMensal() + ( getComissao() * getQtVendas() ) );
		return ganho;
	}
	
	@Override
	public String toString() {
		String dados;
		dados = "\n-----------------------";
		dados += "\nNome: "+ getNome() + " Sobrenome: "+ getSobreNome();
		dados += "\nTrabalhador Comissionado";
		dados += "\n-----------------------";
		dados += "\nSalário Mensal: "+ df.format(getSalarioMensal());
		dados += "\nComissão: "+ df.format(getComissao());
		dados += "\nQuantidade de Vendas: "+ df.format(getQtVendas());
		dados += "\nGanho mensal: "+ df.format(calcularGanho());
		return dados;
	}

}
