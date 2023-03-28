public int moveZeroes(int[] nums){
    if(nums.length==0) return;
	int idx =0;
	for(int i=0;i<nums.length;i++){
	    if(nums[i]!=0){
		    nums[idx] = nums[i];
			idx++;
		}
	}
	while(idx<=nums.length-1){
	    nums[idx]=0;
		idx++;
	}
}
