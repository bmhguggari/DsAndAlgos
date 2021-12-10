package org.hanamant.dsalgo.tree;

import org.hanamant.dsalgo.stack.Stack;

import java.util.ArrayList;

public class BinaryTree {

    class Node {
        int data;
        Node left;
        Node right;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node node = (Node) o;
            return data == node.data;
        }

        @Override
        public int hashCode() {
            return data;
        }
    }

    Node root;

    public boolean addChild(Integer data) {
        if(root == null) {
            root = getNode(data);
        } else {
            // check left or righ based on the size
            Node temp = root;
            while(true) {
                if(data >= temp.data) {
                    if(temp.right == null) {
                        temp.right = getNode(data);
                        break;
                    } else {
                        temp = temp.right;
                    }
                } else {
                    if(temp.left == null) {
                        temp.left = getNode(data);
                        break;
                    } else {
                        temp = temp.left;
                    }
                }
            }
        }
        return true;
    }

    public void displayTree() {
        inOrderTraverse(root);
        System.out.println("-----------------");
        preOrderTraverse(root);
        System.out.println("-----------------");
        postOrderTraverse(root);
    }

    public void inOrderTraverse(Node root) {
        if(root == null) return;
        inOrderTraverse(root.left);
        System.out.println(root.data);
        inOrderTraverse(root.right);
    }

    public void preOrderTraverse(Node root) {
        if(root == null) return;
        System.out.println(root.data);
        preOrderTraverse(root.left);
        preOrderTraverse(root.right);
    }

    public void postOrderTraverse(Node root) {
        if(root == null) return;
        postOrderTraverse(root.left);
        postOrderTraverse(root.right);
        System.out.println(root.data);
    }

    Node getNode(Integer data) {
        Node node = new Node();
        node.data = data;
        return node;
    }


    public void inOrderIterative() {
        Stack<Node> nodeStack = new Stack<Node>();
        ArrayList<Node> viewed = new ArrayList<Node>();
        if(root != null) {
            nodeStack.pushStack(root);
        }
        while(!nodeStack.isStackEmpty()) {
            if(nodeStack.peek().left != null && !viewed.contains(nodeStack.peek())) {
                viewed.add(nodeStack.peek());
                nodeStack.pushStack(nodeStack.peek().left);
            } else {
                Node popped = nodeStack.popStatck();
                System.out.println(popped.data);

                if(popped.right != null) {
                    nodeStack.pushStack(popped.right);
                }
            }
        }
    }


    public void findLeaves() {
        Stack<Node> nodeStack = new Stack<Node>();
        ArrayList<Node> leftViewed = new ArrayList<Node>();
        ArrayList<Node> rightViewed = new ArrayList<Node>();

        if(root == null) {
            return;
        } else {
            nodeStack.pushStack(root);
        }

        while(!nodeStack.isStackEmpty()) {
            Node peek = nodeStack.peek();
            if(peek.left != null && !leftViewed.contains(peek)) {
                leftViewed.add(peek);
                nodeStack.pushStack(peek.left);
            } else if(peek.right != null && !rightViewed.contains(peek)) {
                rightViewed.add(peek);
                nodeStack.pushStack(peek.right);
            } else {
                if(peek.left == null && peek.right == null) {
                    System.out.println(peek.data);
                }
                nodeStack.popStatck();
            }
        }
    }
}
