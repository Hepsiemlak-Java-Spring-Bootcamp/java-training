package hafta1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class JavaBasic {

	public static void main(String[] args) {

		System.out.println("hello world");

		// x = 5 + y

		// primitive türler
		int number = 280;
		float number1 = 7.5f;
		double number2 = 8.5;
		boolean isExist = false; // true

		String name = "Halime";
		char char1 = 'h';
		long number3 = 450;

		Long long1 = new Long(450);
		Integer integer1 = 3;

		//

		if (isExist) {

		}

		int x = 0;
		Integer y = 25;
		Boolean boolean1 = false;

		boolean boolean2 = false;

		if (x == 0 && (5 < 7 || 8 > 10) && y < 0) {
			//
		} else if (boolean1) {

		} else if (boolean2) {

		} else {

		}

		if (x == 0 && (5 < 7 || 8 > 10) && y < 0) {
			//

		}

		if (boolean1) {

		}

		if (boolean2) {

		}

		// döngüler

		int i = 0;
		for (; i < 10;) {

			System.out.println("i: " + i);
			i = i + 1; // i++ & i+=1
		}

		for (String arg : args) {

		}

		// while

		boolean sart = false;

		int j = 0;

		while (sart) {

			System.out.println("j: " + j);
			j++;
		}

		// do-while

		do {

		} while (sart);

		// 1. 1-100 arasındaki asal sayıları bulsun.

		for (int j2 = 0; j2 < 5; j2++) {
			System.out.println("");
			for (int k = 0; k < j2; k++) {
				System.out.print("*");
			}
		}

//		
//		for (int i1 = 0; i1 < 6; i1++) {
//			System.out.println("");
//			for (int j1 = 0; j1 < i1 + 1; j1++) {
//				System.out.print("*");
//			}
//		}

		/*
		 * * * * * * * * * *
		 */

		// ------

		int toplam = topla(5, 10);

		int result = toplam - 10;

		// Listeler

		int[] array = { 1, 5, 9 };

		int[] array2 = new int[4]; // 0,1,2,3

		ArrayList<Integer> list = new ArrayList<>();

		for (int k = 0; k < 10; k++) {
			list.add(k);
		}

		list.remove(5);

		Integer first = list.get(5);

		Integer[] array3 = new Integer[5];

		ArrayList<String> nameList = new ArrayList<>();

		// ArrayList<int> nameList = new ArrayList<>();

		System.out.println();
		HashMap<Integer, String> map = new HashMap<>();

		String name1 = null;
		String name2 = "";
		String name3 = new String("Şeyma");

		map.put(1, name2);
		map.put(2, "Beytullah");
		// map.put(2, 3);

		String seyma = map.get(1);

		System.out.println(seyma.isBlank());

		// SET - Büşra Erçelik

		HashSet<String> lig = new HashSet<>();
		lig.add("Şeyma");
		lig.add("Büşra");
		lig.add("Cem");
		lig.add("Cem");
		lig.add("Şeyma");
		lig.add("Büşra");

		// "Cem" + "28";

		Integer age = new Integer("28");

		int ligSize = lig.size();
		System.out.println("Lig size: " + ligSize);

	}

	ArrayList<String> list1 = new ArrayList<>();
	
	LinkedList<String> list3 = new LinkedList<>();

	List<String> list = new LinkedList<>();

	List<String> list2;

	void add(String string) {
		if (list.contains(string)) {
			System.out.println(string + " hali hazırda liste içerisinde mevcut!!!");
		} else {
			list.add(string);
		}
	}

	static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}

	void topla1() {

	}

}
