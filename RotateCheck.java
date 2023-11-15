//check if one string is rotation of another 
class RotateCheck{
    public static boolean isRotation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        // Concatenate the first string with itself
        String s3 = s1 + s1;

        // Check if the second string is a substring of the new string
        return s3.contains(s2);
		/*contains method is a part of the String class. 
		It is used to check if a particular sequence of characters (substring) is present within the given string. 
		The method returns a boolean value*/
    }

    public static void main(String args[]) {
        String s1 = "ABCD";
        String s2 = "BCDA";

        if (isRotation(s1, s2)) {
            System.out.println("Rotation");
        } else {
            System.out.println("Not a rotation");
        }
    }
}
