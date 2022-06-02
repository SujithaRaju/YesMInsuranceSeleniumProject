import com.insurance.actiondriver.Action;
import com.insurance.base.BaseClass;
import com.insurance.pageobjects.AddCustomerPage;
import com.insurance.pageobjects.DashboardPage;
import com.insurance.pageobjects.LoginPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class AddCustomerPageTestCase extends BaseClass {

    DashboardPage dashboardPage=new DashboardPage(driver);
    LoginPage loginPage=new LoginPage(driver);
    AddCustomerPage addCustomerPage=new AddCustomerPage(driver);

    Action action=new Action();


    @Test
    public void addcustomerLinkTestCase() throws InterruptedException {
        dashboardPage=loginPage.login(userName,password);
        Thread.sleep(10000);
        addCustomerPage.addCustomerLink();
        boolean defaultContent=action.switchToOldWindow(driver);
        Assert.assertEquals(action.switchToDefaultFrame(driver),defaultContent);

    }

    @Test
    public void viewAllCustomersMethodTestCase() throws InterruptedException {
        dashboardPage=loginPage.login(userName,password);
        Thread.sleep(10000);
        addCustomerPage.addCustomerLink();
        Thread.sleep(10000);
        addCustomerPage.viewAllCustomersMethod();
       String getTitle= action.getTitle(driver);
        Assert.assertEquals(driver.getTitle(),getTitle);
    }

    @Test
    public void createCustomerButtonisDisplayedTestCse() throws InterruptedException {
        dashboardPage=loginPage.login(userName,password);
        Thread.sleep(10000);
        addCustomerPage.addCustomerLink();
        Thread.sleep(10000);
        addCustomerPage.createCustomerButtonisDisplayed();
        Assert.assertTrue(true);
    }
}
