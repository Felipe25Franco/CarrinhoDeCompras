import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TesteParte6 {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Faizao Tira", "222.111.333-44", "faizatira@gmail.com");
        Cliente cliente2 = new Cliente("Geraldo Marques", "489.554.662-26", "geraldomarq@gmail.com");
        Cliente cliente3 = new Cliente("Enzo Fernandes", "884.556.931-11", "enzofer@gmail.com");

        Produto produto1 = new Produto("Produto 1", 5.50, 2000, 50);
        Produto produto2 = new Produto("Produto 2", 3.75, 1000, 30);
        Produto produto3 = new Produto("Produto 3", 11.49, 50000, 10);

        List<ItemCarrinho> itens1 = new ArrayList<>();
        itens1.add(new ItemCarrinho(produto1, 5));
        itens1.add(new ItemCarrinho(produto2, 3));
        itens1.add(new ItemCarrinho(produto3, 10000));

        List<ItemCarrinho> itens2 = new ArrayList<>();
        itens2.add(new ItemCarrinho(produto1, 5));
        itens2.add(new ItemCarrinho(produto2, 3));
        itens2.add(new ItemCarrinho(produto3, 500));

        List<ItemCarrinho> itens3 = new ArrayList<>();
        itens3.add(new ItemCarrinho(produto1, 5));
        itens3.add(new ItemCarrinho(produto2, 3));
        itens3.add(new ItemCarrinho(produto3, 5));
        
       

        Carrinho carrinho1 = new Carrinho(LocalDate.now(), itens1, cliente1);
        Carrinho carrinho2 = new Carrinho(LocalDate.now(), itens2, cliente2);
        Carrinho carrinho3 = new Carrinho(LocalDate.now(), itens3, cliente3);

        double valor1 = carrinho1.calcularValorTotal();
        double valor2 = carrinho2.calcularValorTotal();
        double valor3 = carrinho3.calcularValorTotal();

        RankingClientes rankingClientes = new RankingClientes();
        rankingClientes.atualizarRanking(cliente1, valor1);
        rankingClientes.atualizarRanking(cliente2, valor2);
        rankingClientes.atualizarRanking(cliente3, valor3);
        
       

        System.out.println(rankingClientes.getCategoriaCliente(cliente1));
        System.out.println(valor1);
        System.out.println(rankingClientes.getCategoriaCliente(cliente2));
        System.out.println(valor2);
        System.out.println(rankingClientes.getCategoriaCliente(cliente3));
        System.out.println(valor3);
        
        

    }

}