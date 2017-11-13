package jzof;

import java.util.LinkedList;
import java.util.List;

public class N59 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int []num=new int[]{2,3,4,2,6,2,5,1};
        N59 n59=new N59();
        int []res=n59.maxInWindows(num, 3);
        for(int i=0;i<res.length;i++){
        	System.out.print(res[i]);
        }
	}
    public int [] maxInWindows(int []num,int size){
    	if(num==null||num.length<size){
    		return null;
    	}
    	int [] res=new int[num.length-size+1];
    	List<Integer> index=new LinkedList<Integer>();
    	for(int i=size-1;i<num.length;i++){
    		while(!index.isEmpty()&&(i-index.get(0)+1>size)){//超过滑窗长度
    			index.remove(0);
    		}
    		while(!index.isEmpty()&&(num[index.get(index.size()-1)]<=num[i])){
    			//System.out.println("1:"+index.size());
    			index.remove(index.size()-1);
    			//System.out.println("2:"+index.size());
    		}
    		//System.out.println("1"+index);
    		index.add(index.size(), i);
    		//System.out.println("2"+index);
    		res[i-size+1]=num[index.get(0)];
    	}
    	return res;
    }
}
