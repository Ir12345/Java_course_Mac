package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Irina on 5/19/17.
 */
public class NavigationHelper {
   private FirefoxDriver wd;

  public NavigationHelper(FirefoxDriver wd) {

    this.wd = wd;
  }

  public void goToGroupPage() {
    wd.findElement(By.linkText("groups")).click();
  }

  public void goToHomePage() {
    wd.findElement(By.linkText("home")).click();
  }

  public void goToContactPage() {
    wd.findElement(By.linkText("add new")).click();
  }
}
