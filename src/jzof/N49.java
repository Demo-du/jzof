package jzof;

public class N49 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        N49 n49=new N49();
        System.out.println(n49.getUgly(15));
	}
    int getUgly(int index){
    	if(index<0){
    		return 0;
    	}
    	int []uglynum=new int[index];
    	uglynum[0]=1;
    	int m2=0;
    	int m3=0;
    	int m5=0;
    	for(int i=1;i<index;i++){
    		int v_min=min(uglynum[m2]*2,uglynum[m3]*3,uglynum[m5]*5);
    		uglynum[i]=v_min;
    		while(uglynum[m2]*2<=uglynum[i]){
    			m2++;
    		}
    		while(uglynum[m3]*2<=uglynum[i]){
    			m3++;
    		}
    		while(uglynum[m5]*2<=uglynum[i]){
    			m5++;
    		}
    	}
    	return uglynum[index-1];
    }
    public int min(int number1,int number2,int number3){
		int min = (number1<number2)?number1:number2;
		return min <number3?min:number3;
	}
}
