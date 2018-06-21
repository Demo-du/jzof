package jzof2;

public class N57_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		N57_2 n52=new N57_2();
		n52.find(15);
	}
	public void find(int sum){
		if(sum<3){
			return ;
		}
		int index1=0;
		int index2=1;
		int c_sum=1;
		int mid=(1+sum)/2;
		while(index1<mid){
			//System.out.println("index1"+index1+"index2"+index2);
			//System.out.println(c_sum);
			if(c_sum==sum){
				Print(index1,index2);
				c_sum-=index1;
				index1++;
			}else if(c_sum>sum){
				c_sum-=index1;
				index1++;
			}else{
				index2++;
				c_sum+=index2;
			}
		}
	}
	public void Print(int small,int big){
    	for(int i=small;i<=big;i++){
    		System.out.print(i+" ");
    	}
    	System.out.println();
    }
}
