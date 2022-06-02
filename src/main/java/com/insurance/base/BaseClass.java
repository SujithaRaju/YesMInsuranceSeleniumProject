package com.insurance.base;

import com.insurance.utillity.ReadConfig;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseClass {
   ReadConfig readConfig = new ReadConfig();

   public String baseUrl = readConfig.getBaseURl();
   public String userName = readConfig.getUsername();
   public String password = readConfig.getAdminPwd();
   public static WebDriver driver;

   @BeforeClass
   public static void setup() {

      System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers//chromedriver");

      driver = new ChromeDriver();
      driver.get("http://tanchan-001-site3.btempurl.com/production/admin/");
   }

   @AfterClass
   public static void tearDown() {
      driver.quit();
   }
}

