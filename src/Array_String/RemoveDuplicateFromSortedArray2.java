package Array_String;

public class RemoveDuplicateFromSortedArray2 {
    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n<=2) return n;

        int j = 2;
        for (int i = 2; i < n; i++) {
            if (nums[i] != nums[j-2])
            {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        int [] nums = {1,1,1,2,2,3};
       int j = removeDuplicates(nums);
      for (int i = 0;i<j;i++)
      {
          System.out.println(nums[i]);
      }
    }
}
