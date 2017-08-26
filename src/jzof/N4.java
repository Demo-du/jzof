package jzof;

public class N4 {
    static boolean search(int nums[][],int rows,int columns,int n) {
    	boolean res=false;
    	if(rows>0&&columns>0&&nums!=null) {
    		int x=0,y=columns-1;
    		while(x<rows&&y>=0) {
    			if(nums[x][y]>n) {
    				y--;
    			}else if(nums[x][y]<n) {
    				x++;
    			}else {
    				res=true;
    				break;
    			}
    		}
    	}
    	return res;
    }
	public static void main(String[] args) {
		int [][]a= {{1,2,3,4,5},{2,3,4,5,6},{3,4,5,6,7}};
        System.out.print(search(a,3,5,1));
	}

}
