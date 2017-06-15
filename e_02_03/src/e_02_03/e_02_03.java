/* 演習2-3 キーボード入力で値を読み込み入力した値を確認せよ
 * 
 * 作成日 2017年6月15日
 * 
 * 作成者 平澤敬介
 */
package e_02_03;

//値を入力する際、インポートするのに必要な宣言
import java.util.Scanner;

public class e_02_03 {

	public static void main(String[] args) {
		
		Scanner set_value= new Scanner(System.in);		//型を決めずに、値を格納する領域を確保する
		
		//整数値の入力を促す
		System.out.print("整数値を入力してください : ");
		
		int Integer_x = set_value.nextInt();				//newで確保した領域から、Int型で値を代入する
		
		//入力された値を表示し違いないことを確認する
		System.out.println("入力された値は " + Integer_x + " です");
		
		//newで確保した領域を解放する宣言 -> delete[] set_value
		set_value.close();
	}
}
