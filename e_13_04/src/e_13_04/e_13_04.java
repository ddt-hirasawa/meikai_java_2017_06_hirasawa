/* 演習13-4 人間クラスにjavadocコメントを与え、javadocツールによってドキュメントを作成せよ
 * 
 * 作成日 2017年6月21日
 * 
 * 作成者 平澤敬介
 */

package e_13_04;

public class e_13_04 {

	public static void main(String[] args) {
		
		//個人情報でクラスオブジェクトを生成
		Human Hirasawa = new Human("平澤",173.5,64.5);
		
		//javadocテスト用にコメント付き
		Hirasawa.information();
	}
}
