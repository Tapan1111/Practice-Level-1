package DynamicProgramming;

public class HouseRobber {
	public static void main(String[] args) {
		int[] houses = { 1, 2, 3, 1 };
		System.out.println(rob(houses));
		
	}

	public static int rob(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int robnext ;
        int robnextPlusOne;
        robnextPlusOne = 0;
        robnext = nums[nums.length-1];
        for(int i=nums.length-2; i>=0; i--){
            int curr = Math.max(robnext, robnextPlusOne+nums[i]);
            robnextPlusOne = robnext;
            robnext = curr;
        }
        return robnext;

        
    }
}

