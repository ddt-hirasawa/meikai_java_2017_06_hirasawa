/* 演習7-14 指定したbitから入力した分のbitを 1にする 0にする 反転するメソッドの作成
 * 
 * 作成日 2017年6月19日
 * 
 * 作成者 平澤敬介
 */

package e_07_14;

import java.util.Scanner;

public class e_07_14 {

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
		
		//bitを変更する個数を入力するように促す
		System.out.print("何個を 1 にしますか : ");
		int len = set_value.nextInt();						//何個変更するか変数に格納します
		
		bit_num = setN(bit_num,select,len);					//演習内容 指定した部分を1にします
		
		//演習内容 1にします
		System.out.println("bit " + select + " 番目から" + len + "個を1にしました");
		//シフト演算後の値を表示させる
		System.out.print(bit_num + " : ");
		print_bit(bit_num);								//メソッドによりシフトしたビット構成を表示
		//改行して区切ります
		System.out.println();
		
		//bitを変更する値を入力するように促す
		System.out.print("何番目を 0 にしますか : ");
		select = set_value.nextInt();						//どの部分のbitを変更するか変数に格納します
		
		//bitを変更する個数を入力するように促す
		System.out.print("何個を 0 にしますか : ");
		len = set_value.nextInt();							//何個変更するか変数に格納します
		
		bit_num = resetN(bit_num,select,len);				//演習内容 指定した部分を1にします
		
		//演習内容 0にします
		System.out.println("bit " + select + " 番目から" + len +"個を0にしました");
		//シフト演算後の値を表示させる
		System.out.print(bit_num + " : ");
		print_bit(bit_num);								//メソッドによりシフトしたビット構成を表示
		//改行して区切ります
		System.out.println();
		
		//bitを変更する値を入力するように促す
		System.out.print("何番目を 反転しますか : ");
		select = set_value.nextInt();						//どの部分のbitを変更するか変数に格納します
		
		//bitを変更する個数を入力するように促す
		System.out.print("何個を反転しますか : ");
		len = set_value.nextInt();							//何個変更するか変数に格納します
		
		bit_num = inverseN(bit_num,select,len);			//演習内容 指定した部分を反転します
		
		//演習内容 反転します
		System.out.println("bit " + select + " 番から" + len + "個を反転しました");
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
	
	//メソッド 指定したビットを指定した分1にする
	//引数 変更する変数と 変更する番号 変更する個数
	//返却値 変更後の値
	static int setN(int tmp, int select,int len) {
		
		//指定した個数分変換します
		for(int i=0; i < len; i++) {
			
			//引数として与えた番号のbitを確認します
			if((tmp >>> select + i & 1) == 0) {
				
				int shift_set = 1;					//シフト演算する値を定義 
				shift_set <<= select + i;				//指定したビットが1の変数を作ります
				tmp += shift_set;						//0の部分に1の変数を加算し 指定した部分を1にします
			}
			
		}
		
		return tmp;
	}
	
	//メソッド 指定したビットを指定した分0にする
	//引数 変更する変数と 変更する番号 変更する個数
	//返却値 変更後の値
	static int resetN(int tmp, int select,int len) {
		
		//指定した個数分変換します
		for(int i=0; i < len; i++) {
		
			//引数として与えた番号のbitを確認します
			if((tmp >>> select + i & 1) == 1) {
			
				int shift_set = 1;					//シフト演算する値を定義 
				shift_set <<= select + i;				//指定したビットが1の変数を作ります
				tmp -= shift_set;						//1の部分に1の変数を減算し 指定した部分を0にします
			}
		}
		
		return tmp;
	}
	
	//メソッド 指定したビットを指定した分反転する
	//引数 変更する変数と 変更する番号 変更する個数
	//返却値 変更後の値
	static int inverseN(int tmp, int select,int len) {
		
		int shift_set = 1;						//シフト演算する値を定義 
		shift_set <<= select;						//指定したビットが1の変数を作ります
		
		//指定した個数分変換します
		for(int i=0; i < len; i++) {
			
			shift_set <<= select + i;						//指定したビットが1の変数を作ります
		
			//引数として与えた番号のbitを確認します
			if((tmp >>> (select + i) & 1) == 1) {
			
				tmp -= shift_set;						//1の部分に1の変数を減算し 指定した部分を0にします
			} else {
			
				tmp += shift_set;						//0の部分に1の変数を加算し 指定した部分を1にします
			}
		}
		
		return tmp;
	}
}
