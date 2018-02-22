package jzof2;

public class N46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        N46 n46=new N46();
        System.out.println(n46.getnum("12258"));
	}
    public int getnum(String str) {
    	if(str.length()==0) {
    		return 0;
    	}
    	if(str.length()==1) {
    		return 1;
    	}
    	int []res=new int [str.length()];
    	res[str.length()-1]=1;
    	if(str.length()>=2) {
			int n1=(str.charAt(str.length()-2)-'0')*10+(str.charAt(str.length()-1)-'0');
			if(n1>=10&&n1<=25) {
				res[str.length()-2]=2;
			}else {
				res[str.length()-2]=1;
			}
			//return res[0];
		}
    	for(int i=str.length()-3;i>=0;i--) {
    			int n2=(str.charAt(i)-'0')*10+(str.charAt(i+1)-'0');
    			int flag=0;
    			if(n2>=10&&n2<=25) {
    				flag=1;
    			}
    			res[i]=res[i+1]+flag*res[i+2];
    		
    	}
    	return res[0];
    }
}
