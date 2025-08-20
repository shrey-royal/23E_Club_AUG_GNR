import java.util.Random;

public class Two {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        Random r = new Random();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = r.nextInt(100);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                // System.out.print(arr[i][j] + ", ");
                System.out.printf("%02d, ", arr[i][j]);
            }
            System.out.println();
        }
    }
}
