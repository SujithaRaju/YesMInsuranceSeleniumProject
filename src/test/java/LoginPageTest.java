import com.insurance.actiondriver.Action;
import com.insurance.base.BaseClass;
import com.insurance.pageobjects.DashboardPage;
import com.insurance.pageobjects.LoginPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.Properties;


public class LoginPageTest extends BaseClass {

    public DashboardPage dashboardPage;
    Action action = new Action();

    @Test
    public void loginTestCase() throws Throwable {
        driver.get(baseUrl);
        Thread.sleep(1000);
        LoginPage loginPage = new LoginPage(driver);
        dashboardPage = loginPage.login(userName, password);
        String getURL = action.getCurrentURL(driver);
        if (getURL.equals("http://tanchan-001-site3.btempurl.com/production/admin/")) {
            System.out.println("loggin success");
            Assert.assertTrue(true);
        } else {
            System.out.println("URL is Wrong, Cannot logging in.");
            Assert.assertFalse(false);
        }

        if (action.getTitle(driver).equals("Admin | Insurance Application Testing | Yes-M Systems")) {
            Assert.assertTrue("Title is correct", true);
        } else {
            Assert.assertFalse("Please enter correct URL", false);
        }
    }


}
