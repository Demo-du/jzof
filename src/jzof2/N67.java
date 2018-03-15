package jzof2;

public class N67 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        N67 n67=new N67();
        System.out.println(n67.strtoint("-12"));
	}
    public int strtoint(String s){
    	if(s==null||s.length()==0){
    		illegal();
    		return -1;
    	}
    	int flag=1;
    	int res=0;
    	char []str=s.toCharArray();
    	int index=0;
    	if(str[index]=='-'){
    		flag=-1;
    		index++;
    	}else if(str[index]=='+'){
    		flag=1;
    		index++;
    	}
    	for(;index<s.length();index++){
    		if(str[index]>='0'&&str[index]<='9'){
    			res=res*10+str[index]-'0';
    		}else{
    			illegal();
        		return -1;
    		}
    	}
    	return res*flag;
    }
    public void illegal(){
    	System.out.println("不合法");
    }
}
