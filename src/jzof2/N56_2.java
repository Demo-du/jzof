package jzof2;

public class N56_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		N56_2 n56=new N56_2();
		int []num=new int []{1,2,2,2,3,3,3};
		System.out.println(n56.findnum(num));
	}
    public int findnum(int []data){
    	if(data==null||data.length==0){
    		return -1;
    	}
    	int []bitsum=new int[32];
    	for(int i=0;i<data.length;i++){
    		int n_num=data[i];
    		for(int j=31;j>=0;j--){
    			int nbit=n_num&1;
    			bitsum[j]+=nbit;
    			n_num=n_num<<1;
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
