public int pairs(int[]nums, int k){
    if(nums==null || nums.length<3) return 0;
	int l=0,ans=0,prev=Integer.MAX_VALUE;
	for(int i=1;i<nums.length;i++){
	    while(l<i && nums[i]-nums[l]>k)l++;
		if(l!=i && prev!=nums[l] && nums[r]-num[i]==k){
		    ans++;
			prev = nums[l];
		}
	}
	return ans;
}
