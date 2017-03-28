package javaorientacaobjetos.main;

public class AtualizadorDeContas {
	
	private double saldoTotal = 0;
	private double selic;

	public AtualizadorDeContas(double selic) {
	    this.selic = selic;
	}
	 
	public void rodar(Conta c) {
		 c.atualizar(this.selic);
	     this.saldoTotal += c.getSaldo();
	}
			 
	public double getSaldoTotal() {
	    return this.saldoTotal;
	}
	    
}
