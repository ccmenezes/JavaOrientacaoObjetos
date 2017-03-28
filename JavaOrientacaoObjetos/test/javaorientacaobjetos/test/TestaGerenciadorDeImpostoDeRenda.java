package javaorientacaobjetos.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import javaorientacaobjetos.main.ContaCorrente;
import javaorientacaobjetos.main.GerenciadorDeImpostoDeRenda;
import javaorientacaobjetos.main.SeguroDeVida;

public class TestaGerenciadorDeImpostoDeRenda {
	
	private static GerenciadorDeImpostoDeRenda gerenciador;
	private static SeguroDeVida sv;
	private static ContaCorrente cc;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		gerenciador =  new GerenciadorDeImpostoDeRenda();
		sv = new SeguroDeVida();
		cc = new ContaCorrente();
	}

	@Test
	public void test() {
		gerenciador.adicionar(sv);
		cc.deposita(1000);
        gerenciador.adicionar(cc);

        assertEquals(52.00, gerenciador.getTotal(), 0.00);
     }

}
