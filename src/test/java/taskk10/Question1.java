package taskk10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Question1 {

	public static void main(String[] args) throws InterruptedException 
	{
         WebDriver driver = new ChromeDriver();
		 driver.get("https://jqueryui.com/datepicker/");
		 driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

	        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
	        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector(".demo-frame")));

	        driver.findElement(By.id("datepicker")).click();

	        driver.findElement(By.xpath("//span[contains(@class, 'ui-icon-circle-triangle-e')]")).click();

	        driver.findElement(By.xpath("//a[text()='22']")).click();

	        String selectedDate = driver.findElement(By.id("datepicker")).getAttribute("value");
	        System.out.println("Selected date: " + selectedDate);

	        driver.quit();

	}

}
