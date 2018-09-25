package jzof5;







import jzof4.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Administrator on 2018\9\25 0025.
 */
public class N32 {
    public static void main(String[] args) {

    }
    public static void print(TreeNode r){
        if (r==null){
            return;
        }
        List<TreeNode> queue=new LinkedList<>();
        queue.add(r);
        int tobeprint=1;
        int nextlevel=0;
        while (!queue.isEmpty()){
            TreeNode tmp=queue.get(0);
            System.out.print(queue.get(0));
            if (tmp.left!=null){
                queue.add(tmp.left);
                nextlevel++;
            }
            if (tmp.right!=null){
                queue.add(tmp.right);
                nextlevel++;
            }
            queue.remove(0);
            tobeprint--;
            if (tobeprint<=0){
                System.out.println();
                tobeprint=nextlevel;
                nextlevel=0;
            }
        }
    }
}
