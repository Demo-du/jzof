package jzof2;

public class N21 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        N21 n21=new N21();
        int []arr={1,2,3,4,5};
        n21.solve(arr);
        for(int k:arr){
        	System.out.print(k+" ");
        }
	}
    public void solve(int []arr){
    	int len=arr.length;
    	int index1=0;
    	int index2=len-1;
    	while(index1<index2){
    		while((arr[index1]&0x1)!=0){
    			index1++;
    		}
    		while((arr[index2]&0x1)!=1){
    			index2--;
    		}
    		if(index1<index2){
    			swap(arr,index1,index2);
    		}
    	}
    	
    }
    public void swap(int []arr,int index1,int index2){
		int tmp=arr[index1];
		arr[index1]=arr[index2];
		arr[index2]=tmp;
	}
}
