package javaorientacaobjetos.main;

public class Gerente extends Funcionario implements Autenticavel{
	
	private int senha;

	@Override
	public double getBonificacao() {
        return this.salario * 1.4 + 1000;
    }

	@Override
	public boolean autenticar(int senha) {
		if(this.senha == senha){
			return true;
		} else
		return false;
	}

}
