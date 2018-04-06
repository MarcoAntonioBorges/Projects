package br.com.fiap.principal;

// IMPORTS
import br.com.fiap.modelo.Cliente;
import br.com.fiap.modelo.ItemPedido;
import br.com.fiap.modelo.Pedido;
import br.com.fiap.modelo.Produto;

public class Teste {
	public static void main(String[] args) {
		
		// String email = "marco@gmail.com";
		
		// CLIENTE
		System.out.println("--------- Cliente ---------");
		Cliente cliente_01 = new Cliente("Marco", "marco@gmail.com", "Marco", "123", 45);
		
		/*if (email.indexOf("@") < 2) {
			System.out.println("ERRO JUNIN");
		}else {
			cliente_01.setEmail(email);
		}*/
		
		System.out.println(cliente_01.getAll());
		
		System.out.println("");
		
		//PRODUTO
		System.out.println("--------- Produto ---------");
		Produto produto_01 = new Produto("Bolacha", 2.50, 1);
		System.out.println(produto_01.getAll());
		
		System.out.println("");
		
		//ITEM PEDIDO
		System.out.println("--------- ITEM PEDIDO ---------");
		ItemPedido itemPedido = new ItemPedido();
		itemPedido.setQtde(250);
		itemPedido.setValor(2.50);
		System.out.println(itemPedido.getAll());
	
		System.out.println("");
		
		//PEDIDO
		System.out.println("--------- PEDIDO ---------");
		Pedido pedido = new Pedido();
		pedido.setNumPedido(10);
		pedido.setTotal(10.0);
		pedido.setFormaPagamento("Cartão");
		pedido.setPedido
		
		System.out.println(pedido.getAll());
		
	}
}
