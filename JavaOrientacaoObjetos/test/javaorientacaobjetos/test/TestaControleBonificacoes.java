package javaorientacaobjetos.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import javaorientacaobjetos.main.ControleDeBonificacoes;
import javaorientacaobjetos.main.Gerente;

public class TestaControleBonificacoes {
	
	private static ControleDeBonificacoes bonus;
	private static Gerente f;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		bonus = new ControleDeBonificacoes();
		f = new Gerente();
	}

	@Test
	public void testGetTotalDeBonificacoes() {
		f.setSalario(4700.00);
		bonus.registra(f);
		assertEquals(7580.00, bonus.getTotalDeBonificacoes(), 0.00);
	}

}
