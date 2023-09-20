
public class TesteParte7 {

	public static void main(String[] args) {
		Listas<Produto> listaProdutos = new Listas<>();
		listaProdutos.adicionar(new Produto("Produto tal", 5.50, 200, 50));
		listaProdutos.adicionar(new Produto("Produto 1", 5.50, 2000, 50));
		listaProdutos.adicionar(new Produto("Produto 2", 3.75, 1000, 30));
		listaProdutos.adicionar(new Produto("Produto 3", 11.49, 500, 10));
		listaProdutos.adicionar(new Produto("Produto 4", 2.5, 500, 45));
		listaProdutos.adicionar(new Produto("Produto 5", 59.50, 2000, 75));
		listaProdutos.adicionar(new Produto("Produto 6", 3.75, 1000, 30));
		listaProdutos.adicionar(new Produto("Produto 7", 50, 2000, 50));
		listaProdutos.adicionar(new Produto("Produto 8", 25.75, 1000, 30));
		listaProdutos.adicionar(new Produto("Produto 9", 111.49, 5000, 10));
		listaProdutos.adicionar(new Produto("Produto 10", 32.5, 5000, 45));
		System.out.println("Listagem de Produtos:");
		listaProdutos.listar();
		
	
		System.out.println("\n");
		Produto produtoRemover = new Produto("Produto 4", 2.5, 500, 45);
		listaProdutos.remover(produtoRemover);
		listaProdutos.listar();
		System.out.println("\n");

		Listas<Cliente> listaClientes = new Listas<>();
		
		
		listaClientes.adicionar(new Cliente("Fulano da Silva Teixeira", "111.222.333-44", "fulanosilvateixeira@gmail.com"));
		listaClientes.adicionar(new Cliente("Faizao Tira", "222.111.333-44", "faizatira@gmail.com"));
		listaClientes.adicionar(new Cliente("Geraldo Marques", "489.554.662-26", "geraldomarq@gmail.com"));
		listaClientes.adicionar(new Cliente("Enzo Fernandes", "884.556.931-11", "enzofer@gmail.com"));
		System.out.println("Listagem de Clientes:");
		listaClientes.listar();
		System.out.println("\n");
		Cliente clienteRemover = new Cliente("Geraldo Marques", "489.554.662-26", "geraldomarq@gmail.com");
		listaClientes.remover(clienteRemover);
		listaClientes.listar();
		System.out.println("\n");

		Listas<Fornecedor> listaFornecedores = new Listas<>();
		System.out.println("Listagem de Fornecedores:");
		listaFornecedores.adicionar(new Fornecedor("Empresa: VXX S.A", "11.222.333/4444-55", "vex@email.com", "- Sr(a) Maria Aparecida", "maraapa@gmail.com"));
		listaFornecedores.adicionar(new Fornecedor("Empresa: Fulza S.A", "21.252.878/4784-55", "fulza@email.com", "- Sr(a) João Amoedo", "joaoamoe@gmail.com"));
		listaFornecedores.adicionar(new Fornecedor("Empresa: Fulana S.A", "11.222.333/4444-55", "fulana@email.com","- Sr(a) Fulano da Silva Teixeira", "fulana@gmail.com"));
		listaFornecedores.listar();
		System.out.println("\n");
		
		Fornecedor fornecedorRemover = new Fornecedor("Empresa: Fulza S.A", "21.252.878/4784-55", "fulza@email.com", "- Sr(a) João Amoedo", "joaoamoe@gmail.com");
		listaFornecedores.remover(fornecedorRemover);
		listaFornecedores.listar();
	}

}
