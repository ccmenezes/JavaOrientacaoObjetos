package javaorientacaobjetos.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import javaorientacaobjetos.main.ControleDeBonificacoes;
import javaorientacaobjetos.main.Gerente;

public class TestaControleBonificacoes {
	
	private static ControleDeBonificacoes bonus;
	private static Gerente gerente;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		bonus = new ControleDeBonificacoes();
		gerente = new Gerente();
	}

	@Test
	public void testGetTotalDeBonificacoes() {
		gerente.setNome("Maria");
		gerente.setSalario(4700.00);
		bonus.registra(gerente);
		bonus.mostrarFuncionarioBonificado(gerente);
		assertEquals(7580.00, bonus.getTotalDeBonificacoes(), 0.00);
	}

}
