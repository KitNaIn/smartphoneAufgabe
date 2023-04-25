package de.neufische;

import de.neufische.model.BusinessContact;
import de.neufische.model.Contact;
import de.neufische.model.Friend;
import de.neufische.model.Smartphone;
import jdk.internal.icu.text.UnicodeSet;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

    ArrayList<Contact> contactList = new ArrayList();

    /*

    Contact newContact1 = new Friend ("max", "0123465");
    Contact newContact2 = new Friend ("maxi", "01234657");
    Contact newContact3 = new Friend ("maxa", "01234658");
    Contact newContact4 = new Friend ("maxo", "01234659");
    Contact newContact5 = new Friend ("maxu", "01234650");
    Contact newContact6 = new Friend ("maxl", "012346510");
    contactList.add(newContact1);
    contactList.add(newContact2);
    contactList.add(newContact3);
    contactList.add(newContact4);
    contactList.add(newContact5);
    contactList.add(newContact6);

    System.out.println(contactList);

    Contact businessContact = new BusinessContact("Maximus","Tassimo");
    contactList.add(businessContact);

        System.out.println(businessContact);*/


     Smartphone Tranquilizer = new Smartphone("Model 9000","John Wick",contactList,"Köln");
     Tranquilizer.addContact(new Friend("Obi","0190666666"));
     Tranquilizer.addContact(new BusinessContact("Ralphonso","Umbrella"));

     // System.out.print(Tranquilizer);

        System.out.println(Tranquilizer.getContactByName("Ralphonso"));
        System.out.println(Tranquilizer.getContact(1));
        Tranquilizer.startRadio();


    }
}