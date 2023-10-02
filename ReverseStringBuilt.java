// 3.reverse a String using built in function 
 class ReverseStringBuilt 
 {
    public static void main(String[] args) {
        String message = "StringBuilder is a class in the Java API that provides a mutable sequence of characters";
        
        // Create a StringBuilder and initialize it with the original string
        StringBuilder reversed = new StringBuilder(message);
        
        // reverse() method to reverse the string
        reversed.reverse();
        
        // Convert the StringBuilder  to a String
        String reversedString = reversed.toString();
        
        
        System.out.println("Reversed: " + reversedString);
    }
}

