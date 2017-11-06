package jzof;

public class N46 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=12258;
        String str=String.valueOf(a);
        N46 n46=new N46();
        System.out.println(n46.getTrans(str));
	}
    int getTrans(String str){
    	if(str.length()==0){
    		return 0;
    	}
    	if(str.length()==1){
    		return 1;
    	}
    	char []arr=str.toCharArray();
    	int []counts=new int[str.length()];
    	counts[str.length()-1]=1;
    	int t1=arr[str.length()-2]-'0';//判断两位数10位
    	int t2=t1*10+arr[str.length()-1]-'0';
    	if(t2>=10&&t2<=25){
    		counts[str.length()-2]=2;
    	}else{
    		counts[str.length()-2]=1;
    	}
    	for(int i=str.length()-3;i>=0;i--){
    		counts[i]=counts[i+1]+counts[i+2];
    	}
    	return counts[0];
    }
}
