package jzof;

public class N19 {

	/**
	 * @param args
	 * 正则表达式匹配
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(match("aaa","aba"));
	}
    public static boolean match(String str,String pattern){
            if(str==null || pattern==null)
                return false;
            return matchCore(new StringBuilder(str),0,new StringBuilder(pattern),0);
        }
        public static boolean matchCore(StringBuilder str,Integer strIndex,StringBuilder pattern, Integer patternIndex){
            //如果匹配串和模式串都匹配结束
            if(strIndex==str.length() && patternIndex==pattern.length())
                return true;
            //如果匹配串和模式串只有一个匹配结束
            if(strIndex==str.length() || patternIndex==pattern.length())
                return false;
            //如果模式串的第二个字符不是*或者已经只剩一个字符了
            if(patternIndex==pattern.length()-1|| pattern.charAt(patternIndex+1)!='*'){
                if(pattern.charAt(patternIndex)=='.' || pattern.charAt(patternIndex)==str.charAt(strIndex))
                    return matchCore(str,strIndex+1,pattern,patternIndex+1);
                else
                    return false;
            }
            //如果模式串的第二个字符是*
            else{
                if(pattern.charAt(patternIndex)==str.charAt(strIndex))
                    return matchCore(str,strIndex+1,pattern,patternIndex) ||matchCore(str,strIndex+1,pattern,patternIndex+2);
                else
                    return matchCore(str,strIndex,pattern,patternIndex+2);
            }
    }
    }
    /*	if(str.length()==0||pattern.length()==0){
    		return true;
    	}
    	if(str==null||pattern==null){
    		return false;
    	}
    	return matchCore(str,0,pattern,0);
    }
    public static boolean matchCore(String str,int x1,String pattern,int x2){
    	if(str.length()==0&&pattern.length()==0){
    		return true;
    	}
    	if(str.length()!=0&&pattern.length()==0){
    		return false;
    	}
    	if(pattern.charAt(1)=='*'){
    		if(pattern.charAt(0)==str.charAt(0)||(pattern.charAt(0)=='.'&&str.length()!=0)){
    			return matchCore(str.substring(1),pattern.substring(2))
    					||matchCore(str.substring(1),pattern)
    					||matchCore(str,pattern.substring(2));
    		}else{
    			return matchCore(str,pattern.substring(2));
    		}
    	}
    	if(str.charAt(0)==pattern.charAt(0)){
    		return matchCore(str.substring(1),pattern.substring(1));
    	}
    	return false;
    }*/
