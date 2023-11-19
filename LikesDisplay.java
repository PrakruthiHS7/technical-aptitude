public class LikesDisplay {

    public static void main(String[] args) {
        // Examples
        System.out.println(displayLikes(new String[]{}));                            // "no one likes this"
        System.out.println(displayLikes(new String[]{"Peter"}));                     // "Peter likes this"
        System.out.println(displayLikes(new String[]{"Jacob", "Alex"}));             // "Jacob and Alex like this"
        System.out.println(displayLikes(new String[]{"Max", "John", "Mark"}));       // "Max, John, and Mark like this"
        System.out.println(displayLikes(new String[]{"Alex", "Jacob", "Mark", "Max"}));  // "Alex, Jacob, and 2 others like this"
    }

    public static String displayLikes(String[] names) {
        if (names == null || names.length == 0) {
            return "no one likes this";
        } else if (names.length == 1) {
            return names[0] + " likes this";
        } else if (names.length == 2) {
            return names[0] + " and " + names[1] + " like this";
        } else if (names.length == 3) {
            return names[0] + ", " + names[1] + ", and " + names[2] + " like this";
        } else {
            return names[0] + ", " + names[1] + ", and " + (names.length - 2) + " others like this";
        }
    }
}
