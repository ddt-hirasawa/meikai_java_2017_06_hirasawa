/* 演習6-19 クラスの数、クラスに所属する人数を読み込み、合計と平均を表示せよ
 * 
 * 作成日 2017年6月16日
 * 
 * 作成者 平澤敬介
 */

package e_06_19;

import java.util.Scanner;

public class e_06_19 {

	public static void main(String[] args) {
		
		Scanner set_value = new Scanner(System.in); 	    // 数値を入力するための領域を確保する
		
		//キーボードからクラス数を決定
		System.out.print("クラス数 : ");
		int Class = set_value.nextInt();					//クラス数をキーボードから入力
		int[] student = new int[Class];					//クラスに所属する人数を補完するための配列
		int[] test_result = new int[Class];				//点数を補完する変数を定義
		int sum = 0;										//全員のテストの合計の変数
		
		//クラス数分、点数をしていくループ処理
		for(int i=0; i < Class; i++) {
			
			//クラスに所属する人数を入力
			System.out.print(i + 1 + "組の人数 : ");
			student[i] = set_value.nextInt();				//クラスの人数をクラスごとに補完する
			
			//クラスに所属する人数分、点数を入力していくループ
			for(int j=0; j < student[i]; j++) {
				
				System.out.print(i + 1 + "組" + (j + 1) + "番の点数 : ");
				test_result[i] += set_value.nextInt();		//テストの点数を入力 0 ～ 100点までが普通のテスト
			}
			
			sum += test_result[i];							//全学年の合計とする
		}
		
		//表を表示する 項目は 組 とその合計と平均点
		System.out.println("  組 |    合計    平均");
		System.out.println("----------------------");
		
		//入力したクラス分、点数の表示を行う
		for(int i=0; i < Class; i++) {
			
			//合計点と平均点の表示部分
			System.out.print(" " + (i + 1) + "組 |" + "     ");
			System.out.printf("%3d",test_result[i]);
			System.out.print("  ");
			System.out.printf("%4f",(double)(test_result[i] / student[i]));
			System.out.println();
		}
		
		//全学年の合計と平均の表示部分
		System.out.println("----------------------");
		System.out.print("  計 |" + "     ");
		System.out.printf("%3d",sum);
		System.out.print("  ");
		System.out.printf("%4f",(double)(sum / Class));
		
		//数値を入力するために確保していた領域を解放する
		set_value.close();
	}
}
