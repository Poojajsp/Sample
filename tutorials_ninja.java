package numpy_ninja;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.FindBy;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

//commenting the code 2nd time
public class tutorials_ninja {
	
	public static void currency(WebDriver driver) throws InterruptedException
	
	{
		WebElement changecurrency = driver.findElement(By.xpath("//span[text()='Currency']"));
	changecurrency.click(); 
	WebElement changecurrency1= driver.findElement(By.xpath("//span[text()='Currency']/../..//button[@name='EUR']"));
	changecurrency1.click();
	}
	
	public static void canon(WebDriver driver) throws InterruptedException
	{
		WebElement addtocart = driver.findElement(By.xpath("//a[text()='Canon EOS 5D']/../../../div[3]//span"));
		
         addtocart.click();
         Thread.sleep(1000);
		WebElement selecterror = driver.findElement(By.xpath("//div[@class='form-group']/button[@id='button-cart']"));
			 selecterror.click();
		 Thread.sleep(1000);
			WebElement errormsg = driver.findElement(By.xpath("//div[@class='text-danger']"));
		System.out.println("Not able to add   " +errormsg.getText());
		
	}
	public static void iphone(WebDriver driver) throws InterruptedException
	{
		WebElement backhome = driver.findElement(By.xpath("//a[@href='http://tutorialsninja.com/demo/index.php?route=common/home']"));
		backhome.click(); 
		WebElement iphonedetails = driver.findElement(By.xpath("//a[text()='iPhone']"));
		iphonedetails.click();
		
		WebElement quantity= driver.findElement(By.id("input-quantity"));
		quantity.clear();
		quantity.sendKeys("2");
		
		WebElement addtocart = driver.findElement(By.xpath("//div[@class='form-group']/button[@id='button-cart']"));
		addtocart.click();
		
		System.out.println("---iphone successfully added to the cart");
		
		WebElement cart = driver.findElement(By.xpath("//span[@id='cart-total']"));
		cart.click();
		Thread.sleep(2000);
		WebElement viewcart = driver.findElement(By.xpath("//strong[text()=' View Cart']/.."));
		viewcart.click();
		Thread.sleep(2000);
		
		WebElement quantity1= driver.findElement(By.xpath("//div[@class='input-group btn-block']/input"));
		quantity1.clear();
		quantity1.sendKeys("3");
		
		WebElement update= driver.findElement(By.xpath("//i[@class='fa fa-refresh']/.."));
		update.click();
		
		
		
	}
	//Print the Eco tax and VAT Amount in console and click Checkout button
	public static void ECOtax(WebDriver driver) throws InterruptedException
	{
		
//		---------------------------------------
		WebElement Etax = driver.findElement(By.xpath("//td/strong[text()='Eco Tax (-2.00):']/../..//td[text()='4.71€']"));
		System.out.println("Ecotax=  " +Etax.getText());
		WebElement VAT = driver.findElement(By.xpath("//td/strong[text()='VAT (20%):']/../..//td[text()='47.55€']"));
		System.out.println("VAT=  " +VAT.getText());
		Thread.sleep(2000);
		WebElement checkout= driver.findElement(By.xpath("//a[text()='Checkout']"));
		checkout.click();
	
		WebElement errormsg = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
		System.out.println("Not able to continue   " +errormsg.getText());
		
	}
	//Move to the home screen and click on Mac book, check the default quantity is 1 and click add to cart then verify success message
	public static void Macbook(WebDriver driver) throws InterruptedException
	{
		WebElement backhome = driver.findElement(By.xpath("//a[@href='http://tutorialsninja.com/demo/index.php?route=common/home']"));
		backhome.click(); 
		WebElement macbook = driver.findElement(By.xpath("//a[text()='MacBook']"));
		macbook.click();
		WebElement quantity= driver.findElement(By.id("input-quantity"));
		quantity.equals(quantity);
		
		WebElement addtocart = driver.findElement(By.xpath("//div[@class='form-group']/button[@id='button-cart']"));
		addtocart.click();
		Thread.sleep(2000);
		WebElement success = driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
		System.out.println("---Macbook successfully added to the cart  --" +success.getText());
		
	}
	//Click on the shopping cart link in the top and apply ABCD123 as coupon code to check, print error message
	
