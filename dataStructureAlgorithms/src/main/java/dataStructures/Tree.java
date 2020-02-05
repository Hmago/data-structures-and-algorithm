package dataStructures;

public class Tree<T> {
    public T data;
    public Tree<T> left;
    public Tree<T> right;

    public Tree(T data) {
        this.data = data;
        left = null;
        right = null;
    }
}
