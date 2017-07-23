package jzof;

public class N50_2 {

	/**
	 * @param args
	 */
	int [] table=new int[256];
	int index=0;
	public N50_2(){
		for(int i=0;i<256;i++){
    		table[i]=-1;
    	}
	}
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
		if(table[ch]==-1)
			table[ch] = index;
        else
        	table[ch] = -2;
        index++;
	}
	public char find(){
        int minIndex = 256;
        char res = '\77'; //若没有只出现一次的字符，显示\77，即？
        for(int i=0;i<256;i++){
        	if(table[i]>=0 && table[i]<minIndex) {
                minIndex = table[i];
                res = (char)i;
            }
        }
        return res;
    }
}
