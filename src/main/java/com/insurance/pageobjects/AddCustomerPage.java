package com.insurance.pageobjects;

import com.insurance.actiondriver.Action;
import com.insurance.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage extends BaseClass {
    WebDriver driver;

    public CustomerListPage customerListPage;

    Action action=new Action();

    public AddCustomerPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath = "//a[@href='/production/admin/add-customer']")
    private WebElement addCustomer;

    @FindBy(xpath = "//a[contains(@class,'btn btn-sm')]")
    private WebElement viewAllCustomers;

    @FindBy(id = "RBtn")
    private WebElement createCustomerButton;

    public AddCustomerPage addCustomerLink(){
        action.click(driver,addCustomer);
        return null;
    }

    public CustomerListPage viewAllCustomersMethod(){
        action.click(driver,viewAllCustomers);
        return customerListPage;
    }

    public Boolean createCustomerButtonisDisplayed(){
        return action.isDisplayed(driver,createCustomerButton);
    }



}
