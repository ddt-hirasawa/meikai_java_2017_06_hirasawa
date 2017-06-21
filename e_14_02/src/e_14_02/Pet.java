/* 演習14-2 RobotPetクラスを拡張してきせかえ可能なロボット型ペットクラスを作成せよ
 * 
 * 作成日 2017年6月21日
 * 
 * 作成者 平澤敬介
 */

package e_14_02;
//基底クラス
public class Pet {

	private String name;						//ペットの名前
	private String master_name;				//飼い主の名前
	
	//コンストラクタ
	Pet(String name,String master_name) {
		
		this.name = name;						//オブジェクトを初期化した際
		this.master_name = master_name;			//ペットの名前と飼い主の名前で初期化
	}
	
	//ペットの名前を調べる
	public String get_name() {
		
		return name;
	}
	
	//飼い主の名前を調べる
	public String get_master_name() {
		
		return master_name;
	}
	
	//自己紹介
	public void introduce() {
		
		//ペットと飼い主の名前を並べて表示
		//データメンバをコンソールに表示するのみ
		System.out.println("ペット   : " +  name);
		System.out.println("飼い主   : " +  master_name);
	}
}

//ロボペットクラス
class Robot_Pet extends Pet implements Skinnable{
	
	private String color = "シルバー";				//ロボットのデフォルト色 シルバー
	
	//派生クラスでのコンストラクタ
	Robot_Pet(String name, String master_name) {
		
		//基底クラスでのコンストラクタの呼び出し
		super(name, master_name);
	}
	
	//メソッド ロボットの色を調べる
	public String get_color() {
		
		return color;
	}

	//自己紹介 オーバーライド
	public void introduce() {
		
		//基底クラスの自己紹介メソッドを上書きする
		//ロボット用に書き換え
		System.out.println("ロボット : " + get_name());
		System.out.println("オーナー : " + get_master_name());
	}
	
	//派生クラスでの追加部分
	//ロボットなので仕事をする
	public void work(int select) {
		
		//引数として与えた数字で仕事を割り振る
		switch(select) {
		
		//仕事は3種類 ロボットに割り振ります
		case 0 : System.out.println("掃除します"); break;
		case 1 : System.out.println("洗濯します"); break;
		case 2 : System.out.println("炊事します"); break;
		default : System.out.println("アイドリング"); break;
		}
	}

	//インターフェースにより追加するメソッド
	//ロボットの色を調べる
	public void change_skin(int skin) {
		
		System.out.println("色を変更します");
		//引数として色の数字を受け取り、分岐させる
		switch(skin) {
		
		//該当する色を表示します 表示するのみ
		//該当しない場合 デフォルトのシルバー
		//データメンバのロボット色を更新します
		case black :
			
			color = "黒";break;
		case red :
			
			color = "赤"; break;
			
		case blue : 
			
			color = "青"; break;
			
		case yellow : 
			
			color = "黄"; break;
			
		case green : 
			
			color = "緑"; break;
			
		default : 
			
			color = "シルバー";
		}
		System.out.println(get_color() + "色に変更した");
	}
}

//きせかえインターフェース 演習ではロボットの色が該当する
interface Skinnable {
	
	int black = 0;							//黒
	int red = 1;							//赤
	int blue = 2;							//青
	int yellow = 3;						//黄色
	int green = 4;							//緑色のフォルム
	
	//きせかえするため コンストラスタでオブジェクト生成する必要はない
	
	//メソッド 色の設定と変更
	void change_skin(int skin);			//色の変更
}