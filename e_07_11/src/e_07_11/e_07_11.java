/* 演習7-11 ビットを左右シフトした値が2のべき乗での乗算や除算の値と等しくなることを確認せよ
 * 
 * 作成日 2017年6月17日
 * 
 * 作成者 平澤敬介
 */

package e_07_11;

public class e_07_11 {

	public static void main(String[] args) {
		
		//シフト演算させる変数を入力するように促す
		System.out.print("正の整数 : ");
		int bit = 10;									//左にシフト演算させる変数を定義
		
		//シフト演算する前の値を表示させる
		System.out.print("シフト前の構成を表示\n" + bit + " : ");
		print_bit(bit);								//メソッドにより初期のビット構成を表示
		//改行して区切ります
		System.out.println();
		
		bit >>= 1;										//右に1つシフト 除算
		
		//いくつシフトしたか表示します
		System.out.println("右に1つシフトしました");
		//シフト演算後の値を表示させる
		System.out.print(bit + " : ");
		print_bit(bit);								//メソッドによりシフトしたビット構成を表示
		//改行して区切ります
		System.out.println();
		
		bit <<= 2;										//右に2つシフト 乗算

		//いくつシフトしたか表示します
		System.out.println("左に1つシフトしました");
		//シフト演算後の値を表示させる
		System.out.print(bit + " : ");
		print_bit(bit);								//メソッドによりシフトしたビット構成を表示
		//改行して区切ります
		System.out.println();
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
}
