import java.util.Scanner;
import java.util.Arrays;

public class SortStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Read N
        int N = sc.nextInt();
        // Handle the newline after N
        sc.nextLine();
        // Read N strings into an array
        String[] arr = new String[N];
        for(int i = 0; i< N; i++) arr[i]=sc.nextLine();
        // Sort the array (Arrays.sort uses lexicographical order by default)
        Arrays.sort(arr);
        // Print the sorted strings, one per line
        for(int j = 0; j<N; j++) {
            System.out.print(arr[j]);
            if(j!=N-1) System.out.print("\n");
        }
    }
}
