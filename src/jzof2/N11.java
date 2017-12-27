package jzof2;

public class N11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        N11 n11=new N11();
        int []num={3,4,5,1,2};
        System.out.print(n11.min(num));
	}
    public int min(int []num){
    	if(num.length==0||num==null){
    		return -1;
    	}
    	return min2(num,0,num.length-1);
    }
    public int min2(int []num,int index1,int index2){
    	int mid=(index1+index2)/2;
    	//System.out.println(num[mid]);
    	if(num[mid]>num[mid+1]){
    		return num[mid+1];
    	}
    	if(num[mid]<num[mid-1]){
    		return num[mid];
    	}
    	if(num[mid]>num[index1]){
    		return min2(num,mid,index2);    	
    	}
    	if(num[mid]<num[index2]){
    		return min2(num,index1,mid);
    	}
    	return 0;
    }
}
