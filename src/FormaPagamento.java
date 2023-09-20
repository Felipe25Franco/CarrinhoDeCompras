
public abstract class FormaPagamento {
    protected double valorTotal;

    public FormaPagamento(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public abstract double calcularValorAPagar(double d);

    public abstract String descricaoPagamento(double d);

	public double calcularValorAPagar() {
		
		return 0;
	}

	public String descricaoPagamento() {
		
		return null;
	}

	public String descricao() {
		return null;
	}

	
}
