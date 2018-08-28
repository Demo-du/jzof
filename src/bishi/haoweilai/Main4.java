package bishi.haoweilai;

import java.util.Scanner;

public class Main4{
   public static void main(String[] args) {
	   Scanner in=new Scanner(System.in);
	   int shuliang=in.nextInt();
	   int geshu = in.nextInt();
	   int[] shuzu=new int[shuliang];
	   int zongliang=0;
	   double jieguo=0;

	   for(int i=0;i<shuliang;i++){
           shuzu[i]=in.nextInt();
	   }
	   for(int i=0;i<shuliang;i++){
           zongliang+=shuzu[i];
	   }
	   for(int i=0;i<shuliang;i++){
           jieguo+=(shuzu[i]*geshu/shuliang);
	   }
	   System.out.println(zongliang/jieguo);
}
}
