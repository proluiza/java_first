package ru.stqa.pft.testproject;


import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CreationOfMonitoringBased {
    FirefoxDriver wd;

    @BeforeMethod
    public void setUp() throws Exception {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.manage().window().maximize();
        wd.get("https://cas-askd-test.tengry.com/cas/login?service=http://askd-test.tengry.com/monitoring/shiro-cas");
        login();
    }

    private void login() {
        wd.findElement(By.id("username")).click();
        wd.findElement(By.id("username")).clear();
        wd.findElement(By.id("username")).sendKeys("MC_User");
        wd.findElement(By.id("password")).click();
        wd.findElement(By.id("password")).clear();
        wd.findElement(By.id("password")).sendKeys("Gfhjkm$123");
        wd.findElement(By.cssSelector("button.login-btn")).click();
    }

    @Test
    public void CreationOfMonitoringBased() {
        wd.findElement(By.id("button-2089-btnWrap")).click();
        wd.findElement(By.id("menuitem-2092-textEl")).click();
        wd.findElement(By.id("button-2704-btnInnerEl")).click();
        wd.findElement(By.cssSelector("a.logout-btn")).click();
    }

    @AfterMethod
    public void tearDown() {
        wd.quit();
    }

    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
