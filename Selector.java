package Selector;

import java.util.*;

public final class Selector {
    private Selector() { }

    public static <T> T min(Collection<T> coll, Comparator<T> comp) {
        if (coll == null || coll.isEmpty()) {
            throw new IllegalArgumentException("Collection is null or empty");
        }
        return Collections.min(coll, comp);
    }

    public static <T> T max(Collection<T> coll, Comparator<T> comp) {
        if (coll == null || coll.isEmpty()) {
            throw new IllegalArgumentException("Collection is null or empty");
        }
        return Collections.max(coll, comp);
    }

    public static <T> T kmin(Collection<T> coll, int k, Comparator<T> comp) {
        if (coll == null || coll.isEmpty() || k <= 0 || k > coll.size()) {
            throw new IllegalArgumentException("Invalid input");
        }
        List<T> sortedList = new ArrayList<>(new TreeSet<>(coll));
        sortedList.sort(comp);
        if (k > sortedList.size()) {
            throw new IllegalArgumentException("k is out of bounds");
        }
        return sortedList.get(k - 1);
    }

    public static <T> T kmax(Collection<T> coll, int k, Comparator<T> comp) {
        if (coll == null || coll.isEmpty() || k <= 0 || k > coll.size()) {
            throw new IllegalArgumentException("Invalid input");
        }
        List<T> sortedList = new ArrayList<>(new TreeSet<>(coll));
        sortedList.sort(comp.reversed());
        if (k > sortedList.size()) {
            throw new IllegalArgumentException("k is out of bounds");
        }
        return sortedList.get(k - 1);
    }

    public static <T> Collection<T> range(Collection<T> coll, T low, T high, Comparator<T> comp) {
        if (coll == null || coll.isEmpty()) {
            throw new IllegalArgumentException("Collection is null or empty");
        }
        List<T> rangeList = new ArrayList<>();
        for (T item : coll) {
            if (comp.compare(item, low) >= 0 && comp.compare(item, high) <= 0) {
                rangeList.add(item);
            }
        }
        return rangeList;
    }

    public static <T> T ceiling(Collection<T> coll, T key, Comparator<T> comp) {
        if (coll == null || coll.isEmpty()) {
            throw new IllegalArgumentException("Collection is null or empty");
        }
        T ceiling = null;
        for (T item : coll) {
            if (comp.compare(item, key) >= 0) {
                if (ceiling == null || comp.compare(item, ceiling) < 0) {
                    ceiling = item;
                }
            }
        }
        if (ceiling == null) {
            throw new NoSuchElementException("No ceiling element found");
        }
        return ceiling;
    }

    public static <T> T floor(Collection<T> coll, T key, Comparator<T> comp) {
        if (coll == null || coll.isEmpty()) {
            throw new IllegalArgumentException("Collection is null or empty");
        }
        T floor = null;
        for (T item : coll) {
            if (comp.compare(item, key) <= 0) {
                if (floor == null || comp.compare(item, floor) > 0) {
                    floor = item;
                }
            }
        }
        if (floor == null) {
            throw new NoSuchElementException("No floor element found");
        }
        return floor;
    }
}
