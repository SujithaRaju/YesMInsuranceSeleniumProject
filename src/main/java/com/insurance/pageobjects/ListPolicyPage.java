package com.insurance.pageobjects;

import com.insurance.actiondriver.Action;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ListPolicyPage {

    WebDriver driver;

    public ListPolicyPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    Action action=new Action();

    @FindBy(xpath = "//a[@href='/production/admin/list-policy']")
    private WebElement visitListPolicyLink;

    @FindBy(xpath = "//a[contains(@class,'btn btn-sm')]")
    private WebElement policyLisitViewButton;

    @FindBy(xpath = "(//a[contains(@class,'btn btn-sm')])[2]")
    private WebElement policyListDelete;

    public ListPolicyPage visitListPolicyLinkMethod(){
        action.click(driver,visitListPolicyLink);
        return null;
    }

    public void policyLisitViewButtonMethod(){
       action.click(driver,policyLisitViewButton);
    }

    public void policyListDeleteMethod(){
        action.click(driver,policyListDelete);
    }
}
