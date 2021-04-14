package remember;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Sample {
	
	public static void main(String args[]) {
		Sample sample = new Sample();
		sample.hello();
		sample.morning("サトシ");
		sample.hundred();
		sample.mul5();
		sample.kuku();
		sample.reverse();
		sample.today();
		sample.words();
		sample.dict();
	}
	
	void hello() {
		System.out.println("Hello, world");
		System.out.println();
	}
	
	void morning(String name) {
		System.out.println("おはよう"+name);
		System.out.println();
	}
	
	void hundred() {
		for(int i=0; i<=100; i++) {
			System.out.print(" "+i);
		}
		
		System.out.println();
		System.out.println();
	}
	
	void mul5() {
		for(int i=1; i<=100; i++) {
			if(i%5==0) {
				System.out.print(" "+i);
			}
		}
		
		System.out.println();
		System.out.println();
	}
	
	void kuku() {
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				if(i*j<10) {
					System.out.print("  "+i*j);
				}else {
					System.out.print(" "+i*j);
				}
			}
			
			System.out.println();
			
		}
		System.out.println();
	}
	
	void reverse() {
		int[] reverse = new int[100];
		
		int j=99;
		
		for(int i=0; i<100; i++) {
			reverse[i]=j;
			j--;
		}
		
		for(int i=0; i<100; i++) {
			System.out.print(" "+ reverse[i]);
		}
		System.out.println();
		System.out.println();
		
	}
	
	void today() {
		Date d = new Date();
		
		SimpleDateFormat d1 = new SimpleDateFormat("yyyy年MM月dd日HH時mm分ss秒");
		String c1 = d1.format(d);
		System.out.println(c1);
		System.out.println();
	}
	
	void words() {
		
		ArrayList<String> words = new ArrayList<>();
		
		words.add("apple");
		words.add("common");
		words.add("system");
		words.add("add");
		words.add("computer");
		words.add("mouse");
		words.add("index");
		words.add("list");
		words.add("desk");
		words.add("magic");
		
		for(int i=0; i<10; i++) {
			System.out.println(words.get(i));
		}
		System.out.println();
	}
	
	void dict() {
		
		HashMap<String, String> english = new HashMap<String, String>();
		
		english.put("apple", "りんご");
		english.put("common", "共通の");
		english.put("system", "組織");
		english.put("add", "加える");
		english.put("computer", "コンピューター");
		english.put("mouse", "ねずみ");
		english.put("index", "索引");
		english.put("list", "表");
		english.put("desk", "机");
		english.put("magic", "手品");
		
		System.out.println(english.get("apple"));
		
		
		
	}
	
	

}



