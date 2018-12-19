package nhn_preTest;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Q1 {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		int c = Integer.parseInt(scan.nextLine()); //카드 개수
		int p = Integer.parseInt(scan.nextLine()); //섞는 횟수
		int[] ch = new int[p];
		
		for (int i = 0; i < p; i++) {
			ch[i]= Integer.parseInt(scan.nextLine()); //처음 카드섞이에서 제외할 갯수
		}
		
		ArrayList<Integer> cards = new ArrayList<Integer>();
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		for (int i = 0; i < c; i++) {
			cards.add(i + 1);
		}
		
		int j = 0;
		
		for (int i = 0; i < p; i++) {
			
			int temp = ch[i];
			int twotwo = 0;
			while((cards.size() - twotwo) > ch[i] *2) {
				twotwo = twotwo +  temp * 2;
				for (int k = 0; k < ch[i]; k++) {
					System.out.println(cards.toString());
					cards.add(cards.size() - twotwo, cards.get(k));
					cards.remove(0);
					
				}
				
				
			}
		}
		for (int i = 0; i < 5; i++) {
			System.out.println(cards.get(i));
		}
	}
}
