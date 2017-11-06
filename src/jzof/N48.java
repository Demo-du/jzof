package jzof;

public class N48 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        N48 n48=new N48();
        String a="arabcacfr";
        System.out.println(n48.getlong(a));
	}
    int getlong(String a){
    	char []str=a.toCharArray();
    	int cur=0;
    	int maxlength=0;
    	int []f=new int[str.length];//
    	f[0]=1;//
    	int []pos=new int[26];//每个字符上次出现的position
    	for(int i=0;i<26;i++){
    		pos[i]=-1;
    	}
    	for(int i=1;i<str.length;i++){
    		//System.out.println(i+" "+(str[i]-'a'));
    		int temp=pos[str[i]-'a'];
    		if(temp<0||i-temp>f[i-1]){
    				f[i]=f[i-1]+1;
    		}else{
    			f[i]=i-temp;
    			if(f[i]>maxlength){
    				maxlength=f[i];
    			}
    		}
    		pos[str[i]-'a']=i;
    	}
    	if(f[str.length-1]>maxlength){
    		maxlength=f[str.length-1];
    	}
    	return maxlength;
    }
}
