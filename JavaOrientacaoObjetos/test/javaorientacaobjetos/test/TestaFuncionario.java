package javaorientacaobjetos.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import javaorientacaobjetos.main.Gerente;

public class TestaFuncionario {
	
	private static Gerente func;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		func = new Gerente();
	}

	@Test
	public void testGetNome() {
		func.setNome("Samara");
		assertEquals("Samara", func.getNome());
	}
	
	@Test
	public void testGetCpf() {
		func.setCpf("49712378922");
		assertEquals("49712378922", func.getCpf());
	}
	
	@Test
	public void testGetBonificacao() {
		func.setSalario(4700.00);
		assertEquals(7580.00, func.getBonificacao(), 0.00);
	}

}
