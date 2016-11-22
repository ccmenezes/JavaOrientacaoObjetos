package javaorientacaobjetos.main;

abstract class Conta {
	
	protected double saldo;
	
	public Conta(double saldo){
		setSaldo(saldo);
	}
	
	public Conta(){
		
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void deposita(double valor) {
	     this.saldo += valor;
	}

	public void saca(double valor) {
	    this.saldo -= valor;
	}
	
	public abstract void atualizar(double taxaSelic); /*{
        this.saldo += this.saldo * taxa;
    }*/
	
}
