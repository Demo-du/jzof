package jzof2;

public class N65 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        N65 n65=new N65();
        System.out.println(n65.Add(5, 17));
	}
    public int Add(int num1,int num2){
    	int sum=0;
    	int carry=0;
    	while(num2!=0){
    		sum=(num1^num2);
    		carry=(num1&num2)<<1;
    		num1=sum;
    		num2=carry;
    	}
    	return sum;
    }
}
