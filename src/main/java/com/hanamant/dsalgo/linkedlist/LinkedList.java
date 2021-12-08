package com.hanamant.dsalgo.linkedlist;

public class LinkedList<E> {
    public static void main(String[] args) {
        LinkedList<Employee> list = new LinkedList<Employee>();
        System.out.println("Empty list");
        list.displayList();
        System.out.println("Adding three elements to list");
        list.insertNode(new Employee(55, "Hanamant"));
        list.insertNode(new Employee(99, "Kalavati"));
        list.insertNode(new Employee(44, "Abhiram"));
        list.insertNode(new Employee(55, "Hanamant"));
        list.insertNode(new Employee(99, "Kalavati"));
        list.insertNode(new Employee(44, "Abhiram"));
        list.displayList();
        System.out.println("Middle node:" + list.findMiddleNode());
        System.out.println("Delete 55 and 44");
        list.deleteNode(new Employee(55, "Hanamant"));
        list.deleteNode(new Employee(44, "Abhiram"));
        list.displayList();
        System.out.println("Deleting 99");
        list.deleteNode(new Employee(99, "Kalavati"));
        list.displayList();

    }
    class Node<E> {
        E data;
        Node next;
    }

    private Node head;

    public boolean insertNode(E data) {
        Node newNode = new Node();
        newNode.data = data;
        Node mover = head;
        if(head == null) {
            head = newNode;
        } else {
            while(mover.next != null) {
                mover = mover.next;
            }
            mover.next = newNode;
        }
        return true;
    }

    public boolean deleteNode(E data) {
        Node lead = head;
        Node follow = null;
        boolean found = false;
        if(head.data.equals(data)) {
            head = head.next;
            found = true;
        } else {
            while(lead.next != null && !lead.next.data.equals(data)) {
                lead = lead.next;
            }
            if(lead.next != null) {
                lead.next = lead.next.next;
                found = true;
            } else {
                found = false;
            }
        }
        return found;
    }

    public void displayList() {
        Node lead = head;
        System.out.print("head->");
        while(lead != null){
            System.out.print(lead.data + "->");
            lead = lead.next;
        }
        System.out.print("NULL");
        System.out.println();
    }

    public E findMiddleNode() {
        Node fast = head;
        Node slow = head;
        if(head != null) {
            while(fast.next != null && fast.next.next != null) {
                fast = fast.next.next;
                slow = slow.next;
            }
            return (E)slow.data;
        } else return null;
    }
}

class Employee {
    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int hashcode(){
        return id;
    }

    public boolean equals(Object obj) {
        if(obj instanceof Employee) {
            return this.id == ((Employee)obj).id;
        }
        return false;
    }

    public String toString() {
        return "Id = " + this.id + ", name= " + this.name;
    }
}
