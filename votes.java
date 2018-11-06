package com.mypackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class votes {

	public Set<?> VotesForR1(int voter) {

		Set<String> voter1 = new HashSet<String>();

		voter1.add("C");
		voter1.add("D");
		voter1.add("B");

		Set<String> voter2 = new HashSet<String>();
		voter2.add("C");
		voter2.add("A");
		voter2.add("B");

		Set<String> voter3 = new HashSet<String>();
		voter3.add("C");
		voter3.add("A");
		voter3.add("Z");
		voter3.add("B");

		Set<String> voter4 = new HashSet<String>();
		voter4.add("D");
		voter4.add("A");
		voter4.add("H");
		voter4.add("C");
		voter4.add("B");

		Set<String> voter5 = new HashSet<String>();
		voter5.add("D");
		voter5.add("A");
		voter5.add("D");
		voter5.add("B");

		Map<Integer,Set> votes = new HashMap<Integer, Set>();
		votes.put(1, voter1);
		votes.put(2, voter2);
		votes.put(3, voter3);
		votes.put(4, voter4);
		votes.put(5, voter5);
		
		return votes.get(voter);
		
		

	}
}