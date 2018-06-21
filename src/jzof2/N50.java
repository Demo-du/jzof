package jzof2;

public class N50 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        N50 n50=new N50();
        System.out.println(n50.findnotpeat("abaccdeff"));
	}
    public char findnotpeat(String str){
    	if(str==null||str.length()==0){
    		return '\77';
    	}
    	int []hash=new int[256];
    	for(int i=0;i<str.length();i++){
    		hash[str.charAt(i)]++;
    	}
    	for(int i=0;i<str.length();i++){
    		if(hash[str.charAt(i)]==1){
    			return str.charAt(i);
    		}
    	}
    	return '\77';
    }
}
