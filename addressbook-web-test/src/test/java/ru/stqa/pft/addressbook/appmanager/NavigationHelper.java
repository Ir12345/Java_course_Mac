package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Irina on 5/19/17.
 */
public class NavigationHelper extends BaseHelper {


  public NavigationHelper(FirefoxDriver wd) {

    super(wd);
  }

  public void goToGroupPage() {
    click(By.linkText("groups"));

  }

  public void goToHomePage() {
    click(By.linkText("home"));

  }

  public void goToContactPage() {
    click(By.linkText("add new"));

  }
}