package jzof2;



public class N58 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="I am a student.";
        N58 n58=new N58();
        System.out.println(n58.Rev(s));
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
    public String Rev(String s){
    	if(s.length()==0||s==null){
    		return null;
    	}
    	char[]str=s.toCharArray();
    	int index1=0;
    	int index2=str.length-1;
    	Reverse(str,index1,index2);
    	index2=0;
    	while(index2<str.length){
    		/*if(str[index1]==' '){
    			index1++;
    			index2++;
    		}else */if(str[index2]==' '||index2==str.length-1){
    			Reverse(str,index1,index2-1);
    			index2++;
    			index1=index2;
    		}else{
    			index2++;
    		}
    	}
    	return String.valueOf(str);
    }
}
