/* 演習7-10 List7-11を拡張して 様々な演算を行えるようにせよ
 * 
 * 作成日 2017年6月16日
 * 
 * 作成者 平澤敬介
 */

package e_07_10;

import java.util.Random;
import java.util.Scanner;

public class e_07_10 {

	public static void main(String[] args) {
		
		Scanner set_value = new Scanner(System.in); 	    	//数値を入力するための領域を確保する
		Random set_rand_value = new Random();					//乱数の種を生成
		
		//宣言 ゲーム内容の説明
		System.out.println("暗算トレーニング");
		
		do {
			int value1 = set_rand_value.nextInt(900) + 100;	//100 ～ 999 の範囲の乱数を発生させる
			int value2 = set_rand_value.nextInt(900) + 100;	//100 ～ 999 の範囲の乱数を発生させる
			int value3 = set_rand_value.nextInt(900) + 100;	//100 ～ 999 の範囲の乱数を発生させる
			char operator1 = set_operator();				//演算子を+ - で設定 
			char operator2 = set_operator();				//演算子を+ - で設定 
			
			//正解するまで答えを入力するループ
			for(;;){
				
				//暗算するための式を表示
				System.out.print(value1 + " " +  operator1 + " " + value2 + " " + operator2 + " " + value3 + " = ");
				
				int answer = set_value.nextInt();				//答えを入力
				
				//代入された演算子で分岐
				switch(operator1) {
				
				//演算子1が +
				case '+' :
					
					//演算子2 が +
					if(operator2 == '+') {
					
						//演算結果が等しければ ループ脱却
						if(answer == value1 + value2 + value3) {
							
							operator1 = '=';					//正解の証に演算子1を = に変更
							//宣言 正解しました
							System.out.print("正解です");
							//switch分脱却
							break;
						}
					
					//演算子2 が -
					} else {
						
						//演算結果が等しければ ループ脱却
						if(answer == value1 + value2 - value3) {
							
							operator1 = '=';					//正解の証に演算子1を = に変更
							//宣言 正解しました
							System.out.print("正解です");
							//演算結果が等しければ ループ脱却
							break;
						}
					}
					
					//演算結果が間違いの場合、ループ脱却
					break;
				
				//演算子1 が -
				case '-' :
					
					//演算子2 が +
					if(operator2 == '+') {
						
						//演算結果が等しければ ループ脱却
						if(answer == value1 - value2 + value3) {
							
							operator1 = '=';					//正解の証に演算子1を = に変更
							//宣言 正解しました
							System.out.print("正解です");
							
							//演算結果が等しければ ループ脱却
							break;
						}
						
					//演算子2 が -
					} else {
						
						//演算結果が等しければ ループ脱却
						if(answer == value1 - value2 - value3) {
							
							operator1 = '=';					//正解の証に演算子1を = に変更
							//宣言 正解しました
							System.out.print("正解です");
							
							//演算結果が等しければ ループ脱却
							break;
						}
					}
				}
				//演算子1 が = だと演算できません
				if(operator1 == '=') {
					
					//正解したのでループ脱却
					break;
				}
				
				//間違いの場合宣言してまた答えを入力
				System.out.println("間違いです");
			}
				
		}while(confirm_retry());
		
		//数値を入力するために確保していた領域を解放する
		set_value.close();
	}
	
	//メソッド + - の演算子を設定する
	//引数 無し
	//返却値 + - の演算子の文字
	static char set_operator() {
		
		Random set_rand_value = new Random();					//乱数の種を生成
		
		char set_ope = '+';									//+ - の演算子を返却する変数
		int tmp = set_rand_value.nextInt(2);					// 1 の時 - を代入する
		
		//二分の一の確率で 変更される
		if(tmp == 1) {
			
			set_ope = '-';										//演算子を - に更新
		}
		
		return set_ope;
	}
	
	//メソッド 暗算を継続するか判別する処理
	//引数 無し
	//返却値 true false
	static boolean confirm_retry() {
		
		Scanner set_value = new Scanner(System.in); 	    	//数値を入力するための領域を確保する
		int answer;											//返却値を論理型として返すために使う変数
		boolean re_turn = true;								//デフォルトは [継続する]
		
		do {
			
			//1 0 でループ脱却し暗算を継続するか判断する
			System.out.print("もう一度 Yes -> 1 No -> 0");
			
			answer = set_value.nextInt();						//1 0 の入力で継続するかを判断する
		
		//1 0 でループ脱却
		} while(answer != 1 && answer != 0);
		
		//継続しない場合
		if(answer == 0) {
			
			re_turn = false;									//0が入力されていた場合、返却値をfalseに更新
			
			//数値を入力するために確保していた領域を解放する
			set_value.close();
		}

		return re_turn;
	}
}
