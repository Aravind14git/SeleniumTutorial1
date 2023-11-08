package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertEg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty
		("webdriver.gecko.driver", "C:\\Users\\rzaravin\\Pictures\\Gecko\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		
//Sc 1: accept alert
		WebElement alertBox = driver.findElement(By.id("j_idt88:j_idt91"));
		alertBox.click();
		
		Alert alert =driver.switchTo().alert();
		Thread.sleep(3000);
		
		alert.accept();
//Sc 2: cancel alert
	
		WebElement dismissBox = driver.findElement(By.id("j_idt88:j_idt93"));
		dismissBox.click();
		
		Alert dismissAlert = driver.switchTo().alert();
		Thread.sleep(3000);
		dismissAlert.dismiss();
//Sc 3: Prompt alert with inputs
		
		WebElement promptBox = driver.findElement(By.id("j_idt88:j_idt104"));
		promptBox.click();
		
		Alert promptAlert = driver.switchTo().alert();
		promptAlert.sendKeys("Virat");
		Thread.sleep(3000);
		promptAlert.accept();
		
	

	}

}
