package javaorientacaobjetos.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import javaorientacaobjetos.main.Conta;

public class TestaConta {
	
	private static Conta conta;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		conta = new Conta();
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
		assertEquals(1500.00, conta.getSaldo(), 0.00);
	}

	@Test
	public void testSaque(){
		conta.setSaldo(500.0);
		conta.saca(100.0);
		assertEquals(400.00, conta.getSaldo(), 0.00);
	}
}
