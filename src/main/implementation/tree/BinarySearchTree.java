package main.implementation.tree;

import java.util.*;

public class BinarySearchTree {
    public static void main(String[] args) {
        BinarySearchTreeClass binarySearchTreeClass = new BinarySearchTreeClass();
        binarySearchTreeClass.addNode(9);
        binarySearchTreeClass.addNode(4);
        binarySearchTreeClass.addNode(6);
        binarySearchTreeClass.addNode(20);
        binarySearchTreeClass.addNode(170);
        binarySearchTreeClass.addNode(15);
        binarySearchTreeClass.addNode(1);
        binarySearchTreeClass.depthFirstSearchPreOrder(binarySearchTreeClass.root);
        System.out.println();
        binarySearchTreeClass.depthFirstSearchInOrder(binarySearchTreeClass.root);
        System.out.println();
        binarySearchTreeClass.depthFirstSearchPostOrder(binarySearchTreeClass.root);
        System.out.println();
        binarySearchTreeClass.breadthFirstSearch();
        binarySearchTreeClass.breadthFirstSearchRecursive(new LinkedList<>(Arrays.asList(binarySearchTreeClass.root)));
        System.out.println(binarySearchTreeClass.findNode(5));
        System.out.println(binarySearchTreeClass.findNode(9));
        System.out.println(binarySearchTreeClass.findNode(4));
        System.out.println(binarySearchTreeClass.findNode(6));
        System.out.println(binarySearchTreeClass.findNode(20));
        System.out.println(binarySearchTreeClass.findNode(170));
        System.out.println(binarySearchTreeClass.findNode(15));
        System.out.println(binarySearchTreeClass.findNode(1));
        System.out.println(binarySearchTreeClass.findNode(500));

    }
}

class BinarySearchTreeClass {

    Node root;

    class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    public void addNode(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
        } else {
            Node currentNode = root;
            while (true) {
                if (currentNode.data < value) {
                    if (currentNode.right == null) {
                        currentNode.right = newNode;
                        break;
                    }
                    currentNode = currentNode.right;
                } else {
                    if (currentNode.left == null) {
                        currentNode.left = newNode;
                        break;
                    }
                    currentNode = currentNode.left;
                }

            }
        }
    }

    public boolean findNode(int value) {
        Node currentNode = root;
        while (currentNode != null) {
            if (currentNode.data == value) {
                return true;
            } else if (currentNode.data < value) {
                currentNode = currentNode.right;
            } else {
                currentNode = currentNode.left;
            }
        }
        return false;
    }

    public void depthFirstSearchPreOrder(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            depthFirstSearchPreOrder(node.left);
            depthFirstSearchPreOrder(node.right);
        }
    }

    public void depthFirstSearchInOrder(Node node) {
        if (node != null) {
            depthFirstSearchInOrder(node.left);
            System.out.print(node.data + " ");
            depthFirstSearchInOrder(node.right);
        }
    }

    public void depthFirstSearchPostOrder(Node node) {
        if (node != null) {
            depthFirstSearchPostOrder(node.left);
            depthFirstSearchPostOrder(node.right);
            System.out.print(node.data + " ");
        }
    }

    public void breadthFirstSearch() {
        Node currentNode = root;
        List<Integer> itemList = new ArrayList<>();
        Queue<Node> itemQueue = new LinkedList<>();
        itemQueue.add(currentNode);
        while (itemQueue.size() > 0) {
            currentNode = itemQueue.poll();
            itemList.add(currentNode.data);
            if (currentNode.left != null) {
                itemQueue.add(currentNode.left);
            }
            if (currentNode.right != null) {
                itemQueue.add(currentNode.right);
            }
        }
        System.out.println(itemList);
    }

    public void breadthFirstSearchRecursive(Queue<Node> itemQueue) {
        if (itemQueue.size() == 0) {
            return;
        } else {
            Node currentNode = itemQueue.poll();
            System.out.print(currentNode.data + " ");
            if (currentNode.left != null) {
                itemQueue.add(currentNode.left);
            }
            if (currentNode.right != null) {
                itemQueue.add(currentNode.right);
            }
            breadthFirstSearchRecursive(itemQueue);
        }
    }
}