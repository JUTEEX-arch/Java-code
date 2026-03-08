package FinalLabTest;
public int depth(T value) {
    Node current = root;
    int depth = 0;

    while (current != null) {
        int cmp = value.compareTo(current.element);

        if (cmp == 0) {
            return depth; // Found
        } else if (cmp < 0) {
            current = current.left;  // Go left for smaller values
        } else {
            current = current.right; // Go right for larger values
        }
        depth++;
    }
    return -1; //Not found
}

