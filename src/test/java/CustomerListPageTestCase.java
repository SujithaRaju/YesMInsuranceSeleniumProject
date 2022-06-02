import com.insurance.actiondriver.Action;
import com.insurance.base.BaseClass;
import com.insurance.pageobjects.AddCustomerPage;
import com.insurance.pageobjects.CustomerListPage;
import com.insurance.pageobjects.DashboardPage;
import com.insurance.pageobjects.LoginPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class CustomerListPageTestCase extends BaseClass {

    DashboardPage dashboardPage=new DashboardPage(driver);
    LoginPage loginPage=new LoginPage(driver);
    CustomerListPage customerListPage=new CustomerListPage(driver);
    AddCustomerPage addCustomerPage=new AddCustomerPage(driver);

    Action action=new Action();


    @Test
    public void customersListMethodTestCase() throws InterruptedException {
        dashboardPage=loginPage.login(userName,password);
        Thread.sleep(10000);
        customerListPage.customersListMethod();
        Thread.sleep(10000);
        String getUrl=action.getCurrentURL(driver);
       // System.out.println(getUrl);
        Assert.assertEquals("http://tanchan-001-site3.btempurl.com/production/admin/list-customers",getUrl);

    }

    @Test
    public void addCustomerButtonisenabledTestCase() throws InterruptedException {
        dashboardPage=loginPage.login(userName,password);
        Thread.sleep(10000);
        customerListPage.customersListMethod();
        Thread.sleep(10000);
        customerListPage.addCustomerButtonisEnabled();

       boolean defaultcontent= action.switchToDefaultFrame(driver);
     Assert.assertEquals(true,defaultcontent);
    }

}
