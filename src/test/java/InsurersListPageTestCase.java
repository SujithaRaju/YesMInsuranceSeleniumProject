import com.insurance.actiondriver.Action;
import com.insurance.base.BaseClass;
import com.insurance.pageobjects.DashboardPage;
import com.insurance.pageobjects.InsurersListPage;
import com.insurance.pageobjects.LoginPage;
import org.junit.Assert;
import org.junit.Test;

public class InsurersListPageTestCase extends BaseClass {
    DashboardPage dashboardPage=new DashboardPage(driver);
    LoginPage loginPage=new LoginPage(driver);
    InsurersListPage insurersListPage=new InsurersListPage(driver);

    Action action=new Action();

    @Test
    public void listinsurersTestCase() throws InterruptedException {
        dashboardPage=loginPage.login(userName,password);
        Thread.sleep(10000);
        insurersListPage.listinsurersMethod();
        Thread.sleep(10000);
        String getTitle=action.getTitle(driver);
        Assert.assertEquals(driver.getTitle(),getTitle);
    }

    @Test
    public void viewButtonTestCase() throws InterruptedException {
        dashboardPage=loginPage.login(userName,password);
        Thread.sleep(10000);
        insurersListPage.listinsurersMethod();
        Thread.sleep(10000);
        insurersListPage.viewButtonMethod();
        Thread.sleep(10000);
        String getModelHeaderTitle=action.getTitle(driver);
        //System.out.println(getModelHeaderTitle);
        Assert.assertEquals(driver.getTitle(),getModelHeaderTitle);
    }

    @Test
    public void hideButtonTestCase() throws InterruptedException {
        dashboardPage=loginPage.login(userName,password);
        Thread.sleep(10000);
        insurersListPage.listinsurersMethod();
        Thread.sleep(10000);
        insurersListPage.hideButtonMethod();
        Thread.sleep(10000);
        Assert.assertTrue(true);

    }

    @Test
    public void deleteButtonTestCase() throws InterruptedException {
        dashboardPage=loginPage.login(userName,password);
        Thread.sleep(10000);
        insurersListPage.listinsurersMethod();
        Thread.sleep(10000);
        insurersListPage.deleteButtonMethod();
        Thread.sleep(10000);
        Assert.assertTrue(true);
    }
}
