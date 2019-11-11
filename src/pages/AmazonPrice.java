package pages;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class AmazonPrice {
	
	WebDriver driver;
	public AmazonPrice(WebDriver driver){

        this.driver = driver;

    }

	By price = By.xpath("//div[@class='sg-row']//span[@class='a-price-whole']");
	
	
	
    //return the price

    public int getAmazonPrice() throws InterruptedException{
    	List<WebElement> pricenodes = (List<WebElement>) driver.findElements(price);
    	String amazonPrice = pricenodes.get(0).getText();
    	System.out.println("amazonPrice = "+ amazonPrice);
    	Thread.sleep(1000);
    	return Integer.parseInt(amazonPrice);
    }
	
    
}
