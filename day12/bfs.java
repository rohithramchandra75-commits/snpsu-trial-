package day12;

import java.util.*;
import java.util.Queue;

class Node3 {
    int data;
    Node3 left, right;

    Node3(int data) {
        this.data = data;
        left = right = null;
    }
}

class BinaryTreeBFS {

    static Node3 createNode(int data) {
        return new Node3(data);
    }

    static void bfs(Node3 root) {
        if (root == null) {
            return;
        }

        Queue<Object> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            Node3 front = (Node3) q.poll();
            System.out.print(front.data + " ");

            if (front.left != null) {
                q.offer(front.left);
            }

            if (front.right != null) {
                q.offer(front.right);
            }
        }
    }

    public static void main(String[] args) {

        Node3 root = createNode(10);
        root.left = createNode(5);
        root.right = createNode(20);
        root.left.left = createNode(3);
        root.left.right = createNode(7);
        root.right.left = createNode(15);
        root.right.right = createNode(25);

        System.out.println("BFS Traversal:");
        bfs(root);
    }
}