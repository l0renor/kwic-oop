package edu.hm.cs.softarch.kwic.oop;

import java.util.ArrayList;
import java.util.List;

/**
 * Klasse zur Ausgabe eines Wortes mit seinem Kontext.
 * 
 * @author katz.bastian
 */
public class ConsoleOutput implements Output{

	/**
	 * Gibt ein Wort mit umgebendem Kontext aus.
	 * 
	 * @param sorter
	 *            Klasse, die sortierte Liste von Wörtern bereitstellt.
	 */
	public void print(Sorter sorter) {

		for (KwicEntry kwicEntry : sorter.getEntries()) {
			StringBuffer sb = new StringBuffer();

			if(!kwicEntry.getWord().equalsIgnoreCase("the")) {
				sb.append(kwicEntry.getWord());

				List<String> context = new ArrayList<String>(kwicEntry.getPostContext());
				context.addAll(kwicEntry.getPreContext());
				if (!context.isEmpty()) {
					sb.append(" ");
					sb.append(String.join(" ", context));
					if ((kwicEntry.hasPostContext())){
						sb.append(',');
					}
				}

				System.out.println(sb);
			}
		}
	}

}
