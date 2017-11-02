package jzof;

public class N44 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        N44 n44=new N44();
        System.out.println(n44.digiAtIndex(1001));
	}
	public int digiAtIndex(int index){
		if(index<0){
			return -1;
		}
		int digits=1;
		while(true){
			int num=countOfIntegers(digits);
			if(index<num*digits){
				return digiAtIndex(index,digits);
			}
			index-=num*digits;
			digits++;
		}
	}
	public int countOfIntegers(int digits){//m位数字数量
		if(digits==1){
			return 10;
		}
		int n=(int) Math.pow(10, digits-1);
		return 9*n;
	}
	public int beginNumber(int n){//每一位数字开始数字
		if(n==1){
			return 0;
		}
		return (int) Math.pow(10,n-1);
	}
	public int digiAtIndex(int index,int digits){
		int num=beginNumber(digits)+index/digits;
		int indexFromright=digits-index%digits;
		for(int i=1;i<indexFromright;i++){
			num/=10;
		}
		return num%10;
	}

}
