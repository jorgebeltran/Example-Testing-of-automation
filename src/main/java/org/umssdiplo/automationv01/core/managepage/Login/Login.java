package org.umssdiplo.automationv01.core.managepage.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.umssdiplo.automationv01.core.customwebdriver.ManageDriver;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

public class Login extends BasePage {

    @FindBy(name = "user[email]")
    private WebElement usernameInputField;
    //input[@name='user[email]']
    @FindBy(name = "user[password]")
    private WebElement passwordInputField;
    //input[@name='user[password]']
    @FindBy(id = "btn-signin")
    private WebElement loginBoton;
    //input[@id='btn-signin']
    @FindBy(xpath = "//p[text()='Signed in successfully.']")
    private WebElement messeger;
    @FindBy(xpath ="//a[@id='my_account']")
    private  WebElement account;
    @FindBy(xpath = "//ul[@class='dropdown-menu']/li/a[contains(text(),'Sign Out')]")
    private WebElement signout;

    public void setCredentials() {
        String username = PropertyAccessor.getInstance().getUser();
        String password = PropertyAccessor.getInstance().getPassword();
        CommonEvents.setInputField(usernameInputField, username);
        CommonEvents.setInputField(passwordInputField, password);
        CommonEvents.clickButton(loginBoton);
    }

    public void signOff() {
        WebDriverWait wait = new WebDriverWait(webDriver, 60);
        wait.until(ExpectedConditions.invisibilityOf(messeger));
        CommonEvents.clickButton(account);
        CommonEvents.clickButton(signout);

    }

}
