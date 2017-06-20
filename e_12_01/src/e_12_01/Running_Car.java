/* 演習12-1 総走行移動距離を表現するフィールドと、その値を調べるメソッドを自動車クラスに追加せよ
 * 
 * 作成日 2017年6月20日
 * 
 * 作成者 平澤敬介
 */

package e_12_01;

class Running_Car extends Car {
	
	private double total_move;					//総移動距離の変数を継承先で追加

	//継承したクラスのコンストラスタ
	Running_Car(String name, double width, double height, 
			double length, double tank_max, double fuel, double economy,String car_number) {
		
		//基底クラスのコンストラクタの呼び出し
		super(name, width, height, length, tank_max, fuel, economy, car_number);

		total_move = 0;								//総移動距離を 0 km で初期化
	}
	/*     演習課題				*/
	//メソッド 走行距離を加算
	void plus_running(double move) {
		
		total_move += move;							//走行距離の変数に移動した距離を加算する
	}
	
	//メソッド 総移動距離を調べる
	double get_total_move() {
		
		return total_move;
	}
}
