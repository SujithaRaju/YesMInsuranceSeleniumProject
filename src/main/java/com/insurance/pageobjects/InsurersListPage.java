package com.insurance.pageobjects;

import com.insurance.actiondriver.Action;
import com.insurance.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InsurersListPage extends BaseClass {

    WebDriver driver;

    Action action=new Action();

    public InsurersListPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[@href='/production/admin/list-insurers']")
    private WebElement listinsurers;

    @FindBy(xpath = "(//a[contains(@class,'btn btn-sm')])[2]")
    private WebElement viewButton;

    @FindBy(xpath = "//tbody[@id='AInsList']/tr[4]/td[7]/div[1]/a[2]")
    private WebElement hideButton;

    @FindBy(xpath="(//a[@href='javascript:;'])[3]")
    private WebElement deleteButton;

    public InsurersListPage listinsurersMethod(){
       action.click(driver,listinsurers);
       return null;
    }

    public boolean viewButtonMethod(){
        return action.JSClick(driver,viewButton);

    }

    public boolean hideButtonMethod(){
        return action.JSClick(driver,hideButton);
    }

    public boolean deleteButtonMethod()
    {
        return action.JSClick(driver,deleteButton);
    }


}
