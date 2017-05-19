package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() {

    goToContactPage();
    fillContactForm(new ContactData("Irina", "Iva", "1234567890", "email@gmail.com"));
    submitContactForm();
    goToHomePage();
  }
}