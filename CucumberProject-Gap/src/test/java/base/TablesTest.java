package base;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("sidebar.....");
		try {
			
			 String max;
		     double m=0,r=0;
		driver.navigate().to("http://demo.guru99.com/test/web-table-element.php");
		
		 List<WebElement>  col = driver.findElements(By.xpath(".//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
	        System.out.println("No of cols are : " +col.size()); 
	        //No.of rows 
	        List<WebElement>  rows = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]")); 
	        System.out.println("No of rows are : " + rows.size());
	        
	        System.out.println("next step...");
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			 WebElement baseTable = driver.findElement(By.tagName("table"));
			  
			 //To find third row of table
			 WebElement tableRow = baseTable.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]"));
	         String rowtext = tableRow.getText();
			 System.out.println("Third row of table : "+rowtext);
			    
			    //to get 3rd row's 2nd column data
			    WebElement cellIneed = tableRow.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]/td[2]"));
			    String valueIneed = cellIneed.getText();
			    System.out.println("Cell value is : " + valueIneed); 
			    
			    System.out.println("next steps...");
			    
//			    //No. of Columns
//		        List  cols = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/thead/tr/th"));
//		        System.out.println("Total No of columns are : " +col.size());
//		        //No.of rows
//		        List  row = driver.findElements(By.xpath (".//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
//		        System.out.println("Total No of rows are : " + rows.size());
//		        for (int i =1;i<rows.size();i++)
//		        {    
//		            max= driver.findElement(By.xpath("html/body/div[1]/div[5]/table/tbody/tr[" + (i+1)+ "]/td[4]")).getText();
//		            NumberFormat f =NumberFormat.getNumberInstance(); 
//		            Number num = f.parse(max);
//		            max = num.toString();
//		            m = Double.parseDouble(max);
//		            if(m>r)
//		             {    
//		                r=m;
//		             }
//		        }
//		        System.out.println("Maximum current price is : "+ r);
	        driver.close();
		} catch(NoSuchSessionException nsse) {
			
			nsse.printStackTrace();
			System.out.println("Don't worry about it");
		}

	}

}
