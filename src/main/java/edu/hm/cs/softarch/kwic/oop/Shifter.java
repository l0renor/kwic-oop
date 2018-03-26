package edu.hm.cs.softarch.kwic.oop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Shifter {

	private List<WordWithContext> containedContexts = new ArrayList<>();

	public void addPhrase(String phrase) {
		List<String> postContext = new LinkedList<>(Arrays.asList(phrase.trim().split(" ")));
		List<String> preContext = new LinkedList<>();

		while (!postContext.isEmpty()) {
			String word = postContext.remove(0);
			containedContexts.add(new WordWithContext(word, preContext, postContext));
			preContext.add(word);
		}
	}

	public List<WordWithContext> getWordsWithContext() {
		return Collections.unmodifiableList(containedContexts);
	}
}
