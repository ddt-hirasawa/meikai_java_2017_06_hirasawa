/* 演習5-6 float型 と int型の変数で0 ～ 1まで 0.001ずつ増やしていく様子を表示せよ
 * 
 * 作成日 2017年6月16日
 * 
 * 作成者 平澤敬介
 */

package e_05_06;

public class e_05_06 {

	public static void main(String[] args) {
		
		int int_add_process = 1;			//int型は 1 ずつインクリメントしていき 1000で割った値を表示する
		float float_add_process = 0;		//float型は 0.001ずつ加算した値を表紙する
		
		
		//表示を見やすくするために int float の表示を行います
		System.out.println("  int         float");
		System.out.println("---------------------");
		
		//int float の変数の加算過程を見るためループ処理を行う
		for(int i= 1; i <= 1000; i++) {
			
			//int型では 1000で割ると 0 になるので double型にキャスト変換する
			System.out.printf("%8f" , ((double)(int_add_process++)) / 1000 );
			
			//区切ります
			System.out.print("    ");
			
			//float型では ループごとに 0.001 ずつ加算していきます
			System.out.printf("%8f" , float_add_process += 0.001);
			
			//次の段に移ります
			System.out.print("\n");
		}
	}
}
