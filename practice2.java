package FinalLabTest;
/**
 * Returns the maximum value in the binary search tree.
 * we search the rightmost value (since this is how bst work)
 */
public T max() {
    if (root == null) {
        return null;
    }

    Node current = root;
    while (current.right != null) {
        current = current.right;
    }
    return current.element;
}
