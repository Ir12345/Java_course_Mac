package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() {

    app.getNavigationHelper().goToContactPage();
    app.getContactHelper().fillContactForm(new ContactData("Irina", "Iva", "1234567890", "email@gmail.com"));
    app.getContactHelper().submitContactForm();
    app.getNavigationHelper().goToHomePage();
  }
}