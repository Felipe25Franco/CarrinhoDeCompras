import java.util.ArrayList;

import java.util.List;


public class Listas<T> {
	private List<T> lista = new ArrayList<>();

	public void adicionar(T item) {
		lista.add(item);
	}

	public void remover(T item) {
		
		lista.remove(item);
	}

	public void listar() {
		for (T item : lista) {
			System.out.println(item.toString());
		}
	}

	public boolean temItens() {
		return !lista.isEmpty();
	}

}
