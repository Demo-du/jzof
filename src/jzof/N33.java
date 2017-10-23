package jzof;

public class N33 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []seq={5,7,6,9,11,10,8};
		int [] a2={7,4,6,5};
		System.out.println(check(seq,0,7));

	}
	public static boolean check(int []seq,int index,int length){
		if(seq==null||index<0||length<=0){
			return false;
		}
		int i=0;
		int root=seq[length-1];
		for(;i<length-1;i++){
			if(seq[i]>root){
				//System.out.println(seq[i]+">"+root);
				break;
			}
		}
		int j=i;
		System.out.println("次数"+j);
		for(;j<length-1;j++){
			System.out.println(seq[j]);
			if(seq[j]<root){
			//	System.out.println(seq[i]+"<"+root);
				return false;
			}
		}
		boolean left=true;
		if(i>0){
			left=check(seq,index,i);
		}
		boolean right=true;
		if(i<length-1){
			right=check(seq,index+i,length-i-1);
		}
		return (left&&right);
	}

}
