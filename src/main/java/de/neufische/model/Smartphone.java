package de.neufische.model;

import java.util.ArrayList;

public class Smartphone implements Radio, GPS {

    private String model;
    private String manufacturer;
    private ArrayList<Contact> contacts;

    public Smartphone() {

    }

    public Smartphone(String model, String manufacturer, ArrayList<Contact> contacts) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.contacts = contacts;
        contacts = new ArrayList<Contact>();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }

    @Override
    public String getPosition() {
        return "Köln";
    }

    @Override
    public boolean startRadio() {
        System.out.println("Radio started");
        return true;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "model='" + model + '\'' +
                ",\n manufacturer='" + manufacturer + '\'' +
                ",\n contacts=" + contacts +
                '}';
    }

    @Override
    public boolean stopRadio() {
        System.out.println("Radio stopped");
        return false;
    }

    public void addContact(Contact contact) {
        this.contacts.add(contact);
    }

    Contact getContact(int index) {
        return this.contacts.get(index);
    }

    Contact getContactByName(String name) {
        for (Contact c : contacts) {
            if (c.getName().equals(name)) {
                return c;
            }
        }
        return null;
    }
}
