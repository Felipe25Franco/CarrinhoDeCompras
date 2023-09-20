
public class PagamentoParcelado extends FormaPagamento {
	private int parcelas;
	private double juros;

	public PagamentoParcelado(double valorTotal, int parcelas, double juros) throws ParcelasExcedidasException {
		
		super(valorTotal);
		if (parcelas > 6) {
			throw new ParcelasExcedidasException("Quantidade de parcelas excedida. Maximo permitido: 6 parcelas.");
		}
		this.parcelas = parcelas;
		this.juros = juros;
	}
	
	public int getParcelas() {
		return parcelas;
	}
	
	public void setParcelas(int parcelas) {
		this.parcelas = parcelas;
	}
	
	public double getJuros() {
		return parcelas;
	}
	
	public void setJuros(double juros) {
		this.juros = juros;
	}

	@Override
	public double calcularValorAPagar() {
		if (parcelas <= 6) {
			double valorPagamento = valorTotal + (valorTotal / 100 * juros);
			return valorPagamento;
		} else {
			return 0;
		}

	}

	@Override
	public String descricaoPagamento() {
		if (parcelas <= 6) {
			return "Pagamento em " + parcelas + " parcelas de R$"
					+ String.format("%.2f", (calcularValorAPagar() / parcelas)) + " com juros mensais de " + juros;
		} else {
			
			return "Erro: A quantidade de parcelas não pode ser maior que 6.";
		}

	}

	@Override
	public double calcularValorAPagar(double d) {
		
		return 0;
	}

	@Override
	public String descricao() {
		return "Pagamento parcelado";
	}

	@Override
	public String descricaoPagamento(double d) {
		
		return null;
	}




}
