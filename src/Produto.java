import java.util.List;
import java.util.Objects;


public class Produto {
	private double preco;
    private int estoque;
    private int quantidadeMinima;
    private String produt;
    private String codigoProd;    
    private static int qtdProduto = 0;
    

    public Produto(String produt, double preco, int estoque, int quantidadeMinima) {
        this.preco = preco;
        this.estoque = estoque;
        this.quantidadeMinima = quantidadeMinima;
        this.produt = produt;
        this.codigoProd = "P" + ++qtdProduto;
        
    }

    public double getPreco() {
        return preco;
    }
    
    public void setPreco(double preco) {
    	this.preco = preco;
    }
    
    public int getEstoque() {
        return estoque;
    }
    
    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public int getQuantidadeMinima() {
        return quantidadeMinima;
    }
    
    public void setQuantidadeMinima(int quantidadeMinima) {
        this.quantidadeMinima = quantidadeMinima;
    }
    
    public String getProdut() {
        return produt;
    }
    
    public void setProdut(String produt) {
        this.produt = produt;
    }
    
    public String getcodigoProd() {
        return codigoProd;
    }
    
    public static int getqtdProduto() {
        return qtdProduto;
    }
    
    public boolean verificarNecessidadedeCompra() {
    	return estoque < quantidadeMinima;
    }
    
    public int calculaQuantidadedeCompra() {
    	int quantidadedeCompra = quantidadeMinima *4;
    	return quantidadedeCompra;
    }
    
 
    public double calcularValorTotalEstoque() {
        return this.preco * this.estoque;
    }
    
    public double calcularValorTotalEstoque(List<Produto> produtos) {
        double valorTotalEstoque = 0.0;
        for (Produto produto : produtos) {
            valorTotalEstoque += produto.calcularValorTotalEstoque();
        }
        return valorTotalEstoque;
    }
    
    
    public String descricao() {
        return this.produt + " - R$" + this.preco + "\n" + "Estoque: " + this.estoque + " - Quantidade Mínima: " + this.quantidadeMinima;
    }
    
    @Override
	public String toString() {
		return this.produt;
	}
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Produto other = (Produto) obj;
        return Objects.equals(produt, other.produt)
                && Objects.equals(preco, other.preco)
                && Objects.equals(estoque, other.estoque)
                && Objects.equals(quantidadeMinima, other.quantidadeMinima);
    }
}
