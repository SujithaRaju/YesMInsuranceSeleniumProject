import com.insurance.actiondriver.Action;
import com.insurance.base.BaseClass;
import com.insurance.pageobjects.AddInsurerPage;
import com.insurance.pageobjects.DashboardPage;
import com.insurance.pageobjects.InsurersListPage;
import com.insurance.pageobjects.LoginPage;
import org.junit.Assert;
import org.junit.Test;

public class AddInsurerPageTestCase extends BaseClass {

    Action action=new Action();

    DashboardPage dashboardPage = new DashboardPage(driver);
    LoginPage loginPage = new LoginPage(driver);
    InsurersListPage insurersListPage=new InsurersListPage(driver);
    AddInsurerPage addInsurerPage=new AddInsurerPage(driver);

    @Test
    public void addInsurereTestCase() throws InterruptedException {
        dashboardPage = loginPage.login(userName, password);
        Thread.sleep(10000);
        addInsurerPage.addInsurereMethod();
        String getTitle=action.getTitle(driver);
        //System.out.println(getTitle);
        if(getTitle.equals("Add New Insurer | Yes-M Systems")){
            Assert.assertTrue(true);
        }else
        {
            Assert.assertFalse(false);
        }
    }

    @Test
    public void viewAllInsurerTestCase() throws InterruptedException {
        dashboardPage = loginPage.login(userName, password);
        Thread.sleep(10000);
        addInsurerPage.viewAllInsurer();
        String getTitle=action.getTitle(driver);
        //System.out.println(getTitle);
        Assert.assertEquals(driver.getTitle(),getTitle);
    }

    @Test
    public void createInsurerButton() throws InterruptedException {
        dashboardPage = loginPage.login(userName, password);
        Thread.sleep(10000);
        addInsurerPage.viewAllInsurer();
        Thread.sleep(10000);
        addInsurerPage.createInsurerButton();
        Assert.assertTrue(true);
    }
}

