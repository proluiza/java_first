package ru.stqa.pft.addressbook.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ContactCreationTests {
    FirefoxDriver wd;
    
    @BeforeMethod
    public void setUp() throws Exception {
        System.setProperty("webdriver.gecko.driver","C:\\geckodriver\\geckodriver.exe");
        FirefoxDriver wd;
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("http://localhost/addressbook/");
        login(wd);

    }

    private void login(FirefoxDriver wd) {
        wd.findElement(By.id("LoginForm")).click();
        wd.findElement(By.name("user")).sendKeys("admin");;
        wd.findElement(By.name("pass")).click();
        wd.findElement(By.name("pass")).clear();
        wd.findElement(By.name("pass")).sendKeys("secret");
        wd.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();
    }

    @Test
    public void testContactCreationTests() {
        AddContact();
        FillingFiedls();
        returnToContactPage();
    }

    private void returnToContactPage() {
        wd.findElement(By.linkText("home page")).click();
    }

    private void FillingFiedls() {
        wd.findElement(By.name("firstname")).click();
        wd.findElement(By.name("theform")).click();
        wd.findElement(By.name("firstname")).click();
        wd.findElement(By.name("firstname")).clear();
        wd.findElement(By.name("firstname")).sendKeys("Ivan");
        wd.findElement(By.name("firstname")).click();
        wd.findElement(By.name("firstname")).clear();
        wd.findElement(By.name("firstname")).sendKeys("Ivan");
        wd.findElement(By.name("middlename")).click();
        wd.findElement(By.name("middlename")).clear();
        wd.findElement(By.name("middlename")).sendKeys("Ivanov");

        wd.findElement(By.name("address")).clear();
        wd.findElement(By.name("address")).sendKeys("street Shumilova hose 2 ");
        wd.findElement(By.name("address")).click();
        wd.findElement(By.name("home")).click();
        wd.findElement(By.name("home")).clear();
        wd.findElement(By.name("home")).sendKeys("703 698 56 32");
        if (!wd.findElement(By.xpath("//div[@id='content']/form/select[1]//option[10]")).isSelected()) {
            wd.findElement(By.xpath("//div[@id='content']/form/select[1]//option[10]")).click();
        }
        if (!wd.findElement(By.xpath("//div[@id='content']/form/select[2]//option[10]")).isSelected()) {
            wd.findElement(By.xpath("//div[@id='content']/form/select[2]//option[10]")).click();
        }
        wd.findElement(By.name("theform")).click();
        wd.findElement(By.name("byear")).click();
        wd.findElement(By.name("byear")).clear();
        wd.findElement(By.name("byear")).sendKeys("1985");
        wd.findElement(By.name("address2")).click();
        wd.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
    }

    private void AddContact() {
        wd.findElement(By.linkText("add new")).click();
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
