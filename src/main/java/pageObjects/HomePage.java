package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class HomePage 
{
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH,using = "/html/body/header/div/form/input")
	public WebElement BarraBusqueda;
	
	public WebElement getBarraBusqueda()
	{
		System.out.println("trying to find the xpath for BarraBusqueda");
		return BarraBusqueda;
	}
	
	@FindBy(how = How.CLASS_NAME,using = "andes-dropdown__standalone-arrow")
	public WebElement flecha;
	
	public WebElement getFlecha()
	{
		System.out.println("trying to find the class name for Flecha");
		return flecha;
	}
	
	@FindBy(how = How.XPATH,using = "/html/body/main/div/div[1]/section/div[1]/div/div/div/div[2]/div/div/div/ul/a[1]/div[2]/div[2]/div")
		public WebElement menorPrecio;

	public WebElement getMenorPrecio()
	{
		System.out.println("trying to find the xpath for MenorPrecio");
		return menorPrecio;
	}
	
	@FindBy(how = How.XPATH,using = "/html/body/main/div/div[1]/section/ol/li[1]/div/div/div[2]/div[2]/div[1]/div[1]/div/div/span[1]/span[2]/span[2]")
	public WebElement PrimerPrecio1;
	
	public String getPrimerPrecio()
	{
		System.out.println("trying to find the xpath for Primer Precio");
		String PrimerPrecio = PrimerPrecio1.getText();
		return PrimerPrecio;
	}
	
	@FindBy(how = How.XPATH,using = "/html/body/main/div/div[1]/section/ol/li[2]/div/div/div[2]/div[2]/div[1]/div[1]/div/div/span[1]/span[2]/span[2]")
	public WebElement SegundoPrecio1;
	
	public String getSegundoPrecio()
	{
		System.out.println("trying to find the xpath for Segundo Precio");
		String SegundoPrecio = SegundoPrecio1.getText();
		return SegundoPrecio;
	}
}

