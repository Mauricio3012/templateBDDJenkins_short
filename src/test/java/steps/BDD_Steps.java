package steps;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import io.qameta.allure.Step;
import suporte.ScreenshotUtils;


public class BDD_Steps {

	private static WebDriver navegador;
	private ScreenshotUtils screenshot = new ScreenshotUtils();

	@Step("carrego a URL do site Google")
	@Dado("carrego a URL do site Google")
	public void carregar_URL_Google() {
		System.setProperty("webdriver.chrome.driver", "c:\\temp\\driver\\chromedriver.exe");
		navegador = new ChromeDriver();
		navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");
//		navegador = (WebDriver) new ChromeOptions();

		// Navegando para a página
		navegador.get("https://www.google.com.br/");
	}

	@Step("realizo a pesquisa informando UOL")
	@Quando("realizo a pesquisa informando UOL")
	public void realiza_pesquisa_UOL() throws InterruptedException {

		navegador.findElement(By.name("q")).sendKeys("uol");
		Thread.sleep(3000);
		ScreenshotUtils.screenshot(navegador);
		navegador.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}

	@Step("acesso a pagina do UOL")
	@Entao("acesso a pagina do UOL")
	public void acesso_pagina_UOL() throws Throwable {
		ScreenshotUtils.screenshot(navegador);
		WebElement LinkUol = navegador.findElement(By.xpath("//span[text()='UOL - O melhor conteúdo']"));
		Assert.assertTrue(LinkUol.isDisplayed());
		navegador.close();
	}

}
