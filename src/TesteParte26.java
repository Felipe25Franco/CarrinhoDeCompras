import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TesteParte26 {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Fulano da Silva Teixeira", "111.222.333-44", "fulanosilvateixeira@gmail.com");
	    Cliente cliente2 = new Cliente("Geraldo Marques", "489.554.662-26", "geraldomarq@gmail.com");
        Cliente cliente3 = new Cliente("Enzo Fernandes", "884.556.931-11", "enzofer@gmail.com");
        
        Fornecedor fornecedor = new Fornecedor("Empresa: VXX S.A", "11.222.333/4444-55", "vex@email.com", "- Sr(a) Maria Aparecida", "maraapa@gmail.com");
        Fornecedor fornecedor1 = new Fornecedor("Empresa: Fulza S.A", "21.252.878/4784-55", "fulza@email.com", "- Sr(a) João Amoedo", "joaoamoe@gmail.com");
        
        Produto produto2 = new Produto("Produto 4", 2.5, 500, 45);
		Produto produto4 = new Produto("Produto 5", 59.50, 2000, 75);
		Produto produto5 = new Produto("Produto 2", 3.75, 1000, 30);
		
		List<ItemCarrinho> itensCarrinho = new ArrayList<>();
	    itensCarrinho.add(new ItemCarrinho(produto4, 5));
        itensCarrinho.add(new ItemCarrinho(produto2, 3));
        itensCarrinho.add(new ItemCarrinho(produto5, 5));
		
		List<ItemCarrinho> itensCarrinho1 = new ArrayList<>();
        itensCarrinho1.add(new ItemCarrinho(produto4, 5));
        itensCarrinho1.add(new ItemCarrinho(produto5, 1));
        itensCarrinho1.add(new ItemCarrinho(produto2, 5));
        
        List<ItemCarrinho> itensCarrinho2 = new ArrayList<>();
        itensCarrinho2.add(new ItemCarrinho(produto5, 10));
        itensCarrinho2.add(new ItemCarrinho(produto4, 2));
		
		Carrinho carrinho = new Carrinho(LocalDate.now(), itensCarrinho, cliente);
        Carrinho carrinho1 = new Carrinho(LocalDate.now(), itensCarrinho1, cliente2);
        Carrinho carrinho2 = new Carrinho(LocalDate.now(), itensCarrinho2, cliente3);
      
		
		System.out.println("Cliente cadastrado – código = " + cliente.getCodigoCli());
        System.out.println("Cliente cadastrado – código = " + cliente2.getCodigoCli());
        System.out.println("Cliente cadastrado – código = " + cliente3.getCodigoCli());
        System.out.println("\n");
        
        
        
        System.out.println("Fornecedor cadastrado – código =  " + fornecedor.getCodigoFor());
        System.out.println("Fornecedor cadastrado – código =  " + fornecedor1.getCodigoFor());
        System.out.println("\n");
        
        System.out.println("Produto cadastrado – código =  " + produto2.getcodigoProd());
        System.out.println("Produto cadastrado – código =  " + produto4.getcodigoProd());
        System.out.println("Produto cadastrado – código =  " + produto5.getcodigoProd());
        System.out.println("\n");
        
        System.out.println("Codigo do carrinho: " + carrinho.getcodigoCarrin());
        System.out.println("Codigo do carrinho: " + carrinho1.getcodigoCarrin());
        System.out.println("Codigo do carrinho: " + carrinho2.getcodigoCarrin());

	}

}
