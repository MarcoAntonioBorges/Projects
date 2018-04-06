package br.com.fiap.modelo;

public class Produto {
	private String descricao;
	private double valor;
	private int codigo;
	
	//MEUS METODOS
	// SetAll
	public void setAll(String descricao, double valor, int codigo) {
		setDescricao(descricao);
		setValor(valor);
		setCodigo(codigo);
	}
	
	public String getAll() {
		return "DESCRICAO......:" + this.descricao + "\n" +
				"VALOR......:" + this.valor + "\n" +
				"CODIGO......:" + this.codigo;
	}
	
	
	// Construtor
	public Produto() {
		super();
	}

	public Produto(String descricao, double valor, int codigo) {
		super();
		setDescricao(descricao);
		setValor(valor);
		setCodigo(codigo);
	}

	
	// SETTERS E GETTERS 
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao.toUpperCase();
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	
	
	
}
