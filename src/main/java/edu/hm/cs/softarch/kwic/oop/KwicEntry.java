package edu.hm.cs.softarch.kwic.oop;

import java.util.Collections;
import java.util.List;

/**
 * Klasse zur Repräsentation eines Eintrags in einem Kwic-Index.
 * 
 * @author katz.bastian
 */
public class KwicEntry {

	private final List<String> context;
	private final int indexOfWord;

	public KwicEntry(final List<String> context, final int indexOfWord) {
		super();
		this.context = context;
		this.indexOfWord = indexOfWord;
	}

	/**
	 * @return das indizierte Wort
	 */
	public String getWord() {
		return context.get(indexOfWord);
	}

	/**
	 * @return Liste der Wörter, die in der Phrase auf das indizierte Wort
	 *         folgen.
	 */
	public List<String> getPreContext() {
		return Collections.unmodifiableList(context.subList(0, indexOfWord));
	}

	/**
	 * @return Liste der Wörter, die in der Phrase vor dem indizierten Wort
	 *         stehen.
	 */
	public List<String> getPostContext() {
		return Collections.unmodifiableList(context.subList(indexOfWord + 1, context.size()));
	}

	/**
	 * @return ob in der Phrase Wörter auf das indizierte Wort folgen.
	 */
	public boolean hasPostContext() {
		return indexOfWord != context.size();
	}

	/**
	 * @return ob in der Phrase vor dem indizierten Wort Wörter stehen.
	 */

	public boolean hasPreContext() {
		return indexOfWord > 0;
	}
}
