package base;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolsQATable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		 // he <tbody> tag provides a container for rows and columns.
		 WebDriver driver;
		 driver = new ChromeDriver();
		 driver.get("https://demoqa.com/webtables");
		 driver.manage().window().maximize();
		 String MainWindow=driver.getWindowHandle();
		 System.out.println("Window Handle: " + MainWindow);
		 
		 WebElement tableBody = driver.findElement(By.xpath("//div[@class='ReactTable -striped -highlight']")); //entire table body
		 
		 List<WebElement> rows = tableBody.findElements(By.xpath("//div[@class='rt-tr-group']"));
		 //Print the rows size        
	        System.out.println("Total Number of visible rows in the table is: " + rows.size());
	        
	        List<WebElement> rowsWithData = tableBody.findElements(By.xpath("//div[contains(@class,'rt-td') and text()]/ancestor::div[contains(@class,'rt-tr-group')]"));
	        System.out.println("Rows with data " + rowsWithData.size());
	        
	        //Print the text of 3rd row        
	        System.out.println("Data of 3rd row is: \n" + rowsWithData.get(2).getText());
	        
	        
	        System.out.println("====================================");
	        
	        //Print the text of 2nd row        
	        System.out.println("Data of 2nd row is: \n" + rowsWithData.get(1).getText());
	        
	        
	        System.out.println("2nd column data: ");
	        //Getting the text of the second column
	        List<WebElement> colswithData = tableBody.findElements(By.xpath("//div[@class='rt-td'][2][text()]"));
	        
	        for(int i = 0; i < colswithData.size(); i++) {
	        	
	        	 System.out.println(colswithData.get(i).getText());
	        }
	        
		 driver.quit();
	}

}
