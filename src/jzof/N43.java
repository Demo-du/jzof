package jzof;

public class N43 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        N43 n43=new N43();
        int n=21345;
        System.out.println(n43.NumberOf1Between1AndN(n));
	}
    public int NumberOf1Between1AndN(int n){
    	if(n<0){
    		return 0;
    	}
    	char [] str=String.valueOf(n).toCharArray();
    	return NumberOf1(str,0);
    }
    public  int NumberOf1(char [] str,int index){
    	if(str==null||index==str.length||str[index]<'0'||str[index]>'9'){
    		return 0;
    	}//递归终止
    	int first=str[index]-'0';
    	if(first==0&&str.length==1){
    		return 0;
    	}
    	if(first>0&&str.length==1){
    		return 1;
    	}
    	//1在第一位1的数量
    	int num1=0;
    	if(first>1){
    		num1=PowerBase10(str.length-1-index);
    	}
    	if(first==1){
    		num1=atoi(str,index+1);
    	}
    	//1在后几位
    	int num2=first*(str.length-1-index)*PowerBase10(str.length-2-index);
    	//1在前面（位数小于总位数那部分）
    	//System.out.println("index"+index);
    	int num3=NumberOf1(str,index+1);
    	return num1+num2+num3;
    }
    public int atoi(char []str,int index){
    	String res="";
    	for(int i=index;i<str.length;i++){
    		res+=str[i];
    	}
    	return Integer.valueOf(res);
    }
    public int PowerBase10(int n){
    	int res=1;
    	for(int i=0;i<n;i++){
    		res*=10;
    	}
    	return res;
    }
}
