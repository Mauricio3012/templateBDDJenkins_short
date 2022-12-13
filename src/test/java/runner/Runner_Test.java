package runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;

@Story("Teste Exemplo BDD Jenkins")
@Epic("Teste Exemplo BDD Jenkins")
@SuppressWarnings("deprecation")
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/",glue = {""},plugin = {"pretty"}, tags = {
"@BDD"}, monochrome = true, dryRun = false)
public class Runner_Test {
	
		@BeforeClass
		public static void beforeClass() throws Exception {
			System.out.println(">> Iniciando a execução dos testes...");	
		}

		@AfterClass
		public static void afterClass() {
			System.out.println(">> Finalizando a execução dos testes...");
		}
	
}


