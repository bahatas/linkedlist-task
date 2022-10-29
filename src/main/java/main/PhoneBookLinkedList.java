package main;

import java.util.ArrayList;
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

        if (isEmpty()) {

            throw new NoSuchElementException("It is empty");
        }
        List<PhoneNode> listLastName = new ArrayList<>();

        PhoneNode current1 =head;

        while (current1 != null) {
            if (current1.contact.getLastname().equals(lastName)) {
                listLastName.add(current1);
            }

            current1 = current1.next;
        }

        return listLastName;

    }



    public void deleteByFirstName(String firstName) {
        if (isEmpty()) throw new NoSuchElementException("This is an empty list");;
        PhoneNode prev = head;
        PhoneNode current = head;
        while (current != null) {
            if (current.contact.getFirstName().equals(firstName)) {// there is a match

                if (current == head) {
                    head = current.next;
                    current.next = null;
                } else if (current == tail) {
                    tail = prev;
                    prev.next = null;
                } else {
                    prev.next = current.next;
                    current.next = null;

                    size--;
                }
            }
            prev = current;
            current = current.next;

        }

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
