package seleniumHWDay2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class Exercise3 extends Hooks{
	
	public static void main(String[] args) throws InterruptedException {
		
		setUp("edge");
		
		driver.get("https://demo.nopcommerce.com/");
		
		WebElement registerButton = driver.findElement(By.cssSelector("a[class='ico-register']"));
		registerButton.click();
		
		//Get Actual Title
		WebElement titleText = driver.findElement(By.xpath("//title[text()='nopCommerce demo store. Register']"));
		String actualTitle = titleText.getText();
		
		//Expected Title
		String expectedTitle = "nopCommerce demo store. Register";
		
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Title of page is VERIFIED");
		}else {
			System.out.println("Title of page is NOT VERIFIED");
		}
		
		Thread.sleep(2000);
		
		WebElement genderRadio = driver.findElement(By.cssSelector("input[id='gender-male']"));
		genderRadio.click();
		
		
		WebElement firstName = driver.findElement(By.cssSelector("input[data-val-required='First name is required.']"));
		firstName.sendKeys("Uncle");
		
		WebElement lastName = driver.findElement(By.cssSelector("input[data-val-required='Last name is required.']"));
		lastName.sendKeys("Rico");
		
		WebElement email = driver.findElement(By.cssSelector("input[id='Email']"));
		email.sendKeys("uncleRico@coolguy.com");
		
		WebElement newsletterCheck = driver.findElement(By.id("Newsletter"));
		newsletterCheck.click();
		
		
		WebElement password = driver.findElement(By.id("Password"));
		password.sendKeys("PleaseLetMeIn");
		
		
		WebElement confirmPassword = driver.findElement(By.id("ConfirmPassword"));
		confirmPassword.sendKeys("PleaseLetMeIn");
		
		WebElement finalRegisterButton = driver.findElement(By.name("register-button"));
		finalRegisterButton.click();
		
		WebElement completedRegistration = driver.findElement(By.xpath("//div[text()='Your registration completed']"));
		String actualRegMessage = completedRegistration.getText();
		
		String expectedRegMessage = "Your registration completed";
		
		if (actualRegMessage.equals(expectedRegMessage)) {
			System.out.println("TESTCASE PASSED");
		}else {
			System.out.println("TESTCASE FAILED");
		}
		
		
		
		Thread.sleep(7000);
		
		
		
		tearDown();
		
	}


	}


