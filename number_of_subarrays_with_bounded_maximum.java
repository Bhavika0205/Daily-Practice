public int subarrays(int[] nums, int right,int left){
    int i=0,j=0,m=0,count = 0;
	while(j<nums.length){
	    if(nums[j]>right){
		    i=j+1;
			m=0;
		}
		else if(nums[j]>=left && nums[j]<=right){
		    m= j-i+1;
		}
		count+=m;
		j++;
	}
	return count;
}
