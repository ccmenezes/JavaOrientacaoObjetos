package br.com.olx.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import br.com.olx.page.PageOlx;
import br.com.olx.resources.Constantes;

public class TestaImprimirPrimeirosAnuncios {

	PageOlx pagina;
	WebDriver driver;
	List<WebElement> resultadosDeBusca;

	@Before
	public void iniciarTeste() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		pagina = new PageOlx(driver);
		driver.get(Constantes.paginaRioDeJaneiro);
		driver.manage().window().maximize();
	}

	@Test
	public void test() throws InterruptedException {
		
		pagina.buscaPorPalavra("carrinho");
		pagina.clicarBotaoPesquisar();
		
		Thread.sleep(3000);
		String tituloResultadoBusca = "carrinho no Rio de Janeiro - Encontramos carrinho | OLX";
		assertEquals(tituloResultadoBusca , driver.getTitle());
		
		Thread.sleep(3000);
		pagina.imprimirAnuncios();
	}
		
	@After
	public void encerrarTest() throws Exception {
		driver.close();
		driver.quit();
	}

}
