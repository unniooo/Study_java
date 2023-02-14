package Test02;

import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        /*需求：
         * 在歌唱比赛中，有6名评委给选手打分，分数范围是【0 - 100】 之间的整数
         * 选手的最后得分为： 去掉最高分、最低分的4个评委的平均分，请完成上述的过程并计算出选手的得分*/

        int[] scoreArr = getScores();
        for (int i = 0; i < scoreArr.length; i++) {
            System.out.println(scoreArr[i]);
        }

        int max = getMax(scoreArr);

        int min = getMin(scoreArr);

        int sum = getSum(scoreArr);

        int avg = (sum - max - min) / (scoreArr.length - 2);

        System.out.println(avg);

    }

    public static int getSum(int[] scoreArr) {
        int sum = 0;
        for (int i = 0; i < scoreArr.length; i++) {
            sum = sum + scoreArr[i];
        }
        return sum;
    }

    public static int getMax(int[] scoreArr) {
        int max = scoreArr[0];
        for (int i = 1; i < scoreArr.length; i++) {
            if (scoreArr[i] > max) {
                max = scoreArr[i];
            }
        }
        return max;
    }

    public static int getMin(int[] scoreArr) {
        int min = scoreArr[0];
        for (int i = 1; i < scoreArr.length; i++) {
            if (scoreArr[i] > min) {
                min = scoreArr[i];
            }
        }
        return min;
    }


    public static int[] getScores() {
        int[] scores = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; ) {
            System.out.println("请输入评委的打分");
            int score = sc.nextInt();
            if (score >= 0 && score <= 100) {
                scores[i] = score;
                i++;
            } else {
                System.out.println("成绩超出范围，当前i为" + i);
            }
            scores[0] = score;
        }

        return scores;
    }

}
