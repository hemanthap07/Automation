package Assignment;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class alerts_dropdowns {

	public static void main(String[] args) {
		WebDriver driver=(WebDriver) new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.println("google opened and maximized");
		driver.navigate().to("https://www.india.gov.in/");
		System.out.println("navigate to govt in page");
		driver.findElement(By.xpath("//div[@class='sms-content data-do']")).click();
		System.out.println("alert button");
	    Alert alert = driver.switchTo().alert();
	    alert.accept();
	    System.out.println("pop-up accepted");
	 
		Actions actions=new Actions(driver);
		actions.moveToElement((WebElement) By.xpath("//a[@class='wpLan']")).build().perform();
		actions.moveToElement((WebElement) By.xpath("//a[@class='wpLan']")).click().keyDown(Keys.DOWN).sendKeys("kn").doubleClick().build().perform();
	    System.out.println("language");
	    actions.keyDown("//a[@class='wpLan']");

	     


	}

}
