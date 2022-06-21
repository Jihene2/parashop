import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Parashop {
	WebDriver driver;
	PageObjects PO = new PageObjects();


@Given("Browser is open")
public void browser_is_open() {
       PO.launch(driver);
	
}

@And("User clicks on s enregistrer")
public void user_clicks_on_s_enregistrer() {
	
         PO.Senregister();
}

@When("^User enter name (.*)$")
public void user_enter_name(String arg1) {
	
	     PO.Name(arg1);
    
}

@And("^Enter familly name(.*)$")
public void enter_Familly_name(String arg2) {
	
         PO.FamillyName(arg2);
}

@And("^Enter email (.*)$")
public void enter_Email(String arg3) {
	
	PO.email(arg3);
   
}

@And("^Enter telephone(.*)$")
public void enter_telephone(String int1) {
     PO.telephone(int1);
}

@And("^Enter password (.*)$")
public void enter_password(String arg4) {
	
	PO.password(arg4);

}
@And("^Enter confirm password (.*)$")
public void enter_Confirm_password(String arg5) {
	
    PO.confirmpassword(arg5);
}

@And("clicks on accept legal mentions")
public void clicks_on_accept_legal_mentions() {
	
	PO.Agree();

}

@And("clicks on continuer")
public void clicks_on_continuer() {
	
	PO.continuer();
  
}

@Then("User is signed in on the website")
public void user_is_signed_in_on_the_website() {
    
}
}
