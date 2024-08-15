package DAY1;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators2 {

	private static final String MainWindow = null;

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/?authuser=0");
		
		
		
		
		
	
		
//		
//	String window = driver.getWindowHandle();
//	Set<String> multiplewindows = driver.getWindowHandles(); //store unique window id's
	}

	}

