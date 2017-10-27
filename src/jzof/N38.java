package jzof;

public class N38 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		N38 n38=new N38();
		String s="abcd";
		n38.Permutation(s.toCharArray(), 0);
	}
	public void swap(char [] str,int index1,int index2){
		char temp=str[index1];
		str[index1]=str[index2];
		str[index2]=temp;
	}
	public void Permutation(char []str,int index){
		if(index>=str.length){
			for(int i=0;i<index;i++){
				System.out.print(str[i]);
			}
			System.out.println();
		}else{
			for(int i=index;i<str.length;i++){
				swap(str,i,index);
				Permutation(str,index+1);
				swap(str,i,index);
			}
		}
		
	}

}
