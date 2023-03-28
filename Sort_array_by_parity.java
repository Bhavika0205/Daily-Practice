public int[] sort(int[] nums){
    if(nums.legth<=1) return nums;
	int end = nums.length-1;
	for(int i=0;i<nums.length && i<=end;i++){
	    if(nums[i] % 2 !=0){
		    int temp = nums[i];
			nums[i] = nums[end];
			nums[end] = temp;
			end--;
			i--;
		}
	}
	return nums;
}
