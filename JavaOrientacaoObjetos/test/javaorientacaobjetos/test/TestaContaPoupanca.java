package javaorientacaobjetos.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import javaorientacaobjetos.main.ContaPoupanca;

public class TestaContaPoupanca {
	
	private static ContaPoupanca conta;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		conta = new ContaPoupanca();
	}

	@Test
	public void testSaldo() {
		conta.setSaldo(500.0);
		assertEquals(500.00, conta.getSaldo(), 0.00);
	}
	
	@Test
	public void testDeposita(){
		conta.setSaldo(500.0);
		conta.deposita(1000.0);
		assertEquals(1499.9, conta.getSaldo(), 0.00);
	}

	@Test
	public void testSaque(){
		conta.setSaldo(500.0);
		conta.saca(100.0);
		assertEquals(400.00, conta.getSaldo(), 0.00);
	}
}
