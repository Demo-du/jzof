package jzof;

public class N63 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int []num={9,11,8,5,7,12,16,14};
        N63 n63=new N63();
        System.out.println(n63.MaxDiff(num));
	}
    public int MaxDiff(int []num){
    	if(num==null||num.length<2){
    		return -1;
    	}
    	int min=num[0];
    	int maxdif=0;//num[1]-min;
    	for(int i=1;i<num.length;i++){
    		if(num[i-1]<min){
    			min=num[i-1];
    		}
    		if(num[i]-min>maxdif){
    			maxdif=num[i]-min;
    		}
    	}
    	return maxdif;
    }
}
