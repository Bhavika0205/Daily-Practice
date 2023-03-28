public int mountain(int[] arr){
    if(arr.length<3) return 0;
	int longest = 0;
	for(int i=1;i<arr.length-1;i++){
	    if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
		    int left = i;
			int right = i;
			while(left>0 && arr[left]>arr[left-1]){
			    left--;
			}
			while(right<arr.length-1 && arr[right]>arr[right+1]){
			    right++;
			}
			longest = Math.max(right-left+1,longest);
		}
	}
	return longest;
}
