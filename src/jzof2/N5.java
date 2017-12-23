package jzof2;

public class N5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        N5 n5 =new N5();
        System.out.println(n5.rep("We are happy."));
	}
    public String rep(String s){
    	if(s.length()<=0||s==null){
    		return null;
    	}
    	int num_blank=0;
    	for(int i=0;i<s.length();i++){
    		if(s.charAt(i)==' '){
    			num_blank++;
    		}
    	}
    	int index1=0;
    	int index2=0;
    	char []arr=new char[s.length()+num_blank*2];
    	for(int i=0;i<arr.length;i++){
    		if(s.charAt(index1)!=' '){
    			arr[i]=s.charAt(index1);
    			index1++;
    		}else{
    			arr[i++]='%';
    			arr[i++]='2';
    			arr[i]='0';
    			index1++;
    		}
    	}
    	return String.valueOf(arr);
    } 
}
