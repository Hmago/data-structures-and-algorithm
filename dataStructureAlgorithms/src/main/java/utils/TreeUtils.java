package utils;

import dataStructures.Tree;

public class TreeUtils {

    public static <T> void preOrder(Tree<T> root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public static <T> void inOrder(Tree<T> root) {
        if (root != null) {
            preOrder(root.left);
            System.out.print(root.data + " ");
            preOrder(root.right);
        }
    }

    public static <T> void printChilds(Tree<T> root) {
        if (root != null && (root.left != null || root.right != null)) {
            System.out.print("NODE=" + root.data);
            if (root.left != null) {
                System.out.print(": left=" + root.left.data);
            }

            if (root.right != null) {
                System.out.print(" , right=" + root.right.data);
            }

            System.out.println();
            printChilds(root.left);
            printChilds(root.right);

        }
    }
}
