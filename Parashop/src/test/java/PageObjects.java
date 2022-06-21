

	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


	public class PageObjects{
		
		  

				WebDriver driver;
		        
		        PageFactory Inscription;
		        
		
			
			public void launch (WebDriver driver){
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.navigate().to("https://www.parashop.tn/");
				driver.findElement(By.xpath("/html[1]/body[1]/div[4]/header[1]/div[1]/div[2]/div[3]/div[1]/div[1]/ul[1]/li[2]/a[1]")).click();
				WebElement frame=driver.findElement(By.xpath("/html/body/div[6]/div[1]/div/div/iframe"));
				driver.switchTo().frame(frame);
				driver.findElement(By.id("input-firstname")).sendKeys("jihene");
				driver.findElement(By.id("input-lastname")).sendKeys("saidene");
				driver.findElement(By.id("input-email")).sendKeys("test.academy9@yahoo.com");
				driver.findElement(By.id("input-telephone")).sendKeys("25888666");
				driver.findElement(By.id("input-password")).sendKeys("Test123");
				driver.findElement(By.id("input-confirm")).sendKeys("Test123");
				driver.findElement(By.xpath("/html/body/div[1]/form/div[2]/div/input")).click();
			}
			
			
	       public void Senregister() {
	    	   
	    	   Inscription.senregistrer.click();

	       }
				
					
			public void Name(String arg1) {
				
				
				Inscription.firstname.sendKeys(arg1);			
			}
			
			public void FamillyName(String arg2) {
				
				Inscription.lastname.sendKeys(arg2);
			}
			
	        public void email (String arg3) {
				
				Inscription.email.sendKeys(arg3);
			}
	        
	        public void telephone (String int1) {
				
				Inscription.telephone.sendKeys(int1);
			}
			
	        public void password (String arg4) {
				
				Inscription.password.sendKeys(arg4);
			}
	        
	        public void confirmpassword (String arg5) {
				
				Inscription.confirm.sendKeys(arg5);
			}
	        
	        public void Agree () {
				
				Inscription.agree.click();
			}
	        
	        public void continuer() {
	        	
	        	Inscription.continuer.click();
	        }
	        
	     
	}
	    


