package bishi.didi;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args){
        Scanner shuru = new Scanner(System.in);
        String[] line = shuru.nextLine().split(" ");
        String jieguo = line[0];
        int[] scores = new int[line.length];
        for(int i=1; i<line.length; ++i){
            scores[i] = getScore1(jieguo, line[i]);
        }

        List<Integer> list = getIndexs(scores);
        for(int i=0; i<list.size()-1; i++){
            System.out.print(line[list.get(i)] + " ");
        }
        System.out.println(line[list.get(list.size()-1)]);

    }

    public static List<Integer> getIndexs(int[] scores){
        int index1=-1, index2=-1, index3=-1;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int min3 = Integer.MAX_VALUE;

        for(int i=1; i<scores.length; i++){
            if(min1 > scores[i] ){
                min3 = min2;
                index3 = index2;

                min2 = min1;
                index2 = index1;

                min1 = scores[i];
                index1 = i;
            }

            else if(min2 > scores[i]){
                min3 = min2;
                index3 = index2;

                min2 = scores[i];
                index2 = i;
            }

            else if(min3 > scores[i]){
                min3 = scores[i];
                index3 = i;
            }

        }
        List<Integer> list = new ArrayList<>();
        list.add(index1);
        list.add(index2);
        list.add(index3);
        return list;
    }

    public static int getScore1(String word1, String word2) {
        int[][] dp = new int[word1.length()+1][word2.length()+1];
        dp[0][0] = 0;
        int score = 0;
        for(int i=0; i<=word1.length(); ++i)
            dp[i][0] = i;
        for(int j=0; j<=word2.length(); ++j)
            dp[0][j] = j;
        for(int i=1; i<=word1.length(); ++i){
            for(int j=1; j<=word2.length(); ++j){
                if(word1.charAt(i-1) == word2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }else{

                    dp[i][j] = Math.min(dp[i][j], Math.min(dp[i-1][j], dp[i][j-1])) + 1;
                    if(dp[i][j] == dp[i][j] + 1){
                        if(word1.contains(String.valueOf(word2.charAt(j-1)))){
                            score += 1;
                        }else{
                            score += 2;
                        }
                    }else{
                        score +=3;
                    }
                }
            }
        }
//        return dp[word1.length()][word2.length()] * 3;
        return score;
    }

}