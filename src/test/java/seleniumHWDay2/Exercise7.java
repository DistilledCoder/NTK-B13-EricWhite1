package seleniumHWDay2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class Exercise7 extends Hooks{

	
	public static void main(String[] args) throws InterruptedException {
		
		setUp("edge");
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		
		WebElement linkToData = driver.findElement(By.cssSelector("a[href='org/openqa/selenium/package-summary.html']"));
		linkToData.click();
		
		WebElement alertLink = driver.findElement(By.cssSelector("a[href='Alert.html']"));
		alertLink.click();
		
		WebElement interfaceAlertText = driver.findElement(By.xpath("//h1[@title='Interface Alert']"));
		String actualAlertText = interfaceAlertText.getText();
		System.out.println(actualAlertText);
		
		String expextedAlertText = "Interface Alert";
		
		
		if (actualAlertText.equals(expextedAlertText)) {
			System.out.println("TESTCASE PASSED");
		}else {
			System.out.println("TESTCASE FAILED");
		}
		
		WebElement goToOverview = driver.findElement(By.xpath("//a[@href='../../../index.html']"));
		goToOverview.click();
		
		WebElement goToChrome = driver.findElement(By.xpath("//a[@href='org/openqa/selenium/chrome/package-summary.html']"));
		goToChrome.click();
		
		
		WebElement goToChromeDriver = driver.findElement(By.cssSelector("a[href='ChromeDriver.html']"));
		goToChromeDriver.click();
		
		Thread.sleep(2000);
		
		WebElement actialChromeDriverText = driver.findElement(By.cssSelector("h1[title='Class ChromeDriver']"));
		String ChromeText = actialChromeDriverText.getText();
		System.out.println(ChromeText);
		
		String expectedChromeText = ("Class ChromeDriver");
		
		if (ChromeText.equals(expectedChromeText)) {
			System.out.println("TESTCASE PASSED");
		}else {
			System.out.println("TESTCASE FAILED");
		}
	
		
		tearDown();
		
		
		
		
	}
}
