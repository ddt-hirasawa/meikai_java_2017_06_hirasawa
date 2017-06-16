/* 演習7-1 受け取った引数で正負の判断を行え メソッド作成
 *
 * 作成日 2017年6月16日
 * 
 * 作成日 平澤敬介
 */

package e_07_01;

import java.util.Scanner;

public class e_07_01 {
	
	public static void main(String[] args) {
		
		Scanner set_value = new Scanner(System.in); 	    // 数値を入力するための領域を確保する
		
		//キーボードから整数を入力し符号を判別
		System.out.print("整数 : ");
		int tmp_int = set_value.nextInt();					//整数をキーボードから入力
		
		//メソッド呼び出し部
		switch(signOf(tmp_int)) {
		
		//返却値により符号を判別する
		case 1 : System.out.print("正の値です"); break;
		case 0 : System.out.print("0です"); break;
		case -1 : System.out.print("負の値です");
		}
		
		//数値を入力するために確保していた領域を解放する
		set_value.close();
	}
	
	//メソッド 引数として与えられた値の符号を判別するメソッド
	//引数 mainからの整数
	//返却値 1 -1 0 のいずれか -> 符号を判別するのに使う
	static int signOf(int tmp) {
		
		//0未満の値の時
		if(tmp < 0) {
			
			tmp = -1;		//負の証明として -1 を代入
		
		//値が0の時
		} else if(tmp == 0) {
			
			tmp = 0;		//0の証明として 0 を代入
		
		//正の値の時
		} else {
			
			tmp = 1;		//正の証明として 1 を代入
		}
		
		return tmp;
	}
}
