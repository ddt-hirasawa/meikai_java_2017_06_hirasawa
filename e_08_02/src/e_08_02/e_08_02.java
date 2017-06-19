/* 演習8-2 自動車クラスを作り、自由にフィールド、メソッドを追加せよ
 * 
 * 作成日 2017年6月19日
 * 
 * 作成者 平澤敬介
 */

package e_08_02;

import java.util.Scanner;

public class e_08_02 {

	public static void main(String[] args) {
		
		Scanner set_object = new Scanner(System.in);			//数値を入力する領域を確保
		
		//自分の車の情報でオブジェクトを生成
		Car my_car = new Car("スバル",1000.5,700.7,3000.5,100,80,8.8,"那覇 500 さ 46-49");
		
		//メソッドのテスト 車の情報を表示
		my_car.print_spec();
		
		//ガソリンが尽きるまで移動
		//ガソリンが無くなったら給油して移動を再開
		for(;;) {
			
			//移動距離をキーボードから入力して決定
			System.out.print("x軸にどのくらい移動しますか? : ");
			int x_move = set_object.nextInt();					//x軸の移動教理を決定
			System.out.print("y軸にどのくらい移動しますか? : ");
			int y_move = set_object.nextInt();					//y軸の移動教理を決定
			
			//移動した際ガソリンが切れていないか確認します
			if(!my_car.car_move(x_move, y_move)) {
				
				System.out.println("一時停車しています");
			}
			
			System.out.print("続けますか? : 移動 -> 0以外 停車 -> 0");
			int retry = set_object.nextInt();
			
			//仮に停車するならば 総移動教理を表示して終了
			if(retry == 0) {
				
				//メンバとなっている移動距離を返却
				System.out.println("総移動距離 : " + my_car.get_total_move() + "km");
				
				break;
			}
		}
		//確保した領域を解放
		set_object.close();
	}
}
