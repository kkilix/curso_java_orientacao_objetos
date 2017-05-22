package br.com.alura.empresa;

public class Cpf implements Documento {
	private String valor;

	public Cpf(String valor) {
		this.valor = valor;
	}

	public boolean ehValido() {
		return true;
	}

	@Override
	public String getValor() {
		return this.valor;
	}

}
