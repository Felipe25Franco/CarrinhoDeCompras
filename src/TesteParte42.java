
public class TesteParte42 {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("Jose Maria", "123.334.546-99","-josemar123@gmail.com");
		Cliente cliente6 = new Cliente("Maria Oliveira", "123.039.336-85", "mariaoli@gmail.com");
		
		Fornecedor fornecedor = new Fornecedor("Empresa: Fulana S.A", "11.222.333/4444-55", "fulana@email.com",	" - Fulano da Silva Teixeira", "fulana@gmail.com");
		Fornecedor fornecedor2 = new Fornecedor("Empresa: VXX S.A", "11.222.333/4444-55", "vex@email.com","- Sr(a) Maria Aparecida", "maraapa@gmail.com");
		
		cliente.setSexo(true);
		cliente6.setSexo(false);
		
		fornecedor.setSexo(true);
		fornecedor2.setSexo(false);
		
		
		System.out.println(cliente.tratamento());
		System.out.println("\n");
		System.out.println(cliente6.tratamento());
		System.out.println("\n");
		System.out.println(fornecedor.tratamento());
		System.out.println("\n");
		System.out.println(fornecedor2.tratamento());
		
		

	}

}
