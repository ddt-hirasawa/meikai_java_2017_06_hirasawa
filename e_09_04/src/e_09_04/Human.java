/* 演習9-4 人間クラスを拡張して、誕生日の項目を追加せよ
 * 
 * 作成日 2017年6月20日
 * 
 * 作成者 平澤敬介
 */

package e_09_04;

public class Human {

	private String full_name;					//名前 姓名込み
	private double height;					//身長 cm
	private double weight;					//体重 kg
	private Date birth_day;					//誕生日
	
	//コンストラクタ
	Human(String name,double height_,double weight_,Date birth_day) {
		
		full_name = name;						//クラスオブジェクトが初期化された際の名前で、
		height = height_;						//メンバの名前を決定。身長も体重も初期化の
		weight = weight_;						//順番で決定
		this.birth_day = new Date(birth_day);	//誕生日を引数として与えたクラスオブジェクトで初期化
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
	
	/*      演習課題          */
	//メソッド 誕生日を設定
	void set_birth_day(int year,int month,int day) {
		
		birth_day = new Date(year,month,day);					//新たに引数として与えた日付でクラスオブジェクトを生成
	}
	
	//メソッド 誕生日を返却
	Date get_birth_day() {
		
		return birth_day;										//誕生日を返却します
	}
	
	//メソッド 個人情報を公開
	void information() {
		
		//名前 体重 身長 誕生日をすべて公開します
		System.out.println("名前   : " + full_name);
		System.out.println("体重   : " +  weight + "kg");
		System.out.println("身長   : " +  height + "cm");
		System.out.println("誕生日 : " +  birth_day.toString());
	}
}
