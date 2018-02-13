package jzof2;


public class N44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		N44 n44=new N44();
        System.out.println(n44.digatindex(1001));
	}
    public int countint(int dig) {
    	if(dig==1) {
    		return 10;
    	}
    	int cnt=(int)Math.pow(10, dig-1);
    	return cnt*9;
    }
    public int beginnum(int dig) {
    	if(dig==1) {
    		return 0;
    	}
    	return (int)Math.pow(10, dig-1);
    }
    public int digatindex(int index,int dig) {
    	int num=beginnum(dig)+index/dig;
    	int index_2=dig-index%dig;
    	for(int i=1;i<index_2;i++) {
    		num/=10;
    	}
    	return num%10;
    }
    public int digatindex(int index) {
    	if(index==0) {
    		return 0;
    	}
    	int dig=1;
    	while(true) {
    		int num=countint(dig);
    		if(index<num*dig) {
    			return digatindex(index,dig);
    		}
    		index-=dig*num;
    		dig++;
    	}
    } 
}
