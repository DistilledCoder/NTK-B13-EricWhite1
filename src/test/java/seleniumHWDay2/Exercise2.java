package seleniumHWDay2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


import utils.Hooks;

public class Exercise2 extends Hooks{

	public static void main(String[] args) throws InterruptedException {
		
		
		setUp("edge");
		
		//Navigate to Web Page
		driver.get("https://demo.guru99.com/test/newtours/");
		
		//Register Button
		WebElement registerButton = driver.findElement(By.linkText("REGISTER"));
		
		
		//Pause for 5 seconds
		Thread.sleep(5000);
		
		
		//Click Register Button
		registerButton.click();
		
		
		//Pause for 5 seconds
		Thread.sleep(5000);
		
		//Verify page title is Mercury Tours
		
		//Get Actual title
		WebElement titleReg = driver.findElement(By.xpath("//img[@alt='Mercury Tours']"));
		String actualTitle = titleReg.getText();
		
		System.out.println("Actual Title: " + actualTitle);	
		
		
		//Get expected Text in Header
		String expectedText = "Mercury Tours";
		System.out.println("Expected Title: " + expectedText);			
				
		//Verify Text in Header
		if (actualTitle.equals(expectedText)) {
				System.out.println("Title text VERIFIED");
		}else {
				System.out.println("Title text FAILED VERIFICATION");
				}
		
		//First Name Field
		WebElement firstNameField = driver.findElement(By.cssSelector("input[name='firstName']"));
		firstNameField.sendKeys("Uncle");
		
		//Last Name Field
		WebElement lastNameField = driver.findElement(By.cssSelector("input[name='lastName']"));
		lastNameField.sendKeys("Rico");
		
		//Phone Number
		WebElement phoneNumber = driver.findElement(By.cssSelector("input[name='phone']"));
		phoneNumber.sendKeys("618-555-5555");
		
		//Email
		WebElement email = driver.findElement(By.cssSelector("input[id='userName']"));
		email.sendKeys("ericiscool@coolguy.com");
		
		//Address
		WebElement address = driver.findElement(By.cssSelector("input[name='address1']"));
		address.sendKeys("123 Cool Guy Street");
		
		//City
		WebElement cityField = driver.findElement(By.cssSelector("input[name='city']"));
		cityField.sendKeys("Awesome");
		
		//State
		WebElement stateField = driver.findElement(By.cssSelector("input[name='state']"));
		stateField.sendKeys("California");
		
		//Postal Code
		WebElement postalCodeField = driver.findElement(By.cssSelector("input[name='postalCode']"));
		postalCodeField.sendKeys("01234");
		
		//Country from Dropdown
		WebElement countryDropdown = driver.findElement(By.cssSelector("select[name='country']"));
		
		Thread.sleep(2000);
		
		Select selectObj = new Select(countryDropdown);
		selectObj.selectByVisibleText("UNITED STATES");
		
		Thread.sleep(2000);
		
		
		//User Name
		WebElement userName = driver.findElement(By.cssSelector("input[id='email']"));
		userName.sendKeys("eRICaWESOME");
		
		
		//Password
		WebElement password = driver.findElement(By.cssSelector("input[name='password']"));
		password.sendKeys("LETMEIN");
		
		
		//Confirm Password
		WebElement confirmPassword = driver.findElement(By.cssSelector("input[name='confirmPassword']"));
		confirmPassword.sendKeys("LETMEIN");
		
		//Click Submit
		WebElement submitButton = driver.findElement(By.cssSelector("input[name='submit']"));
		submitButton.click();
		
		tearDown();
		
		


	}
}
