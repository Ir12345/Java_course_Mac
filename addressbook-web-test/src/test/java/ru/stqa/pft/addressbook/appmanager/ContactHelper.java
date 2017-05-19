package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.ContactData;

/**
 * Created by Irina on 5/19/17.
 */
public class ContactHelper extends BaseHelper {


  public ContactHelper(FirefoxDriver wd) {

    super(wd);
  }

  public void submitContactForm() {
    click(By.xpath("//div[@id='content']/form/input[21]"));

  }

  public void fillContactForm(ContactData contactData) {
    type("firstname",contactData.getFirstname());
    type("lastname",contactData.getLastname());
    type("mobile",contactData.getMobilephone());
    type("email", contactData.getEmail());

  }
}
