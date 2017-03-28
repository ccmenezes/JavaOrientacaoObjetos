package javaorientacaobjetos.main;

public class SistemasInternos {
	
	private int senha;
	
	public SistemasInternos(int senha) {
		setSenha(senha);
	}
	
	public void setSenha(int senha){
		this.senha = senha;
	}
	
	public void autenticar(Autenticavel pessoa){
		pessoa.autenticar(senha); 
	}

}
