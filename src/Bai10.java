import java.util.*;

class Contact {
    private static int idCounter = 1;
    private int id;
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.id = idCounter++;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Contact contact = (Contact) obj;
        return phoneNumber.equals(contact.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneNumber);
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Phone: " + phoneNumber;
    }
}

class ContactManager {
    private Set<Contact> contacts = new HashSet<>();

    public boolean addContact(String name, String phoneNumber) {
        Contact newContact = new Contact(name, phoneNumber);
        if (contacts.contains(newContact)) {
            System.out.println("Error: Phone number already exists!");
            return false;
        }
        contacts.add(newContact);
        return true;
    }

    public boolean removeContact(String phoneNumber) {
        return contacts.removeIf(contact -> contact.getPhoneNumber().equals(phoneNumber));
    }

    public Contact searchContact(String phoneNumber) {
        for (Contact contact : contacts) {
            if (contact.getPhoneNumber().equals(phoneNumber)) {
                return contact;
            }
        }
        return null;
    }

    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts available.");
        } else {
            for (Contact contact : contacts) {
                System.out.println(contact);
            }
        }
    }

    public List<Contact> getPaginatedContacts(int page, int pageSize) {
        List<Contact> contactList = new ArrayList<>(contacts);
        int start = (page - 1) * pageSize;
        int end = Math.min(start + pageSize, contactList.size());
        if (start >= contactList.size()) {
            return Collections.emptyList();
        }
        return contactList.subList(start, end);
    }
}

public class Bai10 {
    public static void main(String[] args) {
        ContactManager manager = new ContactManager();
        manager.addContact("Alice", "123456789");
        manager.addContact("Bob", "987654321");
        manager.addContact("Charlie", "555666777");

        System.out.println("\nAll Contacts:");
        manager.displayContacts();

        System.out.println("\nSearching for 987654321:");
        System.out.println(manager.searchContact("987654321"));

        System.out.println("\nRemoving 123456789:");
        manager.removeContact("123456789");
        manager.displayContacts();

        System.out.println("\nPaginated Contacts (Page 1, Page Size 2):");
        List<Contact> page1 = manager.getPaginatedContacts(1, 2);
        page1.forEach(System.out::println);
    }
}
