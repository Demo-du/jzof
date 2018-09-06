package bishi.meituan;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Created by Administrator on 2018\9\6 0006.
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            int [][]map=new int [n][3];
            for (int i=0;i<n-1;i++){
                int aa=sc.nextInt();
                int bb=sc.nextInt();
                map[i][0]=aa;
                map[i][1]=bb;
                map[i][2]=1;
            }
            solve(map);
        }
    }
    public static void solve(int[][]map) {

        if(map==null) {
            return;
        }
        int hang=map.length;
        int lie=map[0].length;
        Edge []bian=new Edge[hang];
        for(int i=0;i<hang;i++) {
            bian[i]=new Edge();
        }
        int []parent=new int[hang+1];
        for(int i=0;i<hang;i++) {
            bian[i].a=map[i][0];
            bian[i].b=map[i][1];
            bian[i].len=map[i][2];
            parent[bian[i].a]=bian[i].a;
            parent[bian[i].b]=bian[i].b;
        }

        for(int i=0;i<hang;i++) {
            for(int j=i+1;j<hang;j++) {
                if(bian[i].len>bian[j].len) {
                    Edge tmp=new Edge();
                    tmp.a=bian[i].a;
                    tmp.b=bian[i].b;
                    tmp.len=bian[i].len;
                    bian[i].a=bian[j].a;
                    bian[i].b=bian[j].b;
                    bian[i].len=bian[j].len;
                    bian[j].a=tmp.a;
                    bian[j].b=tmp.b;
                    bian[j].len=tmp.len;
                }

            }
        }
        HashSet<Edge> set=new HashSet<Edge>();
        for(int i=0;i<hang;i++) {
            if(iscircle(bian[i],parent)) {

            }else {
                System.out.println("add   "+bian[i].a+" "+bian[i].b);
                set.add(bian[i]);
            }
        }
        System.out.println("sieze "+set.size());
        Iterator<Edge> it=set.iterator();
        while(it.hasNext()) {
            Edge tmp=it.next();
            System.out.println(tmp.a+" "+tmp.b+" "+tmp.len+" ");
        }

    }
    public static boolean iscircle(Edge bian,int []parent) {
        int a=find(bian.a,parent);
        int b=find(bian.b,parent);
        if(a!=b) {
            parent[b]=a;
            return false;
        }
        return true;
    }
    public static int find(int x,int []parent) {
        int r = x;
        while (parent[r] != r)
            r = parent[r];
        return r;
    }
}
class Edge{
    int a;
    int b;
    int len;
    Edge(){}
    Edge(int a,int b,int len){
        this.a=a;
        this.b=b;
        this.len=len;
    }
}