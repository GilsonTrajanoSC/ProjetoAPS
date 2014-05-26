package teste;

public class Login {

	private String usuario,senha;
	
	public Login(){
		
	}
	public void setUsuario(String u){
		usuario = u;
	}
	public boolean nomeExistente(String nome){
		if(nome.equals(usuario)){
			return true;
		}
		return false;
	}
	public void setSenha(String senha){
		this.senha = senha;
	}
	public String getSenha(){
		return senha;
	}
}
