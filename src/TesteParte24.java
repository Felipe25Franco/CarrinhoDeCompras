import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TesteParte24 {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Fulano da Silva Teixeira", "111.222.333-44", "fulanosilvateixeira@gmail.com");
	    Cliente cliente2 = new Cliente("Geraldo Marques", "489.554.662-26", "geraldomarq@gmail.com");
        Cliente cliente3 = new Cliente("Enzo Fernandes", "884.556.931-11", "enzofer@gmail.com");
      
        Produto produto4 = new Produto("Produto 4", 2.5, 500, 45);
		Produto produto5 = new Produto("Produto 5", 59.50, 2000, 75);
		Produto produto6 = new Produto("Produto 6", 3.75, 1000, 30);
		Produto produto7 = new Produto("Produto 7", 50, 2000, 50);
		Produto produto1 = new Produto("Produto 1", 5.50, 2000, 50);
	    Produto produto2 = new Produto("Produto 2", 3.75, 1000, 30);
	        Produto produto3 = new Produto("Produto 3", 11.49, 500, 10);
		
	        
	        
		List<ItemCarrinho> itensCarrinho = new ArrayList<>();
		itensCarrinho.add(new ItemCarrinho(produto1, 5));
		itensCarrinho.add(new ItemCarrinho(produto2, 3));
		itensCarrinho.add(new ItemCarrinho(produto3, 5));

		List<ItemCarrinho> itensCarrinho1 = new ArrayList<>();
		itensCarrinho1.add(new ItemCarrinho(produto4, 5));
		itensCarrinho1.add(new ItemCarrinho(produto5, 1));
		itensCarrinho1.add(new ItemCarrinho(produto7, 5));

		List<ItemCarrinho> itensCarrinho2 = new ArrayList<>();
		itensCarrinho2.add(new ItemCarrinho(produto6, 10));
		itensCarrinho2.add(new ItemCarrinho(produto5, 2));
		itensCarrinho2.add(new ItemCarrinho(produto4, 1));
		
		
        Carrinho carrinho = new Carrinho(LocalDate.now(), itensCarrinho, cliente);
        Carrinho carrinho1 = new Carrinho(LocalDate.now(), itensCarrinho1, cliente2);
        Carrinho carrinho2 = new Carrinho(LocalDate.now(), itensCarrinho2, cliente3);
		
		List<Carrinho> carrinhos = new ArrayList<>();
		carrinhos.add(carrinho);
        carrinhos.add(carrinho1);
        carrinhos.add(carrinho2);
		
		
		 int quantidadeItens = Carrinho.contarQuantidadeItens(carrinhos);
		 
		 
		 System.out.println("Quantidade de itens vendidos: " + quantidadeItens);
	      

	}

}
