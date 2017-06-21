package e_14_01;

//抽象クラス 図形
public abstract class Shape {

	abstract void draw();					//抽象メソッド
}

//インターフェース
interface Plane2D {
	
	double get_area();						//図形の面積を求める ためのメソッド
}

//抽象クラス 図形 の中の三角形
class Triangle extends Shape {

	//描画 各三角形の基底クラスとなるので空
	void draw() {
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

//平行四辺形クラス
class Parellelogram extends Shape implements Plane2D {
	
	private int width;							//平行四辺形の横幅
	private int height;						//平行四辺形の縦幅
	
	//コンストラクタ
	Parellelogram(int width,int height) {
		
		this.width = width;						//コンストラクタで 平行四辺形の横 縦の長さを補完
		this.height = height;					//するのみ
	}

	//描画
	void draw() {
		
		//平行四辺形の縦の長さ分描画するループ処理
		for(int i=0; i < this.height; i++) {
			
			//平行四辺形の横の長さ分描画するループ処理
			for(int j=1; j < this.width - i; j++) {
				
				//''で*を押し出していく
				System.out.print(" ");
			}
			
			//平行四辺形の横の長さ分描画するループ処理
			for(int j=0; j < this.width; j++) {
				
				//* 一つで 1cm とする
				System.out.print("*");
			}
			//1辺を描画したならば次の段を描画する
			System.out.println();
		}
	}
	
	//平行四辺形の面積を調べる
	public double get_area() {

		return width * height;
	}
}

//長方形クラス
class Rectangle extends Shape implements Plane2D {
	
	private int width;							//長方形の横幅
	private int height;						//長方形の縦幅
	
	//コンストラクタ
	Rectangle(int width,int height) {
		
		this.width = width;						//コンストラクタで 長方形の横 縦の長さを補完
		this.height = height;					//するのみ
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
	// インターフェースを実装するに当たって追加するメソッド
	public double get_area() {
		
		return width * height;					//長方形の面積を返却
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