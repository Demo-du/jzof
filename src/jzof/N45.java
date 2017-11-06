package jzof;

public class N45 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr=new int[]{3,32,321};
		N45 n45=new N45();
		System.out.println(n45.Print(arr));

	}
    public String Print(int []arr){
    	if(arr==null||arr.length==0){
    		return null;
    	}
    	String pre=null;
    	String now=null;
    	int temp;
    	String res="";
    	for(int i=0;i<arr.length;i++){
    		for(int j=i+1;j<arr.length;j++){
    			pre=arr[i]+""+arr[j];
    			now=arr[j]+""+arr[i];
    			if(pre.compareTo(now)>0){
    				temp=arr[i];
    				arr[i]=arr[j];
    				arr[j]=temp;
    			}
    		}
    		res+=arr[i];
    	}
    	return res;
    }
}
