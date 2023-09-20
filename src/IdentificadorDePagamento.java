public class IdentificadorDePagamento {
    public static String identificarTipoPagamento(FormaPagamento formaPagamento) {
    	
        return formaPagamento.descricao();
    }
}