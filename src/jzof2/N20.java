package jzof2;

public class N20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        N20 n20=new N20();
        String str="100e2";
        System.out.println(n20.isNum(str));
	}
    public boolean isNum(String str){
    	boolean res=false;
    	int index=0;
    	if(str.charAt(index)=='+'||str.charAt(index)=='-'){
    		index++;
    	}
    	int num=0;
    	for(;index<str.length();index++){//匹配小数点前的整数
    		if(str.charAt(index)>='0'&&str.charAt(index)<='9'){
    			num++;
    		}else{
    			break;
    		}
    	}
    	res=(num>0);
    	num=0;
    	if(index>=str.length()&&res){
    		return true;
    	}
    	if(str.charAt(index)=='.'){
    		index++;
    	}
    	for(;index<str.length();index++){//匹配小数点后的整数
    		if(str.charAt(index)>='0'&&str.charAt(index)<='9'){
    			num++;
    		}else{
    			break;
    		}
    	}
    	res=(num>0)||res;
    	num=0;
    	if(index>=str.length()&&res){
    		return true;
    	}
    	if(str.charAt(index)=='e'||str.charAt(index)=='E'){//判断e
    		index++;
    	}
    	for(;index<str.length();index++){//匹配e后的整数
    		if(str.charAt(index)>='0'&&str.charAt(index)<='9'){
    			num++;
    		}else{
    			break;
    		}
    	}
    	res=(num>0)&&res;
    	num=0;
    	if(index>=str.length()&&res){
    		return true;
    	}
    	
    	return false;
    }
}
