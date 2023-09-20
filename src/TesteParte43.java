import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TesteParte43 {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Jose Maria", "123.334.546-99","-josemar123@gmail.com");
		
		Produto produto2 = new Produto("Produto 4", 2.5, 500, 45);
		Produto produto4 = new Produto("Produto 5", 59.50, 2000, 75);
		Produto produto5 = new Produto("Produto 2", 3.75, 1000, 30);
		
		List<ItemCarrinho> itensCarrinho = new ArrayList<>();
	    itensCarrinho.add(new ItemCarrinho(produto2, 50));
        itensCarrinho.add(new ItemCarrinho(produto4, 3));
        itensCarrinho.add(new ItemCarrinho(produto5, 5));
		
		Carrinho carrinho = new Carrinho(LocalDate.now(), itensCarrinho, cliente);
		
	
		
		FormaPagamento pagamentoAVista = new PagamentoAVista(carrinho.calcularValorTotal(), 10);
        carrinho.setFormaPagamento(pagamentoAVista);
		
        double valorAPagar = carrinho.calcularValorAPagar();
        String descricaoPagamento = carrinho.descricaoPagamento();

        try {
        	FormaPagamento pagamentoParcelado = new PagamentoParcelado(carrinho.calcularValorTotal(), 5, 5);
            carrinho.setFormaPagamento(pagamentoParcelado);
        } catch(ParcelasExcedidasException e) {
        	System.out.println(e.getMessage());
        }
        

       
        double valorAPagarParc = carrinho.calcularValorAPagar();
        String descricaoPagamentoParc = carrinho.descricaoPagamento();
        
        System.out.println("Descrição do pagamento: " + descricaoPagamento);
        System.out.println("Valor a ser pago: R$" + String.format("%.2f", valorAPagar));
        System.out.println("\n");
        System.out.println("Descrição do pagamento: " + descricaoPagamentoParc);
        System.out.println("Valor a ser pago: R$" + String.format("%.2f", valorAPagarParc));
        

	}

}
