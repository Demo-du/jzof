package jzof;

public class N62 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        N62 n6=new N62();
        System.out.println(n6.LastNum(5, 3));
	}
    public int LastNum(int n,int m){
    	if(n<1||m<1){
    		return -1;
    	}
    	int res=0;
    	int []f=new int[n+1];
    	f[1]=m-1;
    	for(int i=2;i<=n;i++){
    		f[i]=(f[i-1]+m)%i;
    	}
    	return f[n];
    }
}
