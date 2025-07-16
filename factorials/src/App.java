import java.util.Scanner;

public class App {
    public static void Factorial(int input){
        System.out.println("Enter a number");
        Scanner s = new Scanner(System.in);
        int count = s.nextInt();
        int answer = 1;

        for(int i = 1; i <= count; i++){
            answer = answer*i;
           
            
        }
         System.out.println("the factorial of this number is, " + answer);
    }

    public static void main(String[] args){
        Factorial(5);
    }
}
