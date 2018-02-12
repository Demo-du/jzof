package jzof;

import java.util.Arrays;

public class N5 {
    public static String rep(String s) {
    	if(s==null||s.length()<=0) {
    		return "";
    	}
    	int original_lenth=s.length();//字符串长度
    	int count_blank=0;//空格数量
    	
    	for(int i=0;i<s.length();i++) {
    		if(s.charAt(i)==' ') {
    			count_blank++;
    		}
    	}
    	//新字符串长度
    	int new_lenth=s.length()+count_blank*2;
    	//新字符串数组
    	char [] shuzu=new char [new_lenth];
    	for(int i=0;i<s.length();i++) {
    		shuzu[i]=s.charAt(i);
    	}
    	int index_original=original_lenth-1;//指向使用过的字符串的尾部
    	int index_new=new_lenth-1;//指向新字符串尾部
    	while(index_original>=0&&index_new>index_original) {
    		if(shuzu[index_original]==' ') {
    			shuzu[index_new--]='0';
    			shuzu[index_new--]='2';
    			shuzu[index_new--]='%';
    		}else {
    			shuzu[index_new--]=shuzu[index_original];
    			//index_new--;
    		}
    		index_original--;
    	}
    	return String.valueOf(shuzu);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(rep("ww hasdf "));
	}

}
