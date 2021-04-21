package remember;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class CardDeck {
	
	ArrayList<Integer> cards; //要素がIntegerのArrayListを保持する変数
	ArrayList<Integer> tehuda;
	
	public CardDeck() {
		cards = new ArrayList<>(); //要素数0のArrayList生成
		tehuda = new ArrayList<>(); 
		
		for(int i=1; i<=52; i++) {
			cards.add(i);
		}
		//cards.add(1);              //スペードの1を追加
		//cards.add(15);             //ハートの2を追加
		//cards.add(31);             //ダイヤの5を追加
		//cards.add(49);             //クラブの10を追加
		//cards.add(52);             //クラブのKを追加
	}
	
	/**すべてのカードを”SA　H2　D5　CT　CK”の形式で表示する*/
	public void printCards() {
		for (int i=0; i<cards.size(); i++) {//iを0から（要素数-1）まで変化させる
			String c = getCard(i);
			System.out.print(c+" ");
		}
		System.out.println();
	}
	
	/**カードデッキの残りの枚数（cardsの要素数）を返す*/
	public int getSize() {
		return cards.size();
	}
	
	
	
	public String getNumber (int index) {
		int data = cards.get(index);
		int num = data % 13;
		String s = "";
		switch(num){
		case 1:
			s="A";
			break;
		case 10:
			s="T";
			break;
		case 11:
			s="J";
			break;
		case 12:
			s="Q";
			break;
		case 0:
			s="K";
			break;
		default:
			s=""+num;
			break;
		}
		return s;
	}
	
	public String getSuit (int index) {
		String suito="";
		int i=cards.get(index);
		
		if((i-1)/13==0) {
			suito="S";
		}else if((i-1)/13==1) {
			suito="H";
		}else if((i-1)/13==2) {
			suito="D";
		}else if((i-1)/13==3) {
			suito="C";
		}
		return suito;
	}
	
	
	
	
	
	
	/**indexで指定されたカードを2文字で返す（"SA","H2","D5","CT","CK"など*/
	private String getCard(int index) {
		String c = getSuit(index)+getNumber(index);
		return ""+c; //intをStringに変換する
	}
	
	/**カードをランダムに並べなおす*/
	public void shuffle() {
		
		//Collections.shuffle(cards);
		
		
		if(cards.size()<=1) {
			return;
		}
		
		Random rnd = ThreadLocalRandom.current();
		for(int i=cards.size()-1; i>0; i--) {
			int index = rnd.nextInt(i+1);
			
			int tmp = cards.get(index);
			cards.set(index, cards.get(i));
			cards.set(i, tmp);
		}
		
	}
	
	/**デッキからカードを一枚抜き取り、そのカード番号を返す*/
	public int getNextData() {
		printCards();
		
		int remove=0;
		remove=cards.get(0);
		cards.remove(0);
		
		printCards();
		
		return remove;
	}
	
	
	
	public void tehuda_add(int index) {
		tehuda.add(index);
		
	}
	
	public int tehuda_get(int index) {
		return tehuda.get(index);
	}
	
	public void porker() {
		
	}
	
	
	
	
	public static void main(String args[]) {
		CardDeck deck = new CardDeck();
		System.out.println("課題5の(1)");
		deck.printCards();
		System.out.println();
		System.out.println("課題5の(2)");
		System.out.println(deck.getCard(1));
		System.out.println();
		
		//(3)
		System.out.println("課題5の(3)および課題6(1)");
		System.out.println("枚数:"+deck.getSize());
		System.out.println();
		
		//(6)
		System.out.println("課題6の(2)");
		deck.printCards();
		deck.shuffle();
		deck.printCards();
		deck.shuffle();
		deck.printCards();
		System.out.println();
		
		
		
		//(4)
		System.out.println("課題5の（４）");
		System.out.println(deck.getNextData());
		System.out.println(deck.getNextData());
		System.out.println(deck.getNextData());
		System.out.println(deck.getNextData());
		System.out.println(deck.getNextData());
		
		
		
		
		
		System.out.println(" ");
		System.out.println(" ");
		//山札からカードを5枚引く
		for(int i=0; i<5; i++) {
			deck.tehuda_add(deck.getNextData());
		}
		System.out.println();
		System.out.println();
		System.out.println("手札");
		for(int i=0; i<5; i++){
			System.out.print(deck.tehuda_get(i)+" ");
		}
		System.out.println();
		
		
	}

}



































































