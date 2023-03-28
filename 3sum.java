public List<List<Integer>> threeSum(int[] nums){
    Set <List<Integer>> s = new HashSet<>();
	Arrays.sort(nums);
	int sum = 0;
	if(nums.length == 0) return new ArrayList<>();
	for(int i=0;i<nums.length-2;i++){
	    int j = i+1;
		int k = arr.length;
		while(j<k){
		    sum = nums[i] + nums[j] + nums[k];
			if(sum==0) s.add(Arrays.asList(nums[i], nums[j++], nums[k--]));
			if(sum<0) j++;
			if(sum>0) k--;
		}
	}
	return new ArrayList<>(s);
}
