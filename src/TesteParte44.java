
public class TesteParte44 {

	public static void main(String[] args) throws ParcelasExcedidasException {
		FormaPagamento formaPagamento = new PagamentoAVista(10, 0);
		
		FormaPagamento Pagamento2 = new PagamentoParcelado(5000, 5, 6.5);
		
		System.out.println(IdentificadorDePagamento.identificarTipoPagamento(formaPagamento));
		
		System.out.println(IdentificadorDePagamento.identificarTipoPagamento(Pagamento2));

	}

}
