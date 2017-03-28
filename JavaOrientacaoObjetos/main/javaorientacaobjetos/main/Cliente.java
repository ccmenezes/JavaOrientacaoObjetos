package javaorientacaobjetos.main;

public class Cliente implements Autenticavel {
	
	private String nome;
	private int senha;
		
	public Cliente(){
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public boolean autenticar(int senha) {
		if(this.senha == senha){
			return true;
		} else
		return false;
	}

}
