public int maxDist(int[] nums1, int[] nums2){
    int n = nums1.length;
	int m = nums2.length;
	if(n==1 && m==1) return 0;
	int i=0;
	int j=0;
	int max =0;
	while(i<n && j<m){
	    if(i<=j && nums1[i]<=nums2[j]){
		    max = Math.max(max,j-i);
		}
		else{
		    while(i<n && i<=j && nums1[i]>nums2[j])
			{
			    i++;
			}
		}
		j++;
	}
	return max;
}
