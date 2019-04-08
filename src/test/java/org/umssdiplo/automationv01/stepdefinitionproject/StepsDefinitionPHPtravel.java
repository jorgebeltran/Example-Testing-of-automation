package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsDefinitionPHPtravel {
    private Login login;

    @Given("^'courses ultimate qa' page is loaded$")
    public void coursesultimateqaPageIsLoaded() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        login = LoadPage.loginPage();
    }
/*    #opcional
@When("^set my credentials on 'Login' page$")
    public void setMyCredentialsOnLoginPage() throws Throwable {
        login.setCredentials();
    }*/
}
