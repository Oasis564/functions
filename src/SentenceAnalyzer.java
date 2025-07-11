import java.util.Scanner;

public class SentenceAnalyzer {


    static int countWords(String sentence) {
        String[] words = sentence.trim().split("\\s+");
        return words.length;
    }

   
    static int countVowels(String sentence) {
        int count = 0;
        for (char c : sentence.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    
    static int countConsonants(String sentence) {
        int count = 0;
        for (char c : sentence.toLowerCase().toCharArray()) {
            if (Character.isLetter(c) && "aeiou".indexOf(c) == -1) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a sentence:");
        String input = scanner.nextLine();

        System.out.println("Word count: " + countWords(input));
        System.out.println("Vowel count: " + countVowels(input));
        System.out.println("Consonant count: " + countConsonants(input));

        scanner.close();
    }
}