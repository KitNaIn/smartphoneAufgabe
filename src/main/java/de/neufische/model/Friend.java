package de.neufische.model;

public class Friend extends Contact {
    private String phoneNumber;

    public Friend(){
        super();

    }

    public Friend(String name, String phoneNumber) {
        super(name);

        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", name='" + getName() + '\'' +
                "} ";
    }
}
