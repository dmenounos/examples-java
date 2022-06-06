package com.example.iterate;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IterateList {

	public static void indexLoop(List<Character> l) {
		System.out.println("indexLoop: ");

		for (int i = 0; i < l.size(); i++) {
			Character c = l.get(i);
			System.out.print(c);
		}

		System.out.println();
	}

	public static void indexLoopReverse(List<Character> l) {
		System.out.println("indexLoop: ");

		for (int i = l.size(); i > 0; i--) {
			Character c = l.get(i - 1);
			System.out.print(c);
		}

		System.out.println();
	}

	public static void iteratorLoop(List<Character> l) {
		System.out.println("iteratorLoop: ");

		for (Iterator<Character> it = l.iterator(); it.hasNext();) {
			Character c = it.next();
			System.out.print(c);
		}

		System.out.println();
	}

	public static void iteratorLoopReverse(List<Character> l) {
		System.out.println("iteratorLoopReverse: ");

		for (ListIterator<Character> it = l.listIterator(l.size()); it.hasPrevious();) {
			Character c = it.previous();
			System.out.print(c);
		}

		System.out.println();
	}

	public static void foreachLoop(List<Character> l) {
		System.out.println("foreachLoop: ");

		for (Character c : l) {
			System.out.print(c);
		}

		System.out.println();
	}

	public static void main(String[] args) {
		List<Character> l = Arrays.asList('l', 'a', 'l', 'a');

		System.out.println();
		indexLoop(l);

		System.out.println();
		indexLoopReverse(l);

		System.out.println();
		iteratorLoop(l);

		System.out.println();
		iteratorLoopReverse(l);

		System.out.println();
		foreachLoop(l);

		System.out.println();
	}
}
