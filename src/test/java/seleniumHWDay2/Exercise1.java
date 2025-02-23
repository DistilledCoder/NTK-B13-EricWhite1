package seleniumHWDay2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class Exercise1 extends Hooks {

	public static void main(String[] args) throws InterruptedException {

		setUp("edge");

		// Navigate to Web Page
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		// Pause 5 seconds
		Thread.sleep(5000);

		// User Name Field
		WebElement usernameField = driver.findElement(By.name("username"));
		usernameField.sendKeys("admin");

		// Pause 5 seconds
		Thread.sleep(5000);

		// Password Field
		WebElement passwordField = driver.findElement(By.name("password"));
		passwordField.sendKeys("admin123");

		// Pause 5 seconds
		Thread.sleep(5000);

		// Locate login button using XPATH
		WebElement loginButton = driver
				.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));

		// Click login button
		loginButton.click();

		// Pause 5 seconds
		Thread.sleep(5000);

		// Retrieve header text and verify the header is Dashboard
		WebElement headerLine = driver.findElement(By.tagName("h6"));

		// Get Actual Text in Header
		String actualText = headerLine.getText();

		// Get expected Text in Header
		String expectedText = "Dashboard";

		// Verify Text in Header
		if (actualText.equals(expectedText)) {
			System.out.println("Dashboard text VERIFIED");
		} else {
			System.out.println("Dashboard text FAILED VERIFICATION");
		}

		// Close browser
		tearDown();

	}


}










