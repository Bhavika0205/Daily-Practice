public int duplicate(int[] nums){
    int ans = 0;
	for(int i0;i<nums.length;i++){
	    int a = Math.abs(nums[i]);
		if(num[a-1]>0){
		    nums[a-1] *=-1;
		}
		else{
		    ans = Math.abs(nums[a]);
		}
	}
	return ans;
}
