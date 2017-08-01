package br.com.olx.page;

import static org.junit.Assert.fail;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageOlx {

WebDriver driver;
	
	//Elementos da área de busca
	@FindBy(linkText = "RJ")
	private WebElement linkRioDeJaneiro;
	@FindBy(name = "q")
	private WebElement areaDeBusca;
	@FindBy(id = "searchbutton")
	private WebElement botaoPesquisar;
	@FindBy(id="main-ad-list")
	private WebElement listaDeAnuncios;
	
	
	//Constructor
	public PageOlx(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Métodos para buscar webElements na página
	public void clicarLinkRioDeJaneiro() {
		linkRioDeJaneiro.click();
	}
	
	public void buscaPorPalavra(String termoBuscado) {
		areaDeBusca.sendKeys(termoBuscado);
	}
	
	public void clicarBotaoPesquisar(){
		botaoPesquisar.click();
	}
	
	public void imprimirAnuncios(){
		int cont = 0;
		try{
			//WebElement tabelaDeResultados = driver.findElement(By.id("main-ad-list"));
			
			List<WebElement> rows = listaDeAnuncios.findElements(By.className("item"));
			
				for(WebElement row: rows) {
					if(cont < 5){
						List<WebElement> descricao = row.findElements(By.cssSelector(".OLXad-list-line-1.mb5px"));
						List<WebElement> preco = row.findElements(By.cssSelector(".OLXad-list-price"));
							for(WebElement internos: descricao) {
								System.out.println(internos.getText());
									for(WebElement internos1: preco){
										System.out.println(internos1.getText());
										cont++;
									}
							}	
					}
				}	
		}catch (NoSuchElementException e) {
				fail("WebElement não encontrado!");
				e.printStackTrace();
		} 
	}

}
