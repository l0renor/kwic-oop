package edu.hm.cs.softarch.kwic.oop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorter {

	private List<WordWithContext> containedContexts = new ArrayList<>();

	public void init(Shifter shifter) {
		containedContexts.addAll(shifter.getWordsWithContext());
		containedContexts.sort(new Comparator<WordWithContext>() {

			@Override
			public int compare(WordWithContext o1, WordWithContext o2) {
				return o1.getWord().compareTo(o2.getWord());
			}
		});
	}

	public List<WordWithContext> getWordsWithContext() {
		return Collections.unmodifiableList(containedContexts);
	}
}
