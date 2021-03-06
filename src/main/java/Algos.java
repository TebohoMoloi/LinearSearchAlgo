import java.util.InputMismatchException;
import java.util.Scanner;

public class Algos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            int x = input.nextInt();
            int result = search(arr, x);
            if(result == -1)
                System.out.println(x + " is not present in the the array");
            else
                System.out.println("The element is present at index " + result);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
        }
    }
    static int search(int[] arr, int x){
        for (int a : arr) {
            if(a == x)
                return (a - 1);
        }
        return -1;
    }
}
