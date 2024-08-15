package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class amazon_assignment {

	public static void main(String[] args)
	{
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://www.amazon.in/");
	     driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	     driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).click();
	     driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("boult");
	     driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).submit();

         JavascriptExecutor js =  (JavascriptExecutor)driver;
         js.executeScript("window.scrollBy(0, 350)", "");
	     driver.findElement(By.xpath("//button[@id='a-autoid-1-announce']")).click();
         driver.findElement(By.id("nav-cart-count-container")).click();
//        driver.findElement(By.xpath("//span[text()='This will be a gift']")).click();
//     Select dropdown=new Select(driver.findElement(By.id("quantity")));
//        dropdown.selectByIndex(1);
     //    scroll down 
         
        
    
			



		
	}

}
