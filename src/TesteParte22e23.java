import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TesteParte22e23 {

	public static void main(String[] args) {

		Cliente cliente = new Cliente("Fulano da Silva Teixeira", "111.222.333-44", "fulanosilvateixeira@gmail.com");

		Produto produto1 = new Produto("Produto 1", 5.50, 2000, 50);
		Produto produto2 = new Produto("Produto 2", 3.75, 1000, 30);
		Produto produto3 = new Produto("Produto 3", 11.49, 500, 10);
		
		List<ItemCarrinho> itens = new ArrayList<>();
		itens.add(new ItemCarrinho(produto1, 5));
		itens.add(new ItemCarrinho(produto2, 3));
		itens.add(new ItemCarrinho(produto3, 5));
		
		Carrinho carrinho = new Carrinho(LocalDate.now(), itens, cliente);
    
		System.out.println("Data da venda: " + carrinho.getDataVenda());
		System.out.println("Valor da venda: " + carrinho.calcularValorTotal());
		

	}

}
