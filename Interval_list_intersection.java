public in[][] intervalIntersection(int[][] A, int[][] B){
    List<int[]> ans = new ArrayList();
	int i=0;
	int j=0;
	while(i<A.length && j<B.length){
	    int sp = Math.max(A[i][0],B[j][0]);
		int ep = Math.min(A[i][1],B[j][1]);
		if(sp<=ep) ans.add(new int[]{sp,ep});
		if(A[i][1]<B[j][1]) i++;
		else j++;
	}
	return ans.toArray(new int[ans.size()][]);
}
