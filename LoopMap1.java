import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LoopMap1 {
    public static void main(String[] args) {
        ArrayList<Integer> myArray = new ArrayList<>(5);
        System.out.println("Please enter 5 numbers");
        Scanner input = new Scanner(System.in);
        
        for(int i = 0; i <5; i++) {
            int number = input.nextInt();
            myArray.add(number);
        }

        int sum = 0;
        for (int a : myArray) {
            sum += a;
        }
        System.out.println("The sum of all of your numbers are " + sum);

        int product = 1;
        for (int a : myArray) {
            product *= a;
        }
        System.out.println("The product of all of your numbers are " + product);
        System.out.println("The largest number is " + Collections.max(myArray));
        System.out.println("The smallest number is " + Collections.min(myArray));
        input.close();

    }
}