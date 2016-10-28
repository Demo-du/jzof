package jzof;

public class N58_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		N58_2 n58=new N58_2();
		String s="abcdef";
		System.out.println(n58.LeftRotate(s,2));
	}
	public void Reverse(char []str,int index1,int index2){
    	if(str==null||str.length==0){
    		return ;
    	}
    	while(index2>index1){
    		char temp=str[index1];
    		str[index1]=str[index2];
    		str[index2]=temp;
    		index2--;
    		index1++;
    	}
    }
	public String LeftRotate(String s,int n){
		if(s==null||s.length()==0){
			return null;
		}
		char []str=s.toCharArray();
		int index1_1=0;
		int index1_2=n-1;
		int index2_1=n;
		int index2_2=s.length()-1;
		Reverse(str,index1_1,index1_2);
		Reverse(str,index2_1,index2_2);
		Reverse(str,index1_1,index2_2);
		return String.valueOf(str);
	}
}
