package mlaroccaGroupId.mlaroccaArtifact;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import junit.framework.Assert;
import pageObjects.HomePage;

public class Tests extends App {

	private WebDriver driver;

	@Before
	public void InitDriver() throws IOException
	{
		System.out.println("Inicializando Driver");
		driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		if(driver != null){
	    System.out.println("Driver Creado");	   
		}
	}
	
	@Test
	public void Validation() throws InterruptedException{
		
		String baseUrl = "https://www.mercadolibre.com.ar/";
		driver.get(baseUrl);
		
		
		Utilities u=new Utilities();
		u.sleep(30000);
		
		HomePage h=new HomePage(driver);
		
		h.getBarraBusqueda().sendKeys("rompecabezas");
		h.getBarraBusqueda().sendKeys(Keys.ENTER);
		
		u.sleep(20000);
		
		h.getFlecha().click();
						
		u.sleep(5000);
		
		h.getMenorPrecio().click();
		
		u.sleep(5000);
				
			
		String valor1 = h.getPrimerPrecio();
		double valor3 = u.getAmount(valor1); 
		
		String valor2 = h.getSegundoPrecio();
		double valor4 = u.getAmount(valor2);
		
		System.out.println("1er resultado: " + valor3 + " 2do resultado: " + valor4);
		
		Assert.assertEquals(valor3, valor4);
						
	}
    
	@After
	public void CloseDriver()
	{
		System.out.println("Cerrando Driver");
        if(driver != null){
            driver.close();
            driver.quit();
            System.out.println("Driver Cerrado");
        }
	}
	
	
	
}
	
	

