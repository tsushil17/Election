package com.mypackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ElectionPoll {

	public static void main(String[] args) {

		int max = Integer.MIN_VALUE;
		Character maxChar = null;
	

		String votesFromR1 = new String();

		votes votes = new votes();
		Set votesR1 = votes.VotesForR1(1);
		Set votesR2 = votes.VotesForR1(2);
		Set votesR3 = votes.VotesForR1(3);
		Set votesR4 = votes.VotesForR1(4);
		Set votesR5 = votes.VotesForR1(5);

		Iterator it = votesR1.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();
			votesFromR1 = votesFromR1.concat(s);
		}

		Iterator it2 = votesR2.iterator();
		while (it2.hasNext()) {
			String s2 = (String) it2.next();
			votesFromR1 = votesFromR1.concat(s2);
		}

		Iterator it3 = votesR3.iterator();
		while (it3.hasNext()) {
			String s3 = (String) it3.next();
			votesFromR1 = votesFromR1.concat(s3);
		}

		Iterator it4 = votesR4.iterator();
		while (it4.hasNext()) {
			String s4 = (String) it4.next();
			votesFromR1 = votesFromR1.concat(s4);
		}

		Iterator it5 = votesR5.iterator();
		while (it5.hasNext()) {
			String s5 = (String) it5.next();
			votesFromR1 = votesFromR1.concat(s5);
		}

		String str = votesFromR1;
		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < str.length(); i++) {
			Character c = str.charAt(i);
			Integer value = map.get(c);
			if (value != null) {
				map.put(c, value + 1);
			} else {
				map.put(c, 1);
			}
			if (map.get(c) > max) {
				maxChar = c;
				max = map.get(c); //
			}

		}
		Set<Character> set = map.keySet();
		Iterator<Character> iter = set.iterator();
		while (iter.hasNext()) {
			Character key = iter.next();
			Integer val = map.get(key);
			System.out.println(key + " has " + val + " votes");

		}
		System.out.println();

		System.out.println(maxChar + " won with " + max + " votes");


		}
	}
