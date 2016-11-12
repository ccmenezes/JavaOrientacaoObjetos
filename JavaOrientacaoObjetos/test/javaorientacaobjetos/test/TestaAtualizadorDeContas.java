package javaorientacaobjetos.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import javaorientacaobjetos.main.AtualizadorDeContas;
import javaorientacaobjetos.main.Conta;

public class TestaAtualizadorDeContas {
	
	private static Conta conta;
	private static AtualizadorDeContas atualiza;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		conta = new Conta();
		atualiza = new AtualizadorDeContas(0.10);
	}

	@Test
	public void test() {
		conta.setSaldo(200.0);
		atualiza.roda(conta);
		assertEquals(220.0, conta.getSaldo(), 0.00);
	}

}
