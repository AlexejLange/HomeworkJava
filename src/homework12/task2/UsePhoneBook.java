package homework12.task2;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class UsePhoneBook {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContacts("Smith", "838747783");
        phoneBook.addContacts("Johnson", "868833567");
        phoneBook.addContacts("Simpson", "876547994");
        phoneBook.addContacts("McDavid", "893260977");
        phoneBook.addContacts("Jordan", "8098465245");
        System.out.println(phoneBook);
        phoneBook.addContacts("Simpson", "8809548764");
        phoneBook.addContacts("Simpson", "8328764096");
        System.out.println(phoneBook.getContacts("Simpson"));
        System.out.println(phoneBook.getContacts("Petrov"));
    }
}
