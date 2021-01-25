package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBHome {

	WebDriver driver;
	private By uName = By.id("email");
	private By pWord = By.id("pass");
	private By logInClick = By.name("login");
	private By logoutDropDown = By.xpath("//i[@class='hu5pjgll lzf7d6o1 sp_TnD3CePUsDq sx_f0f41e']"); 
	private By logoutLink = By.xpath("//span[contains(text(),'Log Out')]");
	
	public void gotoPage() {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
	}
	
	public void inAndOut() {
		
		WebElement user = driver.findElement(uName);
		user.sendKeys("nnamdiwill@gmail.com");
		
		WebElement pw = driver.findElement(pWord);
		pw.sendKeys("miFBpw$#U$E");
		
		WebElement logged = driver.findElement(logInClick);
		logged.click();
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
	}
	
	public void closingFaceBook() {
		
		System.out.println("Current URL: " + driver.getCurrentUrl());
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		WebElement dDown = driver.findElement(logoutDropDown);
		dDown.click();
		
		WebElement logoutClick = driver.findElement(logoutLink);
		logoutClick.click();
		
		driver.quit();
	}
	
}
