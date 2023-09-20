import java.util.HashMap;
import java.util.Map;

public class RankingClientes {
	 private Map<Cliente, String> ranking;

	    public RankingClientes() {
	        this.ranking = new HashMap<>();
	    }

	    public void atualizarRanking(Cliente cliente, double totalCompras) {
	        if (totalCompras > 10000.00) {
	            ranking.put(cliente, "Categoria A");
	        } else if (totalCompras > 5000.00 && totalCompras <= 10000.00) {
	            ranking.put(cliente, "Categoria B");
	        } else {
	            ranking.put(cliente, "Categoria C");
	        }
	    }

	    public String getCategoriaCliente(Cliente cliente) {
	        return ranking.get(cliente);
	    }
}
