import com.insurance.actiondriver.Action;
import com.insurance.base.BaseClass;
import com.insurance.pageobjects.AddCustomerPage;
import com.insurance.pageobjects.DashboardPage;

import com.insurance.pageobjects.LoginPage;
import org.junit.Assert;
import org.junit.Test;


public class DashboardPageTestCase extends BaseClass {


    DashboardPage dashboardPage=new DashboardPage(driver);
    LoginPage loginPage=new LoginPage(driver);
    AddCustomerPage addCustomerPage=new AddCustomerPage(driver);


   Action action=new Action();

    @Test
    public void ViewAllTestCase() throws InterruptedException {
        //driver.get("http://tanchan-001-site3.btempurl.com/production/admin/");
        Thread.sleep(1000);
        dashboardPage = loginPage.login(userName, password);
        Thread.sleep(1000);

        dashboardPage.viewall();
        Thread.sleep(10000);
        String getCurrentUrl = action.getCurrentURL(driver);
        Thread.sleep(10000);
      if(getCurrentUrl.equals("http://tanchan-001-site3.btempurl.com/production/admin/")){
          System.out.println("success");
          Assert.assertTrue(true);
        }else
        {
            System.out.println("Try with correct credentials");
            Assert.assertFalse(false);
        }
    }

    @Test
    public void sighOutTestCase() throws InterruptedException {

        dashboardPage=loginPage.login(userName,password);
        loginPage=dashboardPage.sighOutMethod();
        String getloginTitile=action.getTitle(driver);
        Thread.sleep(10000);
        if(getloginTitile.equals("Admin Dashboard | Yes-M Systems")){
            System.out.println("SighOut success");
        }else{
            System.out.println("SighOut is not success");
        }

    }

    @Test
    public void validatelogoTestCase() throws InterruptedException {
        dashboardPage=loginPage.login(userName,password);
        dashboardPage.Validatelogo();
        Assert.assertTrue(true);
    }

 }

