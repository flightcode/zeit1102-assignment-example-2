public class Anagram { // Class of each anagram comparison, intended to be created as object
    private String str1;
    private String str2;
    private AreAnagram areAnagram;

    private enum AreAnagram {
        ARE, ARENT
    };

    public Anagram(String str1, String str2) {
        this.str1 = str1;
        this.str2 = str2;
    }

    public void setResult(Boolean result) { // If anagram, set enum to appropriate true/false
        if (result) {
            this.areAnagram = AreAnagram.ARE;
        } else {
            this.areAnagram = AreAnagram.ARENT;
        }
    }

    public String toString() { // Output anagram comparison to string
        return this.str1 + " and " + this.str2 + " " + this.areAnagram + " anagrams";
    }
}