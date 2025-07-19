import java.util.Scanner;

public class RecursionFunctions {
    public static int Factorial(int k){
        if(k <= 1){
            return 1;
        }
        else{
            return k * Factorial(k - 1);
        }
    }

    public static int Fibonacci(int n){
        if(n <= 1){
            return n;
        }
        else{
            //0, 1, 1, 2, 3, 5, 8, 13, 21
            // previous number add the current number to get the next number.
            return Fibonacci(n - 1) + Fibonacci(n-2);
        }
    }

    public static int Count(int d){
        if(d <= 1){
             return 1;
         }
         else{
             return d + Count(d - 1);
         }
    }
    
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number to get the factorial of.");
        int count = s.nextInt();
        int n = Factorial(count);
        System.out.println("the answer is," + n + ".");

        System.out.println("Enter a number to get the fibonacci series of.");
        count = s.nextInt();
        int d = Fibonacci(count);
        System.out.println("the answer is," + d + ".");

        System.out.println("Enter a number to get the count of.");
        count = s.nextInt();
        int f = Count(count);
        System.out.println("the answer is," + f + ".");

    }
}

// 4 3 2 1
