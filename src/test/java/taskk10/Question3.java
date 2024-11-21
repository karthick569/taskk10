package taskk10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Question3 {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		 driver.get("https://www.guvi.in/");
		 driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

	        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Sign Up']"))).click();


	        String email = "karthick10.9.1996@gmail.com"; 
	        String password = "Karthick@96"; 

	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email"))).sendKeys(email);
	        driver.findElement(By.id("password")).sendKeys(password);

	        driver.findElement(By.xpath("//button[text()='Login']")).click();
	        
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(), 'Welcome')]")));

	        String welcomeText = driver.findElement(By.xpath("//h1[contains(text(), 'Welcome')]")).getText();
	        System.out.println("Login Status: " + welcomeText);


	}

}
