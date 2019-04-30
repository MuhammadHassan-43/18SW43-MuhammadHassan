class Task7{
	    public static void  bubbleSort(int A[],int N){
		int a,i,b;
		for(a=1;a<=N-1;a++){        
			for(i=0;i<=(N-1)-a;i++){ 
				if(A[i]>A[i+1]){
					c=A[i];
					A[i]=A[i+1];
					A[i+1]=c;
				}
			}
		} 
	}
	public static void main(String[]args)
	{
		int arr[]={4,8,1,9,7};
		int i;
		System.out.print("Array before sorting: ");
		for(i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		bubbleSort(arr,5);
		System.out.println();
		System.out.print("Array after sorting: ");
		for(i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}

	}
}