/* 演習8-1 人間クラスに自由にフィールドやメソッドを定義せよ
 * 
 * 作成日 2017年6月19日
 * 
 * 作成者 平澤敬介
 */

package e_08_01;

import java.util.Scanner;

public class e_08_01 {

	public static void main(String[] args) {
		
		Scanner set_object = new Scanner(System.in);				//変数の値を入力する領域を確保
		Human Hirasawa = new Human("平澤敬介",173.5, 65.1);		//個人情報でオブジェクトを初期化、生成
		
		System.out.println("名前 : " + Hirasawa.get_name());
		System.out.println("身長 : " + Hirasawa.get_height() + "cm");
		System.out.println("体重 : " + Hirasawa.get_weight() + "kg");
		
		//メソッドのテスト 名前判定
		System.out.print("名前を入力 : ");
		String check_name = set_object.next();
		System.out.print("チェックします . . .");
		
		//メソッドを呼び出し 名前の判別を行います
		if(Hirasawa.check_name(check_name)) {
			
			//文字列の判別により 一字一句あっていれば true
			System.out.println("合致しました");
		
		//1文字でも異なれば false
		} else {
			System.out.println("違います");
		}
		//メソッドのテスト 太った?
		System.out.print("太りましたか? : ");
		double trans = set_object.nextDouble();
		Hirasawa.gain_weight(trans);
		
		//体重を含め メンバをすべて表示させる
		System.out.println("名前 : " + Hirasawa.get_name());
		System.out.println("身長 : " + Hirasawa.get_height() + "cm");
		System.out.println("体重 : " + Hirasawa.get_weight() + "kg");
		
		//メソッドのテスト 痩せた?
		System.out.print("痩せましたか? : ");
		trans = set_object.nextDouble();
		Hirasawa.lose_weight(trans);
		
		//体重を含め メンバをすべて表示させる
		System.out.println("名前 : " + Hirasawa.get_name());
		System.out.println("身長 : " + Hirasawa.get_height() + "cm");
		System.out.println("体重 : " + Hirasawa.get_weight() + "kg");
		
		//メソッドのテスト 身長制限
		System.out.print("最低身長 : ");
		trans = set_object.nextDouble();
		
		//身長の高さが足りないと競技に参加できないとする
		if(Hirasawa.restriction(trans)) {
			
			//身長が足りました
			System.out.println("参加できます");
			
		//身長が足りない -> false
		} else {
			
			//何cm足りないか表示し諦めてもらう
			System.out.println("あなたは身長が" + (trans - Hirasawa.get_height()) + "cm足りないため 参加できません");
		}
		
		//確保した領域を解放
		set_object.close();
	}
}
