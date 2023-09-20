import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class TesteParte51 {

	public static void main(String[] args) {
		Produto produto = new Produto("Produto 4", 2.5, 100, 45);
		Produto produto1 = new Produto("Produto 1", 5.50, 2000, 50);
		Produto produto2 = new Produto("Produto 2", 3.75, 1000, 30);
		Produto produto3 = new Produto("Produto 3", 11.49, 500, 10);
		
		Cliente cliente = new Cliente("Fulano da Silva Teixeira", "111.222.333-44", "fulanosilvateixeira@gmail.com");
		
		
		
		List<ItemCarrinho> itens = new ArrayList<>();
		itens.add(new ItemCarrinho(produto, 102));
		itens.add(new ItemCarrinho(produto1, 5));
		itens.add(new ItemCarrinho(produto2, 3));
		itens.add(new ItemCarrinho(produto3, 5));
		
		Carrinho carrinho = new Carrinho(LocalDate.now(), itens, cliente);
		
		
		System.out.println(produto.getEstoque());
		System.out.println(produto1.getEstoque());
		System.out.println(produto3.getEstoque());
		
		
		carrinho.adicionarProduto(produto1, 10);
		
		System.out.println(produto1.getEstoque());
		carrinho.adicionarProduto(produto3, 3);
		System.out.println(produto3.getEstoque());
		carrinho.removerProduto(produto1, 3);
		System.out.println(produto1.getEstoque());
		
		if (produto.verificarNecessidadedeCompra()) {
			int quantidadeCompra = produto.calculaQuantidadedeCompra();
			System.out.println("É necessario comprar o produto " + produto.getProdut() + 
					". Quantidade a ser comprada: " + quantidadeCompra);
		}else {
			System.out.println("Não é necessario comprar o produto " + produto.getProdut());
		}
		
		List<Produto> produtos = new ArrayList<>();
        produtos.add(produto);
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);

        double valorTotalEstoque = produto.calcularValorTotalEstoque(produtos);
        System.out.println("Valor total em estoque: R$" + valorTotalEstoque);
	}

	

}
