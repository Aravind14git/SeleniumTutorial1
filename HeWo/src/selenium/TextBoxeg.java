package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TextBoxeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty
		("webdriver.gecko.driver", "C:\\Users\\rzaravin\\Pictures\\Gecko\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		
		WebElement yourNameBox = driver.findElement(By.id("j_idt88:name"));
		yourNameBox.sendKeys("harry@gmail.com");
		
		WebElement appendBox = driver.findElement(By.id("j_idt88:j_idt91"));
		appendBox.sendKeys("city");
		
		WebElement retriveBox = driver.findElement(By.id("j_idt88:j_idt97"));
		String valueOut =retriveBox.getAttribute("value");
		System.out.println(valueOut);
		
		WebElement clearBox = driver.findElement(By.id("j_idt88:j_idt95"));
		clearBox.clear();
		
		
		WebElement enableBox = driver.findElement(By.id("j_idt88:j_idt93"));
		boolean enables =enableBox.isEnabled();
		System.out.println(enables);
		
		driver.quit();
		
		//j_idt88:j_idt97
		
		
	}

}
