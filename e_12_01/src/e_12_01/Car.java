/* 演習12-1 総走行移動距離を表現するフィールドと、その値を調べるメソッドを自動車クラスに追加せよ
 * 
 * 作成日 2017年6月20日
 * 
 * 作成者 平澤敬介
 */


package e_12_01;

public class Car {

	private String car_name;				//車の名前
	private double width;					//車幅
	private double height;				//車高
	private double length;				//車長
	private double side_location;			//横軸の移動距離
	private double vertical_location;		//縦軸の移動距離
	private double fuel;					//ガソリン量
	private double tank_max;				//タンク容量
	private double economy;				//燃費
	private String car_number;				//車のナンバー
	
	//コンストラクタ
	Car(String name,double width,double height,double length,double tank_max,double fuel
			,double economy,String car_number) {
		
		this.car_name = name;				//オブジェクトを初期化した際の名前
		this.width = width;					//車幅
		this.height = height;				//車高
		this.length = length;				//車長
		this.economy = economy;				//燃費
		this.tank_max = tank_max;			//タンク容量
		
		//タンク容量以上にガソリンは入らないので
		if(fuel < tank_max) {
			
			fuel = tank_max;				//超えた値を無視します
		}
		this.fuel = fuel;					//残ガソリン量
		vertical_location = 0;				//縦 横軸の移動距離は 0
		side_location = 0;					//
		
		this.car_number = car_number;		//車のナンバー で生成
	}
	
	//メソッド 車のスペックを表示
	void print_spec() {
		//名前と大きさとガソリン関係の情報、車のナンバーを表示
		System.out.println("名前     : " + car_name);
		System.out.println("車幅     : " + width + "mm");
		System.out.println("車高     : " + height + "mm");
		System.out.println("車長     : " + length + "mm");
		System.out.println("タンク   : " + tank_max + "L");
		System.out.println("残量     : " + fuel + "L");
		System.out.println("ナンバー : " + car_number);
	}
	
	//メソッド 縦軸の現在地を返却する
	double get_vertical_location() {
		
		return vertical_location;
	}
	
	//メソッド 横軸の現在地を返却する
	double get_side_location() {
		
		return side_location;
	}
	
	//メソッド 給油する
	void refueling() {
		
		this.fuel += this.tank_max - this.fuel;//現在の容量から満タンにする
	}
	
	//メソッド 走行距離を調べる
	double get_move(double move_x,double move_y) {
		
		return Math.sqrt(move_x * move_x + move_y * move_y);
	}
	
	//メソッド 現在地から移動する
	boolean car_move(double move_x,double move_y) {
		
		//式によって 直線距離での移動距離を求める
		double dist = get_move(move_x,move_y);
		boolean answer = false;			//デフォルトは移動できない
		
		//現在のガソリン量で移動できるのならば移動する
		if(dist <= this.fuel * this.economy) {
			
			fuel -= (dist / economy);			//移動した分のガソリンを引く
			vertical_location += move_x;		//縦軸の移動距離を反映
			side_location += move_y;			//横軸の移動距離を反映
			
			answer = true;						//移動できる に更新
		
		} else {
			
			//コンソールに給油するアピール
			System.out.println("給油します");

			//給油コマンド実行
			refueling();
		}
		
		return answer;
	}
}
