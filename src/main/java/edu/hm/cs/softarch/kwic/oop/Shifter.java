package edu.hm.cs.softarch.kwic.oop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Klasse zum Erstellen einer List von Indexeinträgen bestehend aus Wörtern und
 * ihrem Kontext.
 * 
 * @author katz.bastian
 *
 */
public class Shifter {

	private List<KwicEntry> entries = new ArrayList<>();

	/**
	 * Nimmt eine neue Phrase auf, indem es für alle enthaltenen Wörter einen
	 * Eintrag erstellt.
	 * 
	 * @param phrase Phrase oder Titel zur Indexerstellung
	 */
	public void addPhrase(String phrase) {
		List<String> context = Arrays.asList(phrase.trim().split(" "));

		for (int i = 0; i < context.size(); i++) {
			entries.add(new KwicEntry(context, i));
		}

	}

	/**
	 * Liefert die Liste aller Einträge
	 * @return
	 */
	public List<KwicEntry> getEntries() {
		return Collections.unmodifiableList(entries);
	}
}
