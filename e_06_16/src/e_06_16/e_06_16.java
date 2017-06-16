/* 演習6-16 4行3列と3行4列の行列の積を求めよ
 * 
 * 作成日 20176月16日
 * 
 * 作成者 平澤敬介
 */

package e_06_16;

import java.util.Random;

public class e_06_16 {

	public static void main(String[] args) {
		
		Random set_rand_value = new Random();					//乱数の種を生成
		
		int[][] matrix_int1 = new int[4][3];					//4行3列の配列
		int[][] matrix_int2 = new int[3][4];					//3行4列の配列
		int[][] matrix_answer = new int[3][3];				//解答となる 3行3列の配列
		
		
		//4行3列
		//行列の行分、操作し代入を行うためのループ
		for(int i=0; i < 4; i++) {
			
			//行列の列分、操作し代入を行うためのループ
			for(int j=0; j < 3; j++) {
				
				matrix_int1[i][j] = set_rand_value.nextInt(10);	//行列に値を代入 演算用
			}
		}
		
		//3行4列
		//行列の行分、操作し代入を行うためのループ
		for(int i=0; i < 3; i++) {
			
			//行列の列分、操作し代入を行うためのループ
			for(int j=0; j < 4; j++) {
				
				matrix_int2[i][j] = set_rand_value.nextInt(10);	//行列に値を代入 演算用
			}
		}
		
		//解答となる行列を操作するためのループ 行
		for(int i=0; i < 3; i++) {
			
			//解答となる行列を操作するためのループ 列
			for(int j=0; j < 3; j++) {
				
				//行列の公式により必要となるループ 加算
				for(int k=0; k < 4; k++) {
					
					//公式によっての加算処理
					matrix_answer[i][j] += matrix_int1[k][i] * matrix_int2[j][k];
				}
			}
		}
		//表示する行列の情報
		System.out.println("4行3列の行列");
		
		//4行3列
		//行列の行分、操作し代入を行うためのループ
		for(int i=0; i < 4; i++) {
			
			//行列の列分、操作し代入を行うためのループ
			for(int j=0; j < 3; j++) {
				
				//行列の数値をわかりやすく表示
				System.out.printf("%3d", matrix_int1[i][j]);
			}
			
			//列の表示が終わったならば次の行に移動
			System.out.println("\n");
		}
		
		//表示する行列の情報
		System.out.println("3行4列の行列");
		
		//3行4列
		//行列の行分、操作し代入を行うためのループ
		for(int i=0; i < 3; i++) {
			
			//行列の列分、操作し代入を行うためのループ
			for(int j=0; j < 4; j++) {
				
				//行列の数値をわかりやすく表示
				System.out.printf("%3d", matrix_int2[i][j]);
			}
			
			//列の表示が終わったならば次の行に移動
			System.out.println("\n");
		}
		
		//表示する行列の情報
		System.out.println(" 行列の積");
		System.out.println("3行3列の行列");
		
		//3行4列
		//行列の行分、操作し代入を行うためのループ
		for(int i=0; i < 3; i++) {
			
			//行列の列分、操作し代入を行うためのループ
			for(int j=0; j < 3; j++) {
				
				//行列の数値をわかりやすく表示
				System.out.printf("%4d", matrix_answer[i][j]);
			}
			
			//列の表示が終わったならば次の行に移動
			System.out.println("\n");
		}
	}
}
