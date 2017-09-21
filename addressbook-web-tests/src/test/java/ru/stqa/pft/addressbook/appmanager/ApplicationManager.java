package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;



public class ApplicationManager {


    private final NavigationHelper navigationHelper = new NavigationHelper();
    private GroupHelper groupHelper;

    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
    public void init() {
        FirefoxDriver wd;
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("http://localhost/addressbook/group.php");
        groupHelper = new GroupHelper (wd);
        login("admin", "secret");
    }

    private void login(String username, String password) {
       navigationHelper.wd.findElement(By.name("user")).click();
       navigationHelper.wd.findElement(By.name("user")).clear();
       navigationHelper.wd.findElement(By.name("user")).sendKeys(username);
       navigationHelper.wd.findElement(By.name("pass")).click();
       navigationHelper.wd.findElement(By.name("pass")).clear();
       navigationHelper.wd.findElement(By.name("pass")).sendKeys(password);
       navigationHelper.wd.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();
    }

    public void stop() {
        navigationHelper.wd.quit();
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }
}
