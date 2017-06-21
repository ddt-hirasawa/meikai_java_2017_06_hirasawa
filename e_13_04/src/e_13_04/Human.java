/* 演習13-4 人間クラスにjavadocコメントを与え、javadocツールによってドキュメントを作成せよ
 * 
 * 作成日 2017年6月21日
 * 
 * 作成者 平澤敬介
 */

package e_13_04;

public class Human {

	private String full_name;			//名前 姓名込み
	private double height;			//身長 cm
	private double weight;			//体重 kg
	
	//コンストラクタ
	Human(String name,double height_,double weight_) {
		/**
		 * javadoc コメント
		 * 
		 * 人間クラスを生成します
		 */
		
		full_name = name;				//クラスオブジェクトが初期化された際の名前で、
		height = height_;				//メンバの名前を決定。身長も体重も初期化の
		weight = weight_;				//順番で決定
	}
	
	//メンバメソッド 本名を調べる
	String get_name() {
		
		/**
		 * 本名を表示します
		 * 
		 */
		return full_name;
	}
	
	//メンバメソッド 身長を調べる
	double get_height() {
		/**
		 * 
		 * 身長を表示します
		 * 
		 */
		return height;
	}
	
	//メンバメソッド 体重を調べる
	double get_weight() {
		
		/**
		 * 体重を公開します
		 * 
		 */
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
	
	//メソッド 個人情報を公開
	void information() {
		
		//名前 体重 身長 をすべて公開します
		System.out.println("名前     : " + full_name);
		System.out.println("体重     : " +  weight + "kg");
		System.out.println("身長     : " +  height + "cm");
	}
}
