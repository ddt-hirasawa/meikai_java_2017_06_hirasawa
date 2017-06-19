/* 演習7-32 bit構成を表示するメソッド群の作成
 * 
 * 作成日 2017年6月19日
 * 
 * 作成者 平澤敬介
 */

package e_07_32;

public class e_07_32  {

	public static void main(String[] args) {

		byte byte_tmp = 100;			//ビット構成を表示させるための変数群
		short short_tmp = 1000;		//
		int int_tmp = 1000;			//最小は byte型で 8bit構成
		long long_tmp = 1000;			//-127 ～ 128 まで表現できる
	
		//bit構成を表示する変数の値をすべて表示させる
		System.out.println("byte型  : " + byte_tmp);
		System.out.println("short型 : " + short_tmp);
		System.out.println("int型   : " + int_tmp);
		System.out.println("long型  : " + long_tmp);
		
		//上に表示した変数の値のビット構成をすべて表示させる
		System.out.print("\nbyte型  : ");
		print_bit(byte_tmp);
		System.out.print("\nshort型 : ");
		print_bit(short_tmp);
		System.out.print("\nint型   : ");
		print_bit(int_tmp);
		System.out.print("\nlong型  : ");
		print_bit(long_tmp);	
	}
	
	//メソッド bit構成をコンソールに表示させる int型 32bit
	//引数 bit構成を表示させたい正の整数
	//返却値 無し
	static void print_bit(int tmp) {

		//int型は32ビットなので先頭 31番目～0番目まで 1 0 を表示していく
		for(int i= 31; 0 <= i; i--) {
			
			//論理積により 1  1 0 なら 0 を表示する
			System.out.print( ((tmp >>> i) & 1) == 1 ? '1' : '0');
		}
	}
	
	//メソッド bit構成をコンソールに表示させる long型 32bit
	//引数 bit構成を表示させたい正の整数
	//返却値 無し
	static void print_bit(long tmp) {

		//long型は32ビットなので先頭 31番目～0番目まで 1 0 を表示していく
		for(int i= 31; 0 <= i; i--) {
			
			//論理積により 1  1 0 なら 0 を表示する
			System.out.print( ((tmp >>> i) & 1) == 1 ? '1' : '0');
		}
	}
	
	//メソッド bit構成をコンソールに表示させる short型 16bit
	//引数 bit構成を表示させたい正の整数
	//返却値 無し
	static void print_bit(short tmp) {

		//short型は16ビットなので先頭 15番目～0番目まで 1 0 を表示していく
		for(int i= 15; 0 <= i; i--) {
			
			//論理積により 1  1 0 なら 0 を表示する
			System.out.print( ((tmp >>> i) & 1) == 1 ? '1' : '0');
		}
	}
	
	//メソッド bit構成をコンソールに表示させる byte型 8nit
	//引数 bit構成を表示させたい正の整数
	//返却値 無し
	static void print_bit(byte tmp) {

		//byte型は8ビットなので先頭 7番目～0番目まで 1 0 を表示していく
		for(int i= 7; 0 <= i; i--) {
			
			//論理積により 1  1 0 なら 0 を表示する
			System.out.print( ((tmp >>> i) & 1) == 1 ? '1' : '0');
		}
	}
}
