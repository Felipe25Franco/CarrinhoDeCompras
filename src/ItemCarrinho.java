public class ItemCarrinho  implements Cloneable{
    private Produto produtoVendido;
    private int quantidadeVendida;

    public ItemCarrinho(Produto produtoVendido, int quantidadeVendida) {
        this.produtoVendido = produtoVendido;
        this.quantidadeVendida = quantidadeVendida;
    }

    public double calcularValorVenda() {
        return produtoVendido.getPreco() * quantidadeVendida;
    }

    public Produto getProdutoVendido() {
        return produtoVendido;
    }
    
    public void setProdutoVendido(Produto produtoVendido) {
        this.produtoVendido = produtoVendido;
    }

    public int getQuantidadeVendida() {
        return quantidadeVendida;
    }

	public void setQuantidadeVendida(int quantidadeVendida) {
		this.quantidadeVendida = quantidadeVendida;
		
	}
	 
	

}