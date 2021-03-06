import java.util.*;

public class AnagramCheck { // Main class, runs method to check if strings are anagrams
    static AnagramFile files = new AnagramFile(); // Get files class
    static ArrayList<String> arrSave = new ArrayList<String>(); // Make array of past strings

    public static void main(String args[]) { // Prompt user for strings and check if anagram
        try {
            arrSave = files.Read(); // Read save file and write to array
        } catch (Exception e) { // If error
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter first word: "); // Prompt user input
            String str1 = sc.nextLine(); // Get user input
            System.out.print("Enter second word: "); // Prompt user input
            String str2 = sc.nextLine(); // Get user input
            Anagram testAnagram = new Anagram(str1, str2);

            try {
                if (areAnagram(str1, str2)) { // Call check function
                    System.out.println("The two words are anagrams of each other"); // If anagrams
                    testAnagram.setResult(true);
                } else {
                    System.out.println("The two words are not anagrams of each other"); // If not anagrams
                    testAnagram.setResult(false);
                }
                arrSave.add(testAnagram.toString()); // Write attempt to array
                files.Write(arrSave); // Write array to save file
            } catch (Exception e) { // If error
                System.out.println(e);
            }
            System.out.println("---");
        } while(true);
    }

    static boolean areAnagram(String str1, String str2) throws Exception { // Check if anagram
        if (str1.isEmpty() || str2.isEmpty()) { // Check if either strings empty
            throw new EmptyInputException("Inputs must not be empty");
        }

        char arr1[] = str1.toCharArray(); // Convert strings to character arrays
        char arr2[] = str2.toCharArray(); // Convert strings to character arrays

        Arrays.sort(arr1); // Sort arrays alphabetically
        Arrays.sort(arr2); // Sort arrays alphabetically

        if (Arrays.equals(arr1, arr2)) { // If sorted arrays identical (Identical lengths, and same characters)
            return true;
        } else {
            return false;
        }
    }
}