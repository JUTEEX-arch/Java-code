package FinalLabTest;
public class exam2 {
    public T min() {
        if (root == null) {
            return null;
        }

        Node current = root;
        while (current.right != null) {
            current = current.left;
        }
        return current.element;
    }
    }
}
