package main;

import java.util.List;
import java.util.NoSuchElementException;

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
            System.out.println(current.contact);
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
        if (isEmpty()) {
            throw new NoSuchElementException("its not here guys");
        }
        PhoneNode current = head;
        while (current != null) {
            if (current.contact.getFirstName().equals(firstName)) {
                return current;
            }
            current = current.next;
        }
        throw new NoSuchElementException("doesnt exist");
    }

    public List<PhoneNode> findAllByLastName(String lastName) {
        return null;
        //kadifa
    }

    public void deleteByFirstName(String firstName) {
        //entisar
    }

    public void deleteAllMatchingLastName(String lastName) {
        //adelina

        if (isEmpty()) {
            throw new NoSuchElementException("No such element");
        }
        PhoneNode current = head;

        while (current != null && current.next != null) {
            if (current.next.contact.getLastname().equals(lastName)) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }

        }
    }

    public List<PhoneNode> findAll() {
        return null;
        //medina
    }

}
