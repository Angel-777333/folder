package com.condition.demo;

// if and else condition 
public class Sample_A {

	public static void main(String[] args) {
		String s = "welcome to java";
		String replace = s.replace("a", "A");
		System.out.println("replace :" + replace);

		String concat = s.concat(" and selenium");
		System.out.println("concat :" + concat);
		String substring = s.substring(5);
		System.out.println("substring:" + substring);

		String substring2 = s.substring(5, 11);
		System.out.println("substring2 :" + substring2);
		String join = s.join("* ", " how", "old", " are ", "you");
		System.out.println("join :" +join);
		boolean empty = s.isEmpty();
		System.out.println("is empty or not :"+empty);

	}

}
