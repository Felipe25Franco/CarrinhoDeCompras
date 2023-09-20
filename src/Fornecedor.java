import java.util.Objects;

public class Fornecedor extends Pessoa implements Tratamento {

	private String cnpj;
	private String empresa;
	private String emailEmpresa;
	private String codigoFor;
	private static int qtdFornecedor = 0;
	private boolean sexo;

	public Fornecedor(String empresa, String cnpj, String emailEmpresa, String nome, String email) {
		super(nome, email);
		this.cnpj = cnpj;
		this.empresa = empresa;
		this.emailEmpresa = emailEmpresa;
		this.codigoFor = "F" + ++qtdFornecedor;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getEmailEmpresa() {
		return emailEmpresa;
	}

	public void setEmailEmpresae(String emailEmpresa) {
		this.emailEmpresa = emailEmpresa;
	}

	public String getCodigoFor() {
		return codigoFor;
	}

	public static int getQtdFornecedor() {
		return qtdFornecedor;
	}

	public boolean isSexo() {
		return sexo;
	}

	public void setSexo(boolean sexo) {
		this.sexo = sexo;
	}

	public String tratamento() {
		if (sexo == true) {
			return this.empresa +" representada pelo Diretor  " + getNome();
		} else {
			return this.empresa +" representada pela Gerente  " + getNome();
		}
	}

	public String descricao() {

		return this.empresa + "- CNPJ: " + this.cnpj + " - " + this.emailEmpresa + " " + getNome() + " - " + getEmail();
	}

	@Override
	public String toString() {
		return this.empresa;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		Fornecedor other = (Fornecedor) obj;

		return Objects.equals(cnpj, other.cnpj) && Objects.equals(empresa, other.empresa)
				&& Objects.equals(emailEmpresa, other.emailEmpresa);
	}
}
