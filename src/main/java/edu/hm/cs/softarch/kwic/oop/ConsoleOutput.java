package edu.hm.cs.softarch.kwic.oop;

import java.util.ArrayList;
import java.util.List;

/**
 * Ausgabe
 * @author katz.bastian
 */
public class ConsoleOutput {

	public void print(Sorter sorter) {
		for (WordWithContext word : sorter.getWordsWithContext()) {
			StringBuffer sb = new StringBuffer();

			sb.append(word.getWord());

			List<String> context = new ArrayList<String>(word.getPostContext());
			context.addAll(word.getPreContext());
			if (!context.isEmpty()) {
				sb.append(" ");
				sb.append(String.join(" ", context));
			}
			System.out.println(sb);
		}
	}

}
