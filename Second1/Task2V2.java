package Second1;

public class Task2V2 {

    public static void main(String[] args) {
        int[] arr = { 1, 1, 0, 1, 1, 1 };
        int countMax = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
                if (countMax < count) {
                    countMax = count;
                }
            } else {
                count = 0;
            }
        }
        System.out.println(countMax);
    }

}
