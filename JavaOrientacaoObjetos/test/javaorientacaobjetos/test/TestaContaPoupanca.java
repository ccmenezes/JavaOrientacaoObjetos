package javaorientacaobjetos.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import javaorientacaobjetos.main.Conta;
import javaorientacaobjetos.main.ContaPoupanca;

public class TestaContaPoupanca {
	
	private static Conta conta;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		conta = new ContaPoupanca();
	}

	@Test
	public void testDeposita() {
		conta.setSaldo(0.0);
		conta.deposita(1000.0);
		assertEquals(999.9, conta.getSaldo(), 0.0);
	}

}
