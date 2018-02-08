package jzof2;


public class N48 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		N48 n48=new N48();
        String a="arabcacfr";
        System.out.println(n48.longwithoutdup(a));
	}
    public int longwithoutdup(String str){
    	char []s=str.toCharArray();
    	int cur=0;
    	int maxlen=0;
    	int []pos=new int [26];
    	for(int i=0;i<26;i++){
    		pos[i]=-1;
    	}
    	for(int i=0;i<str.length();i++){
    		int pre=pos[s[i]-'a'];
    		if(pre<0||i-pre>cur){
    			cur++;
    		}else{
    			if(cur>maxlen){
    				maxlen=cur;
    			}
    			cur=i-pre;
    		}
    		pos[s[i]-'a']=i;
    	}
    	if(cur>maxlen){
			maxlen=cur;
		}
    	return maxlen;
    }
}
