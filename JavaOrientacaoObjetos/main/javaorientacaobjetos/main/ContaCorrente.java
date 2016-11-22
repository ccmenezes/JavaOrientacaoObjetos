package javaorientacaobjetos.main;

public class ContaCorrente extends Conta{
	
	@Override
	public void atualizar(double taxa) {
		this.saldo += this.saldo * taxa * 2;
	}

}
