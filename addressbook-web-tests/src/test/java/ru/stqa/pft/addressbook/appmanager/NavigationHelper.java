package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationHelper {
    FirefoxDriver wd;

    public void gotoGroupPage() {
        wd.findElement(By.linkText("groups")).click();
    }
}
