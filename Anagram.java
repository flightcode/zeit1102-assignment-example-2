public class Anagram {
    private String str1;
    private String str2;
    private Boolean areAnagram;

    public Anagram(String str1, String str2) {
        this.str1 = str1;
        this.str2 = str2;
    }

    public void setResult(Boolean result) {
        this.areAnagram = result;
    }

    public String toString() {
        return this.str1 + " and " + this.str2 + ": " + this.areAnagram;
    }
}