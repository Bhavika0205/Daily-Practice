public void duplicate(int[] arr){
    int nums[] = new int[arr.length];
    int i=0;int j=0;
    while(i<arr.length && j<nums.length){
        if(arr[i]==0){
		    nums[j] = 0;
			if(j+1<nums.length){
			    nums[j+1] = 0;
			}
			j+=2;
			i++;
		}
		else{
		    nums[j] = arr[i];
            i++;
            j++;			
		}
    }
    for(int k=0;k<nums.length;k++){
        arr[]= nums[k];
    }
}
