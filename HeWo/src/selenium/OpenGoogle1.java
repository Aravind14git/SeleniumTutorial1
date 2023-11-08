package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.netty.channel.pool.FixedChannelPool.AcquireTimeoutAction;

public class OpenGoogle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\rzaravin\\Pictures\\chrome driver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		System.setProperty
		("webdriver.gecko.driver", "C:\\Users\\rzaravin\\Pictures\\Gecko\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//driver.get("https://demoqa.com/webtables");https://www.google.co.in
		driver.get("https://www.leafground.com/link.xhtml");
		//driver.findElement(By.name("q")).sendKeys("India"+Keys.ENTER);
		//driver.findElement(By.id("APjFqb")).sendKeys("Agni");
		//driver.findElement(By.name("btnI")).click();
//Scenario - Link Text pt4:
		//driver.findElement(By.linkText("Go to Dashboard")).click();
		driver.findElement(By.partialLinkText("Dashboard")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.quit();
		
		



		//driver.findElement(By.xpath("//html/body//div[1]/div/div/main/div[1]/div/div[2]/button/input")).sendKeys("India");
		
		//driver.quit();
		
		
		
		
		
		

	}

}
