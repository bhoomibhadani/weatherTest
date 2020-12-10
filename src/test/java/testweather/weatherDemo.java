package testweather;

import java.util.List;

import org.openqa.selenium.By;                                                                                                       
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class weatherDemo {

	
            public static void main(String[] args) throws InterruptedException {
			
			WebDriverManager.firefoxdriver().setup();
			//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Anshu\\OneDrive\\Desktop\\New folder\\executables\\geckodriver.exe");
	        FirefoxDriver driver = new FirefoxDriver();
	        
	        
			driver.get("https://www.ndtv.com");
			
			driver.findElement(By.className("notnow")).click();
			driver.manage().window().maximize();
			Thread.sleep(4000);
			
			
			driver.findElement(By.id("h_sub_menu")).click();
			System.out.println("Clicked on the top-nav3 dots extender");
			
			
			driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div/a[6]")).click();
			
			driver.findElement(By.xpath("/html/body/div[7]/div/div[1]/div/span[1]")).click();
			System.out.println("Pin YOUr City is clickable");
			
		    driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[4]/div[11]/div/div[1]/span[1]")).click();
		    WebElement element = driver.findElement(By.xpath("//*[@id=\"map_canvas\"]/div[1]/div[6]/div/div[1]/div/div/span[2]/b"));
		    System.out.println(element.isDisplayed());
			System.out.println(element.getText()  + "corresponding city is available with details");
			
			
			
			driver.findElement(By.xpath("//*[@id=\"Alwar\"]")).click();
			
			driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[4]/div[12]/div/div[1]/span[2]")).click();
		    WebElement element1 = driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[6]/div/div[1]/div/div"));
		    
		     System.out.println(element1.getText());
		     
		     List<WebElement> checkboxes = driver.findElements(By.tagName("input"));
		     
		     System.out.println("Total checkboxes are:  " +checkboxes.size());
		     
		    for(WebElement checkbox : checkboxes) {
		    
		    	checkbox.click();
		    }
		    
		    System.out.println("Selecting any city on the map reveals weather details : yes");
		    }
		   
		     
		     

	




	}


