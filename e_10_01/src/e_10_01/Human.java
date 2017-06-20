package e_10_01;

public class Human {

	private String full_name;					//名前 姓名込み
	private double height;					//身長 cm
	private double weight;					//体重 kg
	private Id_class id_num;					//識別番号
	
	//コンストラクタ
	Human(String name,double height_,double weight_) {
		
		full_name = name;						//クラスオブジェクトが初期化された際の名前で、
		height = height_;						//メンバの名前を決定。身長も体重も初期化の
		weight = weight_;						//順番で決定
		id_num = new Id_class();				//人間クラスが生成されるたびに識別番号を与える
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
	
	//メソッド 身長制限 あり 高いと通過できる
	boolean restriction(double tmp) {
		
		return tmp < this.height ? true : false;
	}
	
	//メソッド 識別番号 を返却する
	Id_class get_number() {
		
		return id_num;
	}
	
	//メソッド 個人情報を公開
	void information() {
		
		//名前 体重 身長 識別番号をすべて公開します
		System.out.println("名前     : " + full_name);
		System.out.println("体重     : " +  weight + "kg");
		System.out.println("身長     : " +  height + "cm");
		System.out.println("識別番号 : " +  id_num.get_id_number());
	}
}
