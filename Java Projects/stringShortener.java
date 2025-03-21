import java.util.Scanner;
import java.util.LinkedHashMap;

public class Assignment4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        

        System.out.println("Type the message to be shortened:");
        String input = scan.nextLine().toLowerCase();
        scan.close(); 
        
        String algo1Result = applyAlgorithm1(input);

        String algo2Result = applyAlgorithm2(input);

        System.out.println(algo1Result);
        System.out.println(algo2Result);
    }

    public static String applyAlgorithm1(String input) {
        StringBuilder shortened = new StringBuilder();
        int vowelsRemoved = 0, repeatsRemoved = 0;
        boolean isStartOfWord = true; 

        char prevChar = ' ';
        for (char c : input.toCharArray()) {
            boolean isVowel = "aeiou".indexOf(c) != -1;

            if (isVowel && !isStartOfWord) {
                vowelsRemoved++;
                continue;
            }

            if (c == prevChar && c != ' ') {
                repeatsRemoved++;
                continue;
            }

            shortened.append(c);
            prevChar = c;
            isStartOfWord = (c == ' '); 
        }

        int savedChars = input.length() - shortened.length();
        return "Algorithm 1\nVowels removed: " + vowelsRemoved +
               "\nRepeats removed: " + repeatsRemoved +
               "\nAlgorithm 1 message: " + shortened.toString().trim() +
               "\nAlgorithm 1 characters saved: " + savedChars + "\n";
    }

    public static String applyAlgorithm2(String input) {
        LinkedHashMap<Character, Integer> charCount = new LinkedHashMap<>();
        
        for (char c : input.toCharArray()) {
            if (c != ' ') {
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }
        }

        StringBuilder encoded = new StringBuilder();
        for (char c : charCount.keySet()) {
            encoded.append(charCount.get(c)).append(c);
        }

        int savedChars = input.length() - encoded.length();
        return "Algorithm 2\nUnique characters found: " + charCount.size() +
               "\nAlgorithm 2 message: " + encoded.toString() +
               "\nAlgorithm 2 characters saved: " + savedChars + "\n";
    }
}
