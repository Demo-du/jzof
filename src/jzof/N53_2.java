package jzof;

public class N53_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		N53_2 n52=new N53_2();
		int []num=new int[]{0,1,2,3,4,6,7};
		int a=n52.getnum(num);
		System.out.println(a);
	}
	public int getnum(int []num){
		if(num==null||num.length==0){
			return -1;
		}
		return getnumcore(num, 0, num.length-1);
	} 
	public int getnumcore(int []num,int start,int end){
		int mid=(start+end)/2;
		if(num[mid]==mid){
			start=mid+1;
		}else{
			if(mid>0&&num[mid-1]==(mid-1)){
				return mid;
			}
			if(num[mid-1]!=(mid-1)){
				end=mid-1;
			}
		}
		int res=getnumcore(num, start, end);
		return res;
	}
}
