package main;

public class Main {
    public static void main(String[] args) {
        System.out.println("This is our linked list task as group 3");

       PhoneBookLinkedList p = new PhoneBookLinkedList();
       Contact contact1 = new Contact("Kevin", "Li", "kevin@gmail.com", "234567");
       Contact contact2 = new Contact("Mike", "Smith", "mike@gmail.com", "9876532");
       Contact contact3 = new Contact("Yasemin", "Smith", "yasemin@gmail.com", "4567890");

       p.add(contact1);
       p.add(contact2);
       p.add(contact3);



       p.deleteAllMatchingLastName("Smith");
       p.printPhoneBook();




    }
}
