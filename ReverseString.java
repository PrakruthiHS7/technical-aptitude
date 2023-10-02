//1.reverse a array wihtout using a built in function

class ReverseString {
    public static void main(String[] reversing) {
        String name = "Prakruthi";
		//  empty string  to store the reversed string
        String reverse= "";

        for (int i = name.length() - 1; i >= 0; i--) {
			// Concatenate each character to the "reverse" string in reverse order
            reverse+= name.charAt(i);
        }

        System.out.println("Reversed name: " + reverse);
    }
}
