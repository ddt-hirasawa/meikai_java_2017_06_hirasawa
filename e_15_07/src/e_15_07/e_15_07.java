/* 演習15-7 List15-15 のfor文を拡張for文で実現せよ
 * 
 * 作成日 2017年6月21日
 * 
 * 作成者 平澤敬介
 */

package e_15_07;

public class e_15_07 {

	public static void main(String[] args) {

		double sum = 0.0;							//合計の変数 コマンドライン引数を加算する
		int i=0;									//繰り返し用の変数
		//コマンドライン引数として与えた値分繰り返す
		//演習内容 拡張for文
		for(String test:args) {
			
			System.out.println(test);				//加算する値を表示
			sum += Double.parseDouble(args[i++]);	//double型に変換した値を加算する
		}
		
		//確認用 合計を表示する
		System.out.println("合計 : " + sum);
	}
}
