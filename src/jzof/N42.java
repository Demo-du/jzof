package jzof;

public class N42 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        N42 n42=new N42();
        int [] arr=new int[]{1,-2,3,10,-4,7,2,-5};
        System.out.println(n42.findmax(arr));
	}
    public int findmax(int [] arr){
    	if(arr==null||arr.length==0){
    		return -1;
    	}
    	int max=0;
    	int newsum=0;
    	for(int i=0;i<arr.length;i++){
    		//newsum+=arr[i];
    		if(newsum<0){
    			newsum=arr[i];
    		}else{
    			newsum+=arr[i];
    		}
    		if(newsum>max){
    			max=newsum;
    		}
    	}
    	return max;
    }
}
