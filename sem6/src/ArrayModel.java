import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayModel {
    static private int size;

    public static int sizeInput() {
        boolean temp = true;
        BufferedReader bufferedReader = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        while (temp) {
            System.out.println("Enter the size of array: ");
            try {
                size = Integer.parseInt(bufferedReader.readLine());
                temp = false;
            } catch (NumberFormatException | IOException e) {
                System.out.println("Inter integer!!!\n");
            }
        }
        return size;
    }

    public static int[] arraySave(int size) {
        int[] array = new int[size];
        BufferedReader bufferedReader = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < size; i++) {
            try {
                array[i] = Integer.parseInt(bufferedReader.readLine());
            } catch (NumberFormatException | IOException e) {
                System.out.println("Enter integer!!!\n");
            }
        }
        return array;
    }

    public static double averageNumOFArray(int[] array) {
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        return ((double) sum /array.length);
    }

    public static String comparisonAvg(double avg1, double avg2) {
        if(avg1 > avg2) return avg1 + " > " + avg2;
        else if(avg1 < avg2) return avg1 + " < " + avg2;
        else return avg1 + " = " + avg2;
    }

}
