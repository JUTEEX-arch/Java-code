package SecondLabExam;
public class CountEvens {

    public static int countEvens(int[] values) {
        int count = 0;
        for (int i = 0; i < values.length; i++){
            if (values[i] % 2 == 0){
                count += 1;
            }
            }

        return count;
    }
    public static void main(String[] args) {
        int[] a = {2, 4, 6, 8, 10};
        System.out.println(countEvens(a));
    }

}


