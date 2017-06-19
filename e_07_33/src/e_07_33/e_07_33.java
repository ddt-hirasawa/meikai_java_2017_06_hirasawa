/* 演習7-33 1次元配列と2次元配列の値を左端をそろえて表示させるメソッド群の作成
 * 
 * 作成日 2017年6月19日
 * 
 * 作成者 平澤敬介
 */

package e_07_33;

import java.util.Random;
import java.util.Scanner;

public class e_07_33 {

	public static void main(String[] args) {
		
		Random set_rand_value = new Random();						//乱数の種を生成
		Scanner set_value = new Scanner(System.in);				//数値を入力する領域を確保
		
		//メソッドに使う配列の要素数を決定
		System.out.print("行数 : ");
		int line = set_value.nextInt();							//キーボードから入力して要素数を決定
		//メソッドに使う配列の要素数を決定
		System.out.print("列数 : ");
		int colu = set_value.nextInt();							//キーボードから入力して要素数を決定
		
		int[] one_dimensions = new int[line];					//1次元配列は行数分領域を確保させる
		int[][] two_dimensions = new int[line][];				//2次元配列は行数のみ領域を確保しておく
		
		//各行に列分の領域を確保させるためのrループ
		for(int i=0; i < two_dimensions.length; i++) {
			
			int colu_rand = 1 + set_rand_value.nextInt(colu);		//各行の列数は 1 ～ coluまでの乱数で領域を確保する
			two_dimensions[i] = new int[colu_rand];				//配列なので最低1つは領域を確保する
		}
		
		for(int i=0; i < one_dimensions.length; i++) {
			
			int rand = set_rand_value.nextInt(2);					//ランダムに-符号を付けていく
			one_dimensions[i] = set_rand_value.nextInt(10000);		//0～99の乱数を発生させ 配列の要素すべてを埋め尽くす
			
			//2分の1の確率で 負の値になる
			if(rand == 0) {
				
				one_dimensions[i] = -one_dimensions[i];
			}
		}
		
		for(int i=0; i < two_dimensions.length; i++) {
			
			for(int j=0; j < two_dimensions[i].length; j++) {
			
			int rand = set_rand_value.nextInt(2);					//ランダムに-符号を付けていく
			two_dimensions[i][j] = set_rand_value.nextInt(10000);	//0～99の乱数を発生させ 配列の要素すべてを埋め尽くす
			
			//2分の1の確率で 負の値になる
			if(rand == 0) {
				two_dimensions[i][j] = -two_dimensions[i][j];
			}
			}
		}
		print_array(one_dimensions);
		System.out.println();
		print_array(two_dimensions);
		
		//確保した領域を解放
		set_value.close();
	}
	
	//メソッド 1次元配列の中身を表示させる
	//引数 1次元配列
	//返却値 無し
	static void print_array(int[] array) {
		
		System.out.println("1次元配列の表示");
		
		//配列の全要素を操作して表示を行う
		for(int i=0; i< array.length; i++) {
			
			//表示を見やすくするため、スペースを一つ開ける
			System.out.print(array[i] + " ");
		}
	}
	
	//メソッド 2次元配列の中身を表示させる
	//引数 2次元配列
	//返却値 無し
	static void print_array(int[][] array) {
		
		System.out.println("2次元配列の表示");
		
		//配列の行を操作して表示を行う
		for(int i=0; i< array.length; i++) {
			
			//配列の列を操作して表示を行う
			for(int j=0; j < array[i].length; j++) {
			
				//表示を見やすくするため、スペースを一つ開ける
				System.out.print(array[i][j]);
				int digit = what_digit(array[i][j]);		//桁数をカウントし 空白文字を表示させる際に使う
				
				//最低8文字分の空白文字を表示しますが
				//足りない分をループして表示します
				for(int k=digit; k < 8; k++) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	//メソッド 値の符号込みの桁数を返却する
	//引数 桁数を調べる値
	//返却値 桁数
	static int what_digit(int tmp) {
		
		int count = 0;										//桁数をカウントする変数
		int judg = 0;										//符号判別用の変数 0 -> 正の整数
		
		//引数が負の値ならば 絶対値にする
		if(tmp < 0) {
			
			judg++;											//符号は - であることを記憶
			tmp = -tmp;										//絶対値に変換
		}
		
		do{
			count++;										//桁数をカウント
			tmp = tmp /= 10;								//1つ桁を減らす
			
		//0になるまで継続
		}while(0 < tmp);
		
		//負の符号の時 桁数を1つ加える
		if(0 < judg) {
			count++;
		}
		
		return count;
	}
}
 