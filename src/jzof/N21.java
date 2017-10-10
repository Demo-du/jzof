package jzof;

import java.util.Arrays;

public class N21 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            int [] a=new int [] {1,2,3,4,5,6,7,8,9,10};
            Reoder(a);
            System.out.println(Arrays.toString(a));
	}
    public static boolean isEven(int n){
    	return (n&1)==0;
    }
    public static void Reoder(int [] pdata){
    	int length=pdata.length;
    	if(length==0||pdata==null){
    		return ;
    	}
    	int index1=0;
    	int index2=length-1;
    	while(index1<index2){
    		while(index1<index2&&!isEven(pdata[index1])){
    			index1++;
    		}
    		while(index1<index2&&isEven(pdata[index2])){
    			index2--;
    		}
    		if(index1<index2){
    			int temp=pdata[index1];
    			pdata[index1]=pdata[index2];
    			pdata[index2]=temp;
    		}
    	}
    	 //return pdata;
    }
   
}
