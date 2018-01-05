package jzof2;

public class N19 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        N19 n19=new N19();
        String str="aaa";
        String pat="ab*ac*a";
        System.out.println(n19.match(str, 0, pat, 0));
	}
    public boolean match(String str,int index1,String pat,int index2){
    	if(str==null||pat==null||str.length()==0||pat.length()==0){
    		return false;
    	}
    	return matchcore(str,index1,pat,index2);
    }
    public boolean matchcore(String str,int index1,String pat,int index2){
    	if(index1==str.length()&&index2==pat.length()){
    		return true;
    	}
    	if(index1==str.length()||index2==pat.length()){
    		return false;
    	}
    	if(str.charAt(index1)==pat.charAt(index2)||pat.charAt(index2)=='.'&&index1!=str.length()&&index2!=str.length()){
    		return matchcore(str,index1+1,pat,index2+1);
    	}
    	if(pat.charAt(index2+1)=='*'){
    		if(str.charAt(index1)==pat.charAt(index2)||pat.charAt(index2)=='.'&&index1!=str.length()&&index2!=str.length()){
    			return matchcore(str,index1+1,pat,index2+2)//*前出现一次
    					||matchcore(str,index1+1,pat,index2)//*前出现多次
    					||matchcore(str,index1,pat,index2+2);//*前出现0次
    		}else{
    			return matchcore(str,index1,pat,index2+2);//*前出现0次
    		}
    	}
    	return false;
    }
}
