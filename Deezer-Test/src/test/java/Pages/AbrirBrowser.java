package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AbrirBrowser {

	// METODO PARA ABRIR NAVEGADOR COM A OPCAO CHROME OU FIREFOX
	

	WebDriver driver;
	
	public void abrirNavegador(String appUrl, String descriocaoPasso) {
		System.setProperty("webdriver.chrome.driver", "c:\\Driver\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get(appUrl);
		driver.manage().window().maximize();
	}
	
	

	public void abrirFirefox(String site) {

		System.setProperty("webdriver.gecko.driver", "c:\\geckodriver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(site);
		driver.manage().window().maximize();
	}
	
	public void fecharNavegador(String DescrissaoPasso) {
		driver.quit();
		
		
		}
		  
	public void fecharNavega2(String descrissa) {

driver.close();

}
}