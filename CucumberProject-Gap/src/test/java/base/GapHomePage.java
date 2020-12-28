package base;

import java.io.File;

import multiScreenShot.MultiScreenShot;

import java.io.IOException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
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
	
	//private By exForPopup = By.xpath("//button[attribute::class='css-1qosac6']");
	private By exForPopup = By.xpath("//div[@class='css-x5foxo']//button[@class='css-1qosac6']");
	private By jeansLink = By.xpath("//a[@aria-label='categories jeans ']");
	private By straightScrollDown = By.xpath("//div[@tabindex='-1']//picture//img[@alt='Girls Denim Shop, Straight']");
	private By popupWindow = By.xpath("//div[@class='css-q5fqw0']");
	private By teenMomSelection = By.xpath("//div[contains(text(),'Teen Recycled High-Rise Mom Jeans ')]");
	private By teenMomSize = By.xpath("//label[@for='variant-1-sizeDimension1-10']//span");
//	private By teenMomSize = By.xpath("variant-1-sizeDimension1-10");
	private By addToBagLink = By.xpath("//button[@class='add-to-bag']");
	
	private By offerDropDown = By.xpath("//div[@class='css-3smxlu']//div[@class='promoDrawer__handlebar__icon']");
	
	
	public void openUp() {
		 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
//		 ChromeOptions options = new ChromeOptions();
//		 options.addArguments("--disable-notifications");
		  driver = new ChromeDriver();
		 driver.get("https://www.gap.com/");
		 driver.manage().window().maximize();
		 String MainWindow=driver.getWindowHandle();
		 System.out.println(MainWindow);
		 
//		 try{
//			 WebElement pop =     driver.findElement(exForPopup);
//			 pop.click();
//		        
//		    }
//		    catch (NoSuchElementException nse){
//		       nse.printStackTrace();
//		       System.out.println("popup interferes");
//		    
//		    }
		
		//WebElement pop = driver.findElement(exForPopup);
//		WebDriverWait wdw = new WebDriverWait(driver,20);
//		wdw.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[attribute::class='css-1qosac6']")));
//		pop.click();
		 

//		 String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
//		 String subWindowHandler = null;
//		 
//		 Set<String> handles = driver.getWindowHandles(); 
//		 Iterator<String> iterator = handles.iterator();
//		 while (iterator.hasNext()){
//		     subWindowHandler = iterator.next();
//		 }
//		 driver.switchTo().window(subWindowHandler);
		 driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		 WebElement pop =     driver.findElement(exForPopup);
		 pop.click();
		// driver.switchTo().window(parentWindowHandler); 
	}
	
	public void hoverOverMen() {
		WebElement men = driver.findElement(menDropDown);
		
		Actions act1 = new Actions(driver);
		act1.moveToElement(men).perform();
		
		men.click();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		
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
		
		girls.click();
	}
	
	public void clickJeans() {
		WebElement jeans = driver.findElement(jeansLink);
		jeans.click();
	}
	
	public void straightDrop() {
		WebElement straight = driver.findElement(straightScrollDown);
		
//		WebDriverWait wdw = new WebDriverWait(driver,10);
//		wdw.until(ExpectedConditions.elementToBeSelected(straightScrollDown));
		//straight.click();
		
		driver.navigate().to("https://www.gap.com/browse/category.do?cid=6276&nav=meganav%3AGirls%3ACategories%3AJeans%20#pageId=0&department=48&style=76847&mlink=6276,1,EBB_6276&clink=1");
		
	}
	
	public void selectTeenMom() {
//		WebElement tMom = driver.findElement(teenMomSelection);
//		
//		JavascriptExecutor jse = (JavascriptExecutor) driver;  
//		jse.executeScript("arguments[0].scrollIntoView(true);",tMom);
		
		driver.navigate().to("https://www.gap.com/browse/product.do?pid=575402002&cid=76847&pcid=6276&vid=1&nav=meganav%3AGirls%3ACategories%3AJeans%20&grid=pds_10_14_1#pdp-page-content");
		
	}
	
	public void setTeenMomSize() {
		
		WebElement offerdrop = driver.findElement(offerDropDown);
		
		offerdrop.click();
		WebElement momSize = driver.findElement(teenMomSize);
		momSize.click();
		
		
		
		WebElement bagAdd = driver.findElement(addToBagLink);
		bagAdd.click();
		
		
	}
}
