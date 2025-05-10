package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateCRMAccount {
	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.partialLinkText("Create")).click();
		driver.findElement(By.id("accountName")).sendKeys("Joseph");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		WebElement inddd = driver.findElement(By.name("industryEnumId"));
		Select select = new Select(inddd);
		select.selectByIndex(3);
		WebElement ownershipdd = driver.findElement(By.name("ownershipEnumId"));
		Select select1 = new Select(ownershipdd);
		select1.selectByVisibleText("S-Corporation");
		WebElement sourcedd = driver.findElement(By.name("dataSourceId"));
		Select select2 = new Select(sourcedd);
		select2.selectByValue("LEAD_EMPLOYEE");
		WebElement marketcampaigndd = driver.findElement(By.id("marketingCampaignId"));
		Select select3 = new Select(marketcampaigndd);
		select3.selectByIndex(6);
		WebElement statedd = driver.findElement(By.id("generalStateProvinceGeoId"));
		//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", statedd);
		Select select4 = new Select(statedd);
		select4.selectByValue("TX");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		driver.findElement(By.className("smallSubmit")).click();
		String title = driver.getTitle();
		System.out.println("Page title is: " + title);
		driver.close();
		
		
	}

}
