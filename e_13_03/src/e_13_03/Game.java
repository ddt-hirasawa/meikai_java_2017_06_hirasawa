/* 演習13-3 じゃんけんのプレイヤーを抽象クラスで表現し動作させよ
 * 
 * 作成日 2017年6月20日
 * 
 * 作成者 平澤敬介
 */

package e_13_03;

import java.util.Random;

//じゃんけんの抽象クラス
abstract class Game {
	
	private int hand;							//じゃんけんの手
	
	//メソッド じゃんけんの手を調べる
	public int out_put_hand() {
		
		return this.hand;
	}
	
	//メソッド じゃんけんの手を決定
	public void set_put_hand(int set_hand) {
		
		this.hand = set_hand;
	}
}

//プレイヤーの基底クラス
class Player extends Game{
	
	//基底クラスなのでコンストラクタは空
	Player() {
	}
	
	//メソッド 勝敗を判定します
	int judgment(int partner) {
		
		int answer = 0;					//デフォルトは引き分け
		
		//グー -> 0 チョキ -> 1 パー -> 2
		//自分のじゃんけんの手で分岐させます
		switch(this.out_put_hand()) {
		
			//自分が グー
			case 0 :
			
				//相手の手で分岐させます
				switch(partner) {
			
				// グーとグーであいこ
				case 0 : 
					
					//System.out.println("あいこです"); break;
				// グーとチョキで勝ち
				case 1 : 
					answer = 1;				//勝った宣言
					
					//引数が人間クラスならば 人間クラスの勝った回数をカウントする
					if(this instanceof Human) {
						
						((Human)this).set_win_count();
						
					//引数がCPUクラスならば CPUクラスの勝った回数をカウントする
					} else {
						
						((CPU)this).set_win_count();
					}
					//System.out.println("勝ちです"); 
					break;
				// グーとパーで負け
				case 2 : 
					answer = -1;			//負けた宣言
					//System.out.println("負けです");
				}
				//グー パターン終了
				break;
		
			//自分が チョキ
			case 1 :
				
				//相手の手で分岐させます
				switch(partner) {
				
				// チョキとグーで負け
				case 0 : 
					answer = -1;			//負けた宣言
					//System.out.println("負けです"); 
					break;
				// チョキとチョキであいこ
				case 1 : //System.out.println("あいこです"); 
					break;
				// チョキとパーで勝ち
				case 2 : 
					answer = 1;				//勝った宣言
					//引数が人間クラスならば 人間クラスの勝った回数をカウントする
					if(this instanceof Human) {
						
						((Human)this).set_win_count();
						
					//引数がCPUクラスならば CPUクラスの勝った回数をカウントする
					} else {
						
						((CPU)this).set_win_count();
					}
					//System.out.println("勝ちです");
				}
				//チョキ パターン終了
				break;
				
			//自分が パー
			case 2 :
					
				//相手の手で分岐させます
				switch(partner) {
					
				// パーとグーで勝ち
				case 0 :
					answer = 1;				//勝った宣言
					//引数が人間クラスならば 人間クラスの勝った回数をカウントする
					if(this instanceof Human) {
						
						((Human)this).set_win_count();
						
					//引数がCPUクラスならば CPUクラスの勝った回数をカウントする
					} else {
						
						((CPU)this).set_win_count();
					}
					//System.out.println("勝ちです"); 
					break;
				// パーとチョキで負け
				case 1 : 
					answer = -1;			//負けた宣言
					//System.out.println("負けです"); 
					break;
				// パーとパーであいこ
				case 2 : //System.out.println("あいこです");
				}
				//パー パターン終了
				break;
		
		}
		
		return answer;
	}
}

// プレイヤークラス
class Human extends Player {
	
	private static int win_count = 0;				//勝利回数
	
	//コンストラクタ じゃんけんの手をキーボードから入力して決定
	Human(int set_hand) {
		
		this.set_put_hand(set_hand);
	}
	
	//メソッド 勝った回数を調べる
	public int out_put_win(){
		
		return win_count;								//勝った回数を調べる
	}

	//メソッド 勝った回数をカウント
	public void set_win_count() {
		
		win_count++;									//勝った回数をカウント
	}
}

//CPUクラス
class CPU extends Player {
	
	private static int win_count = 0;				//勝利回数
	
	//コンストラクタ じゃんけんの手を乱数で決定
	CPU() {
		
		Random set_rand_value = new Random();	//乱数の種を生成
		int set = set_rand_value.nextInt(3);	//0 ～ 2の乱数を設定
		this.set_put_hand(set);					//乱数でじゃんけんの手を決定
	}
	
	//メソッド 勝った回数を調べる
	public int out_put_win(){
		
		return win_count;								//勝った回数を調べる
	}

	//メソッド 勝った回数をカウント
	public void set_win_count() {
		
		win_count++;									//勝った回数をカウント
	}
}

