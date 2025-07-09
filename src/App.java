import java.util.Scanner;

public class App {
    public static  String s="";
            public static void  Ispal(String word) {
                
                String reversed = new StringBuilder(word).reverse().toString();
                System.out.println(reversed);
                
                if(word.equals(reversed)){
                    System.out.println("this is a pallindrome");
                }
                else{
                    System.out.println("this is not a pallindrome");
                }




            }
        	public static void main(String[] args, String string) {
                Scanner s = new Scanner(System.in);
                System.out.println("enter a word");
                String word = s.nextLine();
                Ispal(word);

                
                
            }
}

