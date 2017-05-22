package br.com.alura.empresa;

import java.util.Calendar;

public class MinhaAplicacao {

	public static void main(String[] args) {
		BancoDeDados bd = new BancoDeDados("servidor", "usuario", "senha");
		BalancoEmpresa balanco = new BalancoEmpresa(bd);

		Cnpj cnpjPapelaria = new Cnpj("00.000.001/0001-01");
		Divida divida = new Divida();
		divida.setTotal(100);
		divida.setCredor("Papelaria");
		divida.setDocumentoCredor(cnpjPapelaria);

		balanco.registraDivida(divida);

		Pagamento pagamento = new Pagamento();
		pagamento.setPagador("Luiz");
		pagamento.setDocumentoPagador(new Cpf("000.000.001-01"));
		pagamento.setValor(100);
		pagamento.setData(Calendar.getInstance());

		balanco.pagaDivida(cnpjPapelaria, pagamento);

		bd.desconecta();
	}

}
