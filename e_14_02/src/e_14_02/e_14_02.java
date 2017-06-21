/* 演習14-2 RobotPetクラスを拡張してきせかえ可能なロボット型ペットクラスを作成せよ
 * 
 * 作成日 2017年6月21日
 * 
 * 作成者 平澤敬介
 */

package e_14_02;

import java.util.Scanner;

public class e_14_02 {

	public static void main(String[] args) {
		
		Scanner set_value = new Scanner(System.in);				//数値を入力する領域を確保
		
		//アイボのオーナーは私です
		Robot_Pet house_work_robot = new Robot_Pet("アイボ","平澤敬介");
		
		house_work_robot.introduce();								//ロボットの自己紹介を行う	
		
		System.out.println("ロボットの色を変更します");
		System.out.println("現在ロボットは" + house_work_robot.get_color() + "色です");
		System.out.print("変更色 黒 -> 0 赤 -> 1 青 -> 2 黄 -> 3 緑 -> 4 デフォルト -> それ以外 : ");
		int color = set_value.nextInt();							//キーボードから入力して色を決定
		house_work_robot.change_skin(color);						//ロボットの色を更新
		
		System.out.print("仕事 0 -> 掃除 1 -> 洗濯 2 -> 炊事 それ以外 -> 休憩 : ");
		int select = set_value.nextInt();							//仕事を選択 何かしらのアクションを必ずする
		house_work_robot.work(select);
		
		//数値を入力する為に確保していた領域を解放
		set_value.close();
	}
}
