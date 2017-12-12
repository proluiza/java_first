package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class ContactHelper {
            FirefoxDriver wd;

    @BeforeMethod
    public void setUp() throws Exception {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("http://localhost/addressbook/group.php");




    @Test
    public void testContactCreation()  {
            app.getNavigationHelper().gotoContactPage();
            app.getContactHelper().initContactCreation();
            app.getContactHelper().fillContactForm(new ContactData("Иван", "Петров", "Агент", "7 999 999 99 99", "ivanov@ivan.ru"));
            app.getContactHelper().submitContactCreation();
            app.getContactHelper().returnToContactPage();
    }



    @AfterMethod
    public void tearDown() {
        wd.quit();
    }
}
