package Array_String;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int j = 0;
        for(int i = 0;i<nums.length;i++)
        {
            if(nums[i]!=val)
            {
                nums[j]=nums[i];
                j++;
            }
        }

        return j;
    }

    public static void main(String[] args) {
        int [] arr = {3,2,2,3};
        int val = 3;
        RemoveElement removeElement = new RemoveElement();
        System.out.println(removeElement.removeElement(arr,val));
    }
}
