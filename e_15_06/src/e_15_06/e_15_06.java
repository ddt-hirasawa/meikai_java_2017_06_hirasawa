/* 演習15-6 コマンドライン引数で与えられた半径を持つ円周の長さと面積を表示せよ
 * 
 * 作成日 2017年6月21日
 * 
 * 作成者 平澤敬介
 */

package e_15_06;

public class e_15_06 {

	public static void main(String[] args) {

		//コマンドライン引数 定義しているのが String型なので 引数の数が該当する
		System.out.println("コマンドライン引数 : " + args.length);
		
		//円周の長さと面積を式により表示
		System.out.println("円周の長さ : " + 2 * args.length * 3.14);
		System.out.println("円の面積   : " + args.length * args.length * 3.14);
	}
}
