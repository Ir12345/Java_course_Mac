package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.Comparator;
import java.util.List;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() {

    app.getNavigationHelper().goToHomePage();
    List<ContactData> before = app.getContactHelper().getContactList();
    System.out.println("this is before: " + before + before.size());
    app.getNavigationHelper().goToContactPage();
    ContactData contact = new ContactData("Iri", "I", "1234567890", "email@gmail.com", "test1");
    app.getContactHelper().fillContactForm(contact, true);
    app.getContactHelper().submitContactForm();
    app.getContactHelper().goToHomePage();
    List<ContactData> after = app.getContactHelper().getContactList();
    System.out.println("this is after: " + after + after.size());
    Assert.assertEquals(after.size(), before.size() + 1);

    before.add(contact);

    Comparator<? super ContactData> byId = (c1, c2) -> Integer.compare(c1.getId(), c2.getId());

    before.sort(byId);
    after.sort(byId);

    Assert.assertEquals(before, after);
  }
}