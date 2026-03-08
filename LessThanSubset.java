package SecondLabExam;
import java.util.ArrayList;
import java.util.Collection;
public class LessThanSubset {


    public static <T extends Comparable<T>> 
            Collection<T> lessThanSubset(Collection<T> collection, T value) {
        ArrayList<T> result = new ArrayList<>();
        ArrayList<T> list = new ArrayList<>(collection);
        for (int i = 0; i < collection.size(); i++){
            if (list.get(i).compareTo(value) < 0){
                result.add(list.get(i));
            }

        }
        return result;
    }
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(9);
        a.add(1);
        a.add(5);
        a.add(3);
        a.add(7);

        System.out.println(lessThanSubset(a, 7));
        
    }

}

