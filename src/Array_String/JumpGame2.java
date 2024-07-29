package Array_String;

public class JumpGame2 {
    static int minJumps(int[] nums)
    {
        int jumps = 0, curEnd = 0, curFarthest = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            curFarthest = Math.max(curFarthest, i + nums[i]);
            if (i == curEnd) {
                jumps++;
                curEnd = curFarthest;
            }
        }
        return jumps;
    }
    public static void main(String[] args) {
        int [] arr = {2,2,1,1,4};
        System.out.println(  minJumps(arr));
    }
}
