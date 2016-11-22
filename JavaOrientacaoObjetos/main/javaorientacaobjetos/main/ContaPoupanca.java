package javaorientacaobjetos.main;

public class ContaPoupanca extends Conta{

	@Override
	 public void atualizar(double taxa) {
		this.saldo += this.saldo * taxa * 3;
	 }

	 public void deposita(double valor) {
	       super.deposita(valor - 0.10);
	 }
}
