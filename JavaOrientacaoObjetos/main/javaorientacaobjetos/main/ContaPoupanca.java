package javaorientacaobjetos.main;

public class ContaPoupanca extends Conta{

	@Override
	 public void atualiza(double taxa) {
		 this.setSaldo(taxa * 3);
	 }

	 public void deposita(double valor) {
	       super.deposita(valor - 0.10);
	 }
}
