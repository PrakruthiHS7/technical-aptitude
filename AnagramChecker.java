import java.util.Arrays;
public class AnagramChecker {
    public static void main(String[] args) {
        String str1 = "parliament";
        String str2 = "partial men";

        if (areAnagrams(str1, str2)) {
            System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are anagrams.");
        } else {
            System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are not anagrams.");
        }
    }
    public static boolean areAnagrams(String s1, String s2) {
        // Remove white space and punctuation, convert to lowercase
        s1 = s1.replaceAll("[\\s\\p{P}]", "").toLowerCase();
        s2 = s2.replaceAll("[\\s\\p{P}]", "").toLowerCase();

        // Check if the lengths are different
        if (s1.length() != s2.length()) {
            return false;
        }

        // Convert strings to character arrays and sort them
        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        // Compare the sorted character arrays
        return Arrays.equals(charArray1, charArray2);
    }
}
