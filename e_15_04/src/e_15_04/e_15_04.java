/* 演習15-4 浮動小数点数型の値を小数点数以下を p桁で 最低 w 桁で表示するメソッドの作成
 * 
 * 作成日 2017年6月21日
 * 
 * 作成者 平澤敬介
 */

package e_15_04;

public class e_15_04 {

	public static void main(String[] args) {

		double test = 10.5;			//テスト用 通常 10.5 と表示される 
		print_double(test,5,10);		//メソッドの呼び出し 小数点以下を5ケタで全体で10ケタで表現する
	}
	
	//メソッド 浮動小数点数型の値を小数点数以下を p桁で 最低 w 桁で表示する
	//引数 浮動小数点の値 小数点以下を表示する桁数と最低限表示する桁数
	//返却値 無し
	static void print_double(double tmp,int p,int w) {
		
		//formatメソッド %% で囲ってある部分が演習内容に該当する部分
		System.out.printf(String.format("%%%d.%df",w,p),tmp);
	}
}
