import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TesteParte53 {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Fulano da Silva Teixeira", "111.222.333-44", "fulanosilvateixeira@gmail.com");
		
		Produto produto4 = new Produto("Produto 4", 2.5, 500, 45);
		Produto produto7 = new Produto("Produto 7", 50, 2000, 50);
		Produto produto8 = new Produto("Produto 8", 25.75, 1000, 30);
		Produto produto9 = new Produto("Produto 9", 111.49, 5000, 10);
		
		
		List<ItemCarrinho> itenscarr = new ArrayList<>();
		itenscarr.add(new ItemCarrinho(produto7, 5));
		itenscarr.add(new ItemCarrinho(produto8, 3));
		itenscarr.add(new ItemCarrinho(produto4, 5));
		itenscarr.add(new ItemCarrinho(produto9, 5));
		
		
		
		Carrinho carrinho = new Carrinho(LocalDate.now(), itenscarr, cliente);

	

		carrinho.exibirItensPorNome();
		System.out.println();
		carrinho.exibirItensPorValor();

	}

}
