package jzof3;

public class N40 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int []a={0,4,5,6,7,8,9,1,2,3,4};
        solve(a,4);
	}
    public static void adj(int []a,int pos,int len){
    	int child;
    	int tmp;
    	for(tmp=a[pos];2*pos+1<=len;pos=child){
    		child=2*pos+1;
    		if(child<len&&a[child]<a[child+1]){
    			child++;
    		}
    		if(a[child]>tmp){
    			a[pos]=a[child];
    		}else{
    			break;
    		}
    	}
    	a[pos]=tmp;
    }
    public static void solve(int []a,int k){
    	int len=k;
    	for(int i=len/2-1;i>=0;i--){
    		adj(a,i,len-1);
    	}
    	for(int i=k;i<a.length;i++){
    		if(a[i]<a[0]){
    			a[0]=a[i];
    			adj(a,0,len-1);
    		}
    	}
    	for(int i=0;i<k;i++){
    		System.out.print(a[i]+" ");
    	}
    }
}
