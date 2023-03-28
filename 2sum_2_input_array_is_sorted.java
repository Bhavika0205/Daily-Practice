public int[] twoSum(int[] nums, int target){
    int ans[] = new int[2];
	int i = 0;
	int j=nums.length-1;
	while(i<j){
	    if(nums[i] + nums[j]<target) i++;
		else if(nums[i] + nums[j]>target)j--;
		else{
		    ans[0] = i+1;
			ans[1] = j+1;
			break;
		}
	}
	return ans;
}
