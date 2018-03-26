package edu.hm.cs.softarch.kwic.oop;

import java.util.ArrayList;
import java.util.List;

public class WordWithContext {

	private final String word;
	private final List<String> preContext;
	private final List<String> postContext;

	public WordWithContext(final String word, final List<String> preContext, final List<String> postContext) {
		super();
		this.word = word;
		this.preContext = new ArrayList<>(preContext);
		this.postContext = new ArrayList<>(postContext);
	}

	public String getWord() {
		return word;
	}

	public List<String> getPreContext() {
		return preContext;
	}

	public List<String> getPostContext() {
		return postContext;
	}

	public boolean hasPostContext() {
		return !postContext.isEmpty();
	}

	public boolean hasPreContext() {
		return !preContext.isEmpty();
	}
	
	
}
