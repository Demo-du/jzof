package jzof;

public class N20 {

	/**
	 * @param args
	 * 表示数值的字符串
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(isNumeric("+123.1e-2"));
	}
    public static int index=0;
    public static boolean isNumeric(String str){
    	if(str==null||str.length()==0){
    		return false;
    	}
    	boolean numeric=sacnInteger(str);//小数点前判断
    	if(index>=str.length()){
    		return numeric;
    	}
    	if(str.charAt(index)=='.'){
    		index++;
    		numeric=scanUnsignedInteger(str)||numeric;
    	}
    	if(index>=str.length()){
    		return numeric;
    	}
    	if(str.charAt(index)=='e'||str.charAt(index)=='E'){
    		index++;
    		if(index>=str.length()){
        		return false;
        	}
    		numeric=numeric&&sacnInteger(str);
    	}
    	System.out.println(index);
    	return numeric&&(index==str.length());
    }
    //匹配小数点后的整数部分
    public static boolean scanUnsignedInteger(String str){
    	int num=0;
    	while (index < str.length() && str.charAt(index) >= '0' && str.charAt(index) <= '9') {
			index++;
			num++;
		}
    	return num>0;
    }
    //匹配小数点前整数
    public static boolean sacnInteger(String str){
    	if(str.charAt(index)=='+'||str.charAt(index)=='-'){
    		index++;
    	}
    	return scanUnsignedInteger(str);
    }
}
