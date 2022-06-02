package com.insurance.pageobjects;

import com.insurance.actiondriver.Action;
import com.insurance.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InsuranceOrdersListPage extends BaseClass {

    WebDriver driver;
    Action action=new Action();

    public InsuranceOrdersListPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[@href='/production/admin/list-orders']")
    private WebElement listOrders;

    @FindBy(xpath="//a[contains(@class,'btn btn-sm')]")
    private WebElement viewInsurerOrders;

    @FindBy(xpath="(//a[contains(@class,'btn btn-sm')])[2]")
    private WebElement deleteInsurerOrders;

    public void listOrdersMethod(){
        action.click(driver,listOrders);
    }

    public void viewInsurerOrdersMethod(){
        action.click(driver,viewInsurerOrders);
    }

    public void deleteInsurerOrdersMethod(){
        action.click(driver,deleteInsurerOrders);
    }
}
