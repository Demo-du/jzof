package jzof;

public class N50_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String a="abaccdeff";
        N50_1 n50=new N50_1();
        System.out.println(n50.first(a));
	}
    public char first(String a){
    	if(a==null||a.length()==0){
    		return '\77';
    	}
    	int [] table=new int[256];
    	for(int i=0;i<256;i++){
    		table[i]=0;
    	}
    	char [] str=a.toCharArray();
    	for(int i=0;i<str.length;i++){
    		table[str[i]]++;
    	}
    	for(int i=0;i<str.length;i++){
    		if(table[str[i]]==1){
    			//System.out.println("aa");
    			return str[i];
    		}
    	}
    	return '\77';
    }
}
