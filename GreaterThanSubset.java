package FirstLabExam;
import java.util.ArrayList;
import java.util.Collection;
public class GreaterThanSubset {


    public static <T extends Comparable<T>> 
            Collection<T> greaterThanSubset(Collection<T> collection, T value) {
        ArrayList<T> result = new ArrayList<>();
        ArrayList<T> list = new ArrayList<>(collection);
        for (int i = 0; i < collection.size(); i++){
            if (list.get(i).compareTo(value) > 0){
                result.add(list.get(i));
            }

        }
        return result;
    }

}

