import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Carrinho {
	private LocalDate dataVenda;
	private List<ItemCarrinho> itens;
	private Cliente cliente;

	private String codigoCarrin;
	private static int qtdCarrin;
	private FormaPagamento formaPagamento;

	public Carrinho(LocalDate dataVenda, List<ItemCarrinho> itens, Cliente cliente) {
		this.dataVenda = dataVenda;
		this.itens = itens;
		this.cliente = cliente;
		this.codigoCarrin = this.dataVenda.getYear() + "-" + ++qtdCarrin;

		atualizarEstoque();

	}

	public LocalDate getDataVenda() {
		return dataVenda;

	}

	public void setDataVenda(LocalDate dataVenda) {
		this.dataVenda = dataVenda;
	}

	public String getcodigoCarrin() {
		return codigoCarrin;
	}

	public static int getqtdCarrin() {

		return qtdCarrin;
	}

	public int getAno() {
		return dataVenda.getYear();
	}

	public List<ItemCarrinho> getItens() {
		List<ItemCarrinho> itensCopia = new ArrayList<>();
		for (ItemCarrinho item : itens) {
			ItemCarrinho itemCopia = new ItemCarrinho(item.getProdutoVendido(), item.getQuantidadeVendida());
			itensCopia.add(itemCopia);
		}
		return itensCopia;
	}

	public void setItens(List<ItemCarrinho> itens) {
		this.itens = itens;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public static int contarQuantidadeItens(List<Carrinho> carrinhos) {
		int quantidadeItens = 0;
		for (Carrinho carrinho : carrinhos) {
			for (ItemCarrinho item : carrinho.getItens()) {
				quantidadeItens += item.getQuantidadeVendida();
			}
		}
		return quantidadeItens;
	}

	public void setFormaPagamento(FormaPagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public FormaPagamento getFormaPagamento() {
		return formaPagamento;
	}

	public double calcularValorTotal() {
		double valorTotal = 0.0;

		for (ItemCarrinho item : itens) {
			Produto produto = item.getProdutoVendido();
			int quantidade = item.getQuantidadeVendida();

			if (quantidade <= produto.getEstoque()) {
				valorTotal += item.calcularValorVenda();
			}
		}

		return valorTotal;
	}

	public static double getFaturamentoTotal(List<Carrinho> carrinhos) {
		double faturamentoTotal = 0.0;

		for (Carrinho carrinho : carrinhos) {
			faturamentoTotal += carrinho.calcularValorTotal();
		}

		return faturamentoTotal;
	}

	public void adicionarProduto(Produto produto, int quantidade) {
		if (produto.getEstoque() >= quantidade) {
			ItemCarrinho novoItem = new ItemCarrinho(produto, quantidade);
			itens.add(novoItem);
			produto.setEstoque(produto.getEstoque() - quantidade);

		} else {
			System.out.println("Não há estoque suficiente para adicionar o produto ao carrinho.");
		}

	}

	public void removerProduto(Produto produto, int quantidade) {
		for (ItemCarrinho item : itens) {
			if (item.getProdutoVendido().equals(produto)) {
				int quantidadeAtual = item.getQuantidadeVendida();
				if (quantidade >= quantidadeAtual) {
					itens.remove(item);
					produto.setEstoque(produto.getEstoque() + quantidadeAtual);
				} else {
					item.setQuantidadeVendida(quantidadeAtual - quantidade);
					produto.setEstoque(produto.getEstoque() + quantidade);
				}

				break;
			}
		}
	}

	private void atualizarEstoque() {
		for (ItemCarrinho item : itens) {
			Produto produto = item.getProdutoVendido();
			int quantidade = item.getQuantidadeVendida();

			if (produto.getEstoque() >= quantidade) {
				produto.setEstoque(produto.getEstoque() - quantidade);
			} else {
				System.out.println("Quantidade insuficiente em estoque para o produto: " + produto.getProdut()
						+ ". Estoque disponível: " + produto.getEstoque());
			}
		}
	}

	public String verificarExistenciaProduto(Produto produto) {
		for (ItemCarrinho item : itens) {
			if (item.getProdutoVendido().equals(produto)) {
				return "Produto encontrado!";
			}
		}
		return "Produto não encontrado!";
	}

	public void adicionarProdutos(List<ItemCarrinho> novosItens) {
		this.itens.addAll(novosItens);

	}

	public double calcularValorAPagar() {
		return formaPagamento.calcularValorAPagar();
	}

	public String descricaoPagamento() {
		return formaPagamento.descricaoPagamento();
	}

	public void exibirItensPorNome() {
		List<ItemCarrinho> itensOrdenados = itens;
		Collections.sort(itensOrdenados, Comparator.comparing(item -> item.getProdutoVendido().getProdut(),
				String.CASE_INSENSITIVE_ORDER.reversed()));

		System.out.println("Relatório de Itens por Nome:");
		for (ItemCarrinho item : itensOrdenados) {
			System.out.println(item.getProdutoVendido().getProdut() + " - R$" + item.calcularValorVenda());
		}

		System.out.println("Valor total do carrinho: R$" + calcularValorTotal());
	}

	public void exibirItensPorValor() {
		List<ItemCarrinho> itensOrdenados = itens;
		Collections.sort(itensOrdenados, Comparator.comparing(ItemCarrinho::calcularValorVenda));

		System.out.println("Relatório de Itens por Valor:");
		for (ItemCarrinho item : itensOrdenados) {
			System.out.println(item.getProdutoVendido().getProdut() + " - R$" + item.calcularValorVenda());
		}

		System.out.println("Valor total do carrinho: R$" + calcularValorTotal());
	}
}