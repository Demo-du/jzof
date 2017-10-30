package jzof;

public class N40 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		N40 n40=new N40();
		int []arr=new int[]{4,5,1,6,2,7,3,8};
		int []out=n40.getLeastNumbers(arr, 4);
		for(int i=0;i<out.length;i++){
			System.out.print(out[i]+" ");
		}

	}
	public int partition(int[] arr, int left, int right) {  
	        int result = arr[left];  
	        if (left > right)  
	            return -1;  
	  
	        while (left < right) {  
	            while (left < right && arr[right] >= result) {  
	                right--;  
	            }  
	            arr[left] = arr[right];  
	            while (left < right && arr[left] < result) {  
	                left++;  
	            }  
	            arr[right] = arr[left];  
	        }  
	        arr[left] = result;  
	        return left;  
	 }  
	public int[] getLeastNumbers(int[] input,int k){
		if(k==0||input==null||input.length<k){
			return null;
		}
		int []out=new int[k];
		int start=0;
		int end=input.length-1;
		int index=partition(input,0,input.length-1);
		while(index!=k-1){
			if(index>k-1){
				end=index-1;
				index=partition(input,start,end);
			}else{
				start=index+1;
				index=partition(input,start,end);
			}
		}
		for(int i=0;i<k;i++){
			out[i]=input[i];
		}
		return out;
	}
}
