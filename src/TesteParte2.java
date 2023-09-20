
public class TesteParte2 {

	public static void main(String[] args) {

		Produto produto = new Produto("Produto tal", 5.50, 200, 50);

		ItemCarrinho item = new ItemCarrinho(produto, 10);

		double valorTotal = item.calcularValorVenda();
		System.out.println("Valor total da venda do item: R$ " + valorTotal);

		System.out.println("\n\n");

	}

}
