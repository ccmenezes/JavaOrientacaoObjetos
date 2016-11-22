package javaorientacaobjetos.main;

public class AtualizadorDeContas {
	
	 private double saldoTotal = 0;
	private double selic;

	public AtualizadorDeContas(double selic) {
	    this.selic = selic;
	}
	 
	public void rodar(Conta c) {
		 imprimirSaldo("Saldo anterior: ", c);
	     c.atualizar(this.selic);
	     imprimirSaldo("Saldo atualizado: ", c);
	     this.saldoTotal += c.getSaldo();
	 }
	 
	 public void imprimirSaldo(String momentoSaldo, Conta c){
		 System.out.println("===============================");
	     System.out.println(momentoSaldo + c.getSaldo());		 
	 }
	 
	 public double getSaldoTotal() {
	    return this.saldoTotal;
	 }
	    
}
