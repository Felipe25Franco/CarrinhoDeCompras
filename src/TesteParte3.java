import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TesteParte3 {

	public static void main(String[] args) {

		Cliente cliente2 = new Cliente("Geraldo Marques", "489.554.662-26", "geraldomarq@gmail.com");

		Produto produto1 = new Produto("Produto 1", 5.50, 2000, 50);
		Produto produto2 = new Produto("Produto 2", 3.75, 1000, 30);
		Produto produto3 = new Produto("Produto 3", 11.49, 500, 10);

		List<ItemCarrinho> itensCarrinho1 = new ArrayList<>();
		itensCarrinho1.add(new ItemCarrinho(produto1, 5));
		itensCarrinho1.add(new ItemCarrinho(produto3, 3));
		itensCarrinho1.add(new ItemCarrinho(produto3, 5));

		Carrinho carrinho1 = new Carrinho(LocalDate.now(), itensCarrinho1, cliente2);

		carrinho1.adicionarProduto(produto1, 10);
		carrinho1.adicionarProduto(produto3, 3);

		carrinho1.removerProduto(produto1, 3);
		
		List<Carrinho> carrinhos = new ArrayList<>();
       
        carrinhos.add(carrinho1);
        
        double faturamentoTotal = Carrinho.getFaturamentoTotal(carrinhos);

		System.out.println(carrinho1.verificarExistenciaProduto(produto1));
		System.out.println(carrinho1.verificarExistenciaProduto(produto2));

		System.out.println(faturamentoTotal);

	}
}
