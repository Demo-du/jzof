package jzof2;

public class N33 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public boolean ishouxu(int []num,int index,int length){
    	if(num==null||index<0){
    		return false;
    	}
    	int root=num[num.length-1];
    	int i=0;
    	for(;i<num.length-1;i++){
    		if(num[i]>root){
    			break;
    		}
    	}
    	int j=i;
    	for(;j<num.length-1;j++){
    		if(num[j]<root){
    			return false;
    		}
    	}
    	boolean left=true;
    	if(i>0){
    		left=ishouxu(num,index,i);
    	}
    	boolean right=true;
    	if(i<num.length-1){
    		right=ishouxu(num,i+index,num.length-i-1);
    	}
    	return left&right;
    }
}
