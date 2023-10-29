public class TargetSum 
{
    public static void twoSum(int[] nums, int target, int[] result) 
	{
		// If no such pair is found, return an array with default values (-1).
        result[0] = -1;
        result[1] = -1;

        for (int i = 0; i < nums.length - 1; i++) 
		{
            for (int j = i + 1; j < nums.length; j++)
				{
                if (nums[i] + nums[j] == target) 
				{
                    result[0] = i;
                    result[1] = j;
                    return;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = new int[2];

        twoSum(nums, target, result);

        if (result[0] != -1 && result[1] != -1) {
            System.out.println("Indexes of the two numbers that add up to the target: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No such pair found in the array.");
        }
    }
}
