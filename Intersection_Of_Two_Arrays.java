public int[] intersection(int[] nums1, int[] nums2){
    Set<Integer> s = new HashSet<>();
	for(int i=0;i<nums1.length;i++)
	{
	    s.add(nums[i]);
	}
	Set<Integer> t = new HAshSet<>();
	for(int i=0;i<num2.length;i++){
	    if(s.contains(nums2[i]){
		    t.add(nums2[i];
		}
	}
	int ans[] = new int[t.size()];
	int j=0;
	for(int i:t){
	    ans[j] = i;
		j++;
	}
	return ans;	
}
