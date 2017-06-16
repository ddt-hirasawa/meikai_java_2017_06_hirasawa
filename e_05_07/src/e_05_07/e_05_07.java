/* 演習5-7 0.0 ～ 1.0 まで 0.001 毎に加算し その2乗値を表示させよ
 * 
 * 作成日 2017年6月16日
 * 
 * 作成者 平澤敬介
 */

package e_05_07;

public class e_05_07 {

	public static void main(String[] args) {
		
		double double_add_process = 0;		//double型で精度の良い2乗値を表示する
		
		
		//表示を見やすくするために 変数の型と2乗値の表示を行います
		System.out.println("  実数       2乗値");
		System.out.println("---------------------");
		
		//0.001 ずつなので1000回ループ処理を行います
		for(int i= 0; i <= 1000; i++) {
			
			//2乗前の値を最低小数部8ケタで表示します
			System.out.printf("%8f", double_add_process += 0.001);
			
			//区切ります
			System.out.print("    ");
			
			//2乗値を最低小数部8ケタで表示します
			System.out.printf("%8f" , double_add_process * double_add_process);
			
			//次の段に移ります
			System.out.print("\n");
		}
	}
}
