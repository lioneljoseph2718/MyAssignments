package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateAccount {
public static void main(String[] args) {
	ChromeOptions options=new ChromeOptions();
	options.addArguments("guest");
	ChromeDriver driver = new ChromeDriver(options);
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().window().maximize();
	// String title = driver.getTitle();
	// System.out.println(title);
	driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.partialLinkText("CRM")).click();
	driver.findElement(By.linkText("Accounts")).click();
	driver.findElement(By.partialLinkText("Create")).click();
	driver.findElement(By.id("accountName")).sendKeys("Lionel");
	driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
	driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
	driver.findElement(By.id("numberEmployees")).sendKeys("10");
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
	driver.findElement(By.className("smallSubmit")).click();
	String title = driver.getTitle();
	System.out.println("Page title is: " + title);
	driver.close();
	
	
	
	

}
}
