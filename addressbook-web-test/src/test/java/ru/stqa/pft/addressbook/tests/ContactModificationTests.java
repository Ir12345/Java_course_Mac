package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

/**
 * Created by Irina on 5/19/17.
 */
public class ContactModificationTests extends TestBase {

  @Test
  public void testContactModification(){

    app.getNavigationHelper().goToHomePage();
    int before = app.getContactHelper().getGroupCount();
    if (!app.getContactHelper().isThereAreContacts()) {
      app.getNavigationHelper().goToContactPage();
      app.getContactHelper().createContact(new ContactData("Irina", "Iva", "1234567890", "email@gmail.com", "test1"), true);
    }
    app.getContactHelper().editContact();
    app.getContactHelper().fillContactForm(new ContactData("Irina", "Iva", "1234567890","email@gmail.com", null), false);
    app.getContactHelper().updateContact();
    app.getContactHelper().goToHomePage();
    int after = app.getContactHelper().getGroupCount();

    Assert.assertEquals(after, before);
  }
}
