package jzof2;

import java.util.Comparator;
import java.util.PriorityQueue;


public class N41 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr=new int[]{4,5,1,6,2,7,3,8};
        N41 n41=new N41();
        for(int i=0;i<arr.length;i++){
        	n41.insert(arr[i]);
        }
        n41.getmid();
	}
    PriorityQueue<Integer> minstack=new PriorityQueue<Integer>();
    PriorityQueue<Integer> maxstack=new PriorityQueue<Integer>(15,new Comparator<Integer>(){

		@Override
		public int compare(Integer o1, Integer o2) {
			// TODO Auto-generated method stub
			return o2-o1;
		}
    	
    });
    int cnt=0;
    public void insert(int num){
    	cnt++;
    	if((cnt&1)==0){
    		if(!maxstack.isEmpty()&&num<maxstack.peek()){
    			maxstack.offer(num);
    			num=maxstack.poll();
    		}
    		minstack.offer(num);
    	}else{
    		if(!minstack.isEmpty()&&num>minstack.peek()){
    			minstack.offer(num);
    			num=minstack.poll();
    		}
    		maxstack.offer(num);
    	}
    }
    public void getmid(){
    	if((cnt&1)==0){
    		System.out.println(((double)(maxstack.peek() + minstack.peek()))/2);
    	}else{
    		System.out.println((double)maxstack.peek());
    	}
    }
}
