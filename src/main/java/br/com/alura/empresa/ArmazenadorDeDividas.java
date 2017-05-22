package br.com.alura.empresa;

public interface ArmazenadorDeDividas {
	public void salva(Divida divida);
	public Divida carrega(Documento documentoCredor);
}