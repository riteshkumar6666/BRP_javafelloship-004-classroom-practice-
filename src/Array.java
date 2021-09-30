//Write a Java program to sort a numeric array and a string array
import java.util.Arrays;
public class Array {
    public static void main(String[] args) {
        int[] a={234,551,123,432,111};

        String[] b={"Ritesh","cardano","Avalanche","Matic","Avax"};

        System.out.println( "integer array: "+Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("sorted array: "+Arrays.toString(a));

        System.out.println( "string array: "+Arrays.toString(b));
        Arrays.sort(b);
        System.out.println("sorted array: "+Arrays.toString(b));
    }
}
