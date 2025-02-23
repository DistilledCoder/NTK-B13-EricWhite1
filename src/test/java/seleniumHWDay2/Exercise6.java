package seleniumHWDay2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class Exercise6 extends Hooks{

	
	public static void main(String[] args) throws InterruptedException {
		
		
		setUp("edge");
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		WebElement titleText = driver.findElement(By.xpath("//title[text() = 'Alerts']"));
		String actualTitle = titleText.getText();
		
		Thread.sleep(4000);
		
		System.out.println("Actual Title: " + actualTitle);
		
		String expectedTitle = "Alerts";
		
		System.out.println("Expected Title: " + expectedTitle);
		
		
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Title is VERIFIED");
		}else {
			System.out.println("Title is NOT VERIFIED");
		}
		
		WebElement alertButton = driver.findElement(By.cssSelector("a[href='#Textbox']"));
		alertButton.click();
		
		
		WebElement alertWithTextButton = driver.findElement(By.cssSelector("button[class='btn btn-info']"));
		alertWithTextButton.click();
		
		Alert alert = driver.switchTo().alert();
		
		alert.sendKeys("Uncle Rico");
		
		Thread.sleep(5000);
		
		alert.accept();
		
		Thread.sleep(5000);
		
		WebElement alertText = driver.findElement(By.cssSelector("p[id='demo1']"));
		String actualAlertText = alertText.getText();
		System.out.println(actualAlertText);
		
		
		if (actualAlertText.contains("How are you today")) {
			System.out.println("Verified - prompt box contains 'How are you today'");
		}else {
			System.out.println("CANNOT VARIFY prompt box contains 'How are you today'");
		}
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		WebElement alertWithOkCancelButton = driver.findElement(By.cssSelector("a[href='#CancelTab']"));
		alertWithOkCancelButton.click();
		
		WebElement alertDisplayBox = driver.findElement(By.cssSelector("button[class='btn btn-primary']"));
		alertDisplayBox.click();
		
		Thread.sleep(2000);
		
		Alert confirmAlertText = driver.switchTo().alert();
		String secondAlertText = confirmAlertText.getText();
		System.out.println(secondAlertText);
		
		
		
		if (secondAlertText.contains("Press a Button !")) {
			alert.dismiss();
		}else {
			alert.accept();
		}
		
		WebElement youPressed = driver.findElement(By.cssSelector("p[id='demo']"));
		String youPressedText = youPressed.getText();
		System.out.println(youPressedText);
		
		if (youPressedText.contains("You Pressed")) {
			System.out.println("Click the button to display a confirm box contains 'You Pressed'");
		}else {
			System.out.println("Click the button to display a confirm box DOES NOT CONTAIN 'You Pressed'");
		}
		
		
		tearDown();
	}
}
