package main.implementation.tree;

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
        binarySearchTreeClass.printTree(binarySearchTreeClass.root);
        System.out.println();
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

    public void printTree(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            printTree(node.left);
            printTree(node.right);
        }
    }
}