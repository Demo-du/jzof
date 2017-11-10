package jzof;

public class N56 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int []num=new int[2];
        int []data=new int[]{2,4,3,6,3,2,5,5};
        N56 n56=new N56();
        n56.FindNum(data, num);
        System.out.println(num[0]+" "+num[1]);
	}
	public void FindNum(int []data,int[]num){
		if(data==null||data.length<2){
			return;
		}
		int res=0;
		for(int i=0;i<data.length;i++){
			res^=data[i];
		}
		num[0]=0;
		num[1]=0;
		int index=FindFirstBit(res);
		for(int j=0;j<data.length;j++){
			if(IsBit(data[j],index)){
				num[0]^=data[j];
			}else{
				num[1]^=data[j];
			}
		}
	}
    public boolean IsBit(int num,int index_bit){
    	num=num>>index_bit;
    	return (num&1)==1?true:false;
    }
    public int FindFirstBit(int num){
    	int index=0;
    	while((num&1)==0){
    		num=num>>1;
    		index++;
    	}
    	return index;
    }
}
