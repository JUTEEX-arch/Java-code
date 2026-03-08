package Recursion;

public class ArraySearch {

    public static int linearSearch(int[] a, int target, int left, int right) {
    	if (left > right) {
    		return -1;
    	}
    	if (a[left] == target) {
    		return left;
    	}
    	return linearSearch(a, target, left + 1, right);
    }

    public static int binarySearch(int[] a, int target, int left, int right) {
        if (left > right) {
            return -1;
        }
        int middle = left + (right - left) / 2;
        if (a[middle] == target) {
        	return middle;
        }
        if (a[middle] > target) {
            return binarySearch(a, target, left, middle - 1);
        } 
        return binarySearch(a, target, middle + 1, right);
    }

    public static void main(String[] args) {
    	int[] a = {1, 3, 5, 7, 9};
    	for (int i = 0; i <= 10; i++) {
    		System.out.print(i + ": ");
    		System.out.print("ls = ");
    		int loc = linearSearch(a, i, 0, a.length - 1);
    		System.out.print(loc + " ");
    		System.out.print("bs = ");
    		loc = binarySearch(a, i, 0, a.length - 1);
    		System.out.print(loc);
    		System.out.println();
    	}

        System.out.println(linearSearch(a, 4, 0, a.length - 1));
        System.out.println(binarySearch(a, 4, 0, a.length - 1));
    }

}