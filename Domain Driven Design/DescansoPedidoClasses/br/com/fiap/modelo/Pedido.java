package br.com.fiap.modelo;

public class Pedido {

	private int numPedido;
	private Cliente cliente;
	private double total;
	private String formaPagamento;
	
	public void setAll(int numPedido, Cliente cliente, double total, String formaPagamento) {
		setNumPedido(numPedido);
		setCliente(cliente);
		setTotal(total);
		setFormaPagamento(formaPagamento);
	}
	
	public String getAll() {
		return "Nº Pedido.....: " + numPedido + "\n" +
				"CLIENTE.....: " + cliente.getAll() + "\n" +
				"TOTAL.......:" + total + "\n" + 
				"FORMA PAGAMENTO......: " + formaPagamento;
	}
	
	public Pedido() {
		super();
	}

	public Pedido(int numPedido, Cliente cliente, double total, String formaPagamento) {
		super();
		setNumPedido(numPedido);
		setCliente(cliente);
		setTotal(total);
		setFormaPagamento(formaPagamento);
	}

	public int getNumPedido() {
		return numPedido;
	}

	public void setNumPedido(int numPedido) {
		this.numPedido = numPedido;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	
	
	
	
}
