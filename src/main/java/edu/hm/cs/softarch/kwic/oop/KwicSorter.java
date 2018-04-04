package edu.hm.cs.softarch.kwic.oop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Klasse zum Sortieren einer List von Kwic-Index-Einträgen.
 * 
 * @author katz.bastian
 */
public class KwicSorter implements Sorter{

	private List<KwicEntry> entries = new ArrayList<>();

	public void init(Shifter shifter) {
		entries.addAll(shifter.getEntries());
		entries.sort(new Comparator<KwicEntry>() {

			@Override
			public int compare(KwicEntry o1, KwicEntry o2) {
				return o1.getWord().compareTo(o2.getWord());
			}
		});
	}

	public List<KwicEntry> getEntries() {
		return Collections.unmodifiableList(entries);
	}
}
