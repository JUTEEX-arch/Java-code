package FinalLabTest;
/**
 * Returns true if this bst contains value, false otherwise.
 */
public boolean contains(T value) {
    Node current = root;
    while (current != null) {
        int cmp = value.compareTo(current.element);
        if (cmp == 0) {
            return true; // Found the value
        } else if (cmp < 0) {
            current = current.left; // Search left subtree
        } else {
            current = current.right; // Search right subtree
        }
    }
    return false; // Not found
}
