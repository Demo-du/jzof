package jzof;

public class N56_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []num=new int []{1,2,2,2,3,3,3};
		N56_2 n56=new N56_2();
		System.out.println(n56.findnum(num));
	}
    int findnum(int []num){
    	if(num==null||num.length==0){
    		return -1;
    	}
    	int []bitsum=new int[32];
    	for(int i=0;i<num.length;i++){
    		int now_num=num[i];
    		for(int j=31;j>=0;j--){
    			int bit=now_num&1;
    			bitsum[j]+=bit;
    			now_num=now_num<<1;
    		}
    	}
    	int res=0;
    	for(int i=0;i<32;i++){
    		res=res<<1;
    		res+=bitsum[i]%3;
    	}
    	return res;
    }
}
