package selenium;

import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ButtonEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty
		("webdriver.gecko.driver", "C:\\Users\\rzaravin\\Pictures\\Gecko\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.leafground.com/button.xhtml");
		
		//WebElement buttonClick = driver.findElement(By.id("j_idt88:j_idt90"));
		//buttonClick.click();
		
//Find position
		WebElement getPositionBox = driver.findElement(By.id("j_idt88:j_idt94"));

		org.openqa.selenium.Point xyPoint = getPositionBox.getLocation();
		int xValue = xyPoint.getX();
		int yValue = xyPoint.getY();
		System.out.println("X Value is:" +xValue);
		System.out.println("Y Value is:"+ yValue);
		
//Find color
		WebElement colorButton = driver.findElement(By.id("j_idt88:j_idt96"));
		String colorValue = colorButton.getCssValue("background");
		System.out.println(" Button Color is:"+ colorValue);
		
//Find size button
		WebElement sizeButton = driver.findElement(By.id("j_idt88:j_idt98"));
		int height = sizeButton.getSize().getHeight();
		int width = sizeButton.getSize().getWidth();
		System.out.println("Height is:" + height );
		System.out.println("Width is:" + width );

		
		
		
		
		

	}

}
