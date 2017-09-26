package jzof;

public class N17 {

	/**
	 * @param args
	 * 打印从1到最大的n位数
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//char [] nums=new char []{'0','1','2'};
		//PrintNum(nums);
		Print1ToMaxOfDigits(2);
	}
    public static void Print1ToMaxOfDigits(int n){
    	if(n<=0){
    		return ;
    	}
    	char[] numbers=new char[n];
    	for(int i=0;i<10;i++){
    		numbers[0]=(char) (i+'0');
    		Print1ToMaxOfDigitsRecursively(numbers,n,0);
    	}
    }
    public static void Print1ToMaxOfDigitsRecursively(char []numbers,int length,int index){
    	if(index==length-1){
    		PrintNum(numbers);
    		return;
    	}
    	for(int i=0;i<10;i++){
    		numbers[index+1]=(char) (i+'0');
    		Print1ToMaxOfDigitsRecursively(numbers,length,index+1);
    	}
    }
    public static void PrintNum(char [] nums){
    	boolean isBegining=true;
    	int nLength=nums.length;
    	for(int i=0;i<nLength;i++){
    		if(isBegining&&nums[i]!='0'){
    			isBegining=false;
    		}
    		if(!isBegining){
    			System.out.print(nums[i]);
    		}
    	}
    	System.out.println();
    }
}
