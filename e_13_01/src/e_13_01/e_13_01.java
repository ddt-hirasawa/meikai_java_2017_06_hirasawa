/* 演習13-1 図形クラス群をテストするプログラムの作成
 * 
 * 作成日 2017年6月20日
 * 
 * 作成者 平澤敬介
 */

package e_13_01;

import java.util.Scanner;

public class e_13_01 {

	public static void main(String[] args) {

		Scanner set_value = new Scanner(System.in);				//数値を入力する領域を確保
		
		//キーボードから入力して図形の個数を決定
		System.out.print("図形の個数 : ");
		int count = set_value.nextInt();							//図形の個数を決定
		int[] select = new int[count];							//どの図形を選択したのか記憶します
		Shape[] figure = new Shape[count];							//指定した数分図形を格納するスペースを確保
		
		//確保した数分 配列に格納する図形を決めていく
		for(int i=0; i < count; i++) {
			
			System.out.print((i + 1) + "番目の図形の種類 : ");
			System.out.print("0 -> 点 1 -> 水平直線 2 -> 垂直直線 それ以外 -> 長方形 : ");
			select[i] = set_value.nextInt();						//図形の種類を決定
			
			int len,width,height;									//各図形の長さを決める変数
			
			//キーボードから入力した値で図形を決定
			switch(select[i]) {
			
			//点ケース
			case 0 :
				
				//配列に 点オブジェクトを格納
				figure[i] = new Point(); break;
				
			//水平直線ケース
			case 1 :
				
				//水平直線の長さを決める
				System.out.print("線の長さ : ");
				len = set_value.nextInt();							//線の長さを決定
				//配列に 水平直線オブジェクトを格納
				figure[i] = new HorzLine(len); break;
				
			//垂直直線ケース
			case 2 :
				
				//垂直直線の長さを決める
				System.out.print("線の長さ : ");
				len = set_value.nextInt();							//線の長さを決定
				//配列に 垂直直線オブジェクトを格納
				figure[i] = new VirtLine(len); break;
			
			//長方形ケース
			default :
				
				//長方形の横幅を決定させる
				System.out.print("横の長さ : ");
				width = set_value.nextInt();						//長方形の横幅を決定
				//長方形の縦幅を決定させる
				System.out.print("縦の長さ : ");
				height = set_value.nextInt();						//長方形の縦幅を決定
				//配列に 長方形オブジェクトを格納
				figure[i] = new Rectangle(width,height);
			}
		}
		
		//配列を操作して、格納してある図形をすべて表示させる
		for(int i=0; i < count; i++) {
			
			//図形の種類を表示するために分岐します
			switch(select[i]) {
			
			//点ケース
			case 0 :
				
				System.out.println("点クラス"); break;
				
			//水平直線ケース
			case 1 :
				
				System.out.println("水平直線クラス"); break;
				
			//垂直直線ケース
			case 2 :
				
				System.out.println("垂直直線クラス"); break;
			
			//長方形ケース
			default :
				
				System.out.println("長方形クラス");
				
			}
			//図形を描画します
			figure[i].draw();
		}
		
		//確保した領域を解放
		set_value.close();
	}
}
