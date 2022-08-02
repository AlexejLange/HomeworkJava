package homework12.task2;

/**
 * Java Pro. Homework #12
 * @author Alexej Lange
 * @version 31 Jul 2022
 */

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
