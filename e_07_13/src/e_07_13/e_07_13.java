/* 演習7-13 指定した部分のbitを 1 にする 0にする 反転するメソッドの作成
 * 
 * 作成日 2017年6月18日
 * 
 * 作成者 平澤敬介
 */

package e_07_13;

import java.util.Scanner;

public class e_07_13 {

	public static void main(String[] args) {
		
		Scanner set_value = new Scanner(System.in); 	    // 数値を入力するための領域を確保する
		//bitを変更させる変数を入力するように促す
		System.out.print("正の整数 : ");
		int bit_num = set_value.nextInt();					//bitを変更させる変数を定義
		
		//変更する前の値を表示させる
		System.out.print("変更前の構成を表示\n" + bit_num + " : ");
		print_bit(bit_num);								//メソッドにより初期のビット構成を表示
		//改行して区切ります
		System.out.println();
		
		//bitを変更する値を入力するように促す
		System.out.print("何番目を 1 にしますか : ");
		int select = set_value.nextInt();					//どの部分のbitを変更するか変数に格納します
		
		bit_num = set(bit_num,select);						//演習内容 指定した部分を1にします
		
		//演習内容 1にします
		System.out.println("bit " + select + " 番目を1にしました");
		//シフト演算後の値を表示させる
		System.out.print(bit_num + " : ");
		print_bit(bit_num);								//メソッドによりシフトしたビット構成を表示
		//改行して区切ります
		System.out.println();
		
		//bitを変更する値を入力するように促す
		System.out.print("何番目を 0 にしますか : ");
		select = set_value.nextInt();						//どの部分のbitを変更するか変数に格納します
		
		bit_num = reset(bit_num,select);					//演習内容 指定した部分を1にします
		
		//演習内容 0にします
		System.out.println("bit " + select + " 番目を0にしました");
		//シフト演算後の値を表示させる
		System.out.print(bit_num + " : ");
		print_bit(bit_num);								//メソッドによりシフトしたビット構成を表示
		//改行して区切ります
		System.out.println();
		
		//bitを変更する値を入力するように促す
		System.out.print("何番目を 反転しますか : ");
		select = set_value.nextInt();						//どの部分のbitを変更するか変数に格納します
		
		bit_num = inverse(bit_num,select);					//演習内容 指定した部分を反転します
		
		//演習内容 反転します
		System.out.println("bit " + select + " 番目を反転しました");
		//シフト演算後の値を表示させる
		System.out.print(bit_num + " : ");
		print_bit(bit_num);								//メソッドによりシフトしたビット構成を表示
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
	
	//メソッド 指定したビットを1にする
	//引数 変更する変数と 変更する番号
	//返却値 変更後の値
	static int set(int tmp, int select) {
		
		//引数として与えた番号のbitを確認します
		if((tmp >>> select & 1) == 0) {
			
			/*int shift_set = 1;					//シフト演算する値を定義 
			shift_set <<= select;					//指定したビットが1の変数を作ります
			tmp += shift_set;						//0の部分に1の変数を加算し 指定した部分を1にします
			*/
			tmp |= (1 << select);
		}
		
		return tmp;
	}
	
	//メソッド 指定したビットを0にする
	//引数 変更する変数と 変更する番号
	//返却値 変更後の値
	static int reset(int tmp, int select) {
		
		//引数として与えた番号のbitを確認します
		if((tmp >>> select & 1) == 1) {
			
			/*int shift_set = 1;					//シフト演算する値を定義 
			shift_set <<= select;					//指定したビットが1の変数を作ります
			tmp -= shift_set;						//1の部分に1の変数を減算し 指定した部分を0にします
			*/
			tmp &= ~(1 << select);
		}
		
		return tmp;
	}
	
	//メソッド 指定したビットを反転する
	//引数 変更する変数と 変更する番号
	//返却値 変更後の値
	static int inverse(int tmp, int select) {
		
		int shift_set = 1;						//シフト演算する値を定義 
		shift_set <<= select;						//指定したビットが1の変数を作ります
		
		//引数として与えた番号のbitを確認します
		if((tmp >>> select & 1) == 1) {
			
			tmp &= ~shift_set;						//1の部分に1の変数を減算し 指定した部分を0にします
		} else {
			
			tmp |= shift_set;						//0の部分に1の変数を加算し 指定した部分を1にします
		}
		
		return tmp;
	}

}
