package main.implementation.linkedlist;

public class SinglyLinkedList {
    public static void main(String[] args) {
        SinglyLinkedListClass myLinkedList = new SinglyLinkedListClass();
        myLinkedList.printList();
        myLinkedList.addAtLast(1);
        myLinkedList.printList();
        myLinkedList.addAtLast(2);
        myLinkedList.printList();
        myLinkedList.addAtStart(0);
        myLinkedList.printList();
        myLinkedList.addAtStart(-1);
        myLinkedList.printList();
        myLinkedList.addAtIndex(2, 5);
        myLinkedList.printList();
        myLinkedList.addAtIndex(0, 3);
        myLinkedList.printList();
        myLinkedList.remove(4);
        myLinkedList.printList();
        myLinkedList.reverseList();
        myLinkedList.printList();
    }
}

class SinglyLinkedListClass {

    ListNode head;

    class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public void addAtLast(int newVal) {
        ListNode newNode = new ListNode(newVal);

        if (head==null) {
            head = newNode;
        } else {
             ListNode currentNode = head;
             while (currentNode.next != null) {
                 currentNode = currentNode.next;
             }
             currentNode.next = newNode;
        }
    }

    public void addAtStart(int newVal) {
        ListNode newNode = new ListNode(newVal);
        newNode.next = head;
        head = newNode;
    }

    public void addAtIndex(int index, int newVal) {
        ListNode newNode = new ListNode(newVal);
        ListNode currentNode = head;
        if (index == 0) {
            newNode.next = currentNode;
            head = newNode;
        } else {
            while (index-1 > 0) {
                currentNode = currentNode.next;
                index--;
            }
            newNode.next = currentNode.next;
            currentNode.next = newNode;
        }
    }

    public void printList() {
        ListNode currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.val + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    public void remove(int index) {
        ListNode currentNode = head;
        if (index == 0) {
            head = currentNode.next;
        } else {
            while (index - 1 > 0) {
                currentNode = currentNode.next;
                index--;
            }
            currentNode.next = currentNode.next.next;
        }
    }

    public void reverseList() {
        ListNode prevNode = null, nextNode;
        ListNode currentNode = head;

        while (currentNode != null) {
            nextNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }
        head = prevNode;
    }
}