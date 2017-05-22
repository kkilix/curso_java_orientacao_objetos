package br.com.alura.empresa;

import java.text.NumberFormat;

public class RelatorioDeDivida {
	private Divida divida;

	public RelatorioDeDivida(Divida divida) {
		this.divida = divida;
	}

	public void geraRelatorio(NumberFormat formatadorDeNumero) {
		System.out.println("Credor: " + divida.getCredor());
		System.out.println("Cnpj credor: " + divida.getDocumentoCredor());

		System.out.println("Valor a pagar " + formatadorDeNumero.format(divida.getValorAPagar()));
		System.out.println("Valor total " + formatadorDeNumero.format(divida.getTotal()));
	}
}
