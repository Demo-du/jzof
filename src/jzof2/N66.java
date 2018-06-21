package jzof2;


public class N66 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int []A={1,2,3};
        N66 n66=new N66();
        //String s=new String(n66.multiply(A)[0]);
        int []B=n66.multiply(A);
        System.out.print("结果:");
        for(int i=0;i<A.length;i++){
        	System.out.print(B[i]+" ");
        }
	}
    public int[]multiply(int[]A){
    	if(A==null||A.length<=1){
    		return null;
    	}
    	int B[]=new int[A.length];
    	int C[]=new int[A.length];
    	int D[]=new int[A.length];
    	C[0]=1;
    	D[A.length-1]=1;
    	for(int i=1;i<A.length;i++){
    		C[i]=C[i-1]*A[i-1];
    	}
    	for(int i=A.length-2;i>=0;i--){
    		D[i]=D[i+1]*A[i+1];
    	}
    	for(int i=0;i<A.length;i++){
    		B[i]=C[i]*D[i];
    	}
    	return B;
    }
}
