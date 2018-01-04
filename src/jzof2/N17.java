package jzof2;

public class N17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        N17 n17=new N17();
        n17.print1(1);
	}
    public void print1(int n){
    	if(n<=0){
    		return ;
    	}
    	char []num=new char[n];
    	for(int i=0;i<10;i++){
    		num[0]=(char)(i+'0');
    		Print1ToMaxOfDigitsRecursively(num,n,0);
    	}
    }
    public void Print1ToMaxOfDigitsRecursively(char []num,int n,int index){
    	if(index==n-1){
    		PrintNum(num);
    		return;
    	}
    	for(int i=0;i<10;i++){
    		num[index+1]=(char) (i+'0');
    		Print1ToMaxOfDigitsRecursively(num,n,index+1);
    	}
    }
    public void PrintNum(char [] nums){
    	boolean isBegining=true;
    	int nLength=nums.length;
    	for(int i=0;i<nLength;i++){
    		if(isBegining&&nums[i]!='0'){
    			isBegining=false;
    		}
    		if(i==nLength-1&&nums[i]=='0'&&isBegining){
    			System.out.print(nums[i]);
    		}
    		if(!isBegining){
    			System.out.print(nums[i]);
    		}
    	}
    	System.out.println();
    }
}
