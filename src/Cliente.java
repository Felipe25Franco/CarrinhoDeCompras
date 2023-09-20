import java.util.Objects;

public class Cliente extends Pessoa implements Tratamento {

	private String cpf;
	private String codigoCli;
	private static int qtdClientes = 0;
	private boolean sexo;

	public Cliente(String nome, String cpf, String email) {
		super(nome, email);
		this.cpf = cpf;
		this.codigoCli = "C" + ++qtdClientes;

	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCodigoCli() {
		return codigoCli;
	}

	public static int getQtdClientes() {
		return qtdClientes;
	}

	public boolean isSexo() {
		return sexo;
	}

	public void setSexo(boolean sexo) {
		this.sexo = sexo;
	}

	public String tratamento() {
		if (sexo == true) {
			return "Prezado " + getNome();
		} else {
			return "Prezada " + getNome();
		}
	}

	public String descricao() {

		return getNome() + " - CPF " + this.cpf + " (" + getEmail() + ")";
	}

	@Override
	public String toString() {
		return getNome();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		Cliente other = (Cliente) obj;
		return Objects.equals(cpf, other.cpf);
	}
}
