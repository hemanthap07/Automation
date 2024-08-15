package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigation {

	public static void main(String[] args) {
	     WebDriver driver=new ChromeDriver();
	     driver.get("Https://www.google.com/");
	     driver.manage().window().maximize();
	     driver.navigate().to("https://www.india.gov.in/");
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.findElement(By.id("search_key")).sendKeys("hsjg");
	     driver.findElement(By.id("edit-submit1")).click();
	     driver.findElement(By.xpath("//div[@class='gs-snippet']")).click();
         WebElement element = driver.findElement(By.xpath("//div[@class='gs-snippet']"));
         String linkText = element.getText();
	     System.out.println(linkText);
	      


	}

}
