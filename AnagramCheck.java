import java.util.*;

public class AnagramCheck {
    static AnagramFile files = new AnagramFile(); // Get files class
    static ArrayList<String> arrSave = new ArrayList<String>(); // Make array of past strings

    public static void main(String args[]) {
        try {
            arrSave = files.Read(); // Read save file and write to array
        } catch (Exception e) { // If error
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first word: "); // Prompt user input
        String str1 = sc.nextLine(); // Get user input
        System.out.print("Enter second word: "); // Prompt user input
        String str2 = sc.nextLine(); // Get user input
        sc.close();
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
            System.out.println("Words must not be empty");
            e.printStackTrace();
        }
    }

    static boolean areAnagram(String str1, String str2) throws Exception {
        if (str1.isEmpty() || str2.isEmpty()) { // Check if either strings empty
            throw new Exception("Inputs must not be empty");
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