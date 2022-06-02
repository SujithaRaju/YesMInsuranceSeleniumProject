package com.insurance.pageobjects;

import com.insurance.actiondriver.Action;
import com.insurance.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InsuranceQuotationListPage extends BaseClass {

    WebDriver driver;

    Action action=new Action();

    public InsuranceQuotationListPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[@href='/production/admin/list-quotes']")
    private WebElement listQuotes;

    @FindBy(xpath="//a[contains(@class,'btn btn-sm')]")
    private WebElement viewInsurerQuotes;

    @FindBy(xpath="(//a[contains(@class,'btn btn-sm')])[2]")
    private WebElement deleteInsurerQuotes;

    public void listQuotesMethod(){
        action.click(driver,listQuotes);
    }

    public void viewInsurerQuotesMethod(){
        action.click(driver,viewInsurerQuotes);
    }

    public void deleteInsurerQuotesMethod(){
        action.click(driver,deleteInsurerQuotes);
    }
}
