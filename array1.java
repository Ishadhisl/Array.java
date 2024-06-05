import java.util.*;

class Arrays1 {
    public static void main(String args[]) {
        int[] array = new int[20];
        Random r = new Random();

        for (int i = 0; i < 20; i++) {
            array[i] = r.nextInt(101);
        }

        System.out.println(Arrays.toString(array));
    }
}
