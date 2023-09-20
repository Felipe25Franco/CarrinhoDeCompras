
public class TesteParte1 {

	public static void main(String[] args) {
		
		
		// CRIA PRODUTO
				
				Produto produto = new Produto("Produto tal", 5.50, 200, 50);
				Produto produto1 = new Produto("Produto 1", 5.50, 2000, 50);
				Produto produto2 = new Produto("Produto 2", 3.75, 1000, 30);
				Produto produto3 = new Produto("Produto 3", 11.49, 500, 10);
				Produto produto4 = new Produto("Produto 4", 2.5, 500, 45);
				Produto produto5 = new Produto("Produto 5", 59.50, 2000, 75);
				Produto produto6 = new Produto("Produto 6", 3.75, 1000, 30);
				Produto produto7 = new Produto("Produto 7", 50, 2000, 50);
				Produto produto8 = new Produto("Produto 8", 25.75, 1000, 30);
				Produto produto9 = new Produto("Produto 9", 111.49, 5000, 10);
				Produto produto10 = new Produto("Produto 10", 32.5, 5000, 45);
				Produto produto11 = new Produto("Produto 11", 79.50, 2000, 1);
				Produto produto12 = new Produto("Produto 12", 30.75, 1000, 30);
				Produto produto13 = new Produto("Produto 13", 51.50, 2000, 50);
				Produto produto14 = new Produto("Produto 14", 32.75, 1000, 30);
				Produto produto15 = new Produto("Produto 15", 19.49, 5000, 10);
				Produto produto16 = new Produto("Produto 16", 20.5, 5000, 45);
				Produto produto17 = new Produto("Produto 17", 58.50, 2000, 1);
				Produto produto18 = new Produto("Produto 18", 33.75, 1000, 30);
				Produto produto19 = new Produto("Produto 19", 50.50, 2000, 1);
				Produto produto20 = new Produto("Produto 20", 75, 1000, 30);

				System.out.println(produto.descricao());
				System.out.println("\n");
				System.out.println(produto1.descricao());
				System.out.println("\n");
				System.out.println(produto2.descricao());
				System.out.println("\n");
				System.out.println(produto3.descricao());
				System.out.println("\n");
				System.out.println(produto4.descricao());
				System.out.println("\n");
				System.out.println(produto5.descricao());
				System.out.println("\n");
				System.out.println(produto6.descricao());
				System.out.println("\n");
				System.out.println(produto7.descricao());
				System.out.println("\n");
				System.out.println(produto8.descricao());
				System.out.println("\n");
				System.out.println(produto9.descricao());
				System.out.println("\n");
				System.out.println(produto10.descricao());
				System.out.println("\n");
				System.out.println(produto11.descricao());
				System.out.println("\n");
				System.out.println(produto12.descricao());
				System.out.println("\n");
				System.out.println(produto13.descricao());
				System.out.println("\n");
				System.out.println(produto14.descricao());
				System.out.println("\n");
				System.out.println(produto15.descricao());
				System.out.println("\n");
				System.out.println(produto16.descricao());
				System.out.println("\n");
				System.out.println(produto17.descricao());
				System.out.println("\n");
				System.out.println(produto18.descricao());
				System.out.println("\n");
				System.out.println(produto19.descricao());
				System.out.println("\n");
				System.out.println(produto20.descricao());

				System.out.println("\n\n");

				// CRIA CLIENTE
				
				Cliente cliente = new Cliente("Fulano da Silva Teixeira", "111.222.333-44", "fulanosilvateixeira@gmail.com");
				System.out.println(cliente.descricao());
				System.out.println("\n");
				
				Cliente cliente1 = new Cliente("Faizao Tira", "222.111.333-44", "faizatira@gmail.com");
				System.out.println(cliente1.descricao());
				System.out.println("\n");

				Cliente cliente2 = new Cliente("Geraldo Marques", "489.554.662-26", "geraldomarq@gmail.com");
				System.out.println(cliente2.descricao());
				System.out.println("\n");

				Cliente cliente3 = new Cliente("Enzo Fernandes", "884.556.931-11", "enzofer@gmail.com");
				System.out.println(cliente3.descricao());
				System.out.println("\n");

				Cliente cliente4 = new Cliente("Silvio Teixeira", "123.023.026-87", "silviotex@gmail.com");
				System.out.println(cliente4.descricao());
				System.out.println("\n");

				Cliente cliente5 = new Cliente("Gustavo Barbosa", "125.236.458-91", "gusbar@gmail.com");
				System.out.println(cliente5.descricao());
				System.out.println("\n");

				Cliente cliente6 = new Cliente("Maria Oliveira", "123.039.336-85", "mariaoli@gmail.com");
				System.out.println(cliente6.descricao());
				System.out.println("\n");

				Cliente cliente7 = new Cliente("Felipe Jose", "255.325.447-87", "feljose@gmail.com");
				System.out.println(cliente7.descricao());
				System.out.println("\n");

				Cliente cliente8 = new Cliente("Jessica Mediros", "859.556.787-84", "jessmed@gmail.com");
				System.out.println(cliente8.descricao());
				System.out.println("\n");

				Cliente cliente9 = new Cliente("Sarah Alcantra", "125.554.887-44", "saraalca@gmail.com");
				System.out.println(cliente9.descricao());
				
				System.out.println("\n\n");

				// DESCRIÇÃO FORNECEDOR
				
				Fornecedor fornecedor = new Fornecedor("Empresa: VXX S.A", "11.222.333/4444-55", "vex@email.com",
						"- Sr(a) Maria Aparecida", "maraapa@gmail.com");
				System.out.println(fornecedor.descricao());
				System.out.println("\n");
				Fornecedor fornecedor1 = new Fornecedor("Empresa: Fulza S.A", "21.252.878/4784-55", "fulza@email.com",
						"- Sr(a) João Amoedo", "joaoamoe@gmail.com");
				System.out.println(fornecedor1.descricao());
				System.out.println("\n");

				Fornecedor fornecedor2 = new Fornecedor("Empresa: Fulana S.A", "11.222.333/4444-55", "fulana@email.com",
						"- Sr(a) Fulano da Silva Teixeira", "fulana@gmail.com");
				System.out.println(fornecedor2.descricao());
				
				
	}
}
