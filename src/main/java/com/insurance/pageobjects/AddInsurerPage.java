package com.insurance.pageobjects;

import com.insurance.actiondriver.Action;
import com.insurance.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddInsurerPage extends BaseClass {

    WebDriver driver;

    Action action=new Action();

    InsurersListPage insurersListPage=new InsurersListPage(driver);

    public AddInsurerPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[@href='/production/admin/add-insurer']")
    private WebElement addInsurer;

    @FindBy(xpath = "//a[contains(@class,'btn btn-sm')]")
    private WebElement viewAllInsurer;

    @FindBy(xpath = "//button[contains(@class,'btn btn-lg')]")
    private WebElement createInsurerButton;


    public InsurersListPage addInsurereMethod(){
        action.click(driver,addInsurer);
        return null;
    }

    public InsurersListPage viewAllInsurer(){
        action.click(driver,viewAllInsurer);
        return insurersListPage;
    }

    public boolean createInsurerButton(){
       return action.isDisplayed(driver,createInsurerButton);
    }
}
