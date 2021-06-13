package Pages;

import org.openqa.selenium.By;

public class Metodos extends AbrirBrowser {

	public void Escrever(String texto, By Elementos) {
		driver.findElement(Elementos).sendKeys(texto);

	}

	public void Clicar(By Elementos) {
		driver.findElement(Elementos).click();
	}

public void escreverTempo(By Elementos, String Texto) throws InterruptedException {
	Thread.sleep(5000);
	driver.findElement(Elementos).sendKeys(Texto);
}
	


	

	
	
	
	

}
