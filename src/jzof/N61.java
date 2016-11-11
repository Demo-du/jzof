package jzof;

import java.util.Arrays;
import java.util.Comparator;

public class N61 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int []num={0,1,2,3,5};
        N61 n61=new N61();
        System.out.println(n61.IsContinuous(num));
	}
    boolean IsContinuous(int []num){
    	if(num==null||num.length==0){
    		return false;
    	}
    	Arrays.sort(num);
    	int []num2=new int[num.length];
    	for(int i=0;i<num.length;i++){
    		num2[i]=num[num.length-1-i];
    	}
    	int num_0=0;
    	int num_gap=0;
    	for(int i=0;i<num2.length;i++){
    		if(num2[i]==0){
    			num_0++;
    		}
    	}
    	int small=num_0;
    	int big=small+1;
    	while(big<num.length){
    		if(num2[small]==num2[big]){
    			return false;
    		}
    		num_gap+=num[big]-num[small]-1;
    		small++;
    		big++;
    	}
    	return (num_gap>num_0)?false:true;
    }
    
}
