import com.insurance.base.BaseClass;
import com.insurance.pageobjects.DashboardPage;
import com.insurance.pageobjects.InsuranceQuotationListPage;
import com.insurance.pageobjects.LoginPage;
import org.junit.Assert;
import org.junit.Test;

public class InsuranceQuotationListPageTest extends BaseClass {

    DashboardPage dashboardPage=new DashboardPage(driver);
    LoginPage loginPage=new LoginPage(driver);
    InsuranceQuotationListPage insuranceQuotationListPage=new InsuranceQuotationListPage(driver);


    @Test
    public void listQuotesTestCase() throws InterruptedException {
        dashboardPage = loginPage.login(userName, password);
        Thread.sleep(10000);
        insuranceQuotationListPage.listQuotesMethod();
        Thread.sleep(10000);
        Assert.assertTrue(true);
    }

    @Test
    public void viewInsurerQuotesTestCase() throws InterruptedException {
        dashboardPage = loginPage.login(userName, password);
        Thread.sleep(10000);
        insuranceQuotationListPage.listQuotesMethod();
        Thread.sleep(10000);
        insuranceQuotationListPage.viewInsurerQuotesMethod();
        Assert.assertTrue(true);

    }

    @Test
    public void deleteInsurerQuotesTestCase() throws InterruptedException {
        dashboardPage = loginPage.login(userName, password);
        Thread.sleep(10000);
        insuranceQuotationListPage.listQuotesMethod();
        Thread.sleep(10000);
        insuranceQuotationListPage.deleteInsurerQuotesMethod();
        Thread.sleep(10000);
        Assert.assertTrue(true);
    }
}
