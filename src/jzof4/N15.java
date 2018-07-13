package jzof4;

public class N15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        solve(2);
	}
    public static void solve(int n) {
    	int cnt=0;
    	while(n>0) {
    		cnt++;
    		n=n&(n-1);
    	}
    	System.out.println(cnt);
    }
}
