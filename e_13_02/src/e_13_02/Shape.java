/* 演習13-2 前問を拡張して三角形4種を含めよ
 * 
 * 作成日 2017年6月20日
 * 
 * 作成者 平澤敬介
 */

package e_13_02;

//抽象クラス 図形
public abstract class Shape {


	abstract void draw();					//抽象メソッド
}

//抽象クラス 図形 の中の三角形
class Triangle extends Shape {

	//描画 各三角形の基底クラスとなるので空
	void draw() {
	}
}

//左下直角2等辺三角形クラス 
class left_under_Triangle extends Triangle {

	private int len;

	//コンストラクタ
	left_under_Triangle(int len) {
		
		this.len = len;						//三角形の1辺とする
	}
	
	//描画 各三角形の基底クラスとなるので空
	void draw() {
		
		//三角形の縦を扱うループ
		for(int i=1; i <= len; i++) {
			
			//三角形の横を扱うループ
			for(int j=1; j <= i; j++) {
				
				//*1つで1cm
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

//左上直角2等辺三角形クラス 
class left_upper_Triangle extends Triangle {

	private int len;

	//コンストラクタ
	left_upper_Triangle(int len) {
		
		this.len = len;						//三角形の1辺とする
	}
	
	//描画 各三角形の基底クラスとなるので空
	void draw() {
		
		//三角形の縦を扱うループ
		for(int i=1; i <= len; i++) {
			
			//三角形の横を扱うループ
			for(int j=this.len; i <= j; j--) {
				
				//*1つで1cm
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

//右下直角2等辺三角形クラス 
class right_under_Triangle extends Triangle {

	private int len;

	//コンストラクタ
	right_under_Triangle(int len) {
		
		this.len = len;						//三角形の1辺とする
	}
	
	//描画 各三角形の基底クラスとなるので空
	void draw() {
		
		//三角形の縦を扱うループ
		for(int i=1; i <= len; i++) {
			
			//空白で*を押し出すループ
			for(int j=this.len; i < j; j--) {
				
				//' '1つで1cm
				System.out.print(" ");
			}
			
			//三角形の横を扱うループ
			for(int j=1; j <= i; j++) {
				
				//*1つで1cm
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

//右上直角2等辺三角形クラス 
class right_upper_Triangle extends Triangle {

	private int len;

	//コンストラクタ
	right_upper_Triangle(int len) {
		
		this.len = len;						//三角形の1辺とする
	}
	
	//描画 各三角形の基底クラスとなるので空
	void draw() {
		
		//三角形の縦を扱うループ
		for(int i=1; i <= len; i++) {
			
			//空白で*を押し出すループ
			for(int j=1; i > j; j++) {
				
				//' '1つで1cm
				System.out.print(" ");
			}
			
			//三角形の横を扱うループ
			for(int j=this.len; i <= j; j--) {
				
				//*1つで1cm
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

//点クラス
class Point extends Shape {
	
	//コンストラクタ 空
	Point() {}
	
	// メソッド 点を描画する
	void draw() {
		
		// 点 -> * 一つ表示
		System.out.println("*");
	}
}

//長方形クラス
class Rectangle extends Shape {
	
	private int width;						//長方形の横幅
	private int height;					//長方形の縦幅
	
	//コンストラクタ
	Rectangle(int width,int height) {
		
		this.width = width;					//コンストラクタで 長方形の横 縦の長さを補完
		this.height = height;				//するのみ
	}
	
	// メソッド 長方形を描画する
	void draw() {
		
		//長方形の縦の長さ分描画するループ処理
		for(int i=0; i < this.height; i++) {
			
			//長方形の横の長さ分描画するループ処理
			for(int j=0; j < this.width; j++) {
				
				//* 一つで 1cm とする
				System.out.print("*");
			}
			//1辺を描画したならば次の段を描画する
			System.out.println();
		}
		
	}
}

//水平直線クラス
class HorzLine extends Shape {
	
	private int length;						//水平直線の長さ

	
	//コンストラクタ
	HorzLine(int length) {
		
		this.length = length;					//コンストラクタで 水平直線の長さを決める
	}
	
	// メソッド 水平直線を描画する
	void draw() {
		
		//指定した長さ分 - を表示して水平直線を描画します
		for(int i=0; i < this.length; i++) {
			
			// - 一つが 1cm
			System.out.print("-");
		}
		//区切ります
		System.out.println();
	}
}

//垂直直線クラス
class VirtLine extends Shape {
	
	private int length;						//垂直直線の長さ

	
	//コンストラクタ
	VirtLine(int length) {
		
		this.length = length;					//コンストラクタで 垂直直線の長さを決める
	}
	
	// メソッド 垂直直線を描画する
	void draw() {
		
		//指定した長さ分 - を表示して垂直直線を描画します
		for(int i=0; i < this.length; i++) {
			
			// | 一つが 1cm
			System.out.println("|");
		}
		//区切ります
		System.out.println();
	}
}
