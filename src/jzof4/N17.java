package jzof4;

public class N17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=1;
        char []nums=new char[n];
        int index=0;
        solve(n,nums,index);
	}
    public static void solve(int n,char []nums,int index) {
    	if(index>=n) {
    		System.out.println(conver(String.valueOf(nums)));
    		return;
    	}
    	for(int i=0;i<10;i++) {
    		nums[index]=(char) (i+'0');
    		solve(n,nums,index+1);
    	}
    }
    public static String conver(String s) {
    	int index=0;
    	for(int i=0;i<s.length();i++) {
    		if(s.charAt(i)!='0'||i==s.length()-1) {
    			index=i;
    			break;
    		}
    	}
    	return s.substring(index);
    }
}
