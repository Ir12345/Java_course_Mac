package ru.stqa.pft.addressbook.appmanager;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.ArrayList;
import java.util.List;

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

  public void goToHomePage() {

    if (isElementPresent(By.id("maintable"))) {
      return;
    }
    click(By.linkText("home"));

  }

  public void selectContact(int index) {
    wd.findElements(By.name("selected[]")).get(index).click();

  }

  public void deleteSelectedContact() {
    click(By.xpath("//div[@id='content']/form[2]/div[2]/input"));
  }

  public void closeAlert() {
    wd.switchTo().alert().accept();
  }

  public void editContact() {

    wd.findElement(By.xpath("//tr[.]/td[8]")).click();

  }

  public void updateContact() {
    click(By.name("update"));
  }

  public void createContact(ContactData contact, boolean b) {
    fillContactForm(contact, true);
    submitContactForm();
    goToHomePage();
  }

  public boolean isThereAreContacts() {
    return isElementPresent(By.name("selected[]"));
  }

  public int getGroupCount() {
    return wd.findElements(By.name("selected[]")).size();
  }

  public List<ContactData> getContactList() {
    List<ContactData> contacts = new ArrayList<ContactData>();
    List<WebElement> elements = wd.findElements(By.xpath("//tr[@name='entry']"));
    for (WebElement element : elements) {
      String fname = element.findElement(By.cssSelector("tr:nth-child(n) > td:nth-child(3)")).getText();
      String lname = element.findElement(By.cssSelector("tr:nth-child(n) > td:nth-child(2)")).getText();
      //String id = element.findElement(By.tagName("input")).getAttribute("value");
      ContactData contact = new ContactData(fname, lname, null, null, null);
      contacts.add(contact);
    }
  return contacts;
  }
}
