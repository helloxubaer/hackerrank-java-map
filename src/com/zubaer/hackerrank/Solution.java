package com.zubaer.hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class Solution {

	public static void main(String[] args) {
		Map<String, Integer> phoonBook = new HashMap<String, Integer>();
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
			in.nextLine();
			phoonBook.put(name, phone);
            
		}
		//17:41
		while(in.hasNext())
		{
			String s=in.nextLine();
			if(phoonBook.get(s) != null){
				System.out.println(s+"="+phoonBook.get(s));
			}else{
				System.out.println("Not found");
			}
		}
		in.close();
	}
}
