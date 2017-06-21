/* 演習15-5 3人でじゃんけんを行うプログラムの作成
 * 
 * 作成日 2017年6月21日
 * 
 * 作成者 平澤敬介
 */

package e_15_05;

import java.util.Random;

public abstract class Game {
	
	private int hand;							//じゃんけんの手
	
	//3人でじゃんけんを行う
	abstract int judgment(int partner1,int partner2);
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
	
	//メソッド 勝敗を判定します 3人で行う場合に拡張
	int judgment(int partner1,int partner2) {
		
		int answer = 0;					//デフォルトは引き分け
		
		//グー -> 0 チョキ -> 1 パー -> 2
		//自分のじゃんけんの手で分岐させます
		switch(this.out_put_hand()) {
		
			//自分が グー
			case 0 :
			
				//相手の手で分岐させます
				switch(partner1) {
			
				// グーとグー
				case 0 : 
					
					// 3人目のじゃんけんの手
					switch(partner2) {
					
					//あいこ
					case 0 : break;
					
					// 二人が勝ち
					case 1 : 
						
						answer = 1;
						//引数が人間クラスならば 人間クラスの勝った回数をカウントする
						if(this instanceof Human) {
							
							((Human)this).set_win_count();
							
						//引数がCPUクラスならば CPUクラスの勝った回数をカウントする
						} else {
							
							((CPU)this).set_win_count();
						} 
						
						break;
						
					// 二人が負け
					case 2 :
						
						answer = -1;
					}
					
					break;

				// グーとチョキ
				case 1 : 
					
					// 3人目のじゃんけんの手
					switch(partner2) {
					
					//負け
					case 0 :
						
						answer = -1;
						break;
					
					//一人が勝ち
					case 1 : 
						
						answer = 1;
						//引数が人間クラスならば 人間クラスの勝った回数をカウントする
						if(this instanceof Human) {
							
							((Human)this).set_win_count();
							
						//引数がCPUクラスならば CPUクラスの勝った回数をカウントする
						} else {
							
							((CPU)this).set_win_count();
						} 
						
						break;
						
					//あいこ
					case 2 :
					}
					
					break;
					
					// グーとパー
					case 2 : 
						
						// 3人目のじゃんけんの手
						switch(partner2) {
						
						//二人負け
						case 0 :
							
							answer = -1;
							break;
						
						//２人が勝ち
						case 1 : 
							
							answer = 1;
							//引数が人間クラスならば 人間クラスの勝った回数をカウントする
							if(this instanceof Human) {
								
								((Human)this).set_win_count();
								
							//引数がCPUクラスならば CPUクラスの勝った回数をカウントする
							} else {
								
								((CPU)this).set_win_count();
							} 
							
							break;
							
						//一人負け
						case 2 :
							
							answer = -1;
						}
				}
				
				break;
			//自分が チョキ
			case 1:
				
				//相手の手で分岐させます
				switch(partner1) {
			
				// チョキとグー
				case 0 : 
					
					// 3人目のじゃんけんの手
					switch(partner2) {
					
					//一人負け
					case 0 : 
						
						answer = -1;
						break;
					
					//二人負け
					case 1 : 
						
						answer = -1;
						break;
						
					//あいこ
					case 2 :
					}
					
				break;

				//チョキとチョキ
				case 1 : 
					
					// 3人目のじゃんけんの手
					switch(partner2) {
					
					//二人負け
					case 0 :
						answer = -1;
						break;
					
					//あいこ
					case 1 :  
						
						break;
						
					//二人勝ち
					case 2 :
						
						answer = 1;
						//引数が人間クラスならば 人間クラスの勝った回数をカウントする
						if(this instanceof Human) {
							
							((Human)this).set_win_count();
							
						//引数がCPUクラスならば CPUクラスの勝った回数をカウントする
						} else {
							
							((CPU)this).set_win_count();
						} 
					}
					break;
					
					// チョキとパー
					case 2 : 
						
						// 3人目のじゃんけんの手
						switch(partner2) {
						
						//あいこ
						case 0 : break;
						
						//２人が勝ち
						case 1 : 
							
							answer = 1;
							//引数が人間クラスならば 人間クラスの勝った回数をカウントする
							if(this instanceof Human) {
								
								((Human)this).set_win_count();
								
							//引数がCPUクラスならば CPUクラスの勝った回数をカウントする
							} else {
								
								((CPU)this).set_win_count();
							} 
							
							break;
							
						//一人勝ち
						case 2 :
							
							answer = 1;
							//引数が人間クラスならば 人間クラスの勝った回数をカウントする
							if(this instanceof Human) {
								
								((Human)this).set_win_count();
								
							//引数がCPUクラスならば CPUクラスの勝った回数をカウントする
							} else {
								
								((CPU)this).set_win_count();
							} 
						}
				}
				
				break;
			
			//自分がパー
			case 2 :
				
				//相手の手で分岐させます
				switch(partner1) {
			
				// パーとグー
				case 0 : 
					
					// 3人目のじゃんけんの手
					switch(partner2) {
					
					//一人勝ち
					case 0 :
						
						answer = 1;
						//引数が人間クラスならば 人間クラスの勝った回数をカウントする
						if(this instanceof Human) {
							
							((Human)this).set_win_count();
							
						//引数がCPUクラスならば CPUクラスの勝った回数をカウントする
						} else {
							
							((CPU)this).set_win_count();
						} 
						break;
					
					//あいこ
					case 1 : 
						
						break;
						
					//2人勝ち
					case 2 :
						
					answer = 1;
					//引数が人間クラスならば 人間クラスの勝った回数をカウントする
					if(this instanceof Human) {
						
						((Human)this).set_win_count();
						
					//引数がCPUクラスならば CPUクラスの勝った回数をカウントする
					} else {
						
						((CPU)this).set_win_count();
					} 
					}
					
					break;

				//パーとチョキ
				case 1 : 
					
					// 3人目のじゃんけんの手
					switch(partner2) {
					
					//あいこ
					case 0 : break;
					
					//二人負け
					case 1 :  
						
						answer = -1;
						break;
						
					//二人勝ち
					case 2 :
						
						answer = 1;
						//引数が人間クラスならば 人間クラスの勝った回数をカウントする
						if(this instanceof Human) {
							
							((Human)this).set_win_count();
							
						//引数がCPUクラスならば CPUクラスの勝った回数をカウントする
						} else {
							
							((CPU)this).set_win_count();
						} 
					}
					
					//パーとパー
					case 2 : 
						
						// 3人目のじゃんけんの手
						switch(partner2) {
						
						//二人勝ち
						case 0 : 
							
							answer = 1;
							//引数が人間クラスならば 人間クラスの勝った回数をカウントする
							if(this instanceof Human) {
								
								((Human)this).set_win_count();
								
							//引数がCPUクラスならば CPUクラスの勝った回数をカウントする
							} else {
								
								((CPU)this).set_win_count();
							} 
							break;
						
						//２人が負け
						case 1 : 
							
							answer = -1;
							
							break;
							
						//あいこ
						case 2 :
						}
				}
		
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