public boolean exists(int[] arr){
    Arrays.sort(arr);
	for(int i=0;i<arr.length;i++){
	    int target = 2* arr[i];
		int st = 0; int end = arr.length-1;
		while(st<=end)
		{
		    int mid = (st+end)/2;
		    if(arr[mid]==target && mid!=i)
			{
			    return true;
			}
			else if(arr[mid] < target){
			    st = mid+1;
			}
			else{
			    end = mid-1;
			}
		}
	}
	return false;
}
