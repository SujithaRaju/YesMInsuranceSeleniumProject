package com.insurance.pageobjects;

import com.insurance.actiondriver.Action;
import com.insurance.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;

public class DashboardPage extends BaseClass {

    Action action = new Action();

    WebDriver driver;

    public CustomerListPage customerListPage;
    public LoginPage loginPage;


    public DashboardPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//a[@href='/production/admin/list-customers'])[2]")
    private WebElement recentCustomerViewall;

    @FindBy(xpath = "(//a[@href='/production/admin/list-policy'])[3]")
    private WebElement recentPlolicyListViewall;

    @FindBy(xpath = "(//a[@href='/production/admin/list-quotes'])[2]")
    private WebElement recentRequestQuotesViewall;

    @FindBy(xpath = "(//a[@href='/production/admin/list-insurers'])[2]")
    private WebElement recentlyAddedInsurerViewall;

    @FindBy(xpath = "//a[contains(@class,'btn btn-sm')]")
    private WebElement addCustomer;

    @FindBy(xpath = "(//a[contains(@class,'btn btn-sm')])[2]")
    private WebElement listPolicy;

    @FindBy(xpath = "(//a[contains(@class,'btn btn-sm')])[3]")
    private WebElement addInsurer;

    @FindBy(xpath = "(//a[@class='nav-link'])[2]")
    private WebElement backDashboardbutton;

    @FindBy(xpath = "//img[@class='img-fluid']")
    private WebElement logo;

    @FindBy(id = "AdmSessLnk")
    private WebElement sighOut;


    public DashboardPage viewall() {
        action.click(driver, recentCustomerViewall);
        //Thread.sleep(1000);
        action.click(driver, backDashboardbutton);

        action.click(driver, recentPlolicyListViewall);
        //Thread.sleep(1000);

        action.click(driver, backDashboardbutton);

        action.click(driver, recentRequestQuotesViewall);
        action.click(driver, backDashboardbutton);
        action.click(driver, recentlyAddedInsurerViewall);
        action.click(driver, backDashboardbutton);
        action.click(driver, addCustomer);
        action.click(driver, backDashboardbutton);
        action.click(driver, listPolicy);
        action.click(driver, backDashboardbutton);
        action.click(driver, addInsurer);
        action.click(driver, backDashboardbutton);
        return null;
    }

    public LoginPage sighOutMethod(){
        action.click(driver,sighOut);
        return loginPage;
    }

    public Boolean Validatelogo() {
        action.isDisplayed(driver, logo);
        return true;
    }

}
