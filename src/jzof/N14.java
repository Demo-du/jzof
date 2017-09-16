package jzof;

public class N14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(sol1(5));
	}
    /*
     * 动态规划方法
     */
	public static int sol1(int length){
		if(length<2){
			return 0;
		}
		if(length==2){
			return 1;
		}
		if(length==3){
			return 2;
		}
		int []products=new int[length+1];
		products[0]=0;
		products[1]=1;
		products[2]=2;
		products[3]=3;
		int max=0;
		for(int i=4;i<=length;i++){
			max=0;
			for(int j=0;j<=i/2;j++){
				int product=products[j]*products[i-j];
				max=Math.max(max, product);
				products[i]=max;
			}
		}
		max=products[length];
		return max;
	}
	/*
	 * 贪心算法
	 */
	public static int sol2(int length){
		if(length<2){
			return 0;
		}
		if(length==2){
			return 1;
		}
		if(length==3){
			return 2;
		}
		int of3=length/3;
		if(length-of3*3==1){
			of3-=1;
		}
		int of2=(length-of3*3)/2;
		return (int) ((Math.pow(3, of3))*(Math.pow(2, of2)));
	}
}
