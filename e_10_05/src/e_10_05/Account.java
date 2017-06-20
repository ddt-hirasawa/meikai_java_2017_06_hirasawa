/* 演習10-5 銀行クラスを拡張してインスタンスが生成される度にメッセージを表示せよ 
 * 
 * 作成日 2017年6月20日
 * 
 * 作成者 平澤敬介
 */

package e_10_05;

public class Account {

	private String name;						//口座の名義
	private String number;						//口座番号
	private long balance;						//預金残高
	
	//インスタンス初期化子
	{
		//演習で要求されているメッセージを表示
		System.out.println("明解銀行での口座開設ありがとうございます");
	}
	
	//コンストラクタ
	Account(String name,String number,long balance) {
		
		this.name = name;						//口座名義を引数として与えた値で代入
		this.number = number;					//口座番号も同様
		this.balance = balance;					//預金残高も同様

	}
	
	//メソッド 口座名義を調べる
	String get_name() {
		
		return name;
	}
	
	//メソッド 口座番号を調べる
	String get_number() {
		
		return number;
	}
	
	//メソッド 預金残高を調べる
	long get_balance() {
		
		return balance;
	}
	
	//メソッド 貯金に預ける
	void plus_balance(int tmp) {
		
		balance += tmp;;
	}
	
	//メソッド 貯金から引き落とす
	void minus_balance(int tmp) {
		
		balance -= tmp;;
	}
	
	//メソッド 情報公開
	void information() {
		
		//名義 番号 残高 開設日すべての情報を外部に公開する
		System.out.println("口座名義   : " + name + " 様");
		System.out.println("口座番号   : " +  number);
		System.out.println("預金残高   : " +  balance + "円");
	}
}
