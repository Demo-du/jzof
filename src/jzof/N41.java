package jzof;

import java.util.Comparator;
import java.util.PriorityQueue;

public class N41 {

	/**
	 * @param args
	 */
	private PriorityQueue<Integer> minQueue = new PriorityQueue<>();  //最小堆
	private PriorityQueue<Integer> maxQueue = new PriorityQueue<>(15,new Comparator<Integer>() {  
        @Override  
        public int compare(Integer o1, Integer o2) {  
            return o2 - o1;  
        }  
    });  //最大堆
	int count=0;
	public void insert(int num){
		count++;
		if((count&1)==0){
			if(!maxQueue.isEmpty()&&num<maxQueue.peek()){
				maxQueue.offer(num);
				num=maxQueue.poll();
			}
			minQueue.offer(num); 
		}else{  
            if (!minQueue.isEmpty()&&num>minQueue.peek()){  
                minQueue.offer(num);  
                num = minQueue.poll();  
            }  
            maxQueue.offer(num);  
        }  
	}
	public Double GetMedian() {  
        if ((count&1)==0)  
            return ((double)(maxQueue.peek() + minQueue.peek()))/2;  
        else  
            return (double)maxQueue.peek();  
    } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int []arr=new int[]{4,5,1,6,2,7,3,8};
        N41 n41=new N41();
        for(int i=0;i<arr.length;i++){
        	n41.insert(arr[i]);
        }
        System.out.println(n41.GetMedian());
	}

}
