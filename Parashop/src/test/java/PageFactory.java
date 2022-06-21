import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageFactory {


	WebDriver driver;
	
	public PageFactory (WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	




	@FindBy (how=How.XPATH, using= "//a[contains(@href,'javascript:open_register_popup()')]")
	WebElement senregistrer ;
	
	@FindBy (how=How.CLASS_NAME, using="firstname")
	WebElement firstname ;
	
	@FindBy (how=How.CLASS_NAME, using="lastname")
	WebElement lastname ;
  
	@FindBy (how=How.CLASS_NAME, using="email")
	WebElement email ;
    
	@FindBy (how=How.CLASS_NAME, using="telephone")
	WebElement telephone ;
    
	@FindBy (how=How.CLASS_NAME, using="password")
	WebElement password ;
	
	@FindBy (how=How.CLASS_NAME, using="confirm")
	WebElement confirm ;
    
	@FindBy (how=How.CLASS_NAME, using="agree")
	WebElement agree ;
    
	@FindBy (how=How.CLASS_NAME, using="btn btn-primary")
	WebElement continuer ;
	


}

