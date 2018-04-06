package br.com.fiap.modelo;

public class Cliente {
	private String nome;
	private String email;
	private String  login;
	private String  senha;
	private int  qtdEstrelas;
	
	
	
	public void setAll(String nome, String email, String login, String senha, int qtdEstrelas) {
		setNome(nome);
		setEmail(email);
		setLogin(login);
		setSenha(senha);
		setQtdEstrelas(qtdEstrelas);
	}
	
	public String getAll() {
		return "NOME......:" + this.nome + "\n" +
				"EMAIL......:" + this.email + "\n" +
				"LOGIN......:" + this.login + "\n" +
				"SENHA......:" + this.senha + "\n" +
				"QTDE ESTRELAS......:" + this.qtdEstrelas;
	}	
	
	public Cliente() {
		super();
	}
	
	public Cliente(String nome, String email, String login, String senha, int qtdEstrelas) {
		super();
		setNome(nome);
		setEmail(email);
		setLogin(login);
		setSenha(senha);
		setQtdEstrelas(qtdEstrelas);
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome.toUpperCase();
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		if (email.length()>80) {
			email = "fiap@gmail.com";
		}
		this.email = email.toLowerCase();
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login.toUpperCase();
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha.toUpperCase();
	}
	public int getQtdEstrelas() {
		return qtdEstrelas;
	}
	public void setQtdEstrelas(int qtdEstrelas) {
		this.qtdEstrelas = qtdEstrelas;
	}

	
}


