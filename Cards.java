package remember;

public class Cards {
	
	/**カードデータを格納する配列　*/
	private int cards [];
	
	/**格納したカードデータの枚数　*/
	private int num;
	
	/**データ名（説明）*/
	private String name;
	
	public String getName() {
		return name;
	}
	
	/**ｎで指定された枚数のカードを格納できるように準備するコンストラクタ*/
	public Cards(int n, String name) {
		cards = new int [n];  //大きさがｎの配列を用意する
		num=0;                //まだ何も格納していないので0；
		this.name = name;    //thisをつけているのは、引数nameとフィールドnameを区別するため
	}
	
	/**カードデータcardを追加するメソッド。　cardは1～52*/
	public void addData(int card) {
		cards[num] = card;
		num++;
	}
	
	/**index番目のカードを返すメソッド。　返値は1～52*/
	public int getData (int index) {
		return cards[index];
	}
	
	public void printData() {
		for(int i:cards) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	public String getNumber(int index) {
		int i=cards[index];
		String num="";
		
		if(i%13==1) {
			num="A";
		}else if(i%13==2) {
			num="2";
		}else if(i%13==3) {
			num="3";
		}else if(i%13==4) {
			num="4";
		}else if(i%13==5) {
			num="5";
		}else if(i%13==6) {
			num="6";
		}else if(i%13==7) {
			num="7";
		}else if(i%13==8) {
			num="9";
		}else if(i%13==10) {
			num="T";
		}else if(i%13==11) {
			num="J";
		}else if(i%13==12) {
			num="Q";
		}else if(i%13==0) {
			num="K";
		}
		
		/*int data = cards[index];
		 * int num = data % 13;
		 * String s = "";
		 *  switch(num){
		 * 		case 1:
		 * 			s="A";
		 * 			break;
		 * 		case 10:
		 * 			s="T";
		 * 			break;
		 * 		case 11:
		 * 			s="J";
		 * 			break;
		 * 		case 12:
		 * 			s="Q";
		 * 			break;
		 * 		case 0:
		 * 			s="K";
		 * 			break;
		 * 		default:
		 * 			s=""+num;
		 * 			break;
		 * 		}
		 * 	return s;
		 * }
		 * 
		 */
		
		
		return num;
	}
	
	public String getSuit (int index) {
		String suito="";
		int i=cards[index];
		
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
	
	public String getCard(int index) {
		String ans="";
		
		ans=getSuit(index)+getNumber(index);
		return ans;
		
	}
	
	public void printCards() {
		System.out.print("printcards():");
		
		for(int i=0; i<cards.length; i++) {
			System.out.print(getCard(i)+" ");
		}
		System.out.println();
	}
	
	public int maxNumber() {
		int max=0;
		
		for(int i:cards) {
			i=i%13;
			if(i==0) {
				i=13;
			}
			if(max<i) {
				max=i;
			}
		}
		
		return max;
		
	}
	
	public void reverse() {
		int a=0;
		for(int i=0; i<cards.length/2; i++) {
			a=cards[i];
			cards[i]=cards[cards.length-i-1];
			cards[cards.length-i-1]=a;
		}
		for(int i:cards) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	public int removeFirst() {
		int first=0;
		first=cards[0];
		cards[0]=0;
		for(int i=1; i<cards.length; i++) {
			cards[i-1]=cards[i];
		}
		cards[cards.length-1]=0;
		
		for(int i:cards) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		return first;
	}
	
	
	
	
	
	public static void main(String args[]) {
		Cards cards = new Cards(5, "手札");    //「手札」として５枚分のカードデータを作る
		
		System.out.println(cards.getName());
		
		//課題1
		cards.addData(1);                      //スペードAを手札に加える（0枚目はスペードのAとなる）
		cards.addData(15);
		cards.addData(31);
		cards.addData(49);
		cards.addData(52);
		
		//課題2(1)
		cards.printData();
		
		//(2)
		System.out.print(cards.getNumber(0)+" ");
		System.out.print(cards.getNumber(1)+" ");
		System.out.print(cards.getNumber(2)+" ");
		System.out.print(cards.getNumber(3)+" ");
		System.out.print(cards.getNumber(4)+" ");
		System.out.println();
		
		//(3)
		System.out.print(cards.getSuit(0)+" ");
		System.out.print(cards.getSuit(1)+" ");
		System.out.print(cards.getSuit(2)+" ");
		System.out.print(cards.getSuit(3)+" ");
		System.out.print(cards.getSuit(4)+" ");
		System.out.println();
		
		//(4)
		System.out.print(cards.getCard(0)+" ");
		System.out.print(cards.getCard(1)+" ");
		System.out.print(cards.getCard(2)+" ");
		System.out.print(cards.getCard(3)+" ");
		System.out.print(cards.getCard(4)+" ");
		System.out.println();
		
		//(5)
		cards.printCards();
		
		
		//課題3　(1)
		System.out.println(cards.maxNumber());
		
		//(2)
		cards.reverse();
		
		//(3)
		System.out.println(cards.removeFirst());
		
		
	}
	
	

}



























































