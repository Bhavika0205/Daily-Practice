public int water(int[] nums){
    int i = 0;
	int j = nums.length-1;
	int max =0;
	while(i<j){
	    int width = j-i;
		int height = Math.min(nums[i],nums[j]);
		int ans = width*height;
		max = Math.max(max, ans);
		if(nums[i]<nums[j]) i++;
		else j--;
	}
	return max;
}
