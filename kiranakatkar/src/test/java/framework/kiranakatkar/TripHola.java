package framework.kiranakatkar;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TripHola {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://www.thrillophilia.com/");

		driver.findElement(By.xpath("//input[@class='search-wrap__input-bar tt-input']")).sendKeys("Himalayas");
		driver.findElement(By.cssSelector("button[class='icon-search search-button']")).click();
		ChromeOptions option = new ChromeOptions();
		option.setExperimentalOption("excludeswitches", Arrays.asList("disable-popup-blocking"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a.title")));
		List<WebElement> travelPackages = driver.findElements(By.cssSelector("a.title"));
		System.out.println(travelPackages.size());
		
		
		for(WebElement tp : travelPackages) {
			//String[] packagename = travelPackages.get(i).getText().split(",");
			if(tp.getText().contains("Kedarkantha")) {
				wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[class*='radius-md']")));
				 driver.findElement(By.cssSelector("button[class*='radius-md']")).click();
				 
				 if(tp.getText().contains("Kedarkantha") ){
						driver.findElement(By.cssSelector("div.btn-holder span.btn-sm")).click();
						
			}
			}
			break;
		}


	}

	}
