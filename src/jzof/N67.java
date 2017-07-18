package jzof;

public class N67 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public long StrToInt(String str){
        if(str == null)
        	return Long.MIN_VALUE; // 输入非法还是抛异常提示或者约定
        if(str.length() == 0)
        	return 0;

        // 判断输入字符串是否合法
        for (int i = 0; i < str.length(); i++) {
            if (!judge(str.charAt(i))) {
                return Long.MIN_VALUE;
            }
        }

        char chars[] = str.toCharArray();
        long result = 0;
        if(chars[0] == '-' || chars[0] == '+'){ // 有符号数
            result = trans(str.substring(1));
        }else{ // 无符号数
            result = trans(str);
        }

        if(result > 0 && chars[0] == '-') result = -result;

        return result;
    }

    private long trans(String str){
        if(str.length() == 0) return 0;

        long result = 0;
        for(int i=0; i<str.length(); i++){
            result = result*10 + (str.charAt(i)-'0');
            if(result > Long.MAX_VALUE){
                result = Long.MIN_VALUE;
                break;
            }
        }
        return result;
    }

    private boolean judge(char c){
        if(c == '-' || c == '+') return true;
        if(c >= '0' && c <= '9') return true;

        return false;
    }
}
