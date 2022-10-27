package main;

import java.util.List;

public class PhoneBookLinkedList {

    public PhoneNode head;
    public PhoneNode tail;
    public int size;

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return size;
    }

    public void printPhoneBook() {
        PhoneNode current = head;
        while (current != null) {
            System.out.println(current);
            current = current.next;
        }

    }

    public void add(Contact contact) {

        PhoneNode noteToBeInserted = new PhoneNode(contact);

        if (isEmpty()) {
            head = tail = noteToBeInserted;
        } else {
            tail.next = noteToBeInserted;
            tail = noteToBeInserted;
        }
        size++;

    }

    public PhoneNode findByFirstName(String firstName) {
        return null;
    }

    public List<PhoneNode> findAllByLastName(String lastName) {
        return null;
    }

    public void deleteByFirstName(String firstName) {
    }

    public void deleteAllMatchingLastName(String lastName) {
    }

    public List<PhoneNode> findAll() {
        return null;
    }

}
