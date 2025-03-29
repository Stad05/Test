package stadsol.mavenbase;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class googlebase {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.chrome.driver", "F:\\Batch 11_30 A.M\\Chrome\\chromedriver-win64\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "F:\\Batch 11_30 A.M\\Chrome\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	  //  driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    
	    
	    // get command
	    String url = "http://www.google.com/";
	    driver.get(url);
	    
	    //nevigate command
	    
	   // driver.navigate().to(url);
	    
	    
	    
	    
	    
	    
		
	   // WebElement e=driver.findElement(By.name("q"));
		  // Thread.sleep(3000);
		//    e.sendKeys("STAD Solution");  
		    
		  //  e.sendKeys(Keys.BACK_SPACE);
		    
		  //  e.sendKeys(Keys.PAGE_UP);
		    
		 // Click on the search button  
		 //  driver.findElement(By.name("btnK")).submit(); 
		    
		    //implicit wait
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			    
			    
			    //Explicit wait
			
			//  WebDriverWait elementWait = new WebDriverWait(driver,Duration.ofSeconds(5));
			  // elementWait.until(ExpectedConditions.presenceOfElementLocated(By.name("q")));
			   
			   
			    
			//    String searchText=driver.findElement(By.name("q")).getAttribute("value");
			  //  System.out.println("value is "+searchText);
		
		
		/* driver.manage().window().minimize();
		driver.navigate().to("https://rahulshettyacademy.com/locatorspractice/");
	   String actualtitle =  driver.getTitle();
	   
	   String expectedtitle = "Rahul Shetti Academy - Login page";
	   
	   if(actualtitle.equalsIgnoreCase(expectedtitle))
	   {
		   System.out.println("As expected");
	   }
	   
	   else
		   System.out.println("Not match");
	}
	*/
	
	}
}

