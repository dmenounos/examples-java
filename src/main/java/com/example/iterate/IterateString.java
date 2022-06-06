package com.example.iterate;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;

public class IterateString {

	public static void indexLoop(String s) {
		System.out.println("indexLoop: ");

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			System.out.print(c);
		}

		System.out.println();
	}

	public static void indexLoopReverse(String s) {
		System.out.println("indexLoop: ");

		for (int i = s.length(); i > 0; i--) {
			char c = s.charAt(i - 1);
			System.out.print(c);
		}

		System.out.println();
	}

	public static void iteratorLoop(String s) {
		System.out.println("iteratorLoop: ");

		CharacterIterator it = new StringCharacterIterator(s);
		boolean done = it.current() == CharacterIterator.DONE;

		for (it.first(); !done; done = it.next() == CharacterIterator.DONE) {
			char c = it.current();
			System.out.print(c);
		}

		System.out.println();
	}

	public static void iteratorLoopReverse(String s) {
		System.out.println("iteratorLoopReverse: ");

		CharacterIterator it = new StringCharacterIterator(s);
		boolean done = it.current() == CharacterIterator.DONE;

		for (it.last(); !done; done = it.previous() == CharacterIterator.DONE) {
			char c = it.current();
			System.out.print(c);
		}

		System.out.println();
	}

	public static void streamLoop(String s) {
		System.out.println("streamLoop: ");

		s.chars().forEach(i -> System.out.print((char) i));

		System.out.println();
	}

	public static void main(String[] args) {
		String s = "lala";

		System.out.println();
		indexLoop(s);

		System.out.println();
		indexLoopReverse(s);

		System.out.println();
		iteratorLoop(s);

		System.out.println();
		iteratorLoopReverse(s);

		System.out.println();
		streamLoop(s);

		System.out.println();
	}
}
