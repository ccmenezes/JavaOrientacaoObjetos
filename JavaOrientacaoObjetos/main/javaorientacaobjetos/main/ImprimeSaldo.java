package javaorientacaobjetos.main;

public class ImprimeSaldo {

	private String saldoAnterior = "Saldo Anterior: R$ ";
	private String saldoAtualizado = "Saldo Atualizado: R$ ";
	
	public void imprimirSaldoAnterior(Conta c){
		System.out.println("===============================");
		System.out.println(saldoAnterior + c.getSaldo());	
	}
	
	public void imprimirSaldoAtualizado(Conta c){
		System.out.println("===============================");
		System.out.println(saldoAtualizado + c.getSaldo());	
	}
}
