package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;




/**
 * Created by Irina on 5/19/17.
 */
public class BaseHelper {
  protected WebDriver wd;

  public BaseHelper(WebDriver wd) {
    this.wd = wd;
  }

  protected void type(String locator, String text) {
    click(By.name(locator));
    if (text != null) {
      String existingText = wd.findElement(By.name(locator)).getAttribute("value");
      if (!text.equals(existingText)) {
        wd.findElement(By.name(locator)).clear();
        wd.findElement(By.name(locator)).sendKeys(text);
      }
    }
  }

  protected void click(By locator) {
    wd.findElement(locator).click();
  }

  public boolean isAlertPresent() {
    try {
      wd.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  protected boolean isElementPresent(By locator) {

    try {
      wd.findElement(locator);
      return true;

    } catch (NoSuchElementException ex) {
      return false;

    }
  }
}
