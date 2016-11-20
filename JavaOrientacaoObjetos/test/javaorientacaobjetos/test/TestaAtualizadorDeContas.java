package javaorientacaobjetos.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import javaorientacaobjetos.main.AtualizadorDeContas;
import javaorientacaobjetos.main.ContaPoupanca;

public class TestaAtualizadorDeContas {
	
	private static ContaPoupanca conta;
	private static AtualizadorDeContas atualiza;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		conta = new ContaPoupanca();
		atualiza = new AtualizadorDeContas(0.10);
	}

	@Test
	public void test() {
		conta.setSaldo(200.0);
		atualiza.roda(conta);
		assertEquals(260.0, conta.getSaldo(), 0.00);
	}

}
