package stepDefs;

import base.TargetLogin;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class TargetStepDef {

	TargetLogin tl = new TargetLogin();
	
	@Given("^open Target browser$")
	public void openingBrowser() {
		tl.openTargetBrowser();
	}
	
	@And("^Login and Logout$")
	public void loginLogout() {
		
		tl.logged();
	}
	
	@Then("^close this browser$")
	public void cBrowser() {
		tl.closeupBroswer();
	}
}
