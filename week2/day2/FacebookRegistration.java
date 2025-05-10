package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.partialLinkText("Create")).click();
		driver.findElement(By.name("firstname")).sendKeys("Lionel");
		driver.findElement(By.name("lastname")).sendKeys("Joseph");
		WebElement bddd = driver.findElement(By.name("birthday_day"));
		Select select = new Select(bddd);
		select.selectByIndex(26);
		WebElement bmdd = driver.findElement(By.id("month"));
		Select select1 = new Select(bmdd);
		select1.selectByVisibleText("Aug");
		WebElement bydd = driver.findElement(By.id("year"));
		Select select2 = new Select(bydd);
		select2.selectByValue("1994");
		driver.findElement(By.xpath("//input[@value='2']")).click();
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9047861231");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Lion1234");
		driver.close();
				
		
	}

}
