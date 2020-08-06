public class Anagram {
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

    public void setResult(Boolean result) {
        if (result) {
            this.areAnagram = AreAnagram.ARE;
        } else {
            this.areAnagram = AreAnagram.ARENT;
        }
    }

    public String toString() {
        return this.str1 + " and " + this.str2 + " " + this.areAnagram + " anagrams";
    }
}