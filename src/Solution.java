public class Solution {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        // напишите тут ваш код
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = console.nextInt();
        }

        int max = array[0];

        for (int j = 0; j < n; j++) {
            if (max < array[j]) {
                max = array[j];
            }
        }

        System.out.println(max);
    }
}
