public int sumPairs(int[]nums,int k){
    int st =0;
	int end = nums.length-1;
	int count=0;
	Arrays.sort(nums);
	while(st<end){
	    if(nums[st]+num[end]==k){
		    st++;
			end--;
			count++;
		}
		else if(nums[st]+nums[end]<k) st++;
		else end--;
	}
	return count;
}
