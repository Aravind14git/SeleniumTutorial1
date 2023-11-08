package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty
		("webdriver.gecko.driver", "C:\\Users\\rzaravin\\Pictures\\Gecko\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		//Sc 1: checking the status of selected radio button
		WebElement safaricheck =
				driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[2]/div[1]/div/div/table/tbody/tr/td[3]/div/div[2]/span"));
		
		WebElement firefox =
		driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[2]/div[1]/div/div/table/tbody/tr/td[2]/div/div[2]/span"));
		
		boolean status1 = safaricheck.isSelected();
		boolean status2 = firefox.isSelected();
		System.out.println(status1);
		System.out.println(status2);
		//Sc 2: clicking the radio button

		WebElement below20 =
		driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[2]/div[2]/div/div/div/div/div[1]/div/div[2]/span"));
		below20.click();
		

		
	}

}
