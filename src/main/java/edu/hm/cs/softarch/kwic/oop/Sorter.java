package edu.hm.cs.softarch.kwic.oop;

import java.util.List;

public interface Sorter {
    public void init(Shifter shifter);
    public List<KwicEntry> getEntries();

}
