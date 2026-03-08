package FinalLabTest;
public class exam1 {
    public int depth(T value) {
        Node current = root;
        int depth = 0;
        while (current != null) {
            int cmp = value.compareTo(current.element);
            if (cmp == 0) {
                return depth;
            } else if (cmp < 0) {
                current = current.left;
            } else {
                current = current.right;
            }
            depth++;
        }
        return -1;
    }
}
