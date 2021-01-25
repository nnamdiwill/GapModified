package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TargetLogin {

private	By signIn = By.xpath("//span[@class='styles__AccountName-sc-1kk0q5l-0 iQFCAn']");

private By signInLink = By.xpath("//div[contains(text(),'Sign in')]//ancestor::a");
private By uName = By.id("username");
private By pWord = By.id("password");
private By login = By.id("login");
private By skipClick = By.id("circle-skip");

private By uNameLogout = By.xpath("//span[@data-test='accountUserName']");
private By signOut = By.xpath("//div[contains(text(),'Sign out')]//ancestor::a");


WebDriver driver;

public void openTargetBrowser() {
	 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	 
	 driver = new ChromeDriver();
	 driver.get("https://www.target.com/");
	 driver.manage().window().maximize();
	 
	 
}

public void logged() {
	
	WebElement sI = driver.findElement(signIn);
	
	sI.click(); // initial sign
	 driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	 
	WebElement siLink = driver.findElement(signInLink);
	
	Actions act1 = new Actions(driver);
	act1.moveToElement(siLink);
	siLink.click();// sign in link
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	
	WebElement user = driver.findElement(uName);
	user.sendKeys("nnamdiwilliams529@gmail.com");
	
	WebElement pw = driver.findElement(pWord);
	pw.sendKeys("s4lw2Etbs");
	
	System.out.println("Page title : " + driver.getTitle());
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	
	WebElement l = driver.findElement(login);
	l.click();
	//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	
	WebElement skip = driver.findElement(skipClick);
	skip.click();
	
	System.out.println("Current Page: " + driver.getTitle());
	
	WebElement logoutLink = driver.findElement(uNameLogout); //clicking username to logout
	logoutLink.click();
	
	
	
}

public void closeupBroswer() {
	
	driver.quit();
}
}
