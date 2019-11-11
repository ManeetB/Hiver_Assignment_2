package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class AmazonHome {
	
	WebDriver driver;
	public AmazonHome(WebDriver driver){

        this.driver = driver;

    }
	String phoneName = " Apple iPhone 7 plus";
	By amazonSearchBox = By.xpath("//input[@id='twotabsearchtextbox']");
	By amazonSearchBtn = By.xpath("//input[@type='submit' and @value = 'Go']");
	
	
    //Search for iphone 7

    public void searchItem() throws InterruptedException{

    	driver.findElement(amazonSearchBox).click();
    	driver.findElement(amazonSearchBox).sendKeys(phoneName);
    	driver.findElement(amazonSearchBtn).click();
    	Thread.sleep(1000);
    	
    }
	
}
