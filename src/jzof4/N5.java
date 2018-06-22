package jzof4;

public class N5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="We Are happy";
        solve(s);
	}
    public static void solve(String s) {
    	int num_b=0;
    	for(int i=0;i<s.length();i++) {
    		if(s.charAt(i)==' ') {
    			num_b++;
    		}
    	}
    	char []str=new char[s.length()+num_b*2];
    	int p1=s.length()-1;
    	int p2=str.length-1;
    	while(p1>=0&&p2>=0) {
    	    if(s.charAt(p1)!=' ') {
    	    	str[p2]=s.charAt(p1);
    	    }else {
    	    	str[p2--]='0';
    	    	str[p2--]='2';
    	    	str[p2]='%';
    	    }
    	    p1--;
    	    p2--;
    	}
    	System.out.println(String.valueOf(str));
    }
}
