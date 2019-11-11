package tests;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.AmazonHome;
import pages.FlipkartHome;
import pages.AmazonPrice;
import pages.FlipkartPrice;


public class ComparePriceValidation {

	WebDriver driver;
	AmazonHome objAmazonHome;
	FlipkartHome objFlipkartHome;
	AmazonPrice objAmazonPrice;
	FlipkartPrice objflipkartPrice;
	
    @BeforeTest

    public void setup(){

    	System.setProperty("webdriver.chrome.driver", "/Users/mbishla/WebDriver/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.amazon.in/");

    }
	
    @Test(priority=0)
    
	public void phonePrice() throws InterruptedException {
    	//Click on electronics and select samsung category
    	
    	
    	//Get Amazon Price
    	objAmazonHome = new AmazonHome(driver);
    	objAmazonHome.searchItem();
    	objAmazonPrice = new AmazonPrice(driver);
    	int amazonPrice = objAmazonPrice.getAmazonPrice();
    	
    	driver.get("https://www.flipkart.com/");
        //Escape key to ignore the pop up
        Actions action = new Actions(driver);
        action.sendKeys(Keys.ESCAPE);
        action.perform();
        
        
    	//Get Flipkart price
    	objFlipkartHome = new FlipkartHome(driver);
    	objFlipkartHome.searchItem();
    	objflipkartPrice = new FlipkartPrice(driver);
    	int flipkartPrice = objflipkartPrice.getFlipkartPrice();
    	
    	
    	if (amazonPrice < flipkartPrice) {
    		System.out.println("Price on amazon is less than flipkart");
    	}
    	else if(flipkartPrice < amazonPrice) {
    		System.out.println("Price on flipkart is less than Amazon");
    	}
    	else {
    		System.out.println("Price on amazon and flipkart are same");
    	}
    		
    	
    	

    	
    }
	
}