	public static void coupon(WebDriver driver) throws InterruptedException
	{
		
		WebElement shoppingcart = driver.findElement(By.xpath("//span[text()='Shopping Cart']/.."));
		shoppingcart.click();
		Thread.sleep(1000);
		WebElement getcoupon = driver.findElement(By.xpath("//a[text()='Use Coupon Code ']"));
		getcoupon.click();
		Thread.sleep(1000);
		WebElement couponcode= driver.findElement(By.id("input-coupon"));
		couponcode.sendKeys("ABCD123");
		
		Thread.sleep(1000);
		WebElement applycode= driver.findElement(By.xpath("//input[@id='button-coupon']"));
		applycode.click();
		couponcode.clear();
		Thread.sleep(2000);
		WebElement errormsg = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
		System.out.println("  Error! " +errormsg.getText());
		
	}
	
	//Enter AXDFGH123 as gift certificate and perform apply to check, print error message
	public static void gift(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(1000);
		WebElement getcoupon = driver.findElement(By.xpath("//a[text()='Use Gift Certificate ']"));
		getcoupon.click();
	
		WebElement couponcode= driver.findElement(By.id("input-voucher"));
		couponcode.sendKeys("AXDFGH123");
		
		WebElement applycode= driver.findElement(By.xpath("//input[@id='button-voucher']"));
		applycode.click();
		Thread.sleep(1000);
		WebElement errormsg = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
		System.out.println("  Error! " +errormsg.getText());
		Thread.sleep(1000);
		
		
	}
	
	public static void nocoupon(WebDriver driver) throws InterruptedException
	{
		WebElement vcode= driver.findElement(By.id("input-voucher"));
		vcode.clear();
		Thread.sleep(1000);
		WebElement getcoupon1 = driver.findElement(By.xpath("//a[text()='Use Coupon Code ']"));
		getcoupon1.click();
		Thread.sleep(2000);
		WebElement chkout= driver.findElement(By.xpath("//a[text()='Checkout']"));
		chkout.click();
		
	}
	//Select register account option and enter all account and billing details, click continue
	
	public static void billing(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(1000);
		WebElement acct= driver.findElement(By.xpath("//span[@class='caret']"));
		acct.click();
		Thread.sleep(1000);
		WebElement reg= driver.findElement(By.xpath("//a[text()='Register']"));
		reg.click();
		WebElement fstnm= driver.findElement(By.id("input-firstname"));
		fstnm.sendKeys("user");
		WebElement lstnm= driver.findElement(By.id("input-lastname"));
		lstnm.sendKeys("name2");
		WebElement email= driver.findElement(By.id("input-email"));
		email.sendKeys("usr@name2.com");
		Thread.sleep(1000);
		WebElement ph= driver.findElement(By.id("input-telephone"));
		ph.sendKeys("9999999999");
		WebElement paswd= driver.findElement(By.id("input-password"));
		paswd.sendKeys("password");
		WebElement paswd1= driver.findElement(By.id("input-confirm"));
		paswd1.sendKeys("password");
		WebElement rad= driver.findElement(By.xpath("//label[@class='radio-inline'][2]"));
		rad.click();
		Thread.sleep(1000);
		WebElement agree= driver.findElement(By.xpath("//input[@name='agree']"));
		agree.click();
		Thread.sleep(1000);
		WebElement submit= driver.findElement(By.xpath("//input[@class='btn btn-primary']"));
		submit.click();	
		
		WebElement cntct= driver.findElement(By.xpath("//a[text()='Contact Us']"));
		cntct.click();	
		
		
		WebElement enquiry= driver.findElement(By.id("input-enquiry"));
		enquiry.sendKeys("is Mac currently available?");	
		Thread.sleep(1000);
		WebElement sub= driver.findElement(By.xpath("//input[@class='btn btn-primary']"));
		sub.click();	
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/Users/pooja/eclipse-workspace/Hello-selenium/src/test/resources/drivers/chromedriver.exe");
		
		
		ChromeOptions co = new ChromeOptions();
		co.setAcceptInsecureCerts(true);
		WebDriver chromedriver = new ChromeDriver(co);
		chromedriver.manage().window().maximize();
        chromedriver.get("http://tutorialsninja.com/demo/index.php");
		currency(chromedriver);
		canon(chromedriver);
		iphone(chromedriver);
		ECOtax(chromedriver);
		Macbook(chromedriver);
		coupon(chromedriver);
		gift(chromedriver);
		nocoupon(chromedriver);
		billing(chromedriver);
	}

}
