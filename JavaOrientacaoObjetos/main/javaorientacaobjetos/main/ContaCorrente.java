package javaorientacaobjetos.main;

public class ContaCorrente extends Conta{
	
	@Override
	public void atualiza(double taxa) {
		this.setSaldo(taxa * 2);
	}

}
