package seleniumHWDay2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class Exercise8 extends Hooks{

	public static void main(String[] args) throws InterruptedException {
		
		setUp("edge");
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		
		
		WebElement firstFrame = driver.findElement(By.id("singleframe"));
		driver.switchTo().frame(firstFrame);
		
		
		System.out.println("DONE");
		
		WebElement firstFrameTextBox = driver.findElement(By.xpath("//input[@type='text']"));
		firstFrameTextBox.sendKeys("Cool Eric is Accessing Iframe");
		
		Thread.sleep(2000);
		
		driver.switchTo().parentFrame();
		
		WebElement iframeWithin = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
		iframeWithin.click();
		
		Thread.sleep(2000);
		
		WebElement multiFrame = driver.findElement(By.cssSelector("iframe[src='MultipleFrames.html']"));
		driver.switchTo().frame(multiFrame);
		System.out.println("DONE");
		
		WebElement innerFrame = driver.findElement(By.cssSelector("section>div>div>iframe[src='SingleFrame.html']"));
		driver.switchTo().frame(innerFrame);
		
		WebElement innerTextBox = driver.findElement(By.cssSelector("input[type='text']"));
		innerTextBox.sendKeys("Iframe is easy");
		
		driver.switchTo().defaultContent();
		
		WebElement homeButton = driver.findElement(By.xpath("//a[text()='Home']"));
		homeButton.click();
		
		Thread.sleep(2000);
		
		WebElement pageTitleCheck = driver.findElement(By.xpath("//title[text()='Index']"));
		String titleTextCheck = pageTitleCheck.getText();
		System.out.println(titleTextCheck);
		
		
		String expectedTitleText = "Index";
		
		
		if (titleTextCheck.equals(expectedTitleText)) {
			System.out.println("TESTCASE PASSED");
		}else {
			System.out.println("TESTCASE FAILED");
		}
		
		
		tearDown();
		
		
	}
}
