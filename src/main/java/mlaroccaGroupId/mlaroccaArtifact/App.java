package mlaroccaGroupId.mlaroccaArtifact;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class App
{
	
	public static WebDriver capabilities() throws IOException{
	FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\mlaroccaGroupId\\mlaroccaArtifact\\global.properties");
	Properties prop=new Properties();
	prop.load(fis);
	
    String DriverPath=(String) prop.get("WebDriverPath");
    
    System.setProperty("webdriver.chrome.driver", DriverPath);
	ChromeOptions options = new ChromeOptions();
	//options.addArguments("headless");
	options.addArguments("--incognito");
	options.addArguments("start-maximized");
		
	WebDriver driver = new ChromeDriver(options);
	
	return driver;
	
	}

  
}
