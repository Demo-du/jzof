package jzof2;


public class N57_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []data=new int[]{1,2,4,7,11,15};
        int sum=15;
        int []num=new int[]{0,0};
        N57_1 n57=new N57_1();
        n57.Find(data, sum, num);
        System.out.println(num[0]+" "+num[1]);
	}
    public void Find(int []data,int k,int[]num){
    	if(data==null||data.length==0){
    		return ;
    	}
    	int index1=0;
    	int index2=data.length-1;
    	while(index2>index1){
    		int cursum=data[index1]+data[index2];
    		if(cursum==k){
    			num[0]=data[index1];
    			num[1]=data[index2];
    			break;
    		}else if(cursum>k){
    			index2--;
    		}else{
    			index1++;
    		}
    	}
    }
}
