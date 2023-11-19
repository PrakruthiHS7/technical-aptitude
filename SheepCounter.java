public class SheepCounter {
    public static void main(String[] args) {
    Boolean[] sheepArray = {true, true, true, false, true, true, true, true, true, false, true, false, true, false, false, true, true, true, true, false, false, true, true};

        int sheepCount = countSheep(sheepArray);
        System.out.println("Number of sheep present: " + sheepCount);
    }

    public static int countSheep(Boolean[] sheepArray) {
        // Check if the array is null or empty
        if (sheepArray == null || sheepArray.length == 0) {
            System.out.println("Invalid input: The array is null or empty.");
            return 0;
        }

        // Count the number of true values in the array
        int count = 0;
        for (int i = 0; i < sheepArray.length; i++) {
            // Check if the element is true (sheep is present)
            if (sheepArray[i] != null && sheepArray[i]==true) {
                count++;
            }
        }

        return count;
    }
}
