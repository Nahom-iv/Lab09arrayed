import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author heynow
 */
public class ArrayStuff {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int dataPoints[] = new int[100];
        int count = 0;
        int index = 0;
        int min, max;
        Random rand = new Random();

//initializing array with random numbers between 1 to 100
        for (int i = 0; i < 100; i++) {
            dataPoints[i] = rand.nextInt(100) + 1;
        }

//printing array values
        System.out.println("Values in dataPoints......");
        for (int i = 0; i < 99; i++) {
            System.out.print(dataPoints[i] + " | ");
        }
        System.out.println(dataPoints[99] + " ");

//requesting a value between 1 to 100 from user

        int number = SafeInput.getRangedInt(pipe, "Enter an Integer", 1, 100);
//finding the count of value entered
        for (int i = 0; i < 100; i++) {
            if (number == dataPoints[i])
                count++;
        }
        System.out.println("Count of " + number + " in array: " + count + "");

//requesting a value between 1 to 100 from user

        number = SafeInput.getRangedInt(pipe, "Enter anInteger", 1, 100);
        int i;
//finding the first index where value occurs
        for (i = 0; i < 100; i++) {
            if (number == dataPoints[i]) {
                index = i;
                break;
            }
        }
        if (i < 100)
            System.out.println("The value " + number + " was found at array index" + index);
        else {
            System.out.println("Value " + number + " not found in array");
        }
        System.out.println(" ");

//finding the minimum and maximum values
        min = dataPoints[0];
        max = dataPoints[0];
        for (i = 1; i < 100; i++) {
            if (min > dataPoints[i])
                min = dataPoints[i];
            if (max < dataPoints[i]) ;
        }
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);

//finding the average value of dataPoints in array
        System.out.println("Average of dataPoints values:" + getAverage(dataPoints));

    }

    private static String getAverage(int[] dataPoints) {
    }


//////////////////////////////safeInputclass//////////////////////////////////////////////////////////////////

    public static int getRangedInt(Scanner pipe, String prompt, intLow, int high) {
        int retInt = 0;
        do {
            System.out.print("n" + prompt + ": ");
            retInt = pipe.nextInt();

        } while (retInt <= intlow - 1 || retInt >= high + 1);
        return retInt;
    }

}