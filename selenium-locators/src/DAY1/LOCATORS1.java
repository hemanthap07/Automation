package DAY1;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LOCATORS1 {

	private static final int i = 0;

	public static void main(String[] args) 
	{
//      System.setProperty("WebDriver","Chromedriver");
     WebDriver driver=new ChromeDriver();
    driver.get("https://www.google.com/?authuser=0"); 
    driver.manage().window().maximize();
//    String window = driver.getWindowHandle();
//	Set<String> multiplewindows = driver.getWindowHandles();
    driver.navigate().to("https://www.flipkart.com/");
    driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']")).sendKeys("shirts");

    
    
//      driver.manage().window().minimize();
//      driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[2]/div/form/div[3]/button"));
		
//		String q="HEMANTH";
//		String w="ap";
//		
// System.out.println(q.concat ( "AP"));
//		
//		String s = "hemanth";
//		System.out.println(s.substring(2, 5));
//		System.out.println(s.toLowerCase());
		
//		String b = "hemanth@gmail.com";
//		String a[]=b.split("@");
//		System.out.println(a[0]);
//		
//		String amount = "$12,$39,$59";
//		System.out.println(amount.replace("$", "").replace(",", ""));
		
//		String m = "hemanth,@ap";
//		String hak=m.split(",")[0];
//		String hab=m.split(",")[1].split("@")[0];
//		String hac=m.split(",")[1].split("@")[1];
//		
//		System.out.println(hak);
//		System.out.println(hab);
//		System.out.println(hac);
		
//		String s="dhoni";
//		String revs="";
//		for (int i=s.length()-1; i>=0;i--);
//		{
//			
//			revs = revs+s.charAt(i);
//		}
//		System.out.println(revs);
		
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.youtube.com/watch?v=HBOdscUwUnc&list=PPSV");
//		System.out.println(driver.getCurrentUrl());
//		
//		String s=driver.getTitle();
//		System.out.println(s);
//		driver.manage().window().maximize();
//		driver.navigate().to("https://www.jiocinema.com/");
//		System.out.println("JIOCINEMA");
//		driver.navigate().back();
//		System.out.println("back");
//		driver.navigate().refresh();
//		System.out.println("refresh");
//		driver.navigate().forward();
//		System.out.println("forward");
//		driver.close();
		
		
	
  //  driver.findElement(By.xpath("//h2[text()='Prime Minister]")).sendKeys("Department of Atomic Energy");
    //driver.findElement(By.xpath("//span[text()='Shri Narendra Modi']")).click();
  //div[@class = "views-field views-field-php"]/span/a[text()="Contact "]
   //Alert alert = driver.switchTo().alert();
    //alert.accept();
    driver.navigate().to("https://www.pmindia. gov.in/en/interact-with-honble-pm/");
    Select dropdown = new Select(driver.findElement(By.id("lang_choice_polylang-2")));
   // dropdown.selectByValue("kn");
    dropdown.selectByIndex(3);
  
   
//  //  dropdown.selectByVisibleText("Hindi");
  Alert alert1 = driver.switchTo().alert();
 alert1.accept();
//  System.out.println(alert.getText());
//  alert.accept();
//  driver.manage().window().maximize();
//  driver.navigate().refresh();
//  dropdown.selectByVisibleText("Hindi");
//  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
  
  
 // Explicit wait 1; webdriver wait and fluent wait 
  
// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  
  
  
  
  
  
  
  
   
 
  
    
    
	}
	

}
