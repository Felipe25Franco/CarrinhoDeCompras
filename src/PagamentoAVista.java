
public class PagamentoAVista extends FormaPagamento{
	private double desconto;

    public PagamentoAVista(double valorTotal, double desconto) {
        super(valorTotal);
        this.desconto = desconto;
    }
    @Override
	public double calcularValorAPagar() {
        return valorTotal - (valorTotal * (desconto / 100));
    }
    @Override
	public String descricaoPagamento() {
        return "Pagamento à vista no valor de R$" + String.format("%.2f", valorTotal) +
                " com desconto de " + desconto + "%.";
    }
	@Override
	public double calcularValorAPagar(double d) {
		
		return 0;
	}
	@Override
	public String descricao() {
		return "Pagamento à vista";
	}
	@Override
	public String descricaoPagamento(double d) {
		
		return null;
	}
	
}
