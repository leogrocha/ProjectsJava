package Json.FirstJson;

public class Usuario {
	private String cpf;
	private String login;
	private String senha;
	private String nome;
	
	public Usuario() {
		
	}
	
	public Usuario(String cpf, String login, String senha, String nome) {
		this.cpf = cpf;
		this.login = login;
		this.senha = senha;
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Usuario [cpf=" + cpf + ", login=" + login + ", senha=" + senha + ", nome=" + nome + "]";
	}
	
	
}
