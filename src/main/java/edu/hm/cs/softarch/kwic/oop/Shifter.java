package edu.hm.cs.softarch.kwic.oop;

import java.util.List;

public interface Shifter {
    public void addPhrase(String phrase);
    public List<KwicEntry> getEntries();
}
