package com.insurance.pageobjects;

import com.insurance.actiondriver.Action;
import com.insurance.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerListPage extends BaseClass {

    public AddCustomerPage addCustomerPage;
    Action action=new Action();
    WebDriver driver;
    public CustomerListPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="(//a[@class='nav-link'])[3]")
    private WebElement customersList;

    @FindBy(xpath = "//a[contains(@class,'btn btn-sm')]")
    private  WebElement addCustomerbutton;

    public CustomerListPage customersListMethod(){
        action.click(driver,customersList);
        return null;
    }

    public AddCustomerPage addCustomerButtonisEnabled(){
        //action.click(driver,addCustomerbutton);
        action.isEnabled(driver,addCustomerbutton);
        return addCustomerPage;
    }





}
