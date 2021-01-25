package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolsQATableExample {

	private By firstNameLabel = By.xpath("//div[@class='rt-resizable-header-content']");
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		 
		 WebDriver driver;
		 driver = new ChromeDriver();
		 driver.get("https://demoqa.com/webtables");
		 driver.manage().window().maximize();
		 String MainWindow=driver.getWindowHandle();
		 System.out.println("Window Handle: " + MainWindow);
		 
		 String fName = driver.findElement(By.xpath("//div[@class='rt-resizable-header-content']")).getText();
		 System.out.println(fName);
		 
		 driver.quit();
		 
		 
		 

	}

}
