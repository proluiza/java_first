package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SessionHelper extends  HelperBase{
    private FirefoxDriver wd;

    public SessionHelper(FirefoxDriver wd) {

       super(wd);
    }

    public void login(WebDriver wd, String username, String password) {
        type(By.name("user"), username);
        type(By.name("user"), password);
        click(By.xpath("//form[@id='LoginForm']/input[3]"));
    }
}
