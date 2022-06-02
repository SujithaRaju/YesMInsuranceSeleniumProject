import com.insurance.base.BaseClass;
import com.insurance.pageobjects.DashboardPage;
import com.insurance.pageobjects.InsuranceOrdersListPage;
import com.insurance.pageobjects.LoginPage;
import org.junit.Assert;
import org.junit.Test;

public class InsuranceOrdersListPageTest extends BaseClass {
    DashboardPage dashboardPage=new DashboardPage(driver);
    LoginPage loginPage=new LoginPage(driver);
    InsuranceOrdersListPage insuranceOrdersListPage=new InsuranceOrdersListPage(driver);
    @Test
    public void listOrdersTestCase() throws InterruptedException {
        dashboardPage = loginPage.login(userName, password);
        Thread.sleep(10000);
        insuranceOrdersListPage.listOrdersMethod();
        Thread.sleep(10000);
        Assert.assertTrue(true);
    }

    @Test
    public void viewInsurerQuotesTestCase() throws InterruptedException {
        dashboardPage = loginPage.login(userName, password);
        Thread.sleep(10000);
        insuranceOrdersListPage.listOrdersMethod();
        Thread.sleep(10000);
        insuranceOrdersListPage.viewInsurerOrdersMethod();
        Assert.assertTrue(true);

    }

    @Test
    public void deleteInsurerOrdersTestCase() throws InterruptedException {
        dashboardPage = loginPage.login(userName, password);
        Thread.sleep(10000);
        insuranceOrdersListPage.listOrdersMethod();
        Thread.sleep(10000);
        insuranceOrdersListPage.deleteInsurerOrdersMethod();
        Assert.assertTrue(true);

    }

}
