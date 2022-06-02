import com.insurance.actiondriver.Action;
import com.insurance.base.BaseClass;
import com.insurance.pageobjects.DashboardPage;
import com.insurance.pageobjects.ListPolicyPage;
import com.insurance.pageobjects.LoginPage;
import org.junit.Assert;
import org.junit.Test;

public class ListPolicyPageTest extends BaseClass {

    DashboardPage dashboardPage=new DashboardPage(driver);
    LoginPage loginPage=new LoginPage(driver);
    ListPolicyPage listPolicyPage=new ListPolicyPage(driver);

    Action action=new Action();

    @Test
    public void visitListPolicyLinkTestCase() throws InterruptedException {
        dashboardPage = loginPage.login(userName, password);
        Thread.sleep(10000);
        listPolicyPage.visitListPolicyLinkMethod();
        Thread.sleep(10000);
        String getTitle=action.getTitle(driver);
        //System.out.println(getTitle);
        Assert.assertEquals("Insurance Policy List | Yes-M Systems",getTitle);
    }

    @Test
    public void policyLisitViewButtonTestCase() throws InterruptedException {
        dashboardPage = loginPage.login(userName, password);
        Thread.sleep(10000);
        listPolicyPage.visitListPolicyLinkMethod();
        Thread.sleep(10000);
        listPolicyPage.policyLisitViewButtonMethod();
        Assert.assertTrue(true);
    }

    @Test
    public void policyListDeleteTestCase() throws InterruptedException {
        dashboardPage = loginPage.login(userName, password);
        Thread.sleep(10000);
        listPolicyPage.visitListPolicyLinkMethod();
        Thread.sleep(10000);
        listPolicyPage.policyListDeleteMethod();
        Assert.assertTrue(true);
    }


}
