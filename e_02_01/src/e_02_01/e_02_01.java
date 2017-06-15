/*演習2-1 List2-6を変更し実数値2つを代入するように変更せよ
 * 
 * 作成日 2017年6月15日
 * 
 * 作成者 平澤敬介
 */
package e_02_01;

//演習2-1の課題を行います
public class e_02_01 {

	//プログラムメイン部分 変数を使用します
	public static void main(String[] args) {
		
		double double_x;	//実数値を表すために double型の変数を定義します。
		double double_y;	//この時点では不定値が入っており値を代入する必要がある
		
		double_x = 10.55;	//整数値から小数部を含む値の代入に変更
		double_y = 0.43;	//結果が整数にならないように値を調整します
		
		//先に代入した値をそのまま表示します
		System.out.println("変数1つ目の値は" + double_x + "です");
		//次に代入した値をそのまま表示します
		System.out.println("変数2つ目の値は" + double_y + "です");
		//print文の中に式を含ませ 2値の合計を表示します
		System.out.println("合計は" + (double_x + double_y) + "です");
		//同様にprint文の中に式を含ませますが演算を2回行います
		System.out.println("平均は" + (double_x + double_y) / 2 + "です");
	}
}
