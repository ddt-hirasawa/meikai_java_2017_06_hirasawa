/* 演習7-11 ビットを左右に回転させるメソッドの作成
 * 
 * 作成日 2017年6月17日
 * 
 * 作成者 平澤敬介
 */

package e_07_11;

import java.util.Scanner;

public class e_07_11 {

	public static void main(String[] args) {
		
		Scanner set_value = new Scanner(System.in); 	    // 数値を入力するための領域を確保する
		//シフト演算させる変数を入力するように促す
		System.out.print("正の整数 : ");
		int bit_left = set_value.nextInt();				//左にシフト演算させる変数を定義
		int bit_right = bit_left;							//同じ値をシフト演算させるので右も同じ
		
		//シフト演算する前の値を表示させる
		System.out.print("シフト前の構成を表示\n" + bit_left + " : ");
		print_bit(bit_right);								//メソッドにより初期のビット構成を表示
		//改行して区切ります
		System.out.println();
		
		//シフト演算させる変数を入力するように促す
		System.out.print("いくつシフトさせますか : ");
		int shift = set_value.nextInt();					//左右にシフトさせる値を決定
		
		bit_right = rRotate(bit_right,shift);				//メソッドの呼び出し
		bit_left = lRotate(bit_left,shift);				//左右にbitシフト
		
		//いくつシフトしたか表示します
		System.out.println("右に" + shift + "分シフトしました");
		//シフト演算後の値を表示させる
		System.out.print(bit_right + " : ");
		print_bit(bit_right);								//メソッドによりシフトしたビット構成を表示
		//改行して区切ります
		System.out.println();
		
		//いくつシフトしたか表示します
		System.out.println("左に" + shift + "分シフトしました");
		//シフト演算後の値を表示させる
		System.out.print(bit_left + " : ");
		print_bit(bit_left);								//メソッドによりシフトしたビット構成を表示
		//改行して区切ります
		System.out.println();
		
		//数値を入力するために確保していた領域を解放する
		set_value.close();
	}
	
	//メソッド bit構成をコンソールに表示させる
	//引数 bit構成を表示させたい正の整数
	//返却値 無し
	static void print_bit(int tmp) {
		
		//int型は32ビットなので先頭 31番目～0番目まで 1 0 を表示していく
		for(int i= 31; 0 <= i; i--) {
			
			//論理積により 1  1 0 なら 0 を表示する
			System.out.print( ((tmp >>> i) & 1) == 1 ? '1' : '0');
		}
	}
	
	//メソッド 指定した変数を右にビットシフトさせる
	//引数 シフトさせる変数と 右にシフトさせる数
	//返却値 シフト後の値
	static int rRotate(int tmp, int right) {
		
		//指定した回数 ビットをシフトさせます
		for(int i=0; i < right; i++) {
			
			//0番目のbit が 1の時 シフトとは別に処理を行います
			if( ( (tmp >>> 0 & 1)) == 1 ) {
				
				int set = 2147483647;			//この値は 31番目のみが 0 のビット構成
				tmp >>>= 1;						//1つ右にbitシフト
				tmp += ~set;					// 0を反転させ 31番目のみ 1 の値を加算
			
			//ただのbitシフト
			} else {
				tmp >>>= 1;						//1つ右にbitシフト
			}
		}
		return tmp;
	}
	
	//メソッド 指定した変数を左にビットシフトさせる
	//引数 シフトさせる変数と 左にシフトさせる数
	//返却値 シフト後の値
	static int lRotate(int tmp, int left) {
		
		//指定した回数 ビットをシフトさせます
		for(int i=0; i < left; i++) {
			
			//31番目のbit が 1の時 シフトとは別に処理を行います
			if( ( (tmp >>> 31 & 1)) == 1 ) {
				
				int set = 1;					//この値は 0番目のみが 1 のビット構成
				tmp <<= 1;						//1つ左にbitシフト
				tmp += set;						//0番目のみ 1 の値を加算
			
			//ただのbitシフト
			} else {
				tmp <<= 1;						//1つ左にbitシフト
			}
		}
		return tmp;
	}
}
