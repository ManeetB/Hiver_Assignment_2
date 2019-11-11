package pages;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class FlipkartPrice {
	
	WebDriver driver;
	public FlipkartPrice(WebDriver driver){

        this.driver = driver;

    }

	By price = By.xpath("//div[@data-id='MOBEMK6289R7UFQH']//div[@class='_1vC4OE _2rQ-NK']");
	
	
	
    //return the price

    public int getFlipkartPrice() throws InterruptedException{
    	 WebElement priceElement = driver.findElement(price);
    	String Price = priceElement.getText();
    	Thread.sleep(1000);
    	return Integer.parseInt(Price);
    }
	
    
}
