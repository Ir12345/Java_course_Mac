package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() {

    app.getNavigationHelper().goToHomePage();
    int before = app.getContactHelper().getGroupCount();
    app.getNavigationHelper().goToContactPage();
    app.getContactHelper().fillContactForm(new ContactData("Irina", "Iva", "1234567890", "email@gmail.com", "test1"), true);
    app.getContactHelper().submitContactForm();
    app.getContactHelper().goToHomePage();
    int after = app.getContactHelper().getGroupCount();

    Assert.assertEquals(after, before + 1);
  }
}