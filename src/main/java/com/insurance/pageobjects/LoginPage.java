package com.insurance.pageobjects;

import com.insurance.actiondriver.Action;
import com.insurance.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {

    Action action=new Action();

    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="AUser")
    private WebElement adminUserName;

    @FindBy(id = "APwd")
    private WebElement adminPassword;

    @FindBy(id = "ABtn")
    private WebElement signInButton;


    public DashboardPage login(String userName, String password) throws InterruptedException {
        action.click(driver,adminUserName);
        action.type(adminUserName,userName);

        action.click(driver,adminPassword);

        action.type(adminPassword,password);

        action.click(driver,signInButton);
        Thread.sleep(1000);
        DashboardPage dashboardPage=new DashboardPage(driver);
        return dashboardPage;
    }


}
