package javaorientacaobjetos.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import javaorientacaobjetos.main.AtualizadorDeContas;
import javaorientacaobjetos.main.ContaPoupanca;
import javaorientacaobjetos.main.ImprimeSaldo;

public class TestaAtualizadorDeContas {
	
	private static ContaPoupanca conta;
	private static AtualizadorDeContas atualiza;
	private static ImprimeSaldo imprime;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		conta = new ContaPoupanca();
		atualiza = new AtualizadorDeContas(0.10);
		imprime = new ImprimeSaldo();
	}

	@Test
	public void test() {
		conta.setSaldo(200.0);
		imprime.imprimirSaldoAnterior(conta);
		atualiza.rodar(conta);
		assertEquals(260.0, conta.getSaldo(), 0.00);
		imprime.imprimirSaldoAtualizado(conta);
	}

}
