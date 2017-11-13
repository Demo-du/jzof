package jzof;

public class N60 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        N60 n60=new N60();
        n60.PritProbability(3);
	}
    public void PritProbability(int num){
    	if(num<1){
    		return;
    	}
    	int [][]arr=new int[2][6*num+1];
    	int flag=0;
    	for(int i=1;i<=6;i++){//第一颗色子
    		arr[0][i]=1;
    	}
    	for(int k=2;k<=num;k++){//2-num颗色子
    		for(int n=k;n<=6*k;n++){//求n出现的次数
    			for(int j=1;j<=n&&j<=6;j++){
    				arr[1-flag][n]+=arr[flag][n-j];
    			}
    		}
    		flag=1-flag;
    	}
    	double total=Math.pow(6,num);
    	for(int i=num;i<=6*num;i++){
    		double ratio=arr[flag][i]/total;
    		System.out.println(i+"占比例："+ratio);
    	}
    }
}
