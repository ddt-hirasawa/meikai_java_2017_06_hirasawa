/* 演習12-2 定期預金付銀行クラスの変数の、普通預金と定期預金残高の合計を比較した結果を返却するメソッドの作成
 * 
 * 作成日 2017年6月20日
 * 
 * 作成者 平澤敬介
 */

package e_12_02;

public class e_12_02 {

	public static void main(String[] args) {

		//裕福な人 普通預金 定期預金も充実
		Time_Account wealth_man = new Time_Account("test1","No.1234",1000,1000000000);
		//貧乏な人 普通預金 定期預金も不足
		Time_Account poor_man = new Time_Account("test2","No.5678",10000,0);
		
		//裕福な人の残高を表示
		wealth_man.information();
		//裕福な人の定期残高を表示
		System.out.println("定期預金   : " + wealth_man.get_time_balance() + "円");
		//区切ります
		System.out.println();
		
		//貧乏な人の残高を表示
		poor_man.information();
		//貧乏な人の定期残高を表示
		System.out.println("定期預金   : " + poor_man.get_time_balance() + "円");
		//区切ります
		System.out.println();
		
		//裕福な人の残高が多い場合
		if(1 == comp_balance(wealth_man,poor_man)) {
			
			//1 の場合 裕福な人の残高が貧乏な人より多い
			System.out.println("裕福な人の残高が多いです");
		
		//貧乏な人の残高が多い場合
		} else if(-1 == comp_balance(wealth_man,poor_man)) {
			
			//-1 の場合 貧乏な人の残高が裕福な人より多い
			System.out.println("裕福な人は現在、無一文です");
			
		//資産が等しい場合
		} else {
			
			//0 の場合 貧乏な人の残高と裕福な人の残高が等しい
			System.out.println("裕福な人は破産しました");
		}
	}
	
	/*          演習内容          */
	//メソッド 普通預金と定期預金の合計を比較してどちらが大きいか判別する
	//引数 銀行クラスオブジェクト 2つ
	//返却値 大きい 小さい 等しい -> 1 -1 0 で判別
	static int comp_balance(Account tmp1,Account tmp2) {
		
		long sum_balance1 = tmp1.get_balance();// + tmp1.get_time_balance();		//一人目の預金残高
		long sum_balance2 = tmp2.get_balance();// + tmp2.get_time_balance();		//二人目の預金残高
		
		//最初の人が定期預金を持っているか判別してあるならば合算します
		if(tmp1 instanceof Time_Account) {
			
			sum_balance1 += ((Time_Account) tmp1).get_time_balance();				//一人目の預金残高の合算
		}
		
		//最初の人が定期預金を持っているか判別してあるならば合算します
		if(tmp2 instanceof Time_Account) {
			
			sum_balance2 += ((Time_Account) tmp2).get_time_balance();				//二人目の預金残高の合算
		}
		
		//条件演算子で 残高の判定を行う
		return sum_balance1 == sum_balance2 ? 0 : (sum_balance1 > sum_balance2) ? 1 : -1;
	}
}
