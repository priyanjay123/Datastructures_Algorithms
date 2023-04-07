package com.linkedlist;

public class CloneALinkedListNaiveUsingDummyNode {
    public static void main(String[] args) {
        Node head = null;
        int keys[] = {1, 2, 3, 4};
        for (int i = keys.length - 1; i >= 0; i--) {
            head = new Node(keys[i], head);
        }

        Node clonedList = cloneList(head);
        printList(clonedList);
    }

    private static void printList(Node head) {
        Node ptr = head;
        while (ptr != null) {
            System.out.println(ptr.data);
            ptr = ptr.next;
        }
        System.out.println();
    }

    private static Node cloneList(Node head) {
        Node curr = head;
        Node tail;
        Node dummy = new Node();
        tail = dummy;

        while (curr != null) {
            tail.next = new Node(head.data, tail.next);
            tail = tail.next;
            curr = curr.next;
        }
        return dummy.next;
    }
}

