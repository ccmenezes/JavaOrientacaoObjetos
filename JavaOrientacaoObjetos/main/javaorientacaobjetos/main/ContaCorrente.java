package javaorientacaobjetos.main;

public class ContaCorrente extends Conta implements Tributavel{
	
	@Override
	public void atualizar(double taxa) {
		this.saldo += this.saldo * taxa * 2;
	}

	@Override
	public double calcularTributos() {
		return this.getSaldo() * 0.01; //Retorna 10% do saldo
	}

}
