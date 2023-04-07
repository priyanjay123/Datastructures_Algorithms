package com.linkedlist;

class Node {
    Node next;
    int data;

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
    Node() {
    }
}

public class CloneALinkedListNaive {
    public static void main(String[] args) {
        int keys[] = {1, 2, 3, 4};
        Node head = null;

        for (int i = keys.length - 1; i >= 0; i--) {
            head = new Node(keys[i], head);
        }
        Node copy = copyList(head);
        printList(copy);
    }

    private static Node copyList(Node head) {
        Node curr = head;
        Node newList = null;
        Node tail = null;

        while (curr != null) {
            if (newList == null) {
                newList = new Node(curr.data, null);
                tail = newList;
            } else {
                tail.next = new Node(curr.data,tail.next);
                tail = tail.next;
            }
            curr = curr.next;
        }
        return newList;
    }

    private static void printList(Node head) {
        Node ptr = head;
        while (ptr.next != null) {
            System.out.println(ptr.data);
            ptr = ptr.next;
        }
        System.out.println();
    }

}
