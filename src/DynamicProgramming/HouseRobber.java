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
	// recursion + memoization
//	public int solve(int[] nums, int i, int n, int[] dp){
//        if(i >= n){
//            return 0;
//        }
//        if(dp[i] != -1){
//            return dp[i];
//        }
//        int steal = nums[i]+solve(nums,i+2,n,dp);
//        int skip = solve(nums,i+1,n,dp);
//        return dp[i] = Math.max(steal,skip);
//    }
//    public int rob(int[] nums) {
//        int n = nums.length;
//        int[] dp = new int[n+1];
//        for(int i=0; i<dp.length; i++){
//            dp[i] = -1;
//        }
//        
//        return solve(nums,0,n,dp);
//        
//    }
}

