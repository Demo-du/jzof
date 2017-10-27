package jzof;

public class N37 {

	/**
	 * @param args
	 */
	public  int index=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode2 n1=new TreeNode2(8);
		TreeNode2 n2=new TreeNode2(6);
		TreeNode2 n3=new TreeNode2(10);
		TreeNode2 n4=new TreeNode2(5);
		TreeNode2 n5=new TreeNode2(7);
		TreeNode2 n6=new TreeNode2(9);
		TreeNode2 n7=new TreeNode2(11);
		n1.left=n2;
		n1.right=n3;
		n2.left=n4;
		n2.right=n5;
		n3.left=n6;
		n3.right=n7;
		String ss="124$$$35$$6$$";
		TreeNode2 ee=null;
		N37 n37=new N37();
		ee=n37.Deserialize(ss.toCharArray(),0);
		n37.Serialize(ee);
	}
	public void Serialize(TreeNode2 root){
		if(root==null){
			System.out.print("$");
			return ;
		}
		System.out.print(root.value);
		Serialize(root.left);
		Serialize(root.right);
	}
	public TreeNode2 Deserialize(char []strings, int x){ 
		x=index;
        TreeNode2 newNode = null;
        if(index < strings.length){
            if(strings[index]!='$'){
                newNode = new TreeNode2(Integer.valueOf((strings[index])-48));
                index++;
                newNode.left = Deserialize(strings, index);
                index++;
                newNode.right = Deserialize(strings, index);
            }
        }
        return newNode;
    }
	/*public TreeNode2 Deserialize(char [] str,int index){
		
		TreeNode2 newroot=null;
		System.out.println("llindex:"+index);
		if(index<str.length){
			//System.out.println("index:"+index);
			if(str[index]!='$'){	
				
				 newroot=new TreeNode2(Integer.valueOf(str[index])-48);
				//System.out.println(index+" ");
				// newroot.left=Deserialize(str,index+1);
				newroot.left=Deserialize(str,2*index+1);
				newroot.right=Deserialize(str,2*index+2);
				
			}
			
		}
		
		return newroot;
	}*/

}
