/* 演習6-17 6人の2科目の点数を読み込み科目ごとの平均、学年ごとの平均を表示せよ
 * 
 * 作成日 2017年6月16日
 * 
 * 作成者 平澤敬介
 */

package e_06_17;

import java.util.Random;
import java.util.Scanner;

public class e_06_17 {

	public static void main(String[] args) {
		
		Random set_rand_value = new Random();					//乱数の種を生成
		Scanner set_value = new Scanner(System.in);			//点数を入力する領域を確保
		
		int[][][] test_student = new int[3][2][6];			//3学年6人のの生徒の2科目の点数を表した配列
		int[][] test_sum = new int[3][2];						//学年ごと科目のテストの平均を表した配列
		int[] test_total = new int[3];						//学年の平均点を表した配列
		
		//学年を操作するループ処理
		for(int i=0; i < 3; i++) {
			
			//科目を操作するループ処理 0->国語 1->数学
			for(int j=0; j < 2; j++) {
				
				//科目を表示するためif文を設けます
				if(j == 0) {
					System.out.println("国語");
				} else {
					System.out.println("数学");
				}
				
				//生徒数を操作するループ処理
				for(int k=0; k < 6; k++) {
					
					// 0 ～ 100 点をランダムに代入します
					test_student[i][j][k] = set_rand_value.nextInt(100);
					test_total[i] += test_student[i][j][k];		//学年毎の点数を格納
					test_sum[i][j] += test_student[i][j][k];	//学年科目ごとの点数を格納
					
					//加算した点数を表示させます
					System.out.printf((i + 1) + "学年 生徒" + (k + 1) + " : " + "%3d",test_student[i][j][k]);
					System.out.print("点 ");
				}
				System.out.println();
			}
		}
		
		//学年を操作するループ処理
		for(int i=0; i < 3; i++) {
			
			// 人数 × 科目で割り平均を出します
			System.out.println((i + 1) + "学年 平均点 : " + (double)(test_total[i] / 12) + " ");
		}
		
		//学年を操作するループ処理
		for(int i=0; i < 3; i++) {
			
			System.out.println(i + 1 + "学年 ");
			
			//科目を操作するループ処理 0->国語 1->数学
			for(int j=0; j < 2; j++) {
				
				//科目を表示するためif文を設けます
				if(j == 0) {
					System.out.print("国語 ");
				} else {
					System.out.print("数学 ");
				}
				
				//学年科目ごとの平均点を表示します
				System.out.println("平均点 : " + (double)(test_sum[i][j] / 6));
			}
		}
		
		//数値を入力するために確保していた領域を解放する
		set_value.close();
	}
}
