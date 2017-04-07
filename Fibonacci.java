import java.util.Scanner;

public class sumFibo {
    public static void main(String[]args) {
		long jum=0;
        Scanner show = new Scanner(System.in);
        System.out.print("Input : ");
        int n = show.nextInt();
        long fib[] = new long[n];
         
        fib[0] = 0;
        fib[1] = 1;
         
        for(int i = 2; i < n; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
         
        for (int i = 0; i < n; i++) {
            System.out.print(fib[i] +  " ");
			jum=jum+fib[i];
        }
		System.out.println("\nHasil penjumlahan : " + jum);
    }
 
}
