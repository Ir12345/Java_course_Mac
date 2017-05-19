package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Irina on 5/19/17.
 */
public class SessionHelper extends BaseHelper {


  public SessionHelper(FirefoxDriver wd) {

    super(wd);
  }

  public void login(String user, String text) {
    type("user", user);
    type("pass", text);
    click(By.xpath("//form[@id='LoginForm']/input[3]"));

  }
}
