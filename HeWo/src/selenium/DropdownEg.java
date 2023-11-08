package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownEg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty
		("webdriver.gecko.driver", "C:\\Users\\rzaravin\\Pictures\\Gecko\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		
//Sc 1: Select by value, index, visible and also can perform send keys
		WebElement dropdown1 = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[1]/div/div/select"));
		
		//Select class will use for dropDown
		Select select = new Select(dropdown1);
		select.selectByIndex(1);
		Thread.sleep(3000);
		select.selectByVisibleText("Puppeteer");
		/*WebElement dropdown2 = driver.findElement(By.id("j_idt87:country_input"));
		Select select1 = new Select(dropdown2);
		select.selectByValue("India");*/	
		
//Sc 2: Count the no of options in dropdown
		
		List<WebElement> listOfOptions= select.getOptions();
		int size = listOfOptions.size();
		System.out.println(size);
//Sc 3: Multiselect
		
		WebElement multiSelect = driver.findElement(By.id("j_idt87:lang_input"));
		Select multiSelectBox = new Select(multiSelect);
		multiSelectBox.selectByIndex(2);
		
		
		
		
		
	}

}
