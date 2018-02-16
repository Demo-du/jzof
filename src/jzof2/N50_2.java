package jzof2;


public class N50_2 {

	/**
	 * @param args
	 */
	int [] table=new int[256];
	String s="";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "google";
		N50_2 n50=new N50_2();
		for(int i=0;i<str.length();i++){
            n50.insert(str.charAt(i));
            System.out.print(n50.find());
        }
	}
    public void insert(char ch){
    	table[ch]++;
    	s+=ch;
    }
    public char find(){
    	char res = '\77'; 
    	for(int i=0;i<s.length();i++){
    		if(table[s.charAt(i)]==1){
    			return s.charAt(i);
    		}
    	}
    	return res;
    }
}
