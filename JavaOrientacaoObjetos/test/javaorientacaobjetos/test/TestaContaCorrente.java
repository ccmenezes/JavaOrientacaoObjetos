package javaorientacaobjetos.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import javaorientacaobjetos.main.ContaCorrente;

public class TestaContaCorrente {

	private static ContaCorrente conta;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		conta = new ContaCorrente();
	}

	@Test
	public void tesDedposita() {
		conta.setSaldo(0.0);
		conta.deposita(1000.0);
		assertEquals(1000.0, conta.getSaldo(), 0.0);
	}

}
