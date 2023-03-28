public int threeSumClosest(int[] nums, int target){
    Arrays.sort(nums);
	int ans = Integer.MAX_VALUE;
	int sum = 0;
	for(int i=0;i<nums.length;i++){
	    int st = i+1;
		int end = nums.length-1;
		while(st<end){
		    sum = nums[i]+nums[st]+nums[end];
			if(Math.abs(sum-target)<Math.abs(ans-target))
			    ans = sum;
			if(sum<target)st++;
			else end--;
		}
	}
	return ans;
}
