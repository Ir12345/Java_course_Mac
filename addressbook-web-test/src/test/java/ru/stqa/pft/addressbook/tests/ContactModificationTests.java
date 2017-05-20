package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

/**
 * Created by Irina on 5/19/17.
 */
public class ContactModificationTests extends TestBase {

  @Test
  public void testContactModification(){

    //app.getContactHelper().selectContact();
    //app.getNavigationHelper().goToHomePage();
    app.getContactHelper().editContact();
    app.getContactHelper().fillContactForm(new ContactData("Irina", "Iva", "1234567890","email@gmail.com"));
    app.getContactHelper().updateContact();
    app.getNavigationHelper().goToHomePage();
  }
}
