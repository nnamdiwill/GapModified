package base;

import java.io.File;

import multiScreenShot.MultiScreenShot;

import java.io.IOException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GapHomePage {

	WebDriver driver;
	
	private By menDropDown = By.xpath("//button[@data-divisionname='Men']");
	private By menList = By.xpath("//ul[@class='catnav-links']//li//a");
	private By hoodiesLink = By.linkText("Hoodies");
	private By girlDropDown = By.xpath("//button[@data-divisionname='Girls']");
	
	private By exForPopup = By.xpath("//button[attribute::class='css-1qosac6']");
	private By jeansLink = By.linkText("Jeans ");
	private By straightScrollDown = By.xpath("//img[@alt='Girls Denim Shop, Straight']");
	
	private By testFeature;
	public void openUp() {
		 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		  driver = new ChromeDriver();
		 driver.get("https://www.gap.com/");
		 driver.manage().window().maximize();
		
		WebElement pop = driver.findElement(exForPopup);
		pop.click();
		 

		 
		 
	}
	
	public void hoverOverMen() {
		WebElement men = driver.findElement(menDropDown);
		
		Actions act1 = new Actions(driver);
		act1.moveToElement(men).perform();
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		
	}
	
	public void getMenDropDownList() {
		List<WebElement> menDropList = driver.findElements(menList);
		
		for(WebElement we: menDropList) {
			
			String listText = we.getText();
			
			System.out.println(listText);
			
		}
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
	}
	
	public void clickForHoodies() {
	//	System.out.println("After men dropdown");
		WebElement hoodies = driver.findElement(hoodiesLink);
		hoodies.click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		System.out.println("Page Title: " + driver.getTitle());
	}
	
	public void closeBrowser() {
		driver.quit();
	}
	
	public void goToGirlsDropDown() {
		WebElement girls = driver.findElement(girlDropDown);
		
		Actions act1 = new Actions(driver);
		act1.moveToElement(girls).perform();
	}
	
	public void clickJeans() {
		WebElement jeans = driver.findElement(jeansLink);
		jeans.click();
	}
	
	public void straightDrop() {
		WebElement straight = driver.findElement(straightScrollDown);
		straight.click();
	}
}
