public class Problem4_NoCollection {

    public static void main(String[] args) {

        int[] arr = {1,2,8,9,12,46,76,82,15,20,30};

        int[] count = new int[10]; 
        // index 1 → multiples of 1
        // index 2 → multiples of 2
        // ...
        // index 9 → multiples of 9

        for (int num : arr) {
            for (int i = 1; i <= 9; i++) {
                if (num % i == 0) {
                    count[i]++;
                }
            }
        }

        // print output
        for (int i = 1; i <= 9; i++) {
            System.out.println(i + " : " + count[i]);
        }
    }
}
