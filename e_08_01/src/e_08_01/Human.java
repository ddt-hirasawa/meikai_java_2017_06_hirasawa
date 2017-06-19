/* 演習8-1 人間クラスに自由にフィールドやメソッドを定義せよ
 * 
 * 作成日 2017年6月19日
 * 
 * 作成者 平澤敬介
 */

package e_08_01;

public class Human {

	private String full_name;			//名前 姓名込み
	private double height;			//身長 cm
	private double weight;			//体重 kg
	
	//コンストラクタ
	Human(String name,double height_,double weight_) {
		
		full_name = name;				//クラスオブジェクトが初期化された際の名前で、
		height = height_;				//メンバの名前を決定。身長も体重も初期化の
		weight = weight_;				//順番で決定
	}
	
	//メンバメソッド 本名を調べる
	String get_name() {
		
		return full_name;
	}
	
	//メンバメソッド 身長を調べる
	double get_height() {
		
		return height;
	}
	
	//メンバメソッド 体重を調べる
	double get_weight() {
		
		return weight;
	}
	/*         演習により追加した部分               */
	//メソッド 名前があっているか確かめます
	boolean check_name(String name_) {
		
		return name_.equals(this.full_name);
	}
	
	//メソッド 体重が増えました
	void gain_weight(double tmp) {
		
		weight += tmp;
	}
	
	//メソッド 体重が減りました
	void lose_weight(double tmp) {
		
		weight -= tmp;
	}
	
	//身長制限 あり 高いと通過できる
	boolean restriction(double tmp) {
		
		return tmp < this.height ? true : false;
	}
}
