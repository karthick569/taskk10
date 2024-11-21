package taskk10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Question2 {

	public static void main(String[] args) 
	{

        WebDriver driver = new ChromeDriver();
		 driver.get("https://jqueryui.com/droppable/");
		 driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector(".demo-frame")));

	        By sourceLocator = By.xpath("//div[@id='draggable']/p[text()='Drag me to my target']");
	        By targetLocator = By.xpath("//div[@id='droppable']/p[text()='Drop here']");

	        Actions actions = new Actions(driver);
	        actions.dragAndDrop(driver.findElement(sourceLocator), driver.findElement(targetLocator)).perform();

	        String targetColor = driver.findElement(targetLocator).getCssValue("background-color");
	        System.out.println("Targeted element color: " + targetColor);

	        String targetText = driver.findElement(targetLocator).getText();
	        System.out.println("Targeted element text: " + targetText);

	        if (targetText.equals("Dropped")) 
	        {
	            System.out.println("Drag and drop is successful!");
	        } else {
	            System.out.println("Drag and drop is not successful.");
	        }
           driver.close();


	}

}
