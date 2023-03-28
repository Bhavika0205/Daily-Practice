public int minMaxSum(int[] nums){
    Arrays.sort(nums);
	int sum = 0;
	int max =0;
	int n = nums.length-1;
	for(int i=0;i<n;i++){
	    sum = nums[i] + nums[n-1-i];
		max = Math.max(sum,max);
	}
	return max;
}
