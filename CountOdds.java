package FirstLabExam;
public class CountOdds {

    public static int countOdds(int[] values) {
        int count = 0;
        for (int i = 0; i < values.length; i++){
            if (values[i] % 2 != 0){
                count += 1;
            }
            }

        return count;
    }
    public static void main(String[] args) {
        int[] a = {0, 1, 2, 3, 4};
        System.out.println(countOdds(a));
    }

}


