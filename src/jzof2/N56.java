package jzof2;

public class N56 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []num=new int[2];
        int []data=new int[]{2,4,3,6,3,2,5,5};
        N56 n56=new N56();
        n56.findnum(data, num);
        System.out.println(num[0]+" "+num[1]);
	}
    public void findnum(int []data,int[]num){
    	if(data==null||data.length==0){
    		return ;
    	}
    	int ressum=0;
    	for(int i=0;i<data.length;i++){
    		ressum^=data[i];
    	}
    	int index=Findfirst(ressum);
    	for(int i=0;i<data.length;i++){
    		if(IsBit(data[i],index)){
    			num[0]^=data[i];
    		}else{
    			num[1]^=data[i];
    		}
    	}
    }
    public int Findfirst(int num){
    	int index=0;
    	while((num&1)==0){
    		num=num>>1;
    		index++;
    	}
    	return index;
    }
    public boolean IsBit(int num,int index_bit){
    	num=num>>index_bit;
    	return (num&1)==1?true:false;
    }
}
