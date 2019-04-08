package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.umssdiplo.automationv01.core.managepage.Login.Login;

public class LoginStepdef {
    Login loginPage= new Login();

    @When("^set my credentials on 'Login' page$")
    public void setMyCredentialsOnLoginPage() throws Throwable {
        loginPage.setCredentials();
    }

    @And("^sign out$")
    public void signOff() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        loginPage.signOff();
    }
}
