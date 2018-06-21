package jzof;

public class N10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(Fibonacci(4));
	}
	//求斐波那契系数，后面的蛤蟆跳台阶是一样的
	public static  int Fibonacci(int n){
		int []f=new int [n+1]; //f（n）对应n的结果
        f[0]=1;
        f[1]=1;
        for(int i=2;i<=n;i++){
        	f[i]=f[i-1]+f[i-2];
        }
		return f[n];
	}

}
