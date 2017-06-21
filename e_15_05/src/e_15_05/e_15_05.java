/* 演習15-5 3人でじゃんけんを行うプログラムの作成
 * 
 * 作成日 2017年6月21日
 * 
 * 作成者 平澤敬介
 */

package e_15_05;

import java.util.Scanner;

public class e_15_05 {

	public static void main(String[] args) {

		Scanner set_value = new Scanner(System.in);				//数値を入力する領域を確保
		int set;													//じゃんけんの手を決定する変数
		int retry = 0;												//じゃんけんを続けるかの判定
		Human Player;												//人間クラスオブジェクト定義
		CPU COM1;													//CPU1クラスオブジェクト定義
		CPU COM2;													//CPU2クラスオブジェクト定義
		
		for(;;) {
			
		do {
		
		//じゃんけんを行うためコンソールに表示させる文面
		System.out.println("じゃんけん");
		System.out.print("グー -> 0 チョキ -> 1 パー -> 2 : ");
		set = set_value.nextInt();									//キーボードから入力してじゃんけんの手を決定
		
		//入力制限 じゃんけんの手以外の入力を受け付けません
		} while(set < 0 || 2 < set);
		
		Player = new Human(set);									//人間クラスオブジェクト生成
		COM1 = new CPU();											//CPU1クラスオブジェクト生成
		COM2 = new CPU();											//CPU1クラスオブジェクト生成
		
		//コンソールにじゃんけんの手を表示する部分 表示して確認する
		System.out.print("あなた : ");
		print_hand(Player.out_put_hand());
		System.out.print("CPU1　 : ");
		print_hand(COM1.out_put_hand());
		System.out.print("CPU2　 : ");
		print_hand(COM2.out_put_hand());
		
		if(Player.judgment(COM1.out_put_hand(),COM2.out_put_hand())  == 1) {
			
			System.out.println("あなたの勝ちです");
		
		} else if(Player.judgment(COM1.out_put_hand(),COM2.out_put_hand())  == -1){
			
			System.out.println("あなたの負けです");
			
		} else {
			
			System.out.println("あいこです");
		}
		//じゃんけんを終了させる部分
		System.out.println("じゃんけんを続けますか? 0以外の入力で終了");
		//デフォルトが0なので 0 以外を入力すると 終了
		retry = set_value.nextInt();
		
		//終了するかの判定
		if(retry == 0) {
			
			break;													//0以外で 無限ループから脱却
		}
		}
		
		
		//数値を入力する為に確保していた領域を解放
		set_value.close();
	}
	
	//メソッド じゃんけんの手をグーチョキパーで表示させる
	static void print_hand(int hand) {
		
		//引数としてもらったじゃんけんの数字で分岐
		switch(hand) {
		
		//相当するじゃんけんの手を表示させる
		case 0 : System.out.println("グー"); break;
		case 1 : System.out.println("チョキ"); break;
		case 2 : System.out.println("パー");
		}
	}
}