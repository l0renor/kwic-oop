package edu.hm.cs.softarch.kwic.oop;

public class Kwic {

	private SimpleFileInput reader;
	private Shifter shifter;
	private Sorter sorter;
	private ConsoleOutput printer;

	public Kwic(String phraseFileName) {
		reader = new SimpleFileInput(phraseFileName);
		shifter = new Shifter();
		sorter = new Sorter();
		printer = new ConsoleOutput();
	}

	public void print() {
		reader.read(shifter);
		sorter.init(shifter);
		printer.print(sorter);
	}

}
