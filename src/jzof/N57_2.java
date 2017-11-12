package jzof;

public class N57_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        N57_2 n57=new N57_2();
        n57.FIndContion(15);
	}
    public void FIndContion(int sum){
    	if(sum<3){
    		return ;
    	}
    	int small=1;
    	int big=2;
    	int mid=(1+sum)/2;
    	int cursum=small+big;
    	while(small<mid){
    		if(cursum==sum){
    			Print(small,big);
    		}
    		while(cursum>sum&&small<mid){
    			cursum-=small;
    			small++;
    			if(cursum==sum){
        			Print(small,big);
        		}
    		}
    		big++;
    		cursum+=big;
    	}
    }
    public void Print(int small,int big){
    	for(int i=small;i<=big;i++){
    		System.out.print(i+" ");
    	}
    	System.out.println();
    }
}
