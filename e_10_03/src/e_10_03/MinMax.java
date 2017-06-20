/* 演習10-3 2値 3値,配列の最小値を求めるメソッド、最大値を求めるメソッドを集めたユーティリティクラスを作成せよ
 * 
 * 作成日 2017年6月20日
 * 
 * 作成者 平澤敬介
 */

package e_10_03;

//最小値と最大値を求めるメソッドのユーティリティクラス
public class MinMax {

	//メソッド 2値の最小値を求める
	static int min(int tmp1,int tmp2) {
		
		//条件演算子で小さい値を返却
		return tmp1 < tmp2 ? tmp1 : tmp2;
	}
	
	//メソッド 3値の最小値を求める
	static int min(int tmp1,int tmp2,int tmp3) {
		
		int min = tmp1;							//最小値を先に与えられた値で初期化

		//次に与えられた値の方が小さい場合
		if(tmp2 < min) {
			
			min = tmp2;								//最小値を更新
		}
		//最後に与えられた値の方が小さい場合
		if(tmp3 < min) {
			
			min = tmp3;								//最小値を更新
		}	
		return min;
	}
	
	//メソッド 配列の最小値を求める
	static int min(int[] tmp) {
		
		int min = tmp[0];							//最小値を先に与えられた値で初期化

		//配列の全要素を比較するためにループする
		for(int i=1; i < tmp.length; i++) {
		
			//配列の要素で最小値未満の要素があれば
			if(tmp[i] < min) {
			
				min = tmp[i];						//最小値を更新
			}
		}
		return min;
	}
	
	//メソッド 2値の最大値を求める
	static int max(int tmp1,int tmp2) {
		
		//条件演算子で小さい値を返却
		return tmp1 > tmp2 ? tmp1 : tmp2;
	}
	
	//メソッド 3値の最大値を求める
	static int max(int tmp1,int tmp2,int tmp3) {
		
		int max = tmp1;							//最大値を先に与えられた値で初期化

		//次に与えられた値の方が大きい場合
		if(max < tmp2) {
			
			max = tmp2;								//最太値を更新
		}
		//最後に与えられた値の方が大きい場合
		if(max < tmp3) {
			
			max = tmp3;								//最大値を更新
		}	
		return max;
	}
	
	//メソッド 配列の最大値を求める
	static int max(int[] tmp) {
		
		int max = tmp[0];							//最大値を先に与えられた値で初期化

		//配列の全要素を比較するためにループする
		for(int i=1; i < tmp.length; i++) {
		
			//配列の要素で最大値以上の要素があれば
			if(max < tmp[i]) {
			
				max = tmp[i];						//最大値を更新
			}
		}
		return max;
	}
}
