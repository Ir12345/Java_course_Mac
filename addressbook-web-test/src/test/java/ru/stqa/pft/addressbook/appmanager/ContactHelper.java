package ru.stqa.pft.addressbook.appmanager;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Assert.*;
import ru.stqa.pft.addressbook.model.ContactData;

/**
 * Created by Irina on 5/19/17.
 */
public class ContactHelper extends BaseHelper {


  public ContactHelper(WebDriver wd) {

    super(wd);
  }

  public void submitContactForm() {
    click(By.xpath("//div[@id='content']/form/input[21]"));

  }

  public void fillContactForm(ContactData contactData, boolean creation) {
    type("firstname", contactData.getFirstname());
    type("lastname", contactData.getLastname());
    type("mobile", contactData.getMobilephone());
    type("email", contactData.getEmail());

    if (creation) {
      new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
    }
    else {
      Assert.assertFalse(isElementPresent(By.name("new_group")));
    }
  }


  public void selectContact() {
    click(By.name("selected[]"));
  }

  public void deleteSelectedContact() {
    click(By.xpath("//div[@id='content']/form[2]/div[2]/input"));
  }

  public void closeAlert() {
    wd.switchTo().alert().accept();
  }

  public void editContact() {
    click(By.cssSelector("img[alt='Edit']"));
  }

  public void updateContact() {
    click(By.name("update"));
  }
}

