import java.util.Random;
import java.util.Scanner;

public class One {

    int[] generateArray(int size) {
        int[] arr = new int[size];
        Random r = new Random();
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
        }

        return arr;
    }

    void sortArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    void printArray(int[] arr) {
        System.out.print("Array["+arr.length+"] = { ");
        for (int i : arr) {
            System.out.print(i + ", ");
        }
        System.out.println("\b\b }");
    }

    public static void main(String[] args) {
        One obj = new One();
        // Scanner sc = new Scanner(System.in);

        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print("Enter arr["+i+"]: ");
        //     arr[i] = sc.nextInt();
        //     arr[i] = r.nextInt(100);
        // }

        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println("arr[" + i + "] = " + arr[i]);
        // }

        // System.out.print("Array["+arr.length+"] = { ");
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + ", ");
        // }
        // System.out.println("\b\b }");
        
        System.out.print("Enter the size: ");
        int size = Integer.parseInt(System.console().readLine());
        int[] a = obj.generateArray(size);
        obj.printArray(a);
        obj.sortArray(a);
        obj.printArray(a);
    }
}