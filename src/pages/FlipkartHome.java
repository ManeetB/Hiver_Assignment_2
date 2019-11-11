package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class FlipkartHome {
	
	WebDriver driver;
	public FlipkartHome(WebDriver driver){

        this.driver = driver;

    }
	String phoneName = "iPhone 7 Plus";
	By flipkarrtSearchBox = By.xpath("//input[@title='Search for products, brands and more']");
	By flipkartSearchBtn = By.xpath("//button[@type='submit' and @class ='vh79eN']");
	
	
    //Search for iphone 7

    public void searchItem() throws InterruptedException{

    	driver.findElement(flipkarrtSearchBox).click();
    	driver.findElement(flipkarrtSearchBox).sendKeys(phoneName);
    	driver.findElement(flipkartSearchBtn).click();
    	Thread.sleep(1000);
    	
    }
	
}
