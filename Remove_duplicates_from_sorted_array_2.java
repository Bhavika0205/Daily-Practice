public int removeDuplicates(int[] nums){
    int k = 1;
	int c = 0;
	int prev = nums[0];
	for(int i=1;i<nums.length;i++){
	    if(prev!=nums[i])c++;
		else if(prev==nums[i])c=0;
		if(c<=1){
		    nums[k] = nums[i];
			k++;
		}
		prev = nums[i];
	}
	return k;
}
